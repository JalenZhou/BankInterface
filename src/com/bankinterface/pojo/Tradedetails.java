package com.bankinterface.pojo;

/**
 * Tradedetails entity. @author MyEclipse Persistence Tools
 */

public class Tradedetails implements java.io.Serializable {

	// Fields

	private Integer tdid;
	private Tradetype tradetype;
	private Bankusers bankusers;

	// Constructors

	/** default constructor */
	public Tradedetails() {
	}

	/** full constructor */
	public Tradedetails(Tradetype tradetype, Bankusers bankusers) {
		this.tradetype = tradetype;
		this.bankusers = bankusers;
	}
	

	// Property accessors

	public Integer getTdid() {
		return this.tdid;
	}

	public void setTdid(Integer tdid) {
		this.tdid = tdid;
	}

	public Tradetype getTradetype() {
		return this.tradetype;
	}

	public void setTradetype(Tradetype tradetype) {
		this.tradetype = tradetype;
	}

	public Bankusers getBankusers() {
		return this.bankusers;
	}

	public void setBankusers(Bankusers bankusers) {
		this.bankusers = bankusers;
	}

}