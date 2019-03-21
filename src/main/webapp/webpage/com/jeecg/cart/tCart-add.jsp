<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>主表</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<t:base type="bootstrap,layer,validform,bootstrap-form"></t:base>
<script src="${webRoot}/plug-in/lhgDialog/lhgdialog.min.js"></script>
<script src="${webRoot}/plug-in/jquery-plugs/i18n/jquery.i18n.properties.js"></script>
<script src="${webRoot}/plug-in/tools/curdtools.js"></script>
</head>
<body>
<div class="container" style="width:100%;overflow-x:hidden">
<div class="panel panel-default">
<div class="panel-heading"></div>
<div class="panel-body">
<form class="form-horizontal" role="form" id="formobj" action="tCartController.do?doAdd" method="POST">
	<input type="hidden" id="btn_sub" class="btn_sub"/>
	<input type="hidden" id="id" name="id"/>
	<fieldset>
		<legend>车辆信息表</legend>
		<div class="main-form">
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车辆名称：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="name" name="name"  type="text" class="form-control input-sm" maxlength="150"  datatype="*"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车牌时间：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
		            		<div class="input-group input-group-sm">
		            			<input id="cartBrandTime" name="cartBrandTime" type="text" class="form-control input-sm laydate-date" value="<fmt:formatDate pattern='yyyy-MM-dd' type='date' value='${cartBrandTime}'/>"  datatype="*"  ignore="checked"  />
		            			<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
		            		</div>
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							归属地：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="qCellCore" name="qCellCore"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							所在地：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="locationAddr" name="locationAddr"  type="text" class="form-control input-sm" maxlength="32"  datatype="*"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							排放标准：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="emissionStandard" name="emissionStandard"  type="text" class="form-control input-sm" maxlength="32"  datatype="*"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							颜色：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="color" name="color"  type="text" class="form-control input-sm" maxlength="32"  datatype="*"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							里程数：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="mileage" name="mileage"  type="text" class="form-control input-sm" maxlength="32"  datatype="*"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							价格：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="price" name="price"  type="text" class="form-control input-sm" maxlength="10"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							新车价格：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="newPrice" name="newPrice"  type="text" class="form-control input-sm" maxlength="32"  datatype="*"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							首付价格：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="downPayments" name="downPayments"  type="text" class="form-control input-sm" maxlength="10"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							月供：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="monthlySupply" name="monthlySupply"  type="text" class="form-control input-sm" maxlength="10"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							排量：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="displacement" name="displacement"  type="text" class="form-control input-sm" maxlength="32"  datatype="*"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							变速箱：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="gearBox" name="gearBox"  type="text" class="form-control input-sm" maxlength="100"  datatype="*"  ignore="checked"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
	</fieldset>

	<ul class="nav nav-tabs" style="margin-bottom:0" id="subTabs">
		<li class="active"><a href="#tCartBanner" data-toggle="tab">实拍图</a></li>  
		<li><a href="#tCartConfigHightLight" data-toggle="tab">配置亮点</a></li>  
		<li><a href="#tCartBody" data-toggle="tab">车身配置</a></li>  
		<li><a href="#tCartEngine" data-toggle="tab">发动机配置</a></li>  
		<li><a href="#tCartGearbox" data-toggle="tab">变速箱配置</a></li>  
		<li><a href="#tCartChassis" data-toggle="tab">底盘配置</a></li>  
		<li><a href="#tCartWheelBraking" data-toggle="tab">车轮制动配置</a></li>  
		<li><a href="#tCartSafe" data-toggle="tab">安全装备</a></li>  
		<li><a href="#tCartManipulation" data-toggle="tab">操控配置</a></li>  
		<li><a href="#tCartExternalConfig" data-toggle="tab">外部配置</a></li>  
		<li><a href="#tCartInterConfig" data-toggle="tab">内部配置</a></li>  
		<li><a href="#tCartSeatConfig" data-toggle="tab">座椅配置</a></li>  
		<li><a href="#tCartMultimediaConfig" data-toggle="tab">多媒体配置</a></li>  
		<li><a href="#tCartLightConfig" data-toggle="tab">灯光配置</a></li>  
		<li><a href="#tCartGlassRearviewMirror" data-toggle="tab">玻璃/后视镜配置</a></li>  
		<li><a href="#tCartAirRefrigerator" data-toggle="tab">空调/冰箱配置</a></li>  
		<li><a href="#tCartHighTechConfig" data-toggle="tab">高科技配置</a></li>  
	</ul>
	<div class="tab-content" style="background-color:#fff;padding-top:10px;">
		<div class="tab-pane fade in active" id="tCartBanner">  
			<div class="form-tb-toolbar">
				<button onclick="addOneRow('tCartBanner_table')" type="button" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-plus"></span>&nbsp;添加</button>
				<button onclick="deleteSelectRows('tCartBanner_table')" type="button" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-minus"></span>&nbsp;删除</button>
			</div>
	   		<div style="overflow-x:auto">
	   		<table class="table subinfo-table" id="tCartBanner_table">
		   		<thead>
		   		<tr>
		   			<th align="center" style="width:25px;"></th>
					<th>车辆图片</th>
				</thead>
				<tbody>
			  	<tr>
			  		<td class="form-ck"><input type="checkbox" name="ck"/></td>
					<td>
				            		<input onclick="onetomanyUpload('tCartBannerList[0].image')" class="btn btn-default" type="button" value="上传附件" />	
									<input id="tCartBannerList[0].image" type="hidden" name="tCartBannerList[0].image" />
										<a target="_blank" class="btn btn-link"></a>
					</td>
			  	</tr>
			 	</tbody>
			</table>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartConfigHightLight">  
			<div class="form-tb-toolbar">
				<button onclick="addOneRow('tCartConfigHightLight_table')" type="button" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-plus"></span>&nbsp;添加</button>
				<button onclick="deleteSelectRows('tCartConfigHightLight_table')" type="button" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-minus"></span>&nbsp;删除</button>
			</div>
	   		<div style="overflow-x:auto">
	   		<table class="table subinfo-table" id="tCartConfigHightLight_table">
		   		<thead>
		   		<tr>
		   			<th align="center" style="width:25px;"></th>
					<th>配置亮点Id</th>
				</thead>
				<tbody>
			  	<tr>
			  		<td class="form-ck"><input type="checkbox" name="ck"/></td>
					<td>
			            	<div style="padding-top:5px">
			            	<t:dictSelect id="tCartConfigHightLightList[0].configHightLightId" field="tCartConfigHightLightList[0].configHightLightId"  extendJson="{class:'i-checks'}" type="checkbox" hasLabel="false"  title="配置亮点Id"  dictTable="t_config_high_light" dictField="id" dictText="name" ></t:dictSelect>
			            	</div>
					</td>
			  	</tr>
			 	</tbody>
			</table>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartBody">  
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							长度：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cartLength" name="tCartBodyEntity.cartLength"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							宽度：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cartWidth" name="tCartBodyEntity.cartWidth"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							高度：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cartHight" name="tCartBodyEntity.cartHight"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							轴距：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.wheelbase" name="tCartBodyEntity.wheelbase"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前轮距：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.frontWheelPitch" name="tCartBodyEntity.frontWheelPitch"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后轮距：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.rearWheelPitch" name="tCartBodyEntity.rearWheelPitch"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							最小离地间隙：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.miniGround" name="tCartBodyEntity.miniGround"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							整车质量：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cartFullWeight" name="tCartBodyEntity.cartFullWeight"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车身结构：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cartStructure" name="tCartBodyEntity.cartStructure"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车门数：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cartDoorNum" name="tCartBodyEntity.cartDoorNum"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							座位数：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cartSeatNum" name="tCartBodyEntity.cartSeatNum"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							邮箱容积：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.tankVolume" name="tCartBodyEntity.tankVolume"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							行李箱容积：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cargoVolume" name="tCartBodyEntity.cargoVolume"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartEngine">  
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							发动机型号：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.engineOdel" name="tCartEngineEntity.engineOdel"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							排量：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.displacement" name="tCartEngineEntity.displacement"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							进气形式：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.intakeForm" name="tCartEngineEntity.intakeForm"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							气缸排列形式：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.cylinderArrangementDorm" name="tCartEngineEntity.cylinderArrangementDorm"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							气缸数：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.cylinderNum" name="tCartEngineEntity.cylinderNum"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							气门数：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.cylinderDoorNumber" name="tCartEngineEntity.cylinderDoorNumber"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							缸径：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.cylinderDiameter" name="tCartEngineEntity.cylinderDiameter"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							行程：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.trip" name="tCartEngineEntity.trip"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							最大马力：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.maxHorsepower" name="tCartEngineEntity.maxHorsepower"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							最大功率：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.maxPower" name="tCartEngineEntity.maxPower"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							最大功率转速：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.maxPowerSpeed" name="tCartEngineEntity.maxPowerSpeed"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							最大扭矩：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.maxTorque" name="tCartEngineEntity.maxTorque"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							最大扭矩转速：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.maxTorqueSpeed" name="tCartEngineEntity.maxTorqueSpeed"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							发动机特有技术：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.engineSpecificTechnology" name="tCartEngineEntity.engineSpecificTechnology"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							燃料形式：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.fuelForm" name="tCartEngineEntity.fuelForm"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							燃油标号：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.fuelLabeling" name="tCartEngineEntity.fuelLabeling"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							供油方式：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.fuelSupplyMode" name="tCartEngineEntity.fuelSupplyMode"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							缸盖材料：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.cylinderHeadMaterial" name="tCartEngineEntity.cylinderHeadMaterial"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							缸体材料：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.cylinderBlockMaterial" name="tCartEngineEntity.cylinderBlockMaterial"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							环保标准：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.environmentalStandards" name="tCartEngineEntity.environmentalStandards"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartGearbox">  
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							挡位个数：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGearboxEntity.gearsNum" name="tCartGearboxEntity.gearsNum"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							变速箱类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGearboxEntity.gearboxType" name="tCartGearboxEntity.gearboxType"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartChassis">  
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							驱动方式：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartChassisEntity.drivingMode" name="tCartChassisEntity.drivingMode"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							四驱形式：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartChassisEntity.fourWheelDrive" name="tCartChassisEntity.fourWheelDrive"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							中央差速器结构：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartChassisEntity.centralDifferentialStructure" name="tCartChassisEntity.centralDifferentialStructure"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前悬架类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartChassisEntity.frontSuspensionType" name="tCartChassisEntity.frontSuspensionType"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后悬架类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartChassisEntity.rearSuspensionType" name="tCartChassisEntity.rearSuspensionType"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							助力类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartChassisEntity.assistanceType" name="tCartChassisEntity.assistanceType"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车体结构：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartChassisEntity.carBodyStructure" name="tCartChassisEntity.carBodyStructure"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartWheelBraking">  
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前制动器类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartWheelBrakingEntity.frontBrakeType" name="tCartWheelBrakingEntity.frontBrakeType"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后制动器类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartWheelBrakingEntity.rearBrakeType" name="tCartWheelBrakingEntity.rearBrakeType"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							驻车自动类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartWheelBrakingEntity.parkingAutomationType" name="tCartWheelBrakingEntity.parkingAutomationType"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前轮胎规格：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartWheelBrakingEntity.frontTireSpecification" name="tCartWheelBrakingEntity.frontTireSpecification"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后轮胎类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartWheelBrakingEntity.rearTireType" name="tCartWheelBrakingEntity.rearTireType"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							备胎规格：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartWheelBrakingEntity.spareTireSpecification" name="tCartWheelBrakingEntity.spareTireSpecification"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartSafe">  
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							主副驾驶安全气囊：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.mainCoPilotAirbags" name="tCartSafeEntity.mainCoPilotAirbags"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前后排侧气囊：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.anteriorLateralBalloon" name="tCartSafeEntity.anteriorLateralBalloon"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前后排头部气囊：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.frontBackRowHeadBalloon" name="tCartSafeEntity.frontBackRowHeadBalloon"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							膝部气囊：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.kneeAirbag" name="tCartSafeEntity.kneeAirbag"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							胎压监测装置：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.tirePressureMonitoring" name="tCartSafeEntity.tirePressureMonitoring"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							零胎压继续行驶：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.zeroTirePressureToContinue" name="tCartSafeEntity.zeroTirePressureToContinue"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							安全带未息提示：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.seatbeltHint" name="tCartSafeEntity.seatbeltHint"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							ISOFIX儿童座椅接口：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.isofix" name="tCartSafeEntity.isofix"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							发动起电子防盗：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.launchElectronicAntiTheft" name="tCartSafeEntity.launchElectronicAntiTheft"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车内中控锁：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.inCarCentralControlLock" name="tCartSafeEntity.inCarCentralControlLock"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							遥控钥匙：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.remoteKey" name="tCartSafeEntity.remoteKey"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							无钥匙启动系统：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.keylessStartupSystem" name="tCartSafeEntity.keylessStartupSystem"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							无钥匙进入系统：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.keylessAccessSystem" name="tCartSafeEntity.keylessAccessSystem"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartManipulation">  
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							ABS防抱死：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.abs" name="tCartManipulationEntity.abs"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							制动分配：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.distributionBrake" name="tCartManipulationEntity.distributionBrake"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							刹车辅助：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.assistBrake" name="tCartManipulationEntity.assistBrake"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							牵引力控制：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.tractionControl" name="tCartManipulationEntity.tractionControl"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车身稳定控制：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.bodyStabilityControl" name="tCartManipulationEntity.bodyStabilityControl"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							上坡辅助：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.hillStartAssist" name="tCartManipulationEntity.hillStartAssist"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							自动驻车：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.automaticParking" name="tCartManipulationEntity.automaticParking"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							陡坡缓降：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.hdc" name="tCartManipulationEntity.hdc"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							可变悬架：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.variableSuspension" name="tCartManipulationEntity.variableSuspension"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							空气悬架：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.airSuspension" name="tCartManipulationEntity.airSuspension"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartExternalConfig">  
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							电动天窗：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.electricSkylight" name="tCartExternalConfigEntity.electricSkylight"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							全景天窗：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.panoramicSunroof" name="tCartExternalConfigEntity.panoramicSunroof"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							运动外观套件：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.sportsAppearanceKit" name="tCartExternalConfigEntity.sportsAppearanceKit"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							铝合金轮圈：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.aluminumAlloyWheels" name="tCartExternalConfigEntity.aluminumAlloyWheels"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							电动吸合门：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.electricSuctionDoor" name="tCartExternalConfigEntity.electricSuctionDoor"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							侧滑门：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.sideslipDoor" name="tCartExternalConfigEntity.sideslipDoor"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							电动后备厢：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.electricTrunk" name="tCartExternalConfigEntity.electricTrunk"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							感应后备厢：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.inductionTrunk" name="tCartExternalConfigEntity.inductionTrunk"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车顶行李架：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.roofLuggageRack" name="tCartExternalConfigEntity.roofLuggageRack"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartInterConfig">  
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							真皮方向盘：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.leatherSteeringWheel" name="tCartInterConfigEntity.leatherSteeringWheel"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							方向盘调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.steeringWheelAdjustment" name="tCartInterConfigEntity.steeringWheelAdjustment"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							方向盘电动调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.steeringElectricRegulation" name="tCartInterConfigEntity.steeringElectricRegulation"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							多功能方向盘：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.multifunctionalSteeringWheel" name="tCartInterConfigEntity.multifunctionalSteeringWheel"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							方向盘换挡：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.steeringWheelShift" name="tCartInterConfigEntity.steeringWheelShift"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							方向盘加热：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.steeringWheelHeating" name="tCartInterConfigEntity.steeringWheelHeating"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							定速巡航：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.cruiseControl" name="tCartInterConfigEntity.cruiseControl"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前后驻车雷达：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.frontBackParkingRadar" name="tCartInterConfigEntity.frontBackParkingRadar"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							倒车视频影像：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.reversingVideoImage" name="tCartInterConfigEntity.reversingVideoImage"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							行车电脑显示屏：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.drivingComputerDisplay" name="tCartInterConfigEntity.drivingComputerDisplay"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							全液晶仪表盘：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.allLiquidCrystalDashboard" name="tCartInterConfigEntity.allLiquidCrystalDashboard"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartSeatConfig">  
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							座椅材质：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSeatConfigEntity.seatMaterial" name="tCartSeatConfigEntity.seatMaterial"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							座椅高低调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSeatConfigEntity.seatHeightAdjustment" name="tCartSeatConfigEntity.seatHeightAdjustment"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							腰部支撑调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSeatConfigEntity.adjustmentOfWaistSupport" name="tCartSeatConfigEntity.adjustmentOfWaistSupport"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							主副驾驶做电动调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSeatConfigEntity.mainCoDriversMakeElectric" name="tCartSeatConfigEntity.mainCoDriversMakeElectric"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后排座椅电动调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSeatConfigEntity.rearSeatElectricAdjustment" name="tCartSeatConfigEntity.rearSeatElectricAdjustment"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前后排座椅加热：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSeatConfigEntity.heatingFrontRearSeats" name="tCartSeatConfigEntity.heatingFrontRearSeats"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前后排座椅通风：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSeatConfigEntity.ventilationFrontRearSeats" name="tCartSeatConfigEntity.ventilationFrontRearSeats"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartMultimediaConfig">  
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							GPS导航系统：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartMultimediaConfigEntity.gps" name="tCartMultimediaConfigEntity.gps"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							中控台彩色大屏：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartMultimediaConfigEntity.centralConsoleColourScreen" name="tCartMultimediaConfigEntity.centralConsoleColourScreen"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							蓝牙电话：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartMultimediaConfigEntity.bluetoothTelephone" name="tCartMultimediaConfigEntity.bluetoothTelephone"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							外接音源接口：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartMultimediaConfigEntity.externalSourceInterface" name="tCartMultimediaConfigEntity.externalSourceInterface"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							多媒体系统：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartMultimediaConfigEntity.multimediaSystem" name="tCartMultimediaConfigEntity.multimediaSystem"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							扬声器数量：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartMultimediaConfigEntity.speakersNum" name="tCartMultimediaConfigEntity.speakersNum"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartLightConfig">  
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							近光灯远光灯：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.lowHighLightLamps" name="tCartLightConfigEntity.lowHighLightLamps"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							日间行车灯：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.drl" name="tCartLightConfigEntity.drl"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							自适应远光灯：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.adaptiveHighLightLamp" name="tCartLightConfigEntity.adaptiveHighLightLamp"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							自动头灯：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.automaticHeadlamp" name="tCartLightConfigEntity.automaticHeadlamp"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							转向辅助灯：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.steeringAuxiliaryLamp" name="tCartLightConfigEntity.steeringAuxiliaryLamp"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							转向头灯：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.headlight" name="tCartLightConfigEntity.headlight"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前雾灯：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.frontFogLamp" name="tCartLightConfigEntity.frontFogLamp"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							大灯高度可调：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.headlampHeightAdjustable" name="tCartLightConfigEntity.headlampHeightAdjustable"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							大灯清洗装置：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.headlampCleaningDevice" name="tCartLightConfigEntity.headlampCleaningDevice"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartGlassRearviewMirror">  
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前后电动车窗：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.frontRearElectricWindow" name="tCartGlassRearviewMirrorEntity.frontRearElectricWindow"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车窗防夹手功能：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.antiClipFunctionWindow" name="tCartGlassRearviewMirrorEntity.antiClipFunctionWindow"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后视镜电动调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.rearviewMirror" name="tCartGlassRearviewMirrorEntity.rearviewMirror"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后视镜加热：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.rearviewMirrorHeating" name="tCartGlassRearviewMirrorEntity.rearviewMirrorHeating"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							内外后视镜自动防眩目：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.autoInsideOutsideRearview" name="tCartGlassRearviewMirrorEntity.autoInsideOutsideRearview"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后视镜电动折叠：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.electricFoldingMirror" name="tCartGlassRearviewMirrorEntity.electricFoldingMirror"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							遮阳板化妆镜：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.sunshadeMakeupMirror" name="tCartGlassRearviewMirrorEntity.sunshadeMakeupMirror"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后雨刷：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.rearWiper" name="tCartGlassRearviewMirrorEntity.rearWiper"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							感应雨刷：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.inductionWiper" name="tCartGlassRearviewMirrorEntity.inductionWiper"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartAirRefrigerator">  
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							空调控制方式：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartAirRefrigeratorEntity.airControlMode" name="tCartAirRefrigeratorEntity.airControlMode"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后排独立空调：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartAirRefrigeratorEntity.rearIndependentAir" name="tCartAirRefrigeratorEntity.rearIndependentAir"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后座出风口：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartAirRefrigeratorEntity.rearOutlet" name="tCartAirRefrigeratorEntity.rearOutlet"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							温度分区控制：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartAirRefrigeratorEntity.temperatureZoningControl" name="tCartAirRefrigeratorEntity.temperatureZoningControl"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车内空气调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartAirRefrigeratorEntity.inCarAirConditioning" name="tCartAirRefrigeratorEntity.inCarAirConditioning"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车载冰箱：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartAirRefrigeratorEntity.vehicleRefrigerator" name="tCartAirRefrigeratorEntity.vehicleRefrigerator"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartHighTechConfig">  
			<div class="row">
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							自动泊车入位：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.automaticParking" name="tCartHighTechConfigEntity.automaticParking"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							发动机启停技术：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.engineStartStopTechnology" name="tCartHighTechConfigEntity.engineStartStopTechnology"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							并线辅助：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.doublingAssistance" name="tCartHighTechConfigEntity.doublingAssistance"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车道偏离预警系统：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.ldws" name="tCartHighTechConfigEntity.ldws"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							主动刹车：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.activeBrake" name="tCartHighTechConfigEntity.activeBrake"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							整体主动转向系统：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.integralActiveSteeringSys" name="tCartHighTechConfigEntity.integralActiveSteeringSys"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							夜视系统：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.nightVisionSystem" name="tCartHighTechConfigEntity.nightVisionSystem"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							中控液晶屏分屏：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.lcdScreenDivider" name="tCartHighTechConfigEntity.lcdScreenDivider"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							自适应巡航：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.adaptiveCruise" name="tCartHighTechConfigEntity.adaptiveCruise"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							全景摄像头：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.panoramicCamera" name="tCartHighTechConfigEntity.panoramicCamera"  type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</form>
</div>
</div>
</div>
<table style="display:none">
	<tbody id="tCartBanner_table_template">
		<tr>
			<td class="form-ck"><input type="checkbox" name="ck"/></td>
			<td>
				            		<input onclick="onetomanyUpload('tCartBannerList[#index#].image')" class="btn btn-default" type="button" value="上传附件" />	
									<input id="tCartBannerList[#index#].image" type="hidden" name="tCartBannerList[#index#].image" />
										<a target="_blank" class="btn btn-link"></a>
			</td>
		</tr>
	</tbody>
	<tbody id="tCartConfigHightLight_table_template">
		<tr>
			<td class="form-ck"><input type="checkbox" name="ck"/></td>
			<td>
			            	<div style="padding-top:5px">
			            	<t:dictSelect id="tCartConfigHightLightList[#index#].configHightLightId" field="tCartConfigHightLightList[#index#].configHightLightId"  extendJson="{class:'i-checks-tpl'}" type="checkbox" hasLabel="false"  title="配置亮点Id"  dictTable="t_config_high_light" dictField="id" dictText="name" ></t:dictSelect>
			            	</div>
			</td>
		</tr>
	</tbody>
</table>
<script type="text/javascript">
$(document).ready(function() {
	formControlInit();
	//表单提交
	$("#formobj").Validform({
		tiptype:function(msg,o,cssctl){
			if(o.type==3){
				var oopanel = $(o.obj).closest(".tab-pane");
				var a = 0;
				if(oopanel.length>0){
					var panelID = oopanel.attr("id");
					if(!!panelID){
						var waitActive = $('#subTabs a[href="#'+panelID+'"]');
						if(!waitActive.hasClass("active")){
							waitActive.tab('show')
							a = 1;
						}
					}
				}
				if(a==1){
					setTimeout(function(){validationMessage(o.obj,msg);},366);
				}else{
					validationMessage(o.obj,msg);
				}
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
function formControlInit(){
	$(".laydate-datetime").each(function(){
		if($(this).attr("name").indexOf('#index#')<=0){
			var _this = this;
			laydate.render({
			  elem: this,
			  format: 'yyyy-MM-dd HH:mm:ss',
			  type: 'datetime',
			  done:function(){
				  _this.focus();
			  }
			});
		}
	});
	$(".laydate-date").each(function(){
		if($(this).attr("name").indexOf('#index#')<=0){
			var _this = this;
			laydate.render({
			  elem: this,
			  done:function(){
				  _this.focus();
			  }
			});
		}
	});
	//单选框/多选框初始化
	$('.i-checks').iCheck({
		labelHover : false,
		cursor : true,
		checkboxClass : 'icheckbox_square-green',
		radioClass : 'iradio_square-green',
		increaseArea : '20%'
	});
}
//初始化下标
function resetTrNum(tableId) {
	$tbody = $("#"+tableId+"");
	$tbody.find('tbody > tr').each(function(i){
		$(':input, select,button,a', this).each(function(){
			var $this = $(this),validtype_str = $this.attr('validType'), name = $this.attr('name'),id=$this.attr('id'),onclick_str=$this.attr('onclick'), val = $this.val();
			if(name!=null){
				if (name.indexOf("#index#") >= 0){
					$this.attr("name",name.replace('#index#',i));
				}else{
					var s = name.indexOf("[");
					var e = name.indexOf("]");
					var new_name = name.substring(s+1,e);
					$this.attr("name",name.replace(new_name,i));
				}
			}
			if(id!=null){
				if (id.indexOf("#index#") >= 0){
					$this.attr("id",id.replace('#index#',i));
				}else{
					var s = id.indexOf("[");
					var e = id.indexOf("]");
					var new_id = id.substring(s+1,e);
					$this.attr("id",id.replace(new_id,i));
				}
			}
			if(onclick_str!=null){
				if (onclick_str.indexOf("#index#") >= 0){
					$this.attr("onclick",onclick_str.replace(/#index#/g,i));
				}else{
				    var s = onclick_str.indexOf("[");
					var e = onclick_str.indexOf("]");
					var new_onclick_str = onclick_str.substring(s+1,e);
					if(new_onclick_str!=''){
						$this.attr("onclick",onclick_str.replace(new_onclick_str,i));
					}
				}
			}
			if(validtype_str!=null){
				if(validtype_str.indexOf("#index#") >= 0){
					$this.attr("validType",validtype_str.replace('#index#',i));
				}
			}
			var class_str = $this.attr("class");
			if(!!class_str && class_str.indexOf("i-checks-tpl")>=0){
				$this.attr("class",class_str.replace(/i-checks-tpl/,"i-checks"));
			}
		});
		//$(this).find('div[name=\'xh\']').html(i+1);
	});
}
//新增一行
function addOneRow(tableId){
 	var tr =  $("#"+tableId+"_template tr").clone();
 	 $("#"+tableId).append(tr);
 	 resetTrNum(tableId);
 	 formControlInit();
}
//删除所选行
function deleteSelectRows(tableId){
	$("#"+tableId).find("input[name$='ck']:checked").parent().parent().remove();   
    resetTrNum(tableId); 
}
//通用弹出式文件上传
function onetomanyUpload(inputName){
    $.dialog({
           content: "url:${webRoot}/systemController.do?commonWebUpload",
           lock : true,
           title:"文件上传",
           zIndex:getzIndex(),
           width:700,
           height: 200,
           parent:windowapi,
           cache:false,
	       ok: function(){
	               var iframe = this.iframe.contentWindow;
	               var url = iframe.uploadCallback();
	               $("input[name='"+inputName+"']").val(url);
	               $("input[name='"+inputName+"']").next("a").attr("href","img/server/"+url+"?down=true").html("下载");
	               return true;
	       },
	       cancelVal: '关闭',
	       cancel: function(){
       	   } 
      });
  }
</script>
</body>
</html>