package com.jeecg.cart.page;

import com.jeecg.cart.entity.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelCollection;
import org.jeecgframework.poi.excel.annotation.ExcelEntity;

/**   
 * @Title: Entity
 * @Description: 车辆信息表
 * @author onlineGenerator
 * @date 2019-03-07 08:54:10
 * @version V1.0   
 *
 */
public class TCartPage implements java.io.Serializable {
	/**主键*/
	private String id;
	/**创建人名称*/
	private String createName;
	/**创建人登录名称*/
	private String createBy;
	/**创建日期*/
	private Date createDate;
	/**更新人名称*/
	private String updateName;
	/**更新人登录名称*/
	private String updateBy;
	/**更新日期*/
	private Date updateDate;
	/**所属部门*/
	private String sysOrgCode;
	/**所属公司*/
	private String sysCompanyCode;
	/**流程状态*/
	private String bpmStatus;
	/**车辆名称*/
    @Excel(name="车辆名称")
	private String name;
	/**车牌时间*/
    @Excel(name="车牌时间",format = "yyyy-MM-dd")
	private Date cartBrandTime;
	/**归属地*/
    @Excel(name="归属地")
	private String qCellCore;
	/**所在地*/
    @Excel(name="所在地")
	private String locationAddr;
	/**排放标准*/
    @Excel(name="排放标准")
	private String emissionStandard;
	/**颜色*/
    @Excel(name="颜色")
	private String color;
	/**里程数*/
    @Excel(name="里程数")
	private String mileage;
	/**价格*/
    @Excel(name="价格")
	private Double price;
	/**新车价格*/
    @Excel(name="新车价格")
	private String newPrice;
	/**首付价格*/
    @Excel(name="首付价格")
	private Double downPayments;
	/**月供*/
    @Excel(name="月供")
	private Double monthlySupply;
	/**排量*/
    @Excel(name="排量")
	private String displacement;
	/**变速箱*/
    @Excel(name="变速箱")
	private String gearBox;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	public String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人名称
	 */
	public String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人名称
	 */
	public void setCreateName(String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人登录名称
	 */
	public String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人登录名称
	 */
	public void setCreateBy(String createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */
	public Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人名称
	 */
	public String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人名称
	 */
	public void setUpdateName(String updateName){
		this.updateName = updateName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人登录名称
	 */
	public String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人登录名称
	 */
	public void setUpdateBy(String updateBy){
		this.updateBy = updateBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新日期
	 */
	public Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新日期
	 */
	public void setUpdateDate(Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属部门
	 */
	public String getSysOrgCode(){
		return this.sysOrgCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属部门
	 */
	public void setSysOrgCode(String sysOrgCode){
		this.sysOrgCode = sysOrgCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属公司
	 */
	public String getSysCompanyCode(){
		return this.sysCompanyCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属公司
	 */
	public void setSysCompanyCode(String sysCompanyCode){
		this.sysCompanyCode = sysCompanyCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  流程状态
	 */
	public String getBpmStatus(){
		return this.bpmStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流程状态
	 */
	public void setBpmStatus(String bpmStatus){
		this.bpmStatus = bpmStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  车辆名称
	 */
	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  车辆名称
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  车牌时间
	 */
	public Date getCartBrandTime(){
		return this.cartBrandTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  车牌时间
	 */
	public void setCartBrandTime(Date cartBrandTime){
		this.cartBrandTime = cartBrandTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  归属地
	 */
	public String getQCellCore(){
		return this.qCellCore;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  归属地
	 */
	public void setQCellCore(String qCellCore){
		this.qCellCore = qCellCore;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所在地
	 */
	public String getLocationAddr(){
		return this.locationAddr;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所在地
	 */
	public void setLocationAddr(String locationAddr){
		this.locationAddr = locationAddr;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  排放标准
	 */
	public String getEmissionStandard(){
		return this.emissionStandard;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  排放标准
	 */
	public void setEmissionStandard(String emissionStandard){
		this.emissionStandard = emissionStandard;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  颜色
	 */
	public String getColor(){
		return this.color;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  颜色
	 */
	public void setColor(String color){
		this.color = color;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  里程数
	 */
	public String getMileage(){
		return this.mileage;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  里程数
	 */
	public void setMileage(String mileage){
		this.mileage = mileage;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  价格
	 */
	public Double getPrice(){
		return this.price;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  价格
	 */
	public void setPrice(Double price){
		this.price = price;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  新车价格
	 */
	public String getNewPrice(){
		return this.newPrice;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  新车价格
	 */
	public void setNewPrice(String newPrice){
		this.newPrice = newPrice;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  首付价格
	 */
	public Double getDownPayments(){
		return this.downPayments;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  首付价格
	 */
	public void setDownPayments(Double downPayments){
		this.downPayments = downPayments;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  月供
	 */
	public Double getMonthlySupply(){
		return this.monthlySupply;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  月供
	 */
	public void setMonthlySupply(Double monthlySupply){
		this.monthlySupply = monthlySupply;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  排量
	 */
	public String getDisplacement(){
		return this.displacement;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  排量
	 */
	public void setDisplacement(String displacement){
		this.displacement = displacement;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  变速箱
	 */
	public String getGearBox(){
		return this.gearBox;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  变速箱
	 */
	public void setGearBox(String gearBox){
		this.gearBox = gearBox;
	}
	
	/**保存-实拍图*/
    @ExcelCollection(name="实拍图")
	private List<TCartBannerEntity> tCartBannerList = new ArrayList<TCartBannerEntity>();
	public List<TCartBannerEntity> getTCartBannerList() {
		return tCartBannerList;
	}
	public void setTCartBannerList(List<TCartBannerEntity> tCartBannerList) {
		this.tCartBannerList = tCartBannerList;
	}

	/**保存-配置亮点*/
    @ExcelCollection(name="配置亮点")
	private List<TCartConfigHightLightEntity> tCartConfigHightLightList = new ArrayList<TCartConfigHightLightEntity>();
	public List<TCartConfigHightLightEntity> getTCartConfigHightLightList() {
		return tCartConfigHightLightList;
	}
	public void setTCartConfigHightLightList(List<TCartConfigHightLightEntity> tCartConfigHightLightList) {
		this.tCartConfigHightLightList = tCartConfigHightLightList;
	}
	//TODO 一对一excel注解?
	@ExcelEntity(name="车身配置")
	private TCartBodyEntity tCartBodyEntity = new TCartBodyEntity();
	public TCartBodyEntity getTCartBodyEntity() {
		return tCartBodyEntity;
	}
	public void setTCartBodyEntity(TCartBodyEntity tCartBodyEntity) {
		this.tCartBodyEntity = tCartBodyEntity;
	}
	//TODO 一对一excel注解?
	@ExcelEntity(name="发动机配置")
	private TCartEngineEntity tCartEngineEntity = new TCartEngineEntity();
	public TCartEngineEntity getTCartEngineEntity() {
		return tCartEngineEntity;
	}
	public void setTCartEngineEntity(TCartEngineEntity tCartEngineEntity) {
		this.tCartEngineEntity = tCartEngineEntity;
	}
	//TODO 一对一excel注解?
	@ExcelEntity(name="变速箱配置")
	private TCartGearboxEntity tCartGearboxEntity = new TCartGearboxEntity();
	public TCartGearboxEntity getTCartGearboxEntity() {
		return tCartGearboxEntity;
	}
	public void setTCartGearboxEntity(TCartGearboxEntity tCartGearboxEntity) {
		this.tCartGearboxEntity = tCartGearboxEntity;
	}
	//TODO 一对一excel注解?
	@ExcelEntity(name="底盘配置")
	private TCartChassisEntity tCartChassisEntity = new TCartChassisEntity();
	public TCartChassisEntity getTCartChassisEntity() {
		return tCartChassisEntity;
	}
	public void setTCartChassisEntity(TCartChassisEntity tCartChassisEntity) {
		this.tCartChassisEntity = tCartChassisEntity;
	}
	//TODO 一对一excel注解?
	@ExcelEntity(name="车轮制动配置")
	private TCartWheelBrakingEntity tCartWheelBrakingEntity = new TCartWheelBrakingEntity();
	public TCartWheelBrakingEntity getTCartWheelBrakingEntity() {
		return tCartWheelBrakingEntity;
	}
	public void setTCartWheelBrakingEntity(TCartWheelBrakingEntity tCartWheelBrakingEntity) {
		this.tCartWheelBrakingEntity = tCartWheelBrakingEntity;
	}
	//TODO 一对一excel注解?
	@ExcelEntity(name="安全装备")
	private TCartSafeEntity tCartSafeEntity = new TCartSafeEntity();
	public TCartSafeEntity getTCartSafeEntity() {
		return tCartSafeEntity;
	}
	public void setTCartSafeEntity(TCartSafeEntity tCartSafeEntity) {
		this.tCartSafeEntity = tCartSafeEntity;
	}
	//TODO 一对一excel注解?
	@ExcelEntity(name="操控配置")
	private TCartManipulationEntity tCartManipulationEntity = new TCartManipulationEntity();
	public TCartManipulationEntity getTCartManipulationEntity() {
		return tCartManipulationEntity;
	}
	public void setTCartManipulationEntity(TCartManipulationEntity tCartManipulationEntity) {
		this.tCartManipulationEntity = tCartManipulationEntity;
	}
	//TODO 一对一excel注解?
	@ExcelEntity(name="外部配置")
	private TCartExternalConfigEntity tCartExternalConfigEntity = new TCartExternalConfigEntity();
	public TCartExternalConfigEntity getTCartExternalConfigEntity() {
		return tCartExternalConfigEntity;
	}
	public void setTCartExternalConfigEntity(TCartExternalConfigEntity tCartExternalConfigEntity) {
		this.tCartExternalConfigEntity = tCartExternalConfigEntity;
	}
	//TODO 一对一excel注解?
	@ExcelEntity(name="内部配置")
	private TCartInterConfigEntity tCartInterConfigEntity = new TCartInterConfigEntity();
	public TCartInterConfigEntity getTCartInterConfigEntity() {
		return tCartInterConfigEntity;
	}
	public void setTCartInterConfigEntity(TCartInterConfigEntity tCartInterConfigEntity) {
		this.tCartInterConfigEntity = tCartInterConfigEntity;
	}
	//TODO 一对一excel注解?
	@ExcelEntity(name="座椅配置")
	private TCartSeatConfigEntity tCartSeatConfigEntity = new TCartSeatConfigEntity();
	public TCartSeatConfigEntity getTCartSeatConfigEntity() {
		return tCartSeatConfigEntity;
	}
	public void setTCartSeatConfigEntity(TCartSeatConfigEntity tCartSeatConfigEntity) {
		this.tCartSeatConfigEntity = tCartSeatConfigEntity;
	}
	//TODO 一对一excel注解?
	@ExcelEntity(name="多媒体配置")
	private TCartMultimediaConfigEntity tCartMultimediaConfigEntity = new TCartMultimediaConfigEntity();
	public TCartMultimediaConfigEntity getTCartMultimediaConfigEntity() {
		return tCartMultimediaConfigEntity;
	}
	public void setTCartMultimediaConfigEntity(TCartMultimediaConfigEntity tCartMultimediaConfigEntity) {
		this.tCartMultimediaConfigEntity = tCartMultimediaConfigEntity;
	}
	//TODO 一对一excel注解?
	@ExcelEntity(name="灯光配置")
	private TCartLightConfigEntity tCartLightConfigEntity = new TCartLightConfigEntity();
	public TCartLightConfigEntity getTCartLightConfigEntity() {
		return tCartLightConfigEntity;
	}
	public void setTCartLightConfigEntity(TCartLightConfigEntity tCartLightConfigEntity) {
		this.tCartLightConfigEntity = tCartLightConfigEntity;
	}
	//TODO 一对一excel注解?
	@ExcelEntity(name="玻璃/后视镜配置")
	private TCartGlassRearviewMirrorEntity tCartGlassRearviewMirrorEntity = new TCartGlassRearviewMirrorEntity();
	public TCartGlassRearviewMirrorEntity getTCartGlassRearviewMirrorEntity() {
		return tCartGlassRearviewMirrorEntity;
	}
	public void setTCartGlassRearviewMirrorEntity(TCartGlassRearviewMirrorEntity tCartGlassRearviewMirrorEntity) {
		this.tCartGlassRearviewMirrorEntity = tCartGlassRearviewMirrorEntity;
	}
	//TODO 一对一excel注解?
	@ExcelEntity(name="空调/冰箱配置")
	private TCartAirRefrigeratorEntity tCartAirRefrigeratorEntity = new TCartAirRefrigeratorEntity();
	public TCartAirRefrigeratorEntity getTCartAirRefrigeratorEntity() {
		return tCartAirRefrigeratorEntity;
	}
	public void setTCartAirRefrigeratorEntity(TCartAirRefrigeratorEntity tCartAirRefrigeratorEntity) {
		this.tCartAirRefrigeratorEntity = tCartAirRefrigeratorEntity;
	}
	//TODO 一对一excel注解?
	@ExcelEntity(name="高科技配置")
	private TCartHighTechConfigEntity tCartHighTechConfigEntity = new TCartHighTechConfigEntity();
	public TCartHighTechConfigEntity getTCartHighTechConfigEntity() {
		return tCartHighTechConfigEntity;
	}
	public void setTCartHighTechConfigEntity(TCartHighTechConfigEntity tCartHighTechConfigEntity) {
		this.tCartHighTechConfigEntity = tCartHighTechConfigEntity;
	}

	public String getqCellCore() {
		return qCellCore;
	}

	public void setqCellCore(String qCellCore) {
		this.qCellCore = qCellCore;
	}

	public List<TCartBannerEntity> gettCartBannerList() {
		return tCartBannerList;
	}

	public void settCartBannerList(List<TCartBannerEntity> tCartBannerList) {
		this.tCartBannerList = tCartBannerList;
	}

	public List<TCartConfigHightLightEntity> gettCartConfigHightLightList() {
		return tCartConfigHightLightList;
	}

	public void settCartConfigHightLightList(List<TCartConfigHightLightEntity> tCartConfigHightLightList) {
		this.tCartConfigHightLightList = tCartConfigHightLightList;
	}

	public TCartBodyEntity gettCartBodyEntity() {
		return tCartBodyEntity;
	}

	public void settCartBodyEntity(TCartBodyEntity tCartBodyEntity) {
		this.tCartBodyEntity = tCartBodyEntity;
	}

	public TCartEngineEntity gettCartEngineEntity() {
		return tCartEngineEntity;
	}

	public void settCartEngineEntity(TCartEngineEntity tCartEngineEntity) {
		this.tCartEngineEntity = tCartEngineEntity;
	}

	public TCartGearboxEntity gettCartGearboxEntity() {
		return tCartGearboxEntity;
	}

	public void settCartGearboxEntity(TCartGearboxEntity tCartGearboxEntity) {
		this.tCartGearboxEntity = tCartGearboxEntity;
	}

	public TCartChassisEntity gettCartChassisEntity() {
		return tCartChassisEntity;
	}

	public void settCartChassisEntity(TCartChassisEntity tCartChassisEntity) {
		this.tCartChassisEntity = tCartChassisEntity;
	}

	public TCartWheelBrakingEntity gettCartWheelBrakingEntity() {
		return tCartWheelBrakingEntity;
	}

	public void settCartWheelBrakingEntity(TCartWheelBrakingEntity tCartWheelBrakingEntity) {
		this.tCartWheelBrakingEntity = tCartWheelBrakingEntity;
	}

	public TCartSafeEntity gettCartSafeEntity() {
		return tCartSafeEntity;
	}

	public void settCartSafeEntity(TCartSafeEntity tCartSafeEntity) {
		this.tCartSafeEntity = tCartSafeEntity;
	}

	public TCartManipulationEntity gettCartManipulationEntity() {
		return tCartManipulationEntity;
	}

	public void settCartManipulationEntity(TCartManipulationEntity tCartManipulationEntity) {
		this.tCartManipulationEntity = tCartManipulationEntity;
	}

	public TCartExternalConfigEntity gettCartExternalConfigEntity() {
		return tCartExternalConfigEntity;
	}

	public void settCartExternalConfigEntity(TCartExternalConfigEntity tCartExternalConfigEntity) {
		this.tCartExternalConfigEntity = tCartExternalConfigEntity;
	}

	public TCartInterConfigEntity gettCartInterConfigEntity() {
		return tCartInterConfigEntity;
	}

	public void settCartInterConfigEntity(TCartInterConfigEntity tCartInterConfigEntity) {
		this.tCartInterConfigEntity = tCartInterConfigEntity;
	}

	public TCartSeatConfigEntity gettCartSeatConfigEntity() {
		return tCartSeatConfigEntity;
	}

	public void settCartSeatConfigEntity(TCartSeatConfigEntity tCartSeatConfigEntity) {
		this.tCartSeatConfigEntity = tCartSeatConfigEntity;
	}

	public TCartMultimediaConfigEntity gettCartMultimediaConfigEntity() {
		return tCartMultimediaConfigEntity;
	}

	public void settCartMultimediaConfigEntity(TCartMultimediaConfigEntity tCartMultimediaConfigEntity) {
		this.tCartMultimediaConfigEntity = tCartMultimediaConfigEntity;
	}

	public TCartLightConfigEntity gettCartLightConfigEntity() {
		return tCartLightConfigEntity;
	}

	public void settCartLightConfigEntity(TCartLightConfigEntity tCartLightConfigEntity) {
		this.tCartLightConfigEntity = tCartLightConfigEntity;
	}

	public TCartGlassRearviewMirrorEntity gettCartGlassRearviewMirrorEntity() {
		return tCartGlassRearviewMirrorEntity;
	}

	public void settCartGlassRearviewMirrorEntity(TCartGlassRearviewMirrorEntity tCartGlassRearviewMirrorEntity) {
		this.tCartGlassRearviewMirrorEntity = tCartGlassRearviewMirrorEntity;
	}

	public TCartAirRefrigeratorEntity gettCartAirRefrigeratorEntity() {
		return tCartAirRefrigeratorEntity;
	}

	public void settCartAirRefrigeratorEntity(TCartAirRefrigeratorEntity tCartAirRefrigeratorEntity) {
		this.tCartAirRefrigeratorEntity = tCartAirRefrigeratorEntity;
	}

	public TCartHighTechConfigEntity gettCartHighTechConfigEntity() {
		return tCartHighTechConfigEntity;
	}

	public void settCartHighTechConfigEntity(TCartHighTechConfigEntity tCartHighTechConfigEntity) {
		this.tCartHighTechConfigEntity = tCartHighTechConfigEntity;
	}
}
