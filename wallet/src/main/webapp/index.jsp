<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Wallet Form</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        body {
            background: black;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .wallet {
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

<div class="wallet">

    <!-- SUCCESS / ERROR MESSAGE -->
    <c:if test="${not empty message}">
        <h5 id="statusMsg" class="msg" style="color:${color};">
            ${msg}
        </h5>
    </c:if>

    <h3 class="text-center mb-3">Wallet Details</h3>

    <form action="saveWallet" method="post" onsubmit="return validateForm()">

        <!-- Name -->
        <div class="mb-3">
            <label>Name</label>
            <input type="text" class="form-control" id="name" name="name">
            <div id="nameError" class="error"></div>
        </div>

        <!-- Balance -->
        <div class="mb-3">
            <label>Balance</label>
            <input type="number" step="0.01" class="form-control" id="balance" name="balance">
            <div id="balanceError" class="error"></div>
        </div>

        <!-- Currency -->
        <div class="mb-3">
            <label>Currency</label>
            <select class="form-select" id="currency" name="currency">
                <option value="">Select Currency</option>
                <option value="INR">INR</option>
                <option value="USD">USD</option>
                <option value="EUR">EUR</option>
            </select>
            <div id="currencyError" class="error"></div>
        </div>

        <!-- Mobile -->
        <div class="mb-3">
            <label>Mobile Number</label>
            <input type="text" class="form-control" id="mobile" name="mobileNumber">
            <div id="mobileError" class="error"></div>
        </div>

        <button type="submit" class="btn btn-primary w-100">Save Wallet</button>

    </form>

    <br>
    <a href="getWalletDetails" class="btn btn-success w-100">Get Data</a>

</div>

<script>

function validateField(inputId) {

    const value = document.getElementById(inputId).value.trim();

    switch(inputId) {

        case 'name':
            const nameRegex = /^[A-Za-z]{5,}$/;
            if (!nameRegex.test(value))
                showError('name','nameError',
                'Name must contain minimum 5 letters only');
            else
                showSuccess('name');
            break;

        case 'balance':
            if (value === '' || parseFloat(value) < 0)
                showError('balance','balanceError',
                'Balance must be 0 or greater');
            else
                showSuccess('balance');
            break;

        case 'currency':
            if (value === '')
                showError('currency','currencyError',
                'Please select a currency');
            else
                showSuccess('currency');
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

    const errorEl = document.getElementById(inputId + 'Error');
    if (errorEl) errorEl.style.display = 'none';
}

// Real-time validation
document.querySelectorAll('input, select').forEach(input => {
    input.addEventListener('input', () =>
        validateField(input.id));
});

// Validate all fields on submit
function validateForm() {

    let isValid = true;

    ['name','balance','currency','mobile']
    .forEach(id => {
        validateField(id);
        if (document.getElementById(id)
            .classList.contains('error-border'))
            isValid = false;
    });

    return isValid;
}

// Auto hide message
document.addEventListener("DOMContentLoaded", function () {

    const message = document.getElementById("statusMsg");

    if (message) {
        setTimeout(function () {
            message.style.display = "none";
        }, 1000);
    }
});
</script>

</body>
</html>
