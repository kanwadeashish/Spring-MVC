<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign In Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>

<form action="signin" method="post">

    <label for="username">Username : </label>
    <input type="text" placeholder="Enter your username" name="username" id="username" required><br><br>

    <label for="password">Password : </label>
    <input type="password" placeholder="Enter your password" name="password" id="password" required><br><br>

    <button type="submit">Sign In</button>

</form>

</body>
</html>