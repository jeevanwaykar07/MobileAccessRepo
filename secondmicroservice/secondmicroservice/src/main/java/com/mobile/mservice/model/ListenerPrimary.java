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

package com.mobile.mservice.model;

import java.util.Objects;
import java.util.Arrays;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Listener notification is sent to each listener who has subscribed to receive it. Domains can include additional routing information as header parameters, such as Domain and Service mnemonic.
 */
@Schema(description = "Listener notification is sent to each listener who has subscribed to receive it. Domains can include additional routing information as header parameters, such as Domain and Service mnemonic.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-12T04:30:03.026Z[GMT]")
public class ListenerPrimary {
  @SerializedName("eventId")
  private String eventId = null;

  @SerializedName("eventTime")
  private String eventTime = null;

  @SerializedName("eventType")
  private EventTypeEnum eventType = null;

  @SerializedName("event")
  private ListenerPrimaryEvent event = null;

  public ListenerPrimary eventId(String eventId) {
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

  public ListenerPrimary eventTime(String eventTime) {
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

  public ListenerPrimary eventType(EventTypeEnum eventType) {
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

  public ListenerPrimary event(ListenerPrimaryEvent event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @Schema(required = true, description = "")
  public ListenerPrimaryEvent getEvent() {
    return event;
  }

  public void setEvent(ListenerPrimaryEvent event) {
    this.event = event;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListenerPrimary listenerPrimary = (ListenerPrimary) o;
    return Objects.equals(this.eventId, listenerPrimary.eventId) &&
        Objects.equals(this.eventTime, listenerPrimary.eventTime) &&
        Objects.equals(this.eventType, listenerPrimary.eventType) &&
        Objects.equals(this.event, listenerPrimary.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventTime, eventType, event);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListenerPrimary {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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
