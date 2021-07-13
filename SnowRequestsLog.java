package com.farmapp.efarm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class SnowRequestsLog {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 10, nullable = false) 
	private Long id; 
	private String snowId; 
	private String endPointUrl; 
	private String requestPayload; 
	private String responsePayload; 
	@ManyToOne @JoinColumn(name = "riskInstanceLogId")
	private RiskInstanceLog riskInstanceLog;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSnowId() {
		return snowId;
	}
	public void setSnowId(String snowId) {
		this.snowId = snowId;
	}
	public String getEndPointUrl() {
		return endPointUrl;
	}
	public void setEndPointUrl(String endPointUrl) {
		this.endPointUrl = endPointUrl;
	}
	public String getRequestPayload() {
		return requestPayload;
	}
	public void setRequestPayload(String requestPayload) {
		this.requestPayload = requestPayload;
	}
	public String getResponsePayload() {
		return responsePayload;
	}
	public void setResponsePayload(String responsePayload) {
		this.responsePayload = responsePayload;
	}
	public RiskInstanceLog getRiskInstanceLog() {
		return riskInstanceLog;
	}
	public void setRiskInstanceLog(RiskInstanceLog riskInstanceLog) {
		this.riskInstanceLog = riskInstanceLog;
	}
	
	
}

