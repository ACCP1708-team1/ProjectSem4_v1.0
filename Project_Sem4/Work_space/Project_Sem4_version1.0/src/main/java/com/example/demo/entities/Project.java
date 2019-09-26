package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the project database table.
 * 
 */
@Entity
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String avatar;

	@Lob
	private String description;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	private int name;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	private byte status;

	private String title;

	//bi-directional many-to-one association to ProjectStatus
	@ManyToOne
	@JoinColumn(name="id_status_project")
	private ProjectStatus projectStatus;

	//bi-directional many-to-one association to ProjectPhoto
	@OneToMany(mappedBy="project")
	private List<ProjectPhoto> projectPhotos;

	public Project() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getName() {
		return this.name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
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

	public ProjectStatus getProjectStatus() {
		return this.projectStatus;
	}

	public void setProjectStatus(ProjectStatus projectStatus) {
		this.projectStatus = projectStatus;
	}

	public List<ProjectPhoto> getProjectPhotos() {
		return this.projectPhotos;
	}

	public void setProjectPhotos(List<ProjectPhoto> projectPhotos) {
		this.projectPhotos = projectPhotos;
	}

	public ProjectPhoto addProjectPhoto(ProjectPhoto projectPhoto) {
		getProjectPhotos().add(projectPhoto);
		projectPhoto.setProject(this);

		return projectPhoto;
	}

	public ProjectPhoto removeProjectPhoto(ProjectPhoto projectPhoto) {
		getProjectPhotos().remove(projectPhoto);
		projectPhoto.setProject(null);

		return projectPhoto;
	}

}