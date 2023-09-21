package com.amdocs.cargomanagement.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name="TRUCK")
public class Truck {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "truck_no")
	private int truckno;
	@ManyToOne
//	@Column(name = "cargo_id")
	@JoinColumn(name ="cid")
	private Cargo cargo;
	//private int cid;
	@Column(name = "license")
	private String license;
	@Column(name="Driver")
	private String driverName;
	public int getTruckno() {
		return truckno;
	}
	public void setTruckno(int truckno) {
		this.truckno = truckno;
	}
//	public int getCid() {
//		return cid;
//	}
//	public void setCid(int cid) {
//		this.cid = cid;
//	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
	
	
	

}
