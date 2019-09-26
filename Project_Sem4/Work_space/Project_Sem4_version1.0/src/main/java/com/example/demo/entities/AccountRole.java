package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the account_role database table.
 * 
 */
@Entity
@Table(name="account_role")
@NamedQuery(name="AccountRole.findAll", query="SELECT a FROM AccountRole a")
public class AccountRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_account_role")
	private int idAccountRole;

	@Column(name="role_name")
	private String roleName;

	private byte status;

	//bi-directional many-to-one association to Account
	@OneToMany(mappedBy="accountRole")
	private List<Account> accounts;

	public AccountRole() {
	}

	public int getIdAccountRole() {
		return this.idAccountRole;
	}

	public void setIdAccountRole(int idAccountRole) {
		this.idAccountRole = idAccountRole;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public List<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public Account addAccount(Account account) {
		getAccounts().add(account);
		account.setAccountRole(this);

		return account;
	}

	public Account removeAccount(Account account) {
		getAccounts().remove(account);
		account.setAccountRole(null);

		return account;
	}

}