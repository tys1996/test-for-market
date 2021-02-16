
$(function () {
    var userid=GetQueryString("userid") //从url获取参数
    $.post({
        //通过id查询数据，定位到控制层
        url:'userinfo/dataByid?userid='+userid,
        success:function (data) {
            // 控制台是否获得信息
            console.log(data)

            $("#username").val(data.username)
            $("#phone").val(data.phone);
            $("#address").val(data.address);
            $("#image").val(data.userimage);

            //text保存回显的所有数据，对应html中的格式
            var text =
                "       <tr>\n" +
                "            <th>" + data.userid + "</th>\n" +
                "            <th>" + data.username + "</th>\n" +
                "            <th>" + data.userimage + "</th>\n" +
                "            <th>" + data.phone + "</th>\n" +
                "            <th>" + data.address + "</th>\n" +
                "            <td>\n" +
                "               <a href=\"updatePSW.html?userid="+data.userid+"\"  class=\"btn btn-success\">修改用户名和密码</a>\n" +
                "               <a href=\"?userid="+data.userid+"\" class=\"btn btn-success\">上传头像</a>\n" +
                "               <a href=\"?userid="+data.userid+"\"  class=\"btn btn-success\">修改收货地址</a>\n" +
                "               <a href=\"?userid="+data.userid+"\" class=\"btn btn-success\">查看订单</a>\n" +
                "             </td>\n" +
                "         </tr>"

            var obj = $(".pool");
            obj.append(text); //在pool里添加html的代码


        }
    })

})

//页面加载完毕，jquery获取url的参数
function GetQueryString(name){
    var reg=new RegExp("(^|&)"+name+"=([^&]*)(&|$)");
    var r=window.location.search.substr(1).match(reg);
    if(r!=null)return unescape(r[2]);return null;
}
