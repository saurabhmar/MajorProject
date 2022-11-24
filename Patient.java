package com.cybage.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "pateint")
public class Patient{




	
	
	
	
	@Id
    @GeneratedValue
    @Min
    @Max
    @Column(name="Id")
    private int Id;
    @Column(name="patientName");
    @NotNull
    private String doctorName;


    @Column(name="emailId");
    @NotNull
    private String emailId;


    @Column(name="Password");
    @NotNull 
    private password Password;

    @Column(name="mobileNumber");
    @NotNull
    private String mobileNumber;


    @Column(name="gender");
    @NotNull
    private String gender;


    @Column(name="statusOfAccount");
    @NotNull
    private String statusOfAccount;


    @Column(name="attemptsOfLogin");
    @NotNull
    private String attemptsOfLogin;



}


	// public Object getProductName() {
	// TODO Auto-generated method stub
	// return null;
	// }

	// public int getProductId() {
	// return productId;
	// }

	// public String getProductName() {
	// return productName;
	// }

	// public int getPrice() {
	// return price;
	// }

	// public List<Order> getOrder() {
	// return order;
	// }

//	public int getProductId() {
//		return productId;
//	}
//	public void setProductId(int productId) {
//		this.productId = productId;
//	}
//	public String getProductName() {
//		return productName;
//	}
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	@Override
//	public String toString() {
//		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
//	}

}
