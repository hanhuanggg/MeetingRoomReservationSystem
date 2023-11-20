function get_url(name) {
    let reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    let r = window.location.search.substr(1).match(reg);
    if (r != null) {
        return decodeURIComponent(r[2]);
    };
    return null;
}

let username = get_url("username");

window.onload=function(){
    //显示用户名
    var show_name=document.getElementById("name");
    show_name.innerHTML=username;
    // 显示二级菜单
    var room_button=document.getElementsByClassName("room-button");
    var room_specific=document.getElementsByClassName("room-specific")[0];
    for(var i=0;i<room_button.length;i++){
        room_button[i].onclick=change;
    }
    function change(){
        room_specific.style.display="block";
    }

    var select_button_submit = document.getElementById("select-button-submit");
    var select_button_cancel = document.getElementById("select-button-cancel");
    select_button_submit.onclick=function(){
        alert("选择成功！");
        room_specific.style.display="none";
    }
    select_button_cancel.onclick=function(){
        room_specific.style.display="none";
    }
    //显示预约
    var option_appiontments=document.getElementById("option-appiontments");
    var option_check=document.getElementById("option-check");
    var appointment=document.getElementsByClassName("appointment")[0];
    option_appiontments.onclick=function(){
        appointment.style.display="block";
    }
    option_check.onclick=function(){
        appointment.style.display="none";
    }
    //预约界面
    var appointment_cancel_btn=appointment.getElementsByTagName("input");
    for(var i=0;i<appointment_cancel_btn.length;i++){
        appointment_cancel_btn[i].onclick=cancelAppiontment;
    }
    function cancelAppiontment(){
        if(this.parentElement.previousSibling.previousSibling.previousSibling.previousSibling.innerHTML=="审核中"){
            this.parentElement.previousSibling.previousSibling.previousSibling.previousSibling.innerHTML="已取消";
            alert("取消成功！");
        }
    }
}

