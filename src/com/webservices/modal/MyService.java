package com.webservices.modal;

// Generated Feb 9, 2016 1:47:48 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MyService generated by hbm2java
 */
@Entity
@Table(name = "my_service", catalog = "mysql_service")
public class MyService implements java.io.Serializable {

	private Long id;
	private String field1;
	private String field2;
	private String field3;
	private String field4;
	private String field5;
	private String field6;
	private String field7;
	private String field8;
	private String field9;
	private String field10;
	private String field11600;
	private String field12600;
	private String field13600;
	private String field14600;
	private Integer intfield1;
	private Integer intfield2;
	private Integer intfield3;
	private Integer intfield4;
	private Integer intfield5;
	private Integer intfield6;
	private Integer intfield8;
	private String textfield1;
	private String textfield2;
	private String textfield3;
	private String keyword;
	private Date createDate;
	private String active;
	private Float floatfield1;
	private Float floatfield2;
	private Float floatfield3;

	public MyService() {
	}

	public MyService(Date createDate, String active) {
		this.createDate = createDate;
		this.active = active;
	}

	public MyService(String field1, String field2, String field3,
			String field4, String field5, String field6, String field7,
			String field8, String field9, String field10, String field11600,
			String field12600, String field13600, String field14600,
			Integer intfield1, Integer intfield2, Integer intfield3,
			Integer intfield4, Integer intfield5, Integer intfield6,
			Integer intfield8, String textfield1, String textfield2,
			String textfield3, String keyword, Date createDate, String active,
			Float floatfield1, Float floatfield2, Float floatfield3) {
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		this.field4 = field4;
		this.field5 = field5;
		this.field6 = field6;
		this.field7 = field7;
		this.field8 = field8;
		this.field9 = field9;
		this.field10 = field10;
		this.field11600 = field11600;
		this.field12600 = field12600;
		this.field13600 = field13600;
		this.field14600 = field14600;
		this.intfield1 = intfield1;
		this.intfield2 = intfield2;
		this.intfield3 = intfield3;
		this.intfield4 = intfield4;
		this.intfield5 = intfield5;
		this.intfield6 = intfield6;
		this.intfield8 = intfield8;
		this.textfield1 = textfield1;
		this.textfield2 = textfield2;
		this.textfield3 = textfield3;
		this.keyword = keyword;
		this.createDate = createDate;
		this.active = active;
		this.floatfield1 = floatfield1;
		this.floatfield2 = floatfield2;
		this.floatfield3 = floatfield3;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "field1")
	public String getField1() {
		return this.field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	@Column(name = "field2")
	public String getField2() {
		return this.field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	@Column(name = "field3")
	public String getField3() {
		return this.field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	@Column(name = "field4")
	public String getField4() {
		return this.field4;
	}

	public void setField4(String field4) {
		this.field4 = field4;
	}

	@Column(name = "field5")
	public String getField5() {
		return this.field5;
	}

	public void setField5(String field5) {
		this.field5 = field5;
	}

	@Column(name = "field6")
	public String getField6() {
		return this.field6;
	}

	public void setField6(String field6) {
		this.field6 = field6;
	}

	@Column(name = "field7")
	public String getField7() {
		return this.field7;
	}

	public void setField7(String field7) {
		this.field7 = field7;
	}

	@Column(name = "field8")
	public String getField8() {
		return this.field8;
	}

	public void setField8(String field8) {
		this.field8 = field8;
	}

	@Column(name = "field9")
	public String getField9() {
		return this.field9;
	}

	public void setField9(String field9) {
		this.field9 = field9;
	}

	@Column(name = "field10")
	public String getField10() {
		return this.field10;
	}

	public void setField10(String field10) {
		this.field10 = field10;
	}

	@Column(name = "field11_600", length = 600)
	public String getField11600() {
		return this.field11600;
	}

	public void setField11600(String field11600) {
		this.field11600 = field11600;
	}

	@Column(name = "field12_600", length = 600)
	public String getField12600() {
		return this.field12600;
	}

	public void setField12600(String field12600) {
		this.field12600 = field12600;
	}

	@Column(name = "field13_600", length = 600)
	public String getField13600() {
		return this.field13600;
	}

	public void setField13600(String field13600) {
		this.field13600 = field13600;
	}

	@Column(name = "field14_600", length = 600)
	public String getField14600() {
		return this.field14600;
	}

	public void setField14600(String field14600) {
		this.field14600 = field14600;
	}

	@Column(name = "intfield1")
	public Integer getIntfield1() {
		return this.intfield1;
	}

	public void setIntfield1(Integer intfield1) {
		this.intfield1 = intfield1;
	}

	@Column(name = "intfield2")
	public Integer getIntfield2() {
		return this.intfield2;
	}

	public void setIntfield2(Integer intfield2) {
		this.intfield2 = intfield2;
	}

	@Column(name = "intfield3")
	public Integer getIntfield3() {
		return this.intfield3;
	}

	public void setIntfield3(Integer intfield3) {
		this.intfield3 = intfield3;
	}

	@Column(name = "intfield4")
	public Integer getIntfield4() {
		return this.intfield4;
	}

	public void setIntfield4(Integer intfield4) {
		this.intfield4 = intfield4;
	}

	@Column(name = "intfield5")
	public Integer getIntfield5() {
		return this.intfield5;
	}

	public void setIntfield5(Integer intfield5) {
		this.intfield5 = intfield5;
	}

	@Column(name = "intfield6")
	public Integer getIntfield6() {
		return this.intfield6;
	}

	public void setIntfield6(Integer intfield6) {
		this.intfield6 = intfield6;
	}

	@Column(name = "intfield8")
	public Integer getIntfield8() {
		return this.intfield8;
	}

	public void setIntfield8(Integer intfield8) {
		this.intfield8 = intfield8;
	}

	@Column(name = "textfield1", length = 65535)
	public String getTextfield1() {
		return this.textfield1;
	}

	public void setTextfield1(String textfield1) {
		this.textfield1 = textfield1;
	}

	@Column(name = "textfield2", length = 65535)
	public String getTextfield2() {
		return this.textfield2;
	}

	public void setTextfield2(String textfield2) {
		this.textfield2 = textfield2;
	}

	@Column(name = "textfield3", length = 65535)
	public String getTextfield3() {
		return this.textfield3;
	}

	public void setTextfield3(String textfield3) {
		this.textfield3 = textfield3;
	}

	@Column(name = "keyword", length = 65535)
	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate", nullable = false, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "active", nullable = false, length = 1)
	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Column(name = "floatfield1", precision = 12, scale = 0)
	public Float getFloatfield1() {
		return this.floatfield1;
	}

	public void setFloatfield1(Float floatfield1) {
		this.floatfield1 = floatfield1;
	}

	@Column(name = "floatfield2", precision = 12, scale = 0)
	public Float getFloatfield2() {
		return this.floatfield2;
	}

	public void setFloatfield2(Float floatfield2) {
		this.floatfield2 = floatfield2;
	}

	@Column(name = "floatfield3", precision = 12, scale = 0)
	public Float getFloatfield3() {
		return this.floatfield3;
	}

	public void setFloatfield3(Float floatfield3) {
		this.floatfield3 = floatfield3;
	}

}
