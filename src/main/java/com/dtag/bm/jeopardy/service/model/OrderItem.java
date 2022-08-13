
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
@JsonPropertyOrder({ "@baseType", "@schemaLocation", "@type", "action", "appointment", "id", "orderItemMessage",
		"orderItemRelationship", "orderMessage", "percentProgress", "service", "state" })


public class OrderItem {

	@JsonProperty("@baseType")
	private String baseType;
	
	@JsonProperty("@schemaLocation")
	private String schemaLocation;
	
	@JsonProperty("@type")
	private String type;
	
	@JsonProperty("action")
	private String action;
	
	@JsonProperty("appointment")
	private AppointmentRef appointment;
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("orderItemMessage")
	private List<OrderItemMessage> orderItemMessage = null;
	
	@JsonProperty("orderItemRelationship")
	private List<OrderItemRelationship> orderItemRelationship = null;
	
	@JsonProperty("orderMessage")
	private List<OrderMessage> orderMessage = null;
	
	@JsonProperty("percentProgress")
	private String percentProgress;
	
	@JsonProperty("service")
	private Service service;
	
	@JsonProperty("state")
	private String state;


	@JsonProperty("@baseType")
	public String getBaseType() {
		return baseType;
	}

	@JsonProperty("@baseType")
	public void setBaseType(String baseType) {
		this.baseType = baseType;
	}

	@JsonProperty("@schemaLocation")
	public String getSchemaLocation() {
		return schemaLocation;
	}

	@JsonProperty("@schemaLocation")
	public void setSchemaLocation(String schemaLocation) {
		this.schemaLocation = schemaLocation;
	}

	@JsonProperty("@type")
	public String getType() {
		return type;
	}

	@JsonProperty("@type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("action")
	public String getAction() {
		return action;
	}

	@JsonProperty("action")
	public void setAction(String action) {
		this.action = action;
	}

	@JsonProperty("appointment")
	public AppointmentRef getAppointment() {
		return appointment;
	}

	@JsonProperty("appointment")
	public void setAppointment(AppointmentRef appointment) {
		this.appointment = appointment;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("orderItemMessage")
	public List<OrderItemMessage> getOrderItemMessage() {
		return orderItemMessage;
	}

	@JsonProperty("orderItemMessage")
	public void setOrderItemMessage(List<OrderItemMessage> orderItemMessage) {
		this.orderItemMessage = orderItemMessage;
	}

	@JsonProperty("orderItemRelationship")
	public List<OrderItemRelationship> getOrderItemRelationship() {
		return orderItemRelationship;
	}

	@JsonProperty("orderItemRelationship")
	public void setOrderItemRelationship(List<OrderItemRelationship> orderItemRelationship) {
		this.orderItemRelationship = orderItemRelationship;
	}

	@JsonProperty("orderMessage")
	public List<OrderMessage> getOrderMessage() {
		return orderMessage;
	}

	@JsonProperty("orderMessage")
	public void setOrderMessage(List<OrderMessage> orderMessage) {
		this.orderMessage = orderMessage;
	}

	@JsonProperty("percentProgress")
	public String getPercentProgress() {
		return percentProgress;
	}

	@JsonProperty("percentProgress")
	public void setPercentProgress(String percentProgress) {
		this.percentProgress = percentProgress;
	}

	@JsonProperty("service")
	public Service getService() {
		return service;
	}

	@JsonProperty("service")
	public void setService(Service service) {
		this.service = service;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

}
