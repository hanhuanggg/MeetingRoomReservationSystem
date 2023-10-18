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
    var show_name=document.getElementById("name");
    show_name.innerHTML=username;
}

