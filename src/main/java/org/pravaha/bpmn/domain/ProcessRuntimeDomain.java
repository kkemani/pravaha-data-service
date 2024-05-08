package org.pravaha.bpmn.domain;


import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Entity
@Table(name="Tbl_process_runtime")
@Data
public class ProcessRuntimeDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="process_id")
	private String processId;
	
	@Column(name="process_name")
	private String processName;
	
	
//	@Column(name="start_date")
	@Temporal(TemporalType.DATE)
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Calendar startDate;


	@Column(name="last_update_date")
	private Calendar lastUpdateDate;

	@Column(name="end_date")
	private Calendar endDate;

	@Column(name="Status")
	private int status;

	@Column(name="parent_process_id")
	private String parentProcessId;
	
	@Column(name="version")
	private String processVer;

	public ProcessRuntimeDomain() {
		
	}

	
	public String toString()
	{
		StringBuffer strbuffer= new StringBuffer();
		strbuffer.append(this.processId+ " => "+this.processName+" || "+this.status+" || "+this.processVer);
		return strbuffer.toString();
	}
}