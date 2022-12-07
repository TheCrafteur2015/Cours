<?php

$db_name = "dokuwiki_database";

$con = mysqli_connect("localhost","root","25jp%oWQketp","$db_name");

$id   = $_POST['id'];

$Query = "SELECT * FROM $db_name WHERE id = $id";

$result = mysqli_query($con, $Query);

echo "<h1>Result: $result</h1>";

?>