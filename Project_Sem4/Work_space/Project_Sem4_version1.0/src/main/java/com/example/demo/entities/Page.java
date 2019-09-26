package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the page database table.
 * 
 */
@Entity
@NamedQuery(name="Page.findAll", query="SELECT p FROM Page p")
public class Page implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private byte b;

	private String color;

	@Lob
	private String content;

	private byte i;

	private int name;

	private int size;

	private byte status;

	private byte u;

	public Page() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getB() {
		return this.b;
	}

	public void setB(byte b) {
		this.b = b;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public byte getI() {
		return this.i;
	}

	public void setI(byte i) {
		this.i = i;
	}

	public int getName() {
		return this.name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public byte getU() {
		return this.u;
	}

	public void setU(byte u) {
		this.u = u;
	}

}