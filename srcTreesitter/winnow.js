const crypto = require('crypto');
const K_GRAM_SIZE = 20;
const WINDOW_SIZE = 3;

function normalizeSource(text) {
    return text.toLowerCase().replace(/[^a-z0-9]/g, '');
}

function generateKgrams(text, k) {
    const kgrams = [];
    for (let i = 0; i <= text.length - k; i++) {
        kgrams.push(text.substring(i, i + k));
    }
    return kgrams;
}

async function hashKgrams(kgrams) {
    const hashed = [];
    for (let i = 0; i < kgrams.length; i++) {
        const kgram = kgrams[i];
        const hash = crypto.createHash('sha1').update(kgram).digest('hex');
        hashed.push(BigInt('0x' + hash.slice(-16)));  // Using the last 8 bytes (for example)
    }
    return hashed;
}

function findMinIndex(window) {
    let minIndex = 0;
    for (let i = 1; i < window.length; i++) {
        if (window[i] < window[minIndex]) {
            minIndex = i;
        }
    }
    return minIndex;
}

async function extractFingerprints(hashes, windowSize) {
    const fingerprints = [];
    let prevMinIndex = null;

    for (let i = 0; i <= hashes.length - windowSize; i++) {
        const window = hashes.slice(i, i + windowSize);
        const minIndex = i + findMinIndex(window);

        if (minIndex !== prevMinIndex) {
            fingerprints.push(hashes[minIndex]);
            prevMinIndex = minIndex;
        }
    }
    return fingerprints;
}

function generateDiceCoefficient(fingerprints1, fingerprints2) {
    const set1 = new Set(fingerprints1);
    const set2 = new Set(fingerprints2);

    const intersection = [...set1].filter(fingerprint => set2.has(fingerprint)).length;
    const totalElements = set1.size + set2.size;

    if (totalElements === 0) {
        return 0.0;
    }

    return (2 * intersection) / totalElements;
}

async function winnow(doc1, doc2) {
    const normalizedText1 = normalizeSource(doc1);
    const normalizedText2 = normalizeSource(doc2);

    const kgrams1 = generateKgrams(normalizedText1, K_GRAM_SIZE);
    const kgrams2 = generateKgrams(normalizedText2, K_GRAM_SIZE);

    // Process hashes in chunks to avoid excessive memory usage
    const hashes1 = await hashKgrams(kgrams1);
    const hashes2 = await hashKgrams(kgrams2);

    const fingerprints1 = await extractFingerprints(hashes1, WINDOW_SIZE);
    const fingerprints2 = await extractFingerprints(hashes2, WINDOW_SIZE);

    return generateDiceCoefficient(fingerprints1, fingerprints2);
}

module.exports = { winnow };
