package com.farmapp.efarm.model;

import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class RiskInstanceLog {

	
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    private String requestPayload;
    private String rauId;
    @OneToMany(mappedBy = "riskInstanceLog",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<SnowRequestsLog> snowRequestsLogs;
    private String initialPayload;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getRequestPayload() {
		return requestPayload;
	}
	public void setRequestPayload(String requestPayload) {
		this.requestPayload = requestPayload;
	}
	public String getRauId() {
		return rauId;
	}
	public void setRauId(String rauId) {
		this.rauId = rauId;
	}
	public Set<SnowRequestsLog> getSnowRequestsLogs() {
		return snowRequestsLogs;
	}
	public void setSnowRequestsLogs(Set<SnowRequestsLog> snowRequestsLogs) {
		this.snowRequestsLogs = snowRequestsLogs;
	}
	public String getInitialPayload() {
		return initialPayload;
	}
	public void setInitialPayload(String initialPayload) {
		this.initialPayload = initialPayload;
	}
    
    
}
