package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the customer_report database table.
 * 
 */
@Entity
@Table(name="customer_report")
@NamedQuery(name="CustomerReport.findAll", query="SELECT c FROM CustomerReport c")
public class CustomerReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_date")
	private Date createDate;

	private byte status;

	private String title;

	//bi-directional many-to-one association to Account
	@ManyToOne
	@JoinColumn(name="id_account")
	private Account account;

	//bi-directional many-to-one association to RegisterService
	@ManyToOne
	@JoinColumn(name="id_register_service")
	private RegisterService registerService;

	public CustomerReport() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public RegisterService getRegisterService() {
		return this.registerService;
	}

	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}

}