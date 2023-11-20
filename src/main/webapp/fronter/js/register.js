window.onload=function(){
    var register_clear=document.getElementById("register-clear");
    var register=document.getElementById("register");

    register_clear.onclick=function(){
        var register_account=document.getElementById("account");
        var register_password=document.getElementById("password");

        register_account.value="";
        register_password.value="";
    }

    register.onclick=function(){
        var login_account=document.getElementById("account");
        var login_password=document.getElementById("password");
        var login_identity=document.getElementsByName("identity");

        var reg_account=/[0-9]{11}/;
        var reg_password=/[0-9a-zA-Z]{6}/;
        if(reg_account.test(login_account.value)){
            if(reg_password.test(login_password.value)){
                if(login_identity[0].checked){
                    alert("注册成功！");
                    window.location="http://127.0.0.1:5501/html/login.html";
                }
                else{
                    alert("只能注册用户！");
                } 
            }
            else{
                alert("密码请输入6位数字与字母组合");
            }
        }
        else{
            alert("账号请输入11位数字");
        }

    }
}