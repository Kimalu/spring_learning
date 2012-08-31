package com.Kimalu.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.Kimalu.spring.Log;

@Repository
public class LogDao {
	@Autowired
	public HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	public void saveLog(Log log){
		ht.save(log);
	}
}
