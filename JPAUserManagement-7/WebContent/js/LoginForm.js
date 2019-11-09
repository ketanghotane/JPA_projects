function validate(){
    //alert("In validate function");
    var username=document.getElementById("username").value;
    var passwd=document.getElementById("password").value;
    if(username == "")
    {
        //alert("Please enter usrname");
        
        document.getElementById("usrnm").innerHTML = "Please enter username!";
        return false;
    }
    else if(passwd=="")
    {
        //alert("Password cannot be blank");
        document.getElementById("passwd").innerHTML = "Please enter password!";
        return false;
    }
    else
    {
        var form =document.getElementById("frm");
        form.action="login.do";
        form.submit();
    }
}

function validateUpdateUser(){
    var username = document.getElementById("username").value;
    //var password = document.getElementById("password").value;
    var firstname = document.getElementById("firstname").value;
    var lastname = document.getElementById("lastname").value;
    var mobilenumber = document.getElementById("mobilenumber").value;
    
    if(username == ""){
        alert("Username can not be blank.");
        return false;
    
    }else{
        var form = document.getElementById("frm");
        form.action = "update.do";
        form.submit();
    }

	
	
	
	
	
}
