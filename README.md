<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head>

    <title>Vehicle Management System</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    
</head>

<body style="background-image: url('image/hd.jpg'); background-size:cover; background-repeat:no-repeat;">

    <center>
        <br>
        <h1>VEHICLE MANAGEMENT SYSTEM</h1>
        <br>
        <a th:href = "@{/vehicle}" class="btn btn-primary btn-sm mb-3"> Vehicles </a>  
          <a th:href = "@{/driver}" class="btn btn-primary btn-sm mb-3"> Drivers </a>
    </center>

</body>

</html>
