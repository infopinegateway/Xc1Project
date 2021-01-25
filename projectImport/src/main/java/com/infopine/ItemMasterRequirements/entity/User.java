package com.infopine.ItemMasterRequirements.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id" , unique = true,length =5 )
	private Integer id;
	@Column(name="firstName",length=100)
	private String firstName;
	@Column(name="lastName",length=100)
	private String lastName;
	@Column(name="lastModifiedDate")
	private Date lastModifiedDate;
	@Column(name="lastModifiedBy",length=5)
	private Integer lastModifiedBy;
	@Column(name="type" ,length=5)
	private Integer type;
	@Column(name="status",length=2)
	private Integer status;
	@Column(name="filler1",length=200)
	private String filler1;
	@Column(name="filler2",length=200)
	private String filler2;
	@Column(name="filler3",length=200)
	private String filler3;
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="uId",referencedColumnName = "id")
	private List<Item> items;
	public User() {
		super();
	}
	public User(Integer id, String firstName, String lastName, Date lastModifiedDate, Integer lastModifiedBy,
			Integer type, Integer status, String filler1, String filler2, String filler3, List<Item> items) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastModifiedDate = lastModifiedDate;
		this.lastModifiedBy = lastModifiedBy;
		this.type = type;
		this.status = status;
		this.filler1 = filler1;
		this.filler2 = filler2;
		this.filler3 = filler3;
		this.items = items;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public Integer getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(Integer lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getFiller1() {
		return filler1;
	}
	public void setFiller1(String filler1) {
		this.filler1 = filler1;
	}
	public String getFiller2() {
		return filler2;
	}
	public void setFiller2(String filler2) {
		this.filler2 = filler2;
	}
	public String getFiller3() {
		return filler3;
	}
	public void setFiller3(String filler3) {
		this.filler3 = filler3;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", lastModifiedDate="
				+ lastModifiedDate + ", lastModifiedBy=" + lastModifiedBy + ", type=" + type + ", status=" + status
				+ ", filler1=" + filler1 + ", filler2=" + filler2 + ", filler3=" + filler3 + ", items=" + items + "]";
	}
	
}
