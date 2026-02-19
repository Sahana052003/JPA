<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Free Account</title>

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f4f6f8;
        }

        /* Navbar Styling */
        .navbar-brand {
            font-size: 22px;
        }

        /* Register Box */
        .register-box {
            max-width: 700px;
            margin: 60px auto;
            background: white;
            padding: 40px;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        }

        .title-bar {
            background-color: #2e8cb8;
            color: white;
            padding: 12px;
            text-align: center;
            font-weight: 600;
            border-radius: 4px;
            margin-bottom: 25px;
        }


    </style>
</head>

<body>

<!-- Nav Bar Section-->
<nav class="navbar navbar-expand-lg navbar-light bg-white shadow-sm">
    <div class="container">

        <!-- For Logo -->
        <a class="navbar-brand fw-bold text-primary" href="/">SignUp</a>

        <!-- Menu Items -->
        <div class="collapse navbar-collapse" id="navbarNav">

            <!-- Left Menu -->
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">What We Do</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Create a SignUp</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Find My SignUp</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Idea Center</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Help</a>
                </li>
            </ul>

            <!-- Right side of Log In and Register Link -->
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="login">Log in</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Register</a>
                </li>
            </ul>

        </div>
    </div>
</nav>


<!-- Form Data  -->
<div class="container">
    <div class="register-box">

        <div class="title-bar">
            Create Your Free Account
        </div>

        <form action="registerData" method="post">

            <div class="row mb-3">
                <div class="col">
                    <label class="form-label">First Name</label>
                    <input type="text" name="firstName" class="form-control" required>
                </div>

                <div class="col">
                    <label class="form-label">Last Name</label>
                    <input type="text" name="lastName" class="form-control" required>
                </div>
            </div>

            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" name="email"
                       class="form-control"
                       placeholder="you@example.com"
                       required>
            </div>

            <div class="mb-3">
                <label class="form-label">Password</label>
                <input type="password" name="password"
                       class="form-control"
                       required>
            </div>

            <div class="d-grid">
                <button type="submit" class="btn btn-success">
                    Register
                </button>
            </div>
        </form>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
