<%@ page isELIgnored="false" %>


<!DOCTYPE html>
<html>
<head>
    <title>Company Registration</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        body {
            background: black;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .company {
            background: white;
            padding: 25px;
            width: 500px;
            border-radius: 12px;
        }

        .error {
            color: red;
            font-size: 14px;
        }

        .error-border {
            border: 2px solid red !important;
        }

        .success-border {
            border: 2px solid green !important;
        }

        .msg {
            text-align: center;
            font-weight: bold;
        }
    </style>
</head>

<body>

<div class="company">

    <!-- SUCCESS / ERROR MESSAGE -->
    <c:if test="${not empty message}">
        <h2 id="statusMsg" class="msg" style="color:${color};">
            ${message}
        </h2>
    </c:if>


    <h3 class="text-center mb-3">Company Registration</h3>

    <form action="loginPage" method="post" onsubmit="return validateForm()">

        <!-- First Name -->
        <div class="mb-3">
            <label>First Name</label>
            <input type="text" class="form-control" id="firstName" name="firstName">
            <div id="firstNameError" class="error"></div>
        </div>

        <!-- Last Name -->
        <div class="mb-3">
            <label>Last Name</label>
            <input type="text" class="form-control" id="lastName" name="lastName">
            <div id="lastNameError" class="error"></div>
        </div>

        <!-- Email -->
        <div class="mb-3">
            <label>Email</label>
            <input type="email" class="form-control" id="email" name="email">
            <div id="emailError" class="error"></div>
        </div>

        <!-- Password -->
        <div class="mb-3">
            <label>Password</label>
            <input type="password" class="form-control" id="password" name="password">
            <div id="passwordError" class="error"></div>
        </div>

        <!-- Company -->
        <div class="mb-3">
            <label>Company Name</label>
            <input type="text" class="form-control" id="companyName" name="companyName">
            <div id="companyError" class="error"></div>
        </div>

        <!-- Mobile -->
        <div class="mb-3">
            <label>Mobile Number</label>
            <input type="text" class="form-control" id="mobile" name="mobileNumber">
            <div id="mobileError" class="error"></div>
        </div>

        <button type="submit" class="btn btn-primary w-100">Submit</button>

    </form>

    <br>
    <a href="data" class="btn btn-success w-100">Read Data</a>

</div>

<script>

function validateField(inputId) {

    const value = document.getElementById(inputId).value.trim();

    switch(inputId) {

        case 'firstName':
            const nameRegex = /^[A-Za-z]{5,}$/;
            if (!nameRegex.test(value))
                showError('firstName','firstNameError',
                'First Name: minimum 5 letters, no numbers or symbols');
            else
                showSuccess('firstName');
            break;

        case 'lastName':
            const lastRegex = /^[A-Za-z]+(?: [A-Za-z]+)*$/;
            if (!lastRegex.test(value))
                showError('lastName','lastNameError',
                'Last Name must contain only letters and single spaces');
            else
                showSuccess('lastName');
            break;

        case 'email':
            if (!value.endsWith('@gmail.com'))
                showError('email','emailError',
                'Email must contain @gmail.com');
            else
                showSuccess('email');
            break;

        case 'password':
            const passwordRegex =
            /^(?=.*[A-Z])(?=.*\d)(?=.*[@#$%^&+=!]).{6,}$/;
            if (!passwordRegex.test(value))
                showError('password','passwordError',
                'Password: 1 uppercase, 1 number, 1 special character');
            else
                showSuccess('password');
            break;

        case 'companyName':
            if (value === '')
                showError('companyName','companyError',
                'Company Name is mandatory');
            else
                showSuccess('companyName');
            break;

        case 'mobile':
            const mobileRegex = /^[6-9]\d{9}$/;
            if (!mobileRegex.test(value))
                showError('mobile','mobileError',
                'Mobile must be 10 digits & start with 6-9');
            else
                showSuccess('mobile');
            break;
    }
}

function showError(inputId, errorId, message) {
    const input = document.getElementById(inputId);
    input.classList.add('error-border');
    input.classList.remove('success-border');

    const errorEl = document.getElementById(errorId);
    errorEl.innerText = message;
    errorEl.style.display = 'block';
}

function showSuccess(inputId) {
    const input = document.getElementById(inputId);
    input.classList.remove('error-border');
    input.classList.add('success-border');

    const errorEl = document.getElementById(inputId + 'Error')
        || document.getElementById('companyError');

    if (errorEl) errorEl.style.display = 'none';
}

// Real-time validation
document.querySelectorAll('input').forEach(input => {
    input.addEventListener('input', () =>
        validateField(input.id));
});

// Validate all fields on submit
function validateForm() {
    let isValid = true;

    ['firstName','lastName','email',
     'password','companyName','mobile']
    .forEach(id => {
        validateField(id);
        if (document.getElementById(id)
            .classList.contains('error-border'))
            isValid = false;
    });

    return isValid;
}

document.addEventListener("DOMContentLoaded", function () {

    const message = document.getElementById("statusMsg");

    if (message) {
        setTimeout(function () {
            message.style.display = "none";
        }, 1000);  // 1 seconds
    }

});
</script>

</body>
</html>
