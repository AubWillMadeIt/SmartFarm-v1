//--index.html--//
//this is a alert box of index.html
$(document).ready(function() {
    var path = window.location.pathname;//get the path of the page
    var page = path.substring(path.lastIndexOf('/') + 1);//get the page name
    //if the page is index.html
    if(page === "index.html" || page === "") { 
        alert("Welcome to China!");;
    }
});
//this is on click function of index.html
function showText(image) {
    var text = document.getElementById('text');
    switch(image) {
        case 'xinjiang':
            text.innerHTML = 'XinJiang';
            break;
        case 'qinghai':
            text.innerHTML = 'QingHai';
            break;
        case 'hnu':
            text.innerHTML = 'Hunan University';
            break;
        case 'yuelu':
            text.innerHTML = ' Yuelu Mountain';
            break;
        case 'shenzhen':
            text.innerHTML = 'ShenZhen';
            break;
        case 'wusong':
            text.innerHTML = 'WuSong';
            break;
        default:
            text.innerHTML = '';
    }
}

//this is the form validation function of booking.html
function submitAlert() {
    // Reset error messages
    document.getElementById("nameError").innerHTML = "";
    document.getElementById("emailError").innerHTML = "";
    document.getElementById("phoneError").innerHTML = "";
    // Get values from form fields
    var name = document.forms["Booking"]["name"].value;
    var email = document.forms["Booking"]["email"].value;
    var phone = document.forms["Booking"]["number"].value;
    // Validate non-empty for name
    if (name.trim() === "") {
        document.getElementById("nameError").innerHTML = "Please enter your full name";
        return false;
    }
    // Validate non-empty for email
    if (email.trim() === "") {
        document.getElementById("emailError").innerHTML = "Please enter your email address";
        return false;
    }
    // Validate non-empty for phone
    if (phone.trim() === "") {
        document.getElementById("phoneError").innerHTML = "Please enter your phone number";
        return false;
    }
    // Validate email format
    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!email.match(emailRegex)) {
        document.getElementById("emailError").innerHTML = "Please enter a valid email address";
        return false;
    }
    // Validate phone format
    var phoneRegex = /^\d{10}$/;
    if (!phone.match(phoneRegex)) {
        document.getElementById("phoneError").innerHTML = "Please enter a valid 10-digit phone number";
        return false;
    }
    // If all validations pass, display success message
    alert("Booking information submitted successfully!");
    return false; // Prevent the default form submission behavior
}

//this is on click function of service.html
document.addEventListener("DOMContentLoaded", function () {
    var services = document.querySelectorAll(".service");
    services.forEach(function (service) {
      service.addEventListener("click", function () {
        var details = service.querySelector(".details");
        details.style.display = details.style.display === "none" ? "block" : "none";
      });
    });
  });
