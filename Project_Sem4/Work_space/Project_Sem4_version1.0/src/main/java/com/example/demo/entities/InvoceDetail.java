package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the invoce_detail database table.
 * 
 */
@Entity
@Table(name="invoce_detail")
@NamedQuery(name="InvoceDetail.findAll", query="SELECT i FROM InvoceDetail i")
public class InvoceDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="paid_money")
	private double paidMoney;

	private byte status;

	//bi-directional many-to-one association to Invoce
	@ManyToOne
	@JoinColumn(name="id_invoce")
	private Invoce invoce;

	public InvoceDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public double getPaidMoney() {
		return this.paidMoney;
	}

	public void setPaidMoney(double paidMoney) {
		this.paidMoney = paidMoney;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public Invoce getInvoce() {
		return this.invoce;
	}

	public void setInvoce(Invoce invoce) {
		this.invoce = invoce;
	}

}