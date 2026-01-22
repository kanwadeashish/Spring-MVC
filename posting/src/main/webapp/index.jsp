<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Form Page</title>
</head>
<body>

<form action="formDetails" method="post">

    <label for="id">Id : </label>
    <input type="number" placeholder="Enter your id" name="id" id="id"><br>

    <label for="name">Name : </label>
    <input type="text" placeholder="Enter your name" name="name" id="name"><br>

    <label for="username">Username : </label>
    <input type="text" placeholder="Enter your username" name="username" id="username"><br>

    <label for="email">Email : </label>
    <input type="email" placeholder="Enter your email" name="email" id="email"><br>

    <label for="phoneNumber">Phone Number : </label>
    <input type="number" placeholder="Enter your phoneNumber" name="phoneNumber" id="phoneNumber"><br>

    <label for="percentage">Percentage : </label>
    <input type="text" placeholder="Enter your percentage" name="percentage" id="percentage"><br>

    <label for="true">Tick if Passed : </label>
    <input type="radio" name="passed" value="true" id="true"> Yes<br>

    <label for="false">Tick if Failed : </label>
    <input type="radio" name="passed" value="false" id="false"> No<br>

    <button type="submit">Submit</button>

</form>

</body>
</html>