window.onload=function(){
    var login_submit=document.getElementById("login-submit");
    var login_clear=document.getElementById("login-clear");

    login_submit.onclick=function(){
        var login_account=document.getElementById("account");
        var login_password=document.getElementById("password");
        var login_identity=document.getElementsByName("identity");

        var accountAll = [{ // 存储账户数据的数组
                account: 21009200558,
                password: 123456,
                identity: "user",
                username: "A"
            },
            {
                account: 21009200559,
                password: 123457,
                identity: "manager",
                username: "A"
            },
            {
                account: 21009200560,
                password: 123458,
                identity: "user",
                username: "A"
            }
        ]

        var tempAccount = accountAll.filter(function(e) {
            return e.account == login_account.value;
        })[0]; // 筛选账号返回数组，不存在则返回空数组


        if (!account) {
            alert('账户不存在');
        } 
        else {
            if (tempAccount.account == login_account.value && tempAccount.password == login_password.value) {
                //获取身份
                function getId(){
                    if(login_identity[0].checked){
                        return "user";
                    }
                    return "manager";
                }
                var tempId=getId();
                //alert(tempId);
                if(tempAccount.identity==tempId){
                    alert("登陆成功");
                    if(tempAccount.identity=="user"){
                        window.location="http://127.0.0.1:5500/classroomManagement/html/user.html?account="+login_account.value+"&password="+login_password.value+"&identity="+tempId+"&username="+tempAccount.username;
                    }
                    else{
                        window.location="http://127.0.0.1:5500/classroomManagement/html/manager.html?account="+login_account.value+"&password="+login_password.value+"&identity="+tempId+"&username="+tempAccount.username;
                    }
                }
                else{alert("身份错误");}
            }
            else {
                alert('密码错误');
            }
        }
    }

    login_clear.onclick=function(){
        var login_account=document.getElementById("account");
        var login_password=document.getElementById("password");

        login_account.value="";
        login_password.value="";
    }
}