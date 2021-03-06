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
<form class="form-horizontal" role="form" id="formobj" action="tCartController.do?doUpdate" method="POST">
	<input type="hidden" id="btn_sub" class="btn_sub"/>
	<input type="hidden" id="id" name="id" value="${tCartPage.id}"/>
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
							<input id="name" name="name" value = "${tCartPage.name}" type="text" class="form-control input-sm" maxlength="150"  datatype="*"  ignore="checked"  />
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
		            			<input id="cartBrandTime" name="cartBrandTime" type="text" class="form-control input-sm laydate-date" value="<fmt:formatDate pattern='yyyy-MM-dd' type='date' value='${tCartPage.cartBrandTime}'/>"  datatype="*"  ignore="checked"  />
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
							<input id="qCellCore" name="qCellCore" value = "${tCartPage.qCellCore}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							所在地：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="locationAddr" name="locationAddr" value = "${tCartPage.locationAddr}" type="text" class="form-control input-sm" maxlength="32"  datatype="*"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							排放标准：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="emissionStandard" name="emissionStandard" value = "${tCartPage.emissionStandard}" type="text" class="form-control input-sm" maxlength="32"  datatype="*"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							颜色：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="color" name="color" value = "${tCartPage.color}" type="text" class="form-control input-sm" maxlength="32"  datatype="*"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							里程数：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="mileage" name="mileage" value = "${tCartPage.mileage}" type="text" class="form-control input-sm" maxlength="32"  datatype="*"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							价格：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="price" name="price" value = "${tCartPage.price}" type="text" class="form-control input-sm" maxlength="10"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							新车价格：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="newPrice" name="newPrice" value = "${tCartPage.newPrice}" type="text" class="form-control input-sm" maxlength="32"  datatype="*"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							首付价格：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="downPayments" name="downPayments" value = "${tCartPage.downPayments}" type="text" class="form-control input-sm" maxlength="10"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							月供：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="monthlySupply" name="monthlySupply" value = "${tCartPage.monthlySupply}" type="text" class="form-control input-sm" maxlength="10"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							排量：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="displacement" name="displacement" value = "${tCartPage.displacement}" type="text" class="form-control input-sm" maxlength="32"  datatype="*"  ignore="checked"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							变速箱：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="gearBox" name="gearBox" value = "${tCartPage.gearBox}" type="text" class="form-control input-sm" maxlength="100"  datatype="*"  ignore="checked"  />
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
				<c:if test="${fn:length(tCartPage.tCartBannerList)  > 0 }">
				<c:forEach items="${tCartPage.tCartBannerList}" var="poVal" varStatus="stuts">
				<tr>
			  		<td class="form-ck">
			  			<input style="" type="checkbox" name="ck"/>
			  			<input name = "tCartBannerList[${stuts.index }].id" value= "${poVal.id}" type="hidden"/>
			  		</td>
					<td>
				            		<input onclick="onetomanyUpload('tCartBannerList[${stuts.index }].image')" class="btn btn-default" type="button" value="上传附件" />
									<input id="tCartBannerList[${stuts.index }].image" type="hidden" name="tCartBannerList[${stuts.index }].image" value = "${poVal.image}"/>
										<a target="_blank" class=".btn-default"							            <c:if test="${not empty poVal.image}">							              href="img/server/${poVal.image}?down=true">下载							            </c:if>							            <c:if test="${empty poVal.image}">></c:if>							            </a>					</td>
			  	</tr>
				</c:forEach>
				</c:if>
				<c:if test="${fn:length(tCartPage.tCartBannerList) <= 0 }">
				<tr>
			  		<td class="form-ck"><input type="checkbox" name="ck"/></td>
					<td>
				            		<input onclick="onetomanyUpload('tCartBannerList[0].image')" class="btn btn-default" type="button" value="上传附件" />
									<input id="tCartBannerList[0].image" type="hidden" name="tCartBannerList[0].image" />
										<a target="_blank" class="btn btn-link"></a>
					</td>
			  	</tr>
				</c:if>
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
				<c:if test="${fn:length(tCartPage.tCartConfigHightLightList)  > 0 }">
				<c:forEach items="${tCartPage.tCartConfigHightLightList}" var="poVal" varStatus="stuts">
				<tr>
			  		<td class="form-ck">
			  			<input style="" type="checkbox" name="ck"/>
			  			<input name = "tCartConfigHightLightList[${stuts.index }].id" value= "${poVal.id}" type="hidden"/>
			  		</td>
					<td>
			            	<div style="padding-top:5px">
			            	<t:dictSelect id="tCartConfigHightLightList[${stuts.index }].configHightLightId" field="tCartConfigHightLightList[${stuts.index }].configHightLightId" defaultVal = "${poVal.configHightLightId}" extendJson="{class:'i-checks'}" type="checkbox" hasLabel="false"  title="配置亮点Id"  dictTable="t_config_high_light" dictField="id" dictText="name" ></t:dictSelect>
			            	</div>
					</td>
			  	</tr>
				</c:forEach>
				</c:if>
				<c:if test="${fn:length(tCartPage.tCartConfigHightLightList) <= 0 }">
				<tr>
			  		<td class="form-ck"><input type="checkbox" name="ck"/></td>
					<td>
			            	<div style="padding-top:5px">
			            	<t:dictSelect id="tCartConfigHightLightList[0].configHightLightId" field="tCartConfigHightLightList[0].configHightLightId"  extendJson="{class:'i-checks'}" type="checkbox" hasLabel="false"  title="配置亮点Id"  dictTable="t_config_high_light" dictField="id" dictText="name" ></t:dictSelect>
			            	</div>
					</td>
			  	</tr>
				</c:if>
			 	</tbody>
			</table>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartBody">  
			<div class="row">
				<input type="hidden" name = "tCartBodyEntity.id" value="${tCartPage.tCartBodyEntity.id}" />
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							长度：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cartLength" name="tCartBodyEntity.cartLength" value = "${tCartPage.tCartBodyEntity.cartLength}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							宽度：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cartWidth" name="tCartBodyEntity.cartWidth" value = "${tCartPage.tCartBodyEntity.cartWidth}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							高度：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cartHight" name="tCartBodyEntity.cartHight" value = "${tCartPage.tCartBodyEntity.cartHight}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							轴距：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.wheelbase" name="tCartBodyEntity.wheelbase" value = "${tCartPage.tCartBodyEntity.wheelbase}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前轮距：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.frontWheelPitch" name="tCartBodyEntity.frontWheelPitch" value = "${tCartPage.tCartBodyEntity.frontWheelPitch}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后轮距：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.rearWheelPitch" name="tCartBodyEntity.rearWheelPitch" value = "${tCartPage.tCartBodyEntity.rearWheelPitch}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							最小离地间隙：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.miniGround" name="tCartBodyEntity.miniGround" value = "${tCartPage.tCartBodyEntity.miniGround}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							整车质量：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cartFullWeight" name="tCartBodyEntity.cartFullWeight" value = "${tCartPage.tCartBodyEntity.cartFullWeight}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车身结构：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cartStructure" name="tCartBodyEntity.cartStructure" value = "${tCartPage.tCartBodyEntity.cartStructure}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车门数：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cartDoorNum" name="tCartBodyEntity.cartDoorNum" value = "${tCartPage.tCartBodyEntity.cartDoorNum}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							座位数：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cartSeatNum" name="tCartBodyEntity.cartSeatNum" value = "${tCartPage.tCartBodyEntity.cartSeatNum}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							邮箱容积：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.tankVolume" name="tCartBodyEntity.tankVolume" value = "${tCartPage.tCartBodyEntity.tankVolume}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							行李箱容积：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartBodyEntity.cargoVolume" name="tCartBodyEntity.cargoVolume" value = "${tCartPage.tCartBodyEntity.cargoVolume}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartEngine">  
			<div class="row">
				<input type="hidden" name = "tCartEngineEntity.id" value="${tCartPage.tCartEngineEntity.id}" />
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							发动机型号：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.engineOdel" name="tCartEngineEntity.engineOdel" value = "${tCartPage.tCartEngineEntity.engineOdel}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							排量：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.displacement" name="tCartEngineEntity.displacement" value = "${tCartPage.tCartEngineEntity.displacement}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							进气形式：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.intakeForm" name="tCartEngineEntity.intakeForm" value = "${tCartPage.tCartEngineEntity.intakeForm}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							气缸排列形式：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.cylinderArrangementDorm" name="tCartEngineEntity.cylinderArrangementDorm" value = "${tCartPage.tCartEngineEntity.cylinderArrangementDorm}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							气缸数：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.cylinderNum" name="tCartEngineEntity.cylinderNum" value = "${tCartPage.tCartEngineEntity.cylinderNum}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							气门数：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.cylinderDoorNumber" name="tCartEngineEntity.cylinderDoorNumber" value = "${tCartPage.tCartEngineEntity.cylinderDoorNumber}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							缸径：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.cylinderDiameter" name="tCartEngineEntity.cylinderDiameter" value = "${tCartPage.tCartEngineEntity.cylinderDiameter}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							行程：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.trip" name="tCartEngineEntity.trip" value = "${tCartPage.tCartEngineEntity.trip}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							最大马力：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.maxHorsepower" name="tCartEngineEntity.maxHorsepower" value = "${tCartPage.tCartEngineEntity.maxHorsepower}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							最大功率：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.maxPower" name="tCartEngineEntity.maxPower" value = "${tCartPage.tCartEngineEntity.maxPower}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							最大功率转速：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.maxPowerSpeed" name="tCartEngineEntity.maxPowerSpeed" value = "${tCartPage.tCartEngineEntity.maxPowerSpeed}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							最大扭矩：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.maxTorque" name="tCartEngineEntity.maxTorque" value = "${tCartPage.tCartEngineEntity.maxTorque}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							最大扭矩转速：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.maxTorqueSpeed" name="tCartEngineEntity.maxTorqueSpeed" value = "${tCartPage.tCartEngineEntity.maxTorqueSpeed}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							发动机特有技术：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.engineSpecificTechnology" name="tCartEngineEntity.engineSpecificTechnology" value = "${tCartPage.tCartEngineEntity.engineSpecificTechnology}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							燃料形式：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.fuelForm" name="tCartEngineEntity.fuelForm" value = "${tCartPage.tCartEngineEntity.fuelForm}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							燃油标号：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.fuelLabeling" name="tCartEngineEntity.fuelLabeling" value = "${tCartPage.tCartEngineEntity.fuelLabeling}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							供油方式：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.fuelSupplyMode" name="tCartEngineEntity.fuelSupplyMode" value = "${tCartPage.tCartEngineEntity.fuelSupplyMode}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							缸盖材料：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.cylinderHeadMaterial" name="tCartEngineEntity.cylinderHeadMaterial" value = "${tCartPage.tCartEngineEntity.cylinderHeadMaterial}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							缸体材料：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.cylinderBlockMaterial" name="tCartEngineEntity.cylinderBlockMaterial" value = "${tCartPage.tCartEngineEntity.cylinderBlockMaterial}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							环保标准：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartEngineEntity.environmentalStandards" name="tCartEngineEntity.environmentalStandards" value = "${tCartPage.tCartEngineEntity.environmentalStandards}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartGearbox">  
			<div class="row">
				<input type="hidden" name = "tCartGearboxEntity.id" value="${tCartPage.tCartGearboxEntity.id}" />
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							挡位个数：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGearboxEntity.gearsNum" name="tCartGearboxEntity.gearsNum" value = "${tCartPage.tCartGearboxEntity.gearsNum}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							变速箱类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGearboxEntity.gearboxType" name="tCartGearboxEntity.gearboxType" value = "${tCartPage.tCartGearboxEntity.gearboxType}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartChassis">  
			<div class="row">
				<input type="hidden" name = "tCartChassisEntity.id" value="${tCartPage.tCartChassisEntity.id}" />
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							驱动方式：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartChassisEntity.drivingMode" name="tCartChassisEntity.drivingMode" value = "${tCartPage.tCartChassisEntity.drivingMode}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							四驱形式：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartChassisEntity.fourWheelDrive" name="tCartChassisEntity.fourWheelDrive" value = "${tCartPage.tCartChassisEntity.fourWheelDrive}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							中央差速器结构：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartChassisEntity.centralDifferentialStructure" name="tCartChassisEntity.centralDifferentialStructure" value = "${tCartPage.tCartChassisEntity.centralDifferentialStructure}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前悬架类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartChassisEntity.frontSuspensionType" name="tCartChassisEntity.frontSuspensionType" value = "${tCartPage.tCartChassisEntity.frontSuspensionType}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后悬架类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartChassisEntity.rearSuspensionType" name="tCartChassisEntity.rearSuspensionType" value = "${tCartPage.tCartChassisEntity.rearSuspensionType}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							助力类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartChassisEntity.assistanceType" name="tCartChassisEntity.assistanceType" value = "${tCartPage.tCartChassisEntity.assistanceType}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车体结构：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartChassisEntity.carBodyStructure" name="tCartChassisEntity.carBodyStructure" value = "${tCartPage.tCartChassisEntity.carBodyStructure}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartWheelBraking">  
			<div class="row">
				<input type="hidden" name = "tCartWheelBrakingEntity.id" value="${tCartPage.tCartWheelBrakingEntity.id}" />
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前制动器类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartWheelBrakingEntity.frontBrakeType" name="tCartWheelBrakingEntity.frontBrakeType" value = "${tCartPage.tCartWheelBrakingEntity.frontBrakeType}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后制动器类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartWheelBrakingEntity.rearBrakeType" name="tCartWheelBrakingEntity.rearBrakeType" value = "${tCartPage.tCartWheelBrakingEntity.rearBrakeType}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							驻车自动类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartWheelBrakingEntity.parkingAutomationType" name="tCartWheelBrakingEntity.parkingAutomationType" value = "${tCartPage.tCartWheelBrakingEntity.parkingAutomationType}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前轮胎规格：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartWheelBrakingEntity.frontTireSpecification" name="tCartWheelBrakingEntity.frontTireSpecification" value = "${tCartPage.tCartWheelBrakingEntity.frontTireSpecification}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后轮胎类型：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartWheelBrakingEntity.rearTireType" name="tCartWheelBrakingEntity.rearTireType" value = "${tCartPage.tCartWheelBrakingEntity.rearTireType}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							备胎规格：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartWheelBrakingEntity.spareTireSpecification" name="tCartWheelBrakingEntity.spareTireSpecification" value = "${tCartPage.tCartWheelBrakingEntity.spareTireSpecification}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartSafe">  
			<div class="row">
				<input type="hidden" name = "tCartSafeEntity.id" value="${tCartPage.tCartSafeEntity.id}" />
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							主副驾驶安全气囊：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.mainCoPilotAirbags" name="tCartSafeEntity.mainCoPilotAirbags" value = "${tCartPage.tCartSafeEntity.mainCoPilotAirbags}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前后排侧气囊：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.anteriorLateralBalloon" name="tCartSafeEntity.anteriorLateralBalloon" value = "${tCartPage.tCartSafeEntity.anteriorLateralBalloon}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前后排头部气囊：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.frontBackRowHeadBalloon" name="tCartSafeEntity.frontBackRowHeadBalloon" value = "${tCartPage.tCartSafeEntity.frontBackRowHeadBalloon}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							膝部气囊：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.kneeAirbag" name="tCartSafeEntity.kneeAirbag" value = "${tCartPage.tCartSafeEntity.kneeAirbag}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							胎压监测装置：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.tirePressureMonitoring" name="tCartSafeEntity.tirePressureMonitoring" value = "${tCartPage.tCartSafeEntity.tirePressureMonitoring}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							零胎压继续行驶：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.zeroTirePressureToContinue" name="tCartSafeEntity.zeroTirePressureToContinue" value = "${tCartPage.tCartSafeEntity.zeroTirePressureToContinue}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							安全带未息提示：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.seatbeltHint" name="tCartSafeEntity.seatbeltHint" value = "${tCartPage.tCartSafeEntity.seatbeltHint}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							ISOFIX儿童座椅接口：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.isofix" name="tCartSafeEntity.isofix" value = "${tCartPage.tCartSafeEntity.isofix}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							发动起电子防盗：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.launchElectronicAntiTheft" name="tCartSafeEntity.launchElectronicAntiTheft" value = "${tCartPage.tCartSafeEntity.launchElectronicAntiTheft}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车内中控锁：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.inCarCentralControlLock" name="tCartSafeEntity.inCarCentralControlLock" value = "${tCartPage.tCartSafeEntity.inCarCentralControlLock}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							遥控钥匙：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.remoteKey" name="tCartSafeEntity.remoteKey" value = "${tCartPage.tCartSafeEntity.remoteKey}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							无钥匙启动系统：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.keylessStartupSystem" name="tCartSafeEntity.keylessStartupSystem" value = "${tCartPage.tCartSafeEntity.keylessStartupSystem}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							无钥匙进入系统：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSafeEntity.keylessAccessSystem" name="tCartSafeEntity.keylessAccessSystem" value = "${tCartPage.tCartSafeEntity.keylessAccessSystem}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartManipulation">  
			<div class="row">
				<input type="hidden" name = "tCartManipulationEntity.id" value="${tCartPage.tCartManipulationEntity.id}" />
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							ABS防抱死：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.abs" name="tCartManipulationEntity.abs" value = "${tCartPage.tCartManipulationEntity.abs}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							制动分配：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.distributionBrake" name="tCartManipulationEntity.distributionBrake" value = "${tCartPage.tCartManipulationEntity.distributionBrake}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							刹车辅助：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.assistBrake" name="tCartManipulationEntity.assistBrake" value = "${tCartPage.tCartManipulationEntity.assistBrake}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							牵引力控制：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.tractionControl" name="tCartManipulationEntity.tractionControl" value = "${tCartPage.tCartManipulationEntity.tractionControl}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车身稳定控制：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.bodyStabilityControl" name="tCartManipulationEntity.bodyStabilityControl" value = "${tCartPage.tCartManipulationEntity.bodyStabilityControl}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							上坡辅助：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.hillStartAssist" name="tCartManipulationEntity.hillStartAssist" value = "${tCartPage.tCartManipulationEntity.hillStartAssist}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							自动驻车：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.automaticParking" name="tCartManipulationEntity.automaticParking" value = "${tCartPage.tCartManipulationEntity.automaticParking}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							陡坡缓降：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.hdc" name="tCartManipulationEntity.hdc" value = "${tCartPage.tCartManipulationEntity.hdc}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							可变悬架：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.variableSuspension" name="tCartManipulationEntity.variableSuspension" value = "${tCartPage.tCartManipulationEntity.variableSuspension}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							空气悬架：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartManipulationEntity.airSuspension" name="tCartManipulationEntity.airSuspension" value = "${tCartPage.tCartManipulationEntity.airSuspension}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartExternalConfig">  
			<div class="row">
				<input type="hidden" name = "tCartExternalConfigEntity.id" value="${tCartPage.tCartExternalConfigEntity.id}" />
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							电动天窗：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.electricSkylight" name="tCartExternalConfigEntity.electricSkylight" value = "${tCartPage.tCartExternalConfigEntity.electricSkylight}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							全景天窗：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.panoramicSunroof" name="tCartExternalConfigEntity.panoramicSunroof" value = "${tCartPage.tCartExternalConfigEntity.panoramicSunroof}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							运动外观套件：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.sportsAppearanceKit" name="tCartExternalConfigEntity.sportsAppearanceKit" value = "${tCartPage.tCartExternalConfigEntity.sportsAppearanceKit}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							铝合金轮圈：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.aluminumAlloyWheels" name="tCartExternalConfigEntity.aluminumAlloyWheels" value = "${tCartPage.tCartExternalConfigEntity.aluminumAlloyWheels}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							电动吸合门：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.electricSuctionDoor" name="tCartExternalConfigEntity.electricSuctionDoor" value = "${tCartPage.tCartExternalConfigEntity.electricSuctionDoor}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							侧滑门：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.sideslipDoor" name="tCartExternalConfigEntity.sideslipDoor" value = "${tCartPage.tCartExternalConfigEntity.sideslipDoor}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							电动后备厢：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.electricTrunk" name="tCartExternalConfigEntity.electricTrunk" value = "${tCartPage.tCartExternalConfigEntity.electricTrunk}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							感应后备厢：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.inductionTrunk" name="tCartExternalConfigEntity.inductionTrunk" value = "${tCartPage.tCartExternalConfigEntity.inductionTrunk}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车顶行李架：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartExternalConfigEntity.roofLuggageRack" name="tCartExternalConfigEntity.roofLuggageRack" value = "${tCartPage.tCartExternalConfigEntity.roofLuggageRack}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartInterConfig">  
			<div class="row">
				<input type="hidden" name = "tCartInterConfigEntity.id" value="${tCartPage.tCartInterConfigEntity.id}" />
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							真皮方向盘：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.leatherSteeringWheel" name="tCartInterConfigEntity.leatherSteeringWheel" value = "${tCartPage.tCartInterConfigEntity.leatherSteeringWheel}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							方向盘调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.steeringWheelAdjustment" name="tCartInterConfigEntity.steeringWheelAdjustment" value = "${tCartPage.tCartInterConfigEntity.steeringWheelAdjustment}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							方向盘电动调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.steeringElectricRegulation" name="tCartInterConfigEntity.steeringElectricRegulation" value = "${tCartPage.tCartInterConfigEntity.steeringElectricRegulation}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							多功能方向盘：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.multifunctionalSteeringWheel" name="tCartInterConfigEntity.multifunctionalSteeringWheel" value = "${tCartPage.tCartInterConfigEntity.multifunctionalSteeringWheel}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							方向盘换挡：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.steeringWheelShift" name="tCartInterConfigEntity.steeringWheelShift" value = "${tCartPage.tCartInterConfigEntity.steeringWheelShift}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							方向盘加热：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.steeringWheelHeating" name="tCartInterConfigEntity.steeringWheelHeating" value = "${tCartPage.tCartInterConfigEntity.steeringWheelHeating}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							定速巡航：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.cruiseControl" name="tCartInterConfigEntity.cruiseControl" value = "${tCartPage.tCartInterConfigEntity.cruiseControl}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前后驻车雷达：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.frontBackParkingRadar" name="tCartInterConfigEntity.frontBackParkingRadar" value = "${tCartPage.tCartInterConfigEntity.frontBackParkingRadar}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							倒车视频影像：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.reversingVideoImage" name="tCartInterConfigEntity.reversingVideoImage" value = "${tCartPage.tCartInterConfigEntity.reversingVideoImage}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							行车电脑显示屏：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.drivingComputerDisplay" name="tCartInterConfigEntity.drivingComputerDisplay" value = "${tCartPage.tCartInterConfigEntity.drivingComputerDisplay}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							全液晶仪表盘：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartInterConfigEntity.allLiquidCrystalDashboard" name="tCartInterConfigEntity.allLiquidCrystalDashboard" value = "${tCartPage.tCartInterConfigEntity.allLiquidCrystalDashboard}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartSeatConfig">  
			<div class="row">
				<input type="hidden" name = "tCartSeatConfigEntity.id" value="${tCartPage.tCartSeatConfigEntity.id}" />
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							座椅材质：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSeatConfigEntity.seatMaterial" name="tCartSeatConfigEntity.seatMaterial" value = "${tCartPage.tCartSeatConfigEntity.seatMaterial}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							座椅高低调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSeatConfigEntity.seatHeightAdjustment" name="tCartSeatConfigEntity.seatHeightAdjustment" value = "${tCartPage.tCartSeatConfigEntity.seatHeightAdjustment}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							腰部支撑调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSeatConfigEntity.adjustmentOfWaistSupport" name="tCartSeatConfigEntity.adjustmentOfWaistSupport" value = "${tCartPage.tCartSeatConfigEntity.adjustmentOfWaistSupport}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							主副驾驶做电动调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSeatConfigEntity.mainCoDriversMakeElectric" name="tCartSeatConfigEntity.mainCoDriversMakeElectric" value = "${tCartPage.tCartSeatConfigEntity.mainCoDriversMakeElectric}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后排座椅电动调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSeatConfigEntity.rearSeatElectricAdjustment" name="tCartSeatConfigEntity.rearSeatElectricAdjustment" value = "${tCartPage.tCartSeatConfigEntity.rearSeatElectricAdjustment}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前后排座椅加热：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSeatConfigEntity.heatingFrontRearSeats" name="tCartSeatConfigEntity.heatingFrontRearSeats" value = "${tCartPage.tCartSeatConfigEntity.heatingFrontRearSeats}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前后排座椅通风：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartSeatConfigEntity.ventilationFrontRearSeats" name="tCartSeatConfigEntity.ventilationFrontRearSeats" value = "${tCartPage.tCartSeatConfigEntity.ventilationFrontRearSeats}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartMultimediaConfig">  
			<div class="row">
				<input type="hidden" name = "tCartMultimediaConfigEntity.id" value="${tCartPage.tCartMultimediaConfigEntity.id}" />
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							GPS导航系统：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartMultimediaConfigEntity.gps" name="tCartMultimediaConfigEntity.gps" value = "${tCartPage.tCartMultimediaConfigEntity.gps}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							中控台彩色大屏：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartMultimediaConfigEntity.centralConsoleColourScreen" name="tCartMultimediaConfigEntity.centralConsoleColourScreen" value = "${tCartPage.tCartMultimediaConfigEntity.centralConsoleColourScreen}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							蓝牙电话：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartMultimediaConfigEntity.bluetoothTelephone" name="tCartMultimediaConfigEntity.bluetoothTelephone" value = "${tCartPage.tCartMultimediaConfigEntity.bluetoothTelephone}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							外接音源接口：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartMultimediaConfigEntity.externalSourceInterface" name="tCartMultimediaConfigEntity.externalSourceInterface" value = "${tCartPage.tCartMultimediaConfigEntity.externalSourceInterface}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							多媒体系统：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartMultimediaConfigEntity.multimediaSystem" name="tCartMultimediaConfigEntity.multimediaSystem" value = "${tCartPage.tCartMultimediaConfigEntity.multimediaSystem}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							扬声器数量：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartMultimediaConfigEntity.speakersNum" name="tCartMultimediaConfigEntity.speakersNum" value = "${tCartPage.tCartMultimediaConfigEntity.speakersNum}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartLightConfig">  
			<div class="row">
				<input type="hidden" name = "tCartLightConfigEntity.id" value="${tCartPage.tCartLightConfigEntity.id}" />
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							近光灯远光灯：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.lowHighLightLamps" name="tCartLightConfigEntity.lowHighLightLamps" value = "${tCartPage.tCartLightConfigEntity.lowHighLightLamps}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							日间行车灯：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.drl" name="tCartLightConfigEntity.drl" value = "${tCartPage.tCartLightConfigEntity.drl}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							自适应远光灯：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.adaptiveHighLightLamp" name="tCartLightConfigEntity.adaptiveHighLightLamp" value = "${tCartPage.tCartLightConfigEntity.adaptiveHighLightLamp}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							自动头灯：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.automaticHeadlamp" name="tCartLightConfigEntity.automaticHeadlamp" value = "${tCartPage.tCartLightConfigEntity.automaticHeadlamp}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							转向辅助灯：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.steeringAuxiliaryLamp" name="tCartLightConfigEntity.steeringAuxiliaryLamp" value = "${tCartPage.tCartLightConfigEntity.steeringAuxiliaryLamp}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							转向头灯：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.headlight" name="tCartLightConfigEntity.headlight" value = "${tCartPage.tCartLightConfigEntity.headlight}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前雾灯：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.frontFogLamp" name="tCartLightConfigEntity.frontFogLamp" value = "${tCartPage.tCartLightConfigEntity.frontFogLamp}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							大灯高度可调：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.headlampHeightAdjustable" name="tCartLightConfigEntity.headlampHeightAdjustable" value = "${tCartPage.tCartLightConfigEntity.headlampHeightAdjustable}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							大灯清洗装置：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartLightConfigEntity.headlampCleaningDevice" name="tCartLightConfigEntity.headlampCleaningDevice" value = "${tCartPage.tCartLightConfigEntity.headlampCleaningDevice}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartGlassRearviewMirror">  
			<div class="row">
				<input type="hidden" name = "tCartGlassRearviewMirrorEntity.id" value="${tCartPage.tCartGlassRearviewMirrorEntity.id}" />
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							前后电动车窗：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.frontRearElectricWindow" name="tCartGlassRearviewMirrorEntity.frontRearElectricWindow" value = "${tCartPage.tCartGlassRearviewMirrorEntity.frontRearElectricWindow}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车窗防夹手功能：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.antiClipFunctionWindow" name="tCartGlassRearviewMirrorEntity.antiClipFunctionWindow" value = "${tCartPage.tCartGlassRearviewMirrorEntity.antiClipFunctionWindow}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后视镜电动调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.rearviewMirror" name="tCartGlassRearviewMirrorEntity.rearviewMirror" value = "${tCartPage.tCartGlassRearviewMirrorEntity.rearviewMirror}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后视镜加热：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.rearviewMirrorHeating" name="tCartGlassRearviewMirrorEntity.rearviewMirrorHeating" value = "${tCartPage.tCartGlassRearviewMirrorEntity.rearviewMirrorHeating}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							内外后视镜自动防眩目：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.autoInsideOutsideRearview" name="tCartGlassRearviewMirrorEntity.autoInsideOutsideRearview" value = "${tCartPage.tCartGlassRearviewMirrorEntity.autoInsideOutsideRearview}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后视镜电动折叠：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.electricFoldingMirror" name="tCartGlassRearviewMirrorEntity.electricFoldingMirror" value = "${tCartPage.tCartGlassRearviewMirrorEntity.electricFoldingMirror}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							遮阳板化妆镜：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.sunshadeMakeupMirror" name="tCartGlassRearviewMirrorEntity.sunshadeMakeupMirror" value = "${tCartPage.tCartGlassRearviewMirrorEntity.sunshadeMakeupMirror}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后雨刷：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.rearWiper" name="tCartGlassRearviewMirrorEntity.rearWiper" value = "${tCartPage.tCartGlassRearviewMirrorEntity.rearWiper}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							感应雨刷：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartGlassRearviewMirrorEntity.inductionWiper" name="tCartGlassRearviewMirrorEntity.inductionWiper" value = "${tCartPage.tCartGlassRearviewMirrorEntity.inductionWiper}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartAirRefrigerator">  
			<div class="row">
				<input type="hidden" name = "tCartAirRefrigeratorEntity.id" value="${tCartPage.tCartAirRefrigeratorEntity.id}" />
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							空调控制方式：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartAirRefrigeratorEntity.airControlMode" name="tCartAirRefrigeratorEntity.airControlMode" value = "${tCartPage.tCartAirRefrigeratorEntity.airControlMode}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后排独立空调：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartAirRefrigeratorEntity.rearIndependentAir" name="tCartAirRefrigeratorEntity.rearIndependentAir" value = "${tCartPage.tCartAirRefrigeratorEntity.rearIndependentAir}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							后座出风口：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartAirRefrigeratorEntity.rearOutlet" name="tCartAirRefrigeratorEntity.rearOutlet" value = "${tCartPage.tCartAirRefrigeratorEntity.rearOutlet}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							温度分区控制：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartAirRefrigeratorEntity.temperatureZoningControl" name="tCartAirRefrigeratorEntity.temperatureZoningControl" value = "${tCartPage.tCartAirRefrigeratorEntity.temperatureZoningControl}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车内空气调节：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartAirRefrigeratorEntity.inCarAirConditioning" name="tCartAirRefrigeratorEntity.inCarAirConditioning" value = "${tCartPage.tCartAirRefrigeratorEntity.inCarAirConditioning}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车载冰箱：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartAirRefrigeratorEntity.vehicleRefrigerator" name="tCartAirRefrigeratorEntity.vehicleRefrigerator" value = "${tCartPage.tCartAirRefrigeratorEntity.vehicleRefrigerator}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane fade" id="tCartHighTechConfig">  
			<div class="row">
				<input type="hidden" name = "tCartHighTechConfigEntity.id" value="${tCartPage.tCartHighTechConfigEntity.id}" />
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							自动泊车入位：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.automaticParking" name="tCartHighTechConfigEntity.automaticParking" value = "${tCartPage.tCartHighTechConfigEntity.automaticParking}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							发动机启停技术：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.engineStartStopTechnology" name="tCartHighTechConfigEntity.engineStartStopTechnology" value = "${tCartPage.tCartHighTechConfigEntity.engineStartStopTechnology}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							并线辅助：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.doublingAssistance" name="tCartHighTechConfigEntity.doublingAssistance" value = "${tCartPage.tCartHighTechConfigEntity.doublingAssistance}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							车道偏离预警系统：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.ldws" name="tCartHighTechConfigEntity.ldws" value = "${tCartPage.tCartHighTechConfigEntity.ldws}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							主动刹车：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.activeBrake" name="tCartHighTechConfigEntity.activeBrake" value = "${tCartPage.tCartHighTechConfigEntity.activeBrake}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							整体主动转向系统：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.integralActiveSteeringSys" name="tCartHighTechConfigEntity.integralActiveSteeringSys" value = "${tCartPage.tCartHighTechConfigEntity.integralActiveSteeringSys}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							夜视系统：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.nightVisionSystem" name="tCartHighTechConfigEntity.nightVisionSystem" value = "${tCartPage.tCartHighTechConfigEntity.nightVisionSystem}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							中控液晶屏分屏：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.lcdScreenDivider" name="tCartHighTechConfigEntity.lcdScreenDivider" value = "${tCartPage.tCartHighTechConfigEntity.lcdScreenDivider}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							自适应巡航：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.adaptiveCruise" name="tCartHighTechConfigEntity.adaptiveCruise" value = "${tCartPage.tCartHighTechConfigEntity.adaptiveCruise}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
		            	</div>
					</div>
				</div>
				<div class="bt-item col-md-6 col-sm-6">
					<div class="row">
						<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
							全景摄像头：
						</div>
						<div class="col-md-8 col-sm-8 col-xs-8 bt-content">
							<input id="tCartHighTechConfigEntity.panoramicCamera" name="tCartHighTechConfigEntity.panoramicCamera" value = "${tCartPage.tCartHighTechConfigEntity.panoramicCamera}" type="text" class="form-control input-sm" maxlength="32"  ignore="ignore"  />
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
	  //查看模式情况下,删除和上传附件功能禁止使用
	if(location.href.indexOf("load=detail")!=-1){
		$(".form-tb-toolbar").hide();
		$("#formobj").find(":input").attr("readonly","readonly");
	}
});
function formControlInit(){
	$(".laydate-datetime").each(function(){
		if($(this).attr("name").indexOf('#index#')<=0){
			var _this = this;
			laydate.render({
			  elem: _this,
			  format: 'yyyy-MM-dd HH:mm:ss',
			  type: 'datetime',
			  ready: function(date){
			  	 $(_this).val(DateJsonFormat(date,this.format));
			  },
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
			  elem: _this,
			  format: 'yyyy-MM-dd',
			  ready: function(date){
			  	 $(_this).val(DateJsonFormat(date,this.format));
			  },
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
					$this.attr("name",name.replace("["+new_name+"]","["+i+"]"));
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