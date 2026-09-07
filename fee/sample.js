const input = document.getElementById("imageInput");
const preview = document.getElementById("preview");

document.getElementById("html").addEventListener("click", function () {

    const file = input.files[0];

    console.log(file.name);
    console.log(file.size);
    console.log(file.type);

    if (file) {
        const imageURL = URL.createObjectURL(file);

        preview.src = imageURL;
        preview.style.display = "block";
    }

});