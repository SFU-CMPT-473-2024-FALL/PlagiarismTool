const BACKEND_URL = 'http://localhost:3000';

document.getElementById('compare-button').addEventListener('click', async () => {
    const singleFileUpload = document.getElementById('single-file-upload').files[0];
    const multipleFileUpload = document.getElementById('multiple-file-upload').files;
    const comparisonMethod = document.getElementById('comparison-method').value; // Get selected method

    if (!singleFileUpload || multipleFileUpload.length === 0) {
        alert('Please upload files to proceed.');
        return;
    }

    await fetch(`${BACKEND_URL}/clear-folder`, { method: 'POST' });
    const formData = new FormData();
    formData.append('files', singleFileUpload);
    formData.append('firstFileName', singleFileUpload.name);
    Array.from(multipleFileUpload).forEach(file => formData.append('files', file));
    formData.append('comparisonMethod', comparisonMethod); 

    const response = await fetch(`${BACKEND_URL}/upload`, {
        method: 'POST',
        body: formData,
    });

    if (response.ok) {
        window.location.href = `result.html?method=${comparisonMethod}`; 
    } else {
        alert('Error with file upload');
    }
});

