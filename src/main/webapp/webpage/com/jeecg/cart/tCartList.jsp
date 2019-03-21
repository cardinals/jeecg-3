<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>车辆信息表</title>
<meta name="viewport" content="width=device-width" />
<t:base type="bootstrap,bootstrap-table,layer"></t:base>
</head>
<body>
  <t:datagrid name="tCartList"  component="bootstrap-table"  checkbox="true" sortName="createDate"   sortOrder="desc"   pagination="true" fitColumns="true" title="车辆信息表" actionUrl="tCartController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人登录名称"  field="createBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人登录名称"  field="updateBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新日期"  field="updateDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属部门"  field="sysOrgCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属公司"  field="sysCompanyCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="流程状态"  field="bpmStatus"  hidden="true"  queryMode="single"  dictionary="bpm_status"  width="120"></t:dgCol>
   <t:dgCol title="车辆名称"  field="name"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="车牌时间"  field="cartBrandTime"  formatter="yyyy-MM-dd"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="归属地"  field="qCellCore"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所在地"  field="locationAddr"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="排放标准"  field="emissionStandard"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="颜色"  field="color"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="里程数"  field="mileage"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="价格"  field="price"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="新车价格"  field="newPrice"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="首付价格"  field="downPayments"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="月供"  field="monthlySupply"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="排量"  field="displacement"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="变速箱"  field="gearBox"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="tCartController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="tCartController.do?goAdd" funname="add" width="100%" height="100%"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="tCartController.do?goUpdate" funname="update" width="100%" height="100%"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="tCartController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="tCartController.do?goUpdate" funname="detail" width="100%" height="100%"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  <script type="text/javascript">
	 $(document).ready(function(){
	 });
	 
	   
	 
	//导入
	function ImportXls() {
		openuploadwin('Excel导入', 'tCartController.do?upload', "tCartList");
	}
	
	//导出
	function ExportXls() {
		JeecgExcelExport("tCartController.do?exportXls","tCartList");
	}
	
	//模板下载
	function ExportXlsByT() {
		JeecgExcelExport("tCartController.do?exportXlsByT","tCartList");
	}
	
	 </script>
</body>
</html>