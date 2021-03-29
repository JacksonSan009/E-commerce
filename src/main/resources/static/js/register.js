$(document).ready(function () {
    $('#inputImage').change(function () {
        showProfileImage(this);
    })
})

function showProfileImage(fileInput) {
    file = fileInput.files[0];
    reader = new FileReader();

    reader.onload = function (e) {
        $('#profileImage').attr('src', e.target.result);
    }

    reader.readAsDataURL(file);
}