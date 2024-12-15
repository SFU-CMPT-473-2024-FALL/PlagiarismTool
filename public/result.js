const BACKEND_URL = 'http://localhost:3000';

function getQueryParam(param) {
    const urlParams = new URLSearchParams(window.location.search);
    return urlParams.get(param);
}

function showLoadingWheel() {
    const wheel = document.createElement('div');
    wheel.id = 'loading-wheel';
    wheel.innerHTML = `
        <div class="wheel"></div>
        <p>Loading results...</p>
    `;
    document.body.appendChild(wheel);
}

function hideLoadingWheel() {
    const wheel = document.getElementById('loading-wheel');
    if (wheel) {
        wheel.remove();
    }
}

async function fetchResults() {
    const comparisonMethod = getQueryParam('method');

    showLoadingWheel(); 

    try {
        const response = await fetch(`${BACKEND_URL}/compare-files?method=${comparisonMethod}`);
        const data = await response.json();

        if (response.ok) {
            hideLoadingWheel(); 
            const rawResults = data.results;
            const parsedResults = parseResults(rawResults);
            generateChart(parsedResults);
        } else {
            hideLoadingWheel(); 
            document.body.innerHTML = `<p>Error: ${data.message}</p>`;
        }
    } catch (error) {
        hideLoadingWheel(); 
        console.error('Error fetching results:', error);
        document.body.innerHTML = '<p>Error connecting to the server.</p>';
    }
}

function parseResults(rawResults) {
    const lines = rawResults.split('\n').filter(line => line.trim().length > 0);
    const comparisons = [];

    for (let i = 0; i < lines.length; i++) {
        if (lines[i].startsWith('Comparing:')) {
            const filePair = lines[i].replace('Comparing: ', '');
            const percentage = parseFloat(lines[i + 1].match(/([\d.]+)%/)[1]);
            comparisons.push({ files: filePair, percentage });
        }
    }
    return comparisons;
}

function generateChart(data) {
    const ctx = document.getElementById('plagiarism-chart').getContext('2d');

    const labels = data.map(item => item.files);
    const percentages = data.map(item => item.percentage);

    const barColors = percentages.map(percentage => {
        if (percentage < 25) {
            return 'rgba(75, 192, 75, 0.6)';
        } else if (percentage >= 25 && percentage < 50) {
            return 'rgba(255, 205, 86, 0.6)';
        } else {
            return 'rgba(255, 99, 132, 0.6)';
        }
    });

    new Chart(ctx, {
        type: 'bar',
        data: {
            labels: labels,
            datasets: [{
                label: 'Plagiarism Percentage',
                data: percentages,
                backgroundColor: barColors,
                borderColor: barColors.map(color => color.replace('0.65', '1')), 
                borderWidth: 1,
            }]
        },
        options: {
            responsive: true,
            indexAxis: 'y',
            scales: {
                x: {
                    beginAtZero: true,
                    max: 100,
                    title: {
                        display: true,
                        text: 'Percentage (%)'
                    }
                },
                y: {
                    title: {
                        display: true,
                        text: 'File Comparisons'
                    }
                }
            },
            plugins: {
                legend: {
                    display: false
                },
                tooltip: {
                    callbacks: {
                        label: function (context) {
                            return `${context.raw}%`;
                        }
                    }
                }
            }
        }
    });
}

fetchResults();
