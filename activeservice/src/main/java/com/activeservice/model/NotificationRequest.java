/*
 * MobileAccess v1.3.0
 *  ##### **NaaS API Version:** 2.4.0 ##### **mobileAccess service version:** 1.2.3 ## OVERVIEW TMF 640 - Activation and Configuration API. This is a strategic mobileAccess service aiming to provide network capabilities to products.   **Note: Enum values are case sensitive**
 *
 * OpenAPI spec version: 2.4.5
 * Contact: D1701045@team.telstra.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.activeservice.model;

import java.util.Objects;
import java.util.Arrays;

import com.activeservice.model.EventTypeEnum;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * NotificationRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-12T04:30:03.026Z[GMT]")
public class NotificationRequest {
  @SerializedName("eventId")
  private String eventId = null;

  @SerializedName("eventTime")
  private String eventTime = null;

  @SerializedName("eventType")
  private EventTypeEnum eventType = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("serviceId")
  private String serviceId = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("parameterizedMessage")
  private List<Object> parameterizedMessage = null;

  public NotificationRequest eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * This is a Domain generated attribute and should be UUID. Unique identifier for the event message
   * @return eventId
  **/
  @Schema(required = true, description = "This is a Domain generated attribute and should be UUID. Unique identifier for the event message")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public NotificationRequest eventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Creation date of the event. Format should be ISO-8601 (e.g. 2018-03-19T08:20:00.123Z)
   * @return eventTime
  **/
  @Schema(required = true, description = "Creation date of the event. Format should be ISO-8601 (e.g. 2018-03-19T08:20:00.123Z)")
  public String getEventTime() {
    return eventTime;
  }

  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }

  public NotificationRequest eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @Schema(required = true, description = "")
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public NotificationRequest code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Status code
   * @return code
  **/
  @Schema(example = "2xx, 4xx, 5xx", required = true, description = "Status code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public NotificationRequest serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @Schema(required = true, description = "")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public NotificationRequest message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Standard Http Status Message. 
   * @return message
  **/
  @Schema(description = "Standard Http Status Message. ")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public NotificationRequest parameterizedMessage(List<Object> parameterizedMessage) {
    this.parameterizedMessage = parameterizedMessage;
    return this;
  }

  public NotificationRequest addParameterizedMessageItem(Object parameterizedMessageItem) {
    if (this.parameterizedMessage == null) {
      this.parameterizedMessage = new ArrayList<Object>();
    }
    this.parameterizedMessage.add(parameterizedMessageItem);
    return this;
  }

   /**
   * Get parameterizedMessage
   * @return parameterizedMessage
  **/
  @Schema(description = "")
  public List<Object> getParameterizedMessage() {
    return parameterizedMessage;
  }

  public void setParameterizedMessage(List<Object> parameterizedMessage) {
    this.parameterizedMessage = parameterizedMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRequest notificationRequest = (NotificationRequest) o;
    return Objects.equals(this.eventId, notificationRequest.eventId) &&
        Objects.equals(this.eventTime, notificationRequest.eventTime) &&
        Objects.equals(this.eventType, notificationRequest.eventType) &&
        Objects.equals(this.code, notificationRequest.code) &&
        Objects.equals(this.serviceId, notificationRequest.serviceId) &&
        Objects.equals(this.message, notificationRequest.message) &&
        Objects.equals(this.parameterizedMessage, notificationRequest.parameterizedMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventTime, eventType, code, serviceId, message, parameterizedMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRequest {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    parameterizedMessage: ").append(toIndentedString(parameterizedMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}