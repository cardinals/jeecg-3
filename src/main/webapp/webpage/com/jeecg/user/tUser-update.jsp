<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>用户表</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<t:base type="bootstrap,bootstrap-table,layer,validform,webuploader,bootstrap-form"></t:base>
</head>
 <body style="overflow:hidden;overflow-y:auto;">
 <div class="container" style="width:100%;">
	<div class="panel-heading"></div>
	<div class="panel-body">
	<form class="form-horizontal" role="form" id="formobj" action="tUserController.do?doUpdate" method="POST">
		<input type="hidden" id="btn_sub" class="btn_sub"/>
		<input type="hidden" id="id" name="id" value="${tUser.id}"/>
	<div class="form-group">
		<label for="nickName" class="col-sm-3 control-label">昵称：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="nickName" name="nickName" value='${tUser.nickName}' type="text" maxlength="32" class="form-control input-sm" placeholder="请输入昵称"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="phoneNumber" class="col-sm-3 control-label">手机号：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="phoneNumber" name="phoneNumber" value='${tUser.phoneNumber}' type="text" maxlength="11" class="form-control input-sm" placeholder="请输入手机号"  ignore="checked" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="openId" class="col-sm-3 control-label">授权openId：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="openId" name="openId" value='${tUser.openId}' type="text" maxlength="32" class="form-control input-sm" placeholder="请输入授权openId"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="gender" class="col-sm-3 control-label">性别：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<t:dictSelect field="gender" type="radio" extendJson="{class:'i-checks'}"  typeGroupCode="gender"  hasLabel="false"  title="性别" defaultVal="${tUser.gender}"></t:dictSelect>
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="headImage" class="col-sm-3 control-label">头像：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<t:webUploader name="headImage" outJs="true" auto="true" showImgDiv="filediv_headImage" type="image" buttonText='添加图片' displayTxt="false" pathValues="${tUser.headImage}"></t:webUploader>
				<div class="form" id="filediv_headImage"></div>
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="province" class="col-sm-3 control-label">省名称：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
               <t:dictSelect field="province" type="list" extendJson="{class:'form-control input-sm'}"   typeGroupCode=""  hasLabel="false"  title="省名称" defaultVal="${tUser.province}"></t:dictSelect>
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="city" class="col-sm-3 control-label">城市：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
               <t:dictSelect field="city" type="list" extendJson="{class:'form-control input-sm'}"   typeGroupCode=""  hasLabel="false"  title="城市" defaultVal="${tUser.city}"></t:dictSelect>
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="country" class="col-sm-3 control-label">国家：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
               <t:dictSelect field="country" type="list" extendJson="{class:'form-control input-sm'}"   typeGroupCode=""  hasLabel="false"  title="国家" defaultVal="${tUser.country}"></t:dictSelect>
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="region" class="col-sm-3 control-label">地区：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
               <t:dictSelect field="region" type="list" extendJson="{class:'form-control input-sm'}"   typeGroupCode=""  hasLabel="false"  title="地区" defaultVal="${tUser.region}"></t:dictSelect>
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