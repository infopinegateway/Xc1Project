package com.infopine.ItemMasterRequirements.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=" t_itemmaster")
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id" , unique = true,length =5 )
	private Integer id;
	@Column(name="name",length = 100)
	private String name;
	@Column(name="sku",length = 100)
	private String sku;
	@Column(name="lastModifiedDate")
	private Date lastModifiedDate;
	@Column(name="lastModifiedBy",length = 5)
	private Integer lastModifiedBy;
	@Column(name="type",length = 5)
	private Integer itemType;
	@Column(name="status",length = 2)
	private Integer status;
	@Column(name="filler1",length = 200)
	private String filler1;
	@Column(name="filler2",length = 200)
	private String filler2;
	@Column(name="filler3",length = 200)
	private String filler3;
	public Item() {
		super();
	}
	public Item(Integer id, String name, String sku, Date lastModifiedDate, Integer lastModifiedBy, Integer itemType,
			Integer status, String filler1, String filler2, String filler3) {
		super();
		this.id = id;
		this.name = name;
		this.sku = sku;
		this.lastModifiedDate = lastModifiedDate;
		this.lastModifiedBy = lastModifiedBy;
		this.itemType = itemType;
		this.status = status;
		this.filler1 = filler1;
		this.filler2 = filler2;
		this.filler3 = filler3;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
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
	public Integer getItemType() {
		return itemType;
	}
	public void setItemType(Integer itemType) {
		this.itemType = itemType;
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
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", sku=" + sku + ", lastModifiedDate=" + lastModifiedDate
				+ ", lastModifiedBy=" + lastModifiedBy + ", itemType=" + itemType + ", status=" + status + ", filler1="
				+ filler1 + ", filler2=" + filler2 + ", filler3=" + filler3 + "]";
	}
	

}
