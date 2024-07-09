$("#content").load("/getLogin")
$("#content").load("/r2Login")
$("#r2Login").click(function (event) {
    event.preventDefault();
    window.location.href = "/r2SignUp";
});
$("#r2SignUp").click(function (event) {
    event.preventDefault();
    window.location.href = "/r2Login";
});
console.log("Wor");