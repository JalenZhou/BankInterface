package com.bankinterface.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Bankusers entity. @author MyEclipse Persistence Tools
 */

public class Bankusers implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String accountNum;
	private String upwd;
	private Set tradedetailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bankusers() {
	}

	/** full constructor */
	public Bankusers(String accountNum, String upwd, Set tradedetailses) {
		this.accountNum = accountNum;
		this.upwd = upwd;
		this.tradedetailses = tradedetailses;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getAccountNum() {
		return this.accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public Set getTradedetailses() {
		return this.tradedetailses;
	}

	public void setTradedetailses(Set tradedetailses) {
		this.tradedetailses = tradedetailses;
	}

}