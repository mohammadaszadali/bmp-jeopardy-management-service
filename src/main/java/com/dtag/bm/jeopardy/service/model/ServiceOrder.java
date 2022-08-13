
package com.dtag.bm.jeopardy.service.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "category", "description", "externalId", "orderItem", "orderRelationship", "priority",
		"relatedParty" })

public class ServiceOrder {

	@JsonProperty("category")
	private String category;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("externalId")
	private String externalId;
	
	@JsonProperty("orderItem")
	private List<OrderItem> orderItem = null;
	
	@JsonProperty("orderRelationship")
	private String orderRelationship;
	
	@JsonProperty("priority")
	private String priority;
	
	@JsonProperty("relatedParty")
	private List<RelatedParty> relatedParty = null;
	

	@JsonProperty("category")
	public String getCategory() {
		return category;
	}

	@JsonProperty("category")
	public void setCategory(String category) {
		this.category = category;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("externalId")
	public String getExternalId() {
		return externalId;
	}

	@JsonProperty("externalId")
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	@JsonProperty("orderItem")
	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	@JsonProperty("orderItem")
	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	@JsonProperty("orderRelationship")
	public String getOrderRelationship() {
		return orderRelationship;
	}

	@JsonProperty("orderRelationship")
	public void setOrderRelationship(String orderRelationship) {
		this.orderRelationship = orderRelationship;
	}

	@JsonProperty("priority")
	public String getPriority() {
		return priority;
	}

	@JsonProperty("priority")
	public void setPriority(String priority) {
		this.priority = priority;
	}

	@JsonProperty("relatedParty")
	public List<RelatedParty> getRelatedParty() {
		return relatedParty;
	}

	@JsonProperty("relatedParty")
	public void setRelatedParty(List<RelatedParty> relatedParty) {
		this.relatedParty = relatedParty;
	}


}
