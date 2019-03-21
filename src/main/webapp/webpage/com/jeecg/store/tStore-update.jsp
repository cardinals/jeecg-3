<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>门店信息表</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<t:base type="bootstrap,bootstrap-table,layer,validform,bootstrap-form"></t:base>
</head>
 <body style="overflow:hidden;overflow-y:auto;">
 <div class="container" style="width:100%;">
	<div class="panel-heading"></div>
	<div class="panel-body">
	<form class="form-horizontal" role="form" id="formobj" action="tStoreController.do?doUpdate" method="POST">
		<input type="hidden" id="btn_sub" class="btn_sub"/>
		<input type="hidden" id="id" name="id" value="${tStore.id}"/>
	<div class="form-group">
		<label for="name" class="col-sm-3 control-label">门店名称：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="name" name="name" value='${tStore.name}' type="text" maxlength="32" class="form-control input-sm" placeholder="请输入门店名称"  datatype="*"  ignore="checked" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="address" class="col-sm-3 control-label">地址：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="address" name="address" value='${tStore.address}' type="text" maxlength="150" class="form-control input-sm" placeholder="请输入地址"  datatype="*"  ignore="checked" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="phoneNumber" class="col-sm-3 control-label">手机号：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="phoneNumber" name="phoneNumber" value='${tStore.phoneNumber}' type="text" maxlength="11" class="form-control input-sm" placeholder="请输入手机号"  datatype="*"  ignore="checked" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="lng" class="col-sm-3 control-label">经度：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="lng" name="lng" value='${tStore.lng}' type="text" maxlength="150" class="form-control input-sm" placeholder="请输入经度"  datatype="*"  ignore="checked" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="lat" class="col-sm-3 control-label">维度：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="lat" name="lat" value='${tStore.lat}' type="text" maxlength="150" class="form-control input-sm" placeholder="请输入维度"  datatype="*"  ignore="checked" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="userName" class="col-sm-3 control-label">负责人：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="userName" name="userName" value='${tStore.userName}' type="text" maxlength="32" class="form-control input-sm" placeholder="请输入负责人"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="browseNum" class="col-sm-3 control-label">浏览人数：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="browseNum" name="browseNum" value='${tStore.browseNum}' type="text" maxlength="32" class="form-control input-sm" placeholder="请输入浏览人数"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="soldNum" class="col-sm-3 control-label">已售车数：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="soldNum" name="soldNum" value='${tStore.soldNum}' type="text" maxlength="32" class="form-control input-sm" placeholder="请输入已售车数"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="cartNum" class="col-sm-3 control-label">在售车数：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="cartNum" name="cartNum" value='${tStore.cartNum}' type="text" maxlength="32" class="form-control input-sm" placeholder="请输入在售车数"  ignore="ignore" />
			</div>
		</div>
	</div>
	</form>
	</div>
 </div>
<script type="text/javascript">
var subDlgIndex = '';
$(document).ready(function() {
	//单选框/多选框初始化
	$('.i-checks').iCheck({
		labelHover : false,
		cursor : true,
		checkboxClass : 'icheckbox_square-green',
		radioClass : 'iradio_square-green',
		increaseArea : '20%'
	});
	
	//表单提交
	$("#formobj").Validform({
		tiptype:function(msg,o,cssctl){
			if(o.type==3){
				validationMessage(o.obj,msg);
			}else{
				removeMessage(o.obj);
			}
		},
		btnSubmit : "#btn_sub",
		btnReset : "#btn_reset",
		ajaxPost : true,
		beforeSubmit : function(curform) {
		},
		usePlugin : {
			passwordstrength : {
				minLen : 6,
				maxLen : 18,
				trigger : function(obj, error) {
					if (error) {
						obj.parent().next().find(".Validform_checktip").show();
						obj.find(".passwordStrength").hide();
					} else {
						$(".passwordStrength").show();
						obj.parent().next().find(".Validform_checktip").hide();
					}
				}
			}
		},
		callback : function(data) {
			var win = frameElement.api.opener;
			if (data.success == true) {
				frameElement.api.close();
			    win.reloadTable();
			    win.tip(data.msg);
			} else {
			    if (data.responseText == '' || data.responseText == undefined) {
			        $.messager.alert('错误', data.msg);
			        $.Hidemsg();
			    } else {
			        try {
			            var emsg = data.responseText.substring(data.responseText.indexOf('错误描述'), data.responseText.indexOf('错误信息'));
			            $.messager.alert('错误', emsg);
			            $.Hidemsg();
			        } catch (ex) {
			            $.messager.alert('错误', data.responseText + "");
			            $.Hidemsg();
			        }
			    }
			    return false;
			}
		}
	});
});
</script>
</body>
</html>