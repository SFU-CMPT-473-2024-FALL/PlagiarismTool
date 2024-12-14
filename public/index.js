const BACKEND_URL = 'http://localhost:3000';

document.getElementById('compare-button').addEventListener('click', async () => {
    const singleFileUpload = document.getElementById('single-file-upload').files[0];
    const multipleFileUpload = document.getElementById('multiple-file-upload').files;

    if (!singleFileUpload || multipleFileUpload.length === 0) {
        alert('Please upload files to proceed.');
        return;
    }

    //Clear the test folder on the server
    await fetch(`${BACKEND_URL}/clear-folder`, { method: 'POST' });

    const formData = new FormData();

    //Add the first file with prefix
    formData.append('files', singleFileUpload);
    formData.append('firstFileName', singleFileUpload.name); 

    //Add the files to be compared to
    Array.from(multipleFileUpload).forEach(file => {
        formData.append('files', file);
    });

    //Upload all files
    const response = await fetch(`${BACKEND_URL}/upload`, {
        method: 'POST',
        body: formData,
    });

    if (response.ok) {
        window.location.replace('result.html');
    } else {
        alert('Error with file upload');
    }
});
