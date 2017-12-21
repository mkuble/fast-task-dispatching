package com.fast.task.dispatching.bean.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fast.framework.data.jpa.bean.BaseIdEntity;

/**
 * 管理员实体
 * 
 * @author lion.chen
 * @version 1.0.0 2017年12月21日 下午6:47:02
 */
@Entity
@Table(name="admin")
public class Admin extends BaseIdEntity{

	private static final long serialVersionUID = 7528305130274928586L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sys_id")
	private int sysId;
	
	@Column(name="status")
	private byte status;
	
	@Column(name="create_by")
	private String createBy;

	@Column(name="create_time")
	private Date createTime;
	
	@Column(name="update_by")
	private String updateBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_time")
	private Date updateTime;
	
}
