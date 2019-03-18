window.onload = function () {
    var sign_in_button = document.getElementById("sign_in_button");

    sign_in_button.addEventListener('click', function (event) {
        event.preventDefault();
        document.getElementById('autorisation').style.display = 'none';
        document.getElementById('main_page').style.display = 'block';
    })
}
