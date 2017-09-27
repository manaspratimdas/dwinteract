package splusDwInteract.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * @author dhiraj.bangar
 *
 **/
@Entity
//@Data
@Table(name="STORE")
public class Store {

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="STORE_ID")
	private int storeId;
	
	@Column(name="STORE_NAME")
	private String storeName;
	
	@Column(name="STORE_TYPE")
	private String storeType;
	
	@OneToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	
	public int getStoreId() {
		return storeId;
	}
	
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public String getStoreType() {
		return storeType;
	}
	
	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}
	
	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName + ", storeType=" + storeType + "]";
	}
	
	

}
