package com.dtag.bm.jeopardy.service.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "externalId",
    "priority",
    "description",
    "category",
    "relatedParty",
    "orderRelationship",
    "orderItem",
    "@referredType"
})
public class ServiceOrderRequest implements Serializable {
	
	
	private static final long serialVersionUID = -4395597729497890379L;
	
		@JsonProperty("externalId")
		private String externalId;
		
		@JsonProperty("priority")
		 private String priority;
		
		@JsonProperty("description")
		 private String description;
		
		@JsonProperty("category")
		 private String category;		
		
		@JsonProperty("relatedParty")
		 private List < RelatedPartyRef > relatedParty;
		
		@JsonProperty("orderRelationship")
		 private String orderRelationship = null;
		
		@JsonProperty("orderItem")
		 private List < ServiceOrderItem > orderItem;
		 
		 // Getter Methods 

		 public String getExternalId() {
		  return externalId;
		 }

		 public String getPriority() {
		  return priority;
		 }

		 public String getDescription() {
		  return description;
		 }

		 public String getCategory() {
		  return category;
		 }

		 public String getOrderRelationship() {
		  return orderRelationship;
		 }

		 // Setter Methods 

		 public void setExternalId(String externalId) {
		  this.externalId = externalId;
		 }

		 public void setPriority(String priority) {
		  this.priority = priority;
		 }

		 public void setDescription(String description) {
		  this.description = description;
		 }

		 public void setCategory(String category) {
		  this.category = category;
		 }

		 public void setOrderRelationship(String orderRelationship) {
		  this.orderRelationship = orderRelationship;
		 }

		public List<RelatedPartyRef> getRelatedParty() {
			return relatedParty;
		}

		public void setRelatedParty(List<RelatedPartyRef> relatedParty) {
			this.relatedParty = relatedParty;
		}

		public List<ServiceOrderItem> getOrderItem() {
			return orderItem;
		}

		public void setOrderItem(List<ServiceOrderItem> orderItem) {
			this.orderItem = orderItem;
		}
		 
		 
}
