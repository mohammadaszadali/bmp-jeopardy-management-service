
package com.dtag.bm.jeopardy.service.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "_id", "externalId", "productOrderId", "version", "processInstanceId", "serviceOrder", "errorInfo",
		"provisioningChannel", "serviceOrderStatus", "jeopardyType", "jeopardyStatus", "resolutionType",
		"jeopardySubType", "severity" })

public class Jeopardy {

	@JsonProperty("id")
	private String id;
	
	@JsonProperty("externalId")
	private String externalId;
	
	@JsonProperty("productOrderId")
	private String productOrderId;
	
	@JsonProperty("version")
	private String version;
	
	@JsonProperty("processInstanceId")
	private String processInstanceId;
	
	@JsonProperty("serviceOrder")
	private ServiceOrderRequest serviceOrder;
	
	@JsonProperty("errorInfo")
	private List<ErrorInfo> errorInfo = null;
	
	@JsonProperty("provisioningChannel")
	private String provisioningChannel;
	
	@JsonProperty("serviceOrderStatus")
	private String serviceOrderStatus;
	
	@JsonProperty("jeopardyType")
	private String jeopardyType;
	
	@JsonProperty("jeopardyStatus")
	private String jeopardyStatus;
	
	@JsonProperty("resolutionType")
	private String resolutionType;
	
	@JsonProperty("jeopardySubType")
	private String jeopardySubType;
	
	@JsonProperty("severity")
	private String severity;

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("externalId")
	public String getExternalId() {
		return externalId;
	}

	@JsonProperty("externalId")
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	@JsonProperty("productOrderId")
	public String getProductOrderId() {
		return productOrderId;
	}

	@JsonProperty("productOrderId")
	public void setProductOrderId(String productOrderId) {
		this.productOrderId = productOrderId;
	}

	@JsonProperty("version")
	public String getVersion() {
		return version;
	}

	@JsonProperty("version")
	public void setVersion(String version) {
		this.version = version;
	}

	@JsonProperty("processInstanceId")
	public String getProcessInstanceId() {
		return processInstanceId;
	}

	@JsonProperty("processInstanceId")
	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	@JsonProperty("serviceOrder")
	public ServiceOrderRequest getServiceOrder() {
		return serviceOrder;
	}

	@JsonProperty("serviceOrder")
	public void setServiceOrder(ServiceOrderRequest serviceOrder) {
		this.serviceOrder = serviceOrder;
	}

	@JsonProperty("errorInfo")
	public List<ErrorInfo> getErrorInfo() {
		return errorInfo;
	}

	@JsonProperty("errorInfo")
	public void setErrorInfo(List<ErrorInfo> errorInfo) {
		this.errorInfo = errorInfo;
	}

	@JsonProperty("provisioningChannel")
	public String getProvisioningChannel() {
		return provisioningChannel;
	}

	@JsonProperty("provisioningChannel")
	public void setProvisioningChannel(String provisioningChannel) {
		this.provisioningChannel = provisioningChannel;
	}

	@JsonProperty("serviceOrderStatus")
	public String getServiceOrderStatus() {
		return serviceOrderStatus;
	}

	@JsonProperty("serviceOrderStatus")
	public void setServiceOrderStatus(String serviceOrderStatus) {
		this.serviceOrderStatus = serviceOrderStatus;
	}

	@JsonProperty("jeopardyType")
	public String getJeopardyType() {
		return jeopardyType;
	}

	@JsonProperty("jeopardyType")
	public void setJeopardyType(String jeopardyType) {
		this.jeopardyType = jeopardyType;
	}

	@JsonProperty("jeopardyStatus")
	public String getJeopardyStatus() {
		return jeopardyStatus;
	}

	@JsonProperty("jeopardyStatus")
	public void setJeopardyStatus(String jeopardyStatus) {
		this.jeopardyStatus = jeopardyStatus;
	}

	@JsonProperty("resolutionType")
	public String getResolutionType() {
		return resolutionType;
	}

	@JsonProperty("resolutionType")
	public void setResolutionType(String resolutionType) {
		this.resolutionType = resolutionType;
	}

	@JsonProperty("jeopardySubType")
	public String getJeopardySubType() {
		return jeopardySubType;
	}

	@JsonProperty("jeopardySubType")
	public void setJeopardySubType(String jeopardySubType) {
		this.jeopardySubType = jeopardySubType;
	}

	@JsonProperty("severity")
	public String getSeverity() {
		return severity;
	}

	@JsonProperty("severity")
	public void setSeverity(String severity) {
		this.severity = severity;
	}

}
