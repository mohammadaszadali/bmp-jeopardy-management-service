
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
@JsonPropertyOrder({ "@referredType", "href", "id" })

public class Appointment {

	@JsonProperty("@referredType")
	private String referredType;
	@JsonProperty("href")
	private String href;
	@JsonProperty("id")
	private String id;
	

	@JsonProperty("@referredType")
	public String getReferredType() {
		return referredType;
	}

	@JsonProperty("@referredType")
	public void setReferredType(String referredType) {
		this.referredType = referredType;
	}

	@JsonProperty("href")
	public String getHref() {
		return href;
	}

	@JsonProperty("href")
	public void setHref(String href) {
		this.href = href;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

}
