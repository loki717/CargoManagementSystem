package com.amdocs.cargomanagement.entity;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;



@Entity
@Table(name = "CARGO")
public class Cargo {
	
	@Id
	@Column(name = "CNO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	@Column(name = "CARGONAME")
	private String cname;
	
	@Column(name = "EMAIL")
	private String cmail;
	
	@Column(name = "PHONENUMBER")
	private String cphone;
	
	@Column(name = "ADDRESS")
	private String caddress;
	
    @OneToMany(mappedBy = "cargo", cascade = CascadeType.ALL)
    private Set<Truck> truck = new HashSet<>();
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCmail() {
		return cmail;
	}
	public void setCmail(String cmail) {
		this.cmail = cmail;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public Cargo(int cid, String cname, String cmail, String cphone, String caddress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cmail = cmail;
		this.cphone = cphone;
		this.caddress = caddress;
	}
	
	public Cargo()
	{
		
	}

}
