package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the invoce database table.
 * 
 */
@Entity
@NamedQuery(name="Invoce.findAll", query="SELECT i FROM Invoce i")
public class Invoce implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	private byte status;

	@Column(name="total_price")
	private double totalPrice;

	//bi-directional many-to-one association to RegisterService
	@ManyToOne
	@JoinColumn(name="id_register_service")
	private RegisterService registerService;

	//bi-directional many-to-one association to InvoceDetail
	@OneToMany(mappedBy="invoce")
	private List<InvoceDetail> invoceDetails;

	public Invoce() {
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

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public RegisterService getRegisterService() {
		return this.registerService;
	}

	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public List<InvoceDetail> getInvoceDetails() {
		return this.invoceDetails;
	}

	public void setInvoceDetails(List<InvoceDetail> invoceDetails) {
		this.invoceDetails = invoceDetails;
	}

	public InvoceDetail addInvoceDetail(InvoceDetail invoceDetail) {
		getInvoceDetails().add(invoceDetail);
		invoceDetail.setInvoce(this);

		return invoceDetail;
	}

	public InvoceDetail removeInvoceDetail(InvoceDetail invoceDetail) {
		getInvoceDetails().remove(invoceDetail);
		invoceDetail.setInvoce(null);

		return invoceDetail;
	}

}