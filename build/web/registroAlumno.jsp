<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Registro Alumno</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>    
</head>

<body>
    <h1 class="h1_2">REGISTRAR ALUMNO</h1>
    
    <label>Usuario:</label>
    <span>${login.user}</span><br>

    <p>Introduce datos del alumno:</p>

    
    <form class="registro" action="registrarAlumno" method="post">        
        <input type="hidden" name="action" value="add">          
        <div><label class="pad_top">Nombre:</label> </div>     
        <div><input type="text" name="firstName" required><br></div>      
        <div><label class="pad_top">Apellidos:</label> </div>    
        <div><input type="text" name="lastName" required><br></div>        
        <div><label class="pad_top">Email:</label></div>      
        <div><input type="email" name="email" required><br></div>
         
        <label>&nbsp;</label>        
        <div><input type="submit" value="REGISTRAR ALUMNO" class="margin_left"></div>       
    </form> 
    
    
    <form action="" method="get">
        <input type="hidden" name="action" value="join">
    </form>

</body>
</html>