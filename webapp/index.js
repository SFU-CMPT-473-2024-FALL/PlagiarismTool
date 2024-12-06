document.getElementById("compare-button").addEventListener("click", function () {
    //Retrieve files
    const singleFile = document.getElementById("single-file-upload").files[0];
    const multipleFiles = document.getElementById("multiple-file-upload").files;
    const comparisonMethod = document.getElementById("comparison-method").value;

    if (!singleFile) {
        alert("Please upload a file to check.");
        return;
    }

    if (multipleFiles.length === 0) {
        alert("Please upload files to compare against.");
        return;
    }

    //Stores files and method in local storage for use on result.html 
    localStorage.setItem("singleFileName", singleFile.name);
    localStorage.setItem("comparisonFiles", JSON.stringify([...multipleFiles].map(f => f.name)));
    localStorage.setItem("comparisonMethod", comparisonMethod);

    window.location.href = "result.html";
});
