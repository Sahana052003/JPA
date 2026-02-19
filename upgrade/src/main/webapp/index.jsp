<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Signup Clone</title>

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        .hero-section {
            background-color: #eaf4f8;
            padding: 80px 0;
        }

        .hero-title {
            font-size: 3rem;
            font-weight: 600;
        }

        .hero-subtitle {
            font-size: 1.2rem;
            margin-top: 20px;
            color: #555;
        }

        .btn-custom {
            background-color: #1e88a8;
            color: white;
            padding: 10px 25px;
            border-radius: 6px;
        }

        .btn-custom:hover {
            background-color: #166c86;
            color: white;
        }

        .hero-img {
            width: 100%;
            border-radius: 10px;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-light bg-white shadow-sm">
    <div class="container">

        <!-- Logo -->
        <a class="navbar-brand fw-bold text-primary" href="#">SignUp</a>



        <!-- Navbar Content -->
        <div class="collapse navbar-collapse" id="navbarNav">

            <!-- menu itmes -->
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
                    <a class="nav-link" href="#">Help</a>
                </li>
            </ul>

            <!--Login Links-->
            <ul class="navbar-nav">

                <!-- Log In Link -->
                <ul class="navbar-nav">
                      <li class="nav-item">
                           <a class="nav-link text-dark" href="login">Log In</a>
                      </li>
                <!-- Register Link -->
                      <li class="nav-item">
                         <a class="nav-link text-dark" href="register">Register</a>
                      </li>
                </ul>
        </div>
    </div>
</nav>
</body>
</html>