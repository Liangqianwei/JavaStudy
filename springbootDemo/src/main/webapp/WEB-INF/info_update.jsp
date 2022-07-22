<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/20
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ include file="header.jsp"%>
</head>
<body>
    <form id="formId" class="layui-form layui-form-pane" action="">
        <input type="hidden" name="id" value="${info.id}"/>
        <div class="layui-form-item">
            <label class="layui-form-label">CREATED_BY</label>
            <div class="layui-input-block">
                <input type="text" name="CREATED_BY" value="${info.CREATED_BY}" autocomplete="off" placeholder="请输入创建人" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">UPDATED_BY</label>
            <div class="layui-input-block">
                <input type="text" name="UPDATED_BY" value="${info.UPDATED_BY}" autocomplete="off" placeholder="请输入修改人" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">OUT_TRADE_NO</label>
            <div class="layui-input-block">
                <input type="text" name="OUT_TRADE_NO" value="${info.OUT_TRADE_NO}" autocomplete="off" placeholder="请输入商户订单号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">PLATFORM_TYPE</label>
            <div class="layui-input-block">
                <input type="text" name="PLATFORM_TYPE" value="${info.PLATFORM_TYPE}" autocomplete="off" placeholder="请输入支付方式" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">GOODS_INFO</label>
            <div class="layui-input-block">
                <input type="text" name="GOODS_INFO" value="${info.GOODS_INFO}" autocomplete="off" placeholder="请输入商品信息" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">TRADE_AMT</label>
            <div class="layui-input-block">
                <input type="text" name="TRADE_AMT" value="${info.TRADE_AMT}" autocomplete="off" placeholder="请输入交易总金额" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">RESULT_MSG</label>
            <div class="layui-input-block">
                <input type="text" name="RESULT_MSG" value="${info.RESULT_MSG}" autocomplete="off" placeholder="请输入错误描述" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <!--<label class="layui-form-label"></label> -->
            <div class="layui-input-inline">
                <input type="button" class="layui-btn" value="更新"  onclick="submitForm()" lay-submit lay-filter="login" />
                <input type="reset" class="layui-btn layui-btn-primary" value="重置" />
            </div>
        </div>
    </form>
    <script type="text/javascript">
        function submitForm() {
            $.post(
                '${path}/Info/update',
                $('#formId').serialize(), //{'name':'zhansgan','password':'123'}
                /*function(jsonResult) {
                    if (jsonResult.code == 0) {
                        // mylayer.okMsg(jsonResult.msg);
                        // 获得当前弹出框的index
                        var index = parent.layer.getFrameIndex(window.name);
                        layer.msg(
                            jsonResult.msg,
                            {icon:1, time:1000},
                            function() { // msg弹出1秒后消失触发这个函数
                                // 关闭弹出层
                                parent.layer.close(index);
                                // 刷新父页面
                                window.parent.location.reload();
                            }
                        );

                    } else {
                        mylayer.errorMsg(jsonResult.msg);
                    }
                },*/
                function (jsonResult){
                    if(jsonResult.code == 0){
                        mylayer.okUrl(jsonResult.msg, '${path}/Info/selectAll');
                    }else{
                        mylayer.errorMsg(jsonResult.msg,'${path}/user/getLoginPage');
                    }
                },
                'json'
            );
        };
    </script>
</body>
</html>
