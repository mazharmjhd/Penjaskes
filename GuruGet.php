<?php

$servername = "localhost";
$user = "sofyanla_budiluhur";
$pass = "Lolipop0)";
$dbname = "penjaskes";

// Create connection
$conn = new mysqli($servername, $user, $pass, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$NIP = $_GET['nip'];
$password = $_GET['pass'];

$data_users = mysqli_query($conn, "SELECT role FROM guru where NIP = '$NIP' and pass = '$pass'");

$row = mysqli_fetch_array($data_users, MYSQLI_NUM);
$data = $row[0];
if ($data){
    echo $data;
}

$conn->close();
?>