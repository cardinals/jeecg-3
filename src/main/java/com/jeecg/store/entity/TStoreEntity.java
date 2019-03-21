package com.jeecg.store.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 门店信息表
 * @author onlineGenerator
 * @date 2019-03-14 09:11:25
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_store", schema = "")
@SuppressWarnings("serial")
public class TStoreEntity implements java.io.Serializable {
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
	/**门店名称*/
	@Excel(name="门店名称",width=15)
	private String name;
	/**地址*/
	@Excel(name="地址",width=15)
	private String address;
	/**手机号*/
	@Excel(name="手机号",width=15)
	private String phoneNumber;
	/**经度*/
	@Excel(name="经度",width=15)
	private String lng;
	/**维度*/
	@Excel(name="维度",width=15)
	private String lat;
	/**负责人*/
	@Excel(name="负责人",width=15)
	private String userName;
	/**浏览人数*/
	@Excel(name="浏览人数",width=15)
	private String browseNum;
	/**已售车数*/
	@Excel(name="已售车数",width=15)
	private String soldNum;
	/**在售车数*/
	@Excel(name="在售车数",width=15)
	private String cartNum;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")

	@Column(name ="ID",nullable=false,length=36)
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

	@Column(name ="CREATE_NAME",nullable=true,length=50)
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

	@Column(name ="CREATE_BY",nullable=true,length=50)
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

	@Column(name ="CREATE_DATE",nullable=true,length=20)
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

	@Column(name ="UPDATE_NAME",nullable=true,length=50)
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

	@Column(name ="UPDATE_BY",nullable=true,length=50)
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

	@Column(name ="UPDATE_DATE",nullable=true,length=20)
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

	@Column(name ="SYS_ORG_CODE",nullable=true,length=50)
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

	@Column(name ="SYS_COMPANY_CODE",nullable=true,length=50)
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

	@Column(name ="BPM_STATUS",nullable=true,length=32)
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
	 *@return: java.lang.String  门店名称
	 */

	@Column(name ="NAME",nullable=false,length=32)
	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  门店名称
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  地址
	 */

	@Column(name ="ADDRESS",nullable=false,length=150)
	public String getAddress(){
		return this.address;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  地址
	 */
	public void setAddress(String address){
		this.address = address;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  手机号
	 */

	@Column(name ="PHONE_NUMBER",nullable=false,length=11)
	public String getPhoneNumber(){
		return this.phoneNumber;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  手机号
	 */
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  经度
	 */

	@Column(name ="LNG",nullable=false,length=150)
	public String getLng(){
		return this.lng;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  经度
	 */
	public void setLng(String lng){
		this.lng = lng;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  维度
	 */

	@Column(name ="LAT",nullable=false,length=150)
	public String getLat(){
		return this.lat;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  维度
	 */
	public void setLat(String lat){
		this.lat = lat;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  负责人
	 */

	@Column(name ="USER_NAME",nullable=true,length=32)
	public String getUserName(){
		return this.userName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  负责人
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  浏览人数
	 */

	@Column(name ="BROWSE_NUM",nullable=true,length=32)
	public String getBrowseNum(){
		return this.browseNum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  浏览人数
	 */
	public void setBrowseNum(String browseNum){
		this.browseNum = browseNum;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  已售车数
	 */

	@Column(name ="SOLD_NUM",nullable=true,length=32)
	public String getSoldNum(){
		return this.soldNum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  已售车数
	 */
	public void setSoldNum(String soldNum){
		this.soldNum = soldNum;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  在售车数
	 */

	@Column(name ="CART_NUM",nullable=true,length=32)
	public String getCartNum(){
		return this.cartNum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  在售车数
	 */
	public void setCartNum(String cartNum){
		this.cartNum = cartNum;
	}
}