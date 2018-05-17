package org.jdsp.pojo;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 用户表
 * @author Administrator
 *
 */
public class Users {

	private String user_id;				//用户id
	private String email;				//邮箱
	private String user_name;			//用户名
	private String user_pwd;			//密码
	private String user_question;		//密保问题
	private String user_answer;			//答案
	private String sex;					//性别	（0男1女）
	private Date birthday;				//出生日期
	private BigDecimal user_moner;		//用户现有资金
	private BigDecimal frozen_moner;	//用户冻结资金
	private Date reg_time;				//注册时间
	private Date last_login;			//最后登陆时间
	private Date last_time;				//最后修改信息时间
	private String last_ip;				//最后一次登录ip
	private String alias;				//昵称
	private String user_qq;				//QQ
	private String mobile_phone;		//联系电话
	private String school;				//学校
	private String province;			//省id
	private String city;				//市id
	private String town;				//县id
	private String sfsq;				//是否授权
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_question() {
		return user_question;
	}
	public void setUser_question(String user_question) {
		this.user_question = user_question;
	}
	public String getUser_answer() {
		return user_answer;
	}
	public void setUser_answer(String user_answer) {
		this.user_answer = user_answer;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public BigDecimal getUser_moner() {
		return user_moner;
	}
	public void setUser_moner(BigDecimal user_moner) {
		this.user_moner = user_moner;
	}
	public BigDecimal getFrozen_moner() {
		return frozen_moner;
	}
	public void setFrozen_moner(BigDecimal frozen_moner) {
		this.frozen_moner = frozen_moner;
	}
	public Date getReg_time() {
		return reg_time;
	}
	public void setReg_time(Date reg_time) {
		this.reg_time = reg_time;
	}
	public Date getLast_login() {
		return last_login;
	}
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	public Date getLast_time() {
		return last_time;
	}
	public void setLast_time(Date last_time) {
		this.last_time = last_time;
	}
	public String getLast_ip() {
		return last_ip;
	}
	public void setLast_ip(String last_ip) {
		this.last_ip = last_ip;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getUser_qq() {
		return user_qq;
	}
	public void setUser_qq(String user_qq) {
		this.user_qq = user_qq;
	}
	public String getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getSfsq() {
		return sfsq;
	}
	public void setSfsq(String sfsq) {
		this.sfsq = sfsq;
	}
	
}
