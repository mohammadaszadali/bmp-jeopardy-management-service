
package com.dtag.bm.jeopardy.service.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "code", "correctionRequired", "field", "messageInformation", "severity" })


public class OrderItemMessage {

	@JsonProperty("code")
	private String code;
	
	@JsonProperty("correctionRequired")
	private Boolean correctionRequired;
	
	@JsonProperty("field")
	private String field;
	
	@JsonProperty("messageInformation")
	private String messageInformation;
	
	@JsonProperty("severity")
	private String severity;
	

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	@JsonProperty("correctionRequired")
	public Boolean getCorrectionRequired() {
		return correctionRequired;
	}

	@JsonProperty("correctionRequired")
	public void setCorrectionRequired(Boolean correctionRequired) {
		this.correctionRequired = correctionRequired;
	}

	@JsonProperty("field")
	public String getField() {
		return field;
	}

	@JsonProperty("field")
	public void setField(String field) {
		this.field = field;
	}

	@JsonProperty("messageInformation")
	public String getMessageInformation() {
		return messageInformation;
	}

	@JsonProperty("messageInformation")
	public void setMessageInformation(String messageInformation) {
		this.messageInformation = messageInformation;
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
