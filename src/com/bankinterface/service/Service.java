package com.bankinterface.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bankinterface.pojo.Bankusers;
import com.bankinterface.pojo.Tradedetails;
import com.bankinterface.sessionFactory.HibernateSessionFactory;

@Path("service")
public class Service {

	@GET
	@Path("login/{accountNum},{upwd}")
	@Produces(MediaType.APPLICATION_JSON)
	public String Login(@PathParam("accountNum") String accountNum,@PathParam("upwd") String upwd){
		Session session = HibernateSessionFactory.getSession();
		String hql = "from Bankusers u where u.accountNum = ?";
		Query query =session.createQuery(hql);
		query.setString(0, accountNum);
		Bankusers bu = (Bankusers)query.uniqueResult();
		boolean isSuccess = false;
		if(bu != null){
			if(bu.getUpwd().equals(upwd)){
				isSuccess = true;
			}
		}
		HibernateSessionFactory.closeSession();
		if(isSuccess){
			return "{\"login\":[\"state\":1]}";
		}else{
			return "{\"login\":[\"state\":2]}";
		}
		
	}
	
	@GET
	@Path("pay/{accountNum},{upwd}")
	@Produces(MediaType.APPLICATION_JSON)
	public String pay(@PathParam("accountNum")String accountNum,@PathParam("upwd")String upwd){
		Session session = HibernateSessionFactory.getSession();
		String hql = "from Bankusers u where u.accountNum = ?";
		Query query =session.createQuery(hql);
		query.setString(0, accountNum);
		Bankusers bu = (Bankusers)query.uniqueResult();
		if(bu == null){
			return "{\"pay\":[\"state\":0]}";
		}else{
			if(bu.getUpwd().equals(upwd)){
				String hql2 = "select bu.uid from Bankusers bu where bu.accountNum = ?";
				Query q = session.createQuery(hql2);
				q.setString(0, accountNum);
				Integer uid =  (Integer)q.uniqueResult();
				String sql = "insert into Tradedetails td(uid,ttid)values(?,1)";
				Query q2 =session.createSQLQuery(sql);
				q.setInteger(0, uid);
				Tradedetails td = new Tradedetails(tradetype, bankusers);   //------------
				return "{\"pay\":[\"state\":1]}";
			}
		}
	}
	
	@GET
	@Path("turnMoney/{accountNum},{upwd}")
	@Produces(MediaType.APPLICATION_JSON)
	public String turnMoney(@PathParam("accountNum")String accountNum,@PathParam("upwd")String upwd){
		return "";
	}
	
}
