package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the register_service database table.
 * 
 */
@Entity
@Table(name="register_service")
@NamedQuery(name="RegisterService.findAll", query="SELECT r FROM RegisterServicer r")
public class RegisterService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="price_detail")
	private int priceDetail;

	private int status;

	//bi-directional many-to-one association to CustomerReport
	@OneToMany(mappedBy="registerService")
	private List<CustomerReport> customerReports;

	//bi-directional many-to-one association to Invoce
	@OneToMany(mappedBy="registerService")
	private List<Invoce> invoces;

	//bi-directional many-to-one association to Account
	@ManyToOne
	@JoinColumn(name="id_account")
	private Account account;

	//bi-directional many-to-one association to Servicer
	@ManyToOne
	@JoinColumn(name="id_service")
	private Servicer service;

	public RegisterService() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPriceDetail() {
		return this.priceDetail;
	}

	public void setPriceDetail(int priceDetail) {
		this.priceDetail = priceDetail;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<CustomerReport> getCustomerReports() {
		return this.customerReports;
	}

	public void setCustomerReports(List<CustomerReport> customerReports) {
		this.customerReports = customerReports;
	}

	public CustomerReport addCustomerReport(CustomerReport customerReport) {
		getCustomerReports().add(customerReport);
		customerReport.setRegisterService(this);

		return customerReport;
	}

	public CustomerReport removeCustomerReport(CustomerReport customerReport) {
		getCustomerReports().remove(customerReport);
		customerReport.setRegisterService(null);

		return customerReport;
	}

	public List<Invoce> getInvoces() {
		return this.invoces;
	}

	public void setInvoces(List<Invoce> invoces) {
		this.invoces = invoces;
	}

	public Invoce addInvoce(Invoce invoce) {
		getInvoces().add(invoce);
		invoce.setRegisterService(this);

		return invoce;
	}

	public Invoce removeInvoce(Invoce invoce) {
		getInvoces().remove(invoce);
		invoce.setRegisterService(null);

		return invoce;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Servicer getServicer() {
		return this.service;
	}

	public void setServicer(Servicer service) {
		this.service = service;
	}

}