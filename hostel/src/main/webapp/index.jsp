<html>
<head>
<title>Form</title>
<style>
body{
background-color:black;
}
.info{
height:256px;
width:290px;
margin-left:567px;
margin-top:80px;
padding-top:25px;
border-radius: 12px;
background-color: white;
box-shadow: 0 20px 125px rgba(0, 0, 0, 0.2);
}
.details{
border-radius:8px;
padding-left:12px;
margin-left:25px;
}
.ok{
background-color:purple;
margin-left:80px;
border-radius:25px;

width:80px;
}
.ok:hover{
background-color:black;
color:white;
}
</style>
</head>
<body>
<form action="information" method="post">
<div class="info">
<input type="text" placeholder="Eg: SORA " name="name" class="details"><br><br>
<input type="text" placeholder="Eg: Bangalore" name="address" class="details"><br><br>
<input type="number" placeholder="1234567890" name="mobileNumber" class="details"><br><br>
<input type="number" placeholder="Eg: 2000" name="fees" class="details"><br><br>
<input type="text" placeholder="Eg: SN12" name="usn" class="details"><br><br>
<button class="ok">Submit</button>
</div>
</form>
</body>
</html>
