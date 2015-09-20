package com.bankinterface.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Tradetype entity. @author MyEclipse Persistence Tools
 */

public class Tradetype implements java.io.Serializable {

	// Fields

	private Integer ttid;
	private String ttname;
	private Set tradedetailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tradetype() {
	}

	/** full constructor */
	public Tradetype(String ttname, Set tradedetailses) {
		this.ttname = ttname;
		this.tradedetailses = tradedetailses;
	}

	// Property accessors

	public Integer getTtid() {
		return this.ttid;
	}

	public void setTtid(Integer ttid) {
		this.ttid = ttid;
	}

	public String getTtname() {
		return this.ttname;
	}

	public void setTtname(String ttname) {
		this.ttname = ttname;
	}

	public Set getTradedetailses() {
		return this.tradedetailses;
	}

	public void setTradedetailses(Set tradedetailses) {
		this.tradedetailses = tradedetailses;
	}

}