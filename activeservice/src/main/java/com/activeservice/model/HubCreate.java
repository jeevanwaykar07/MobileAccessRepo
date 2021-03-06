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

import com.activeservice.model.*;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The registration of a listener is done by creating a HUB resource unique to the listener (equivalent of a subscription). When a consumer wants to subscribe to all the types of entType, then need to include &#x27;&#x27;*&#x27;&#x27; as the value in hub request
 */
@Schema(description = "The registration of a listener is done by creating a HUB resource unique to the listener (equivalent of a subscription). When a consumer wants to subscribe to all the types of entType, then need to include ''*'' as the value in hub request")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-12T04:30:03.026Z[GMT]")
public class HubCreate {
  @SerializedName("callback")
  private String callback = null;

  @SerializedName("eventType")
  private EventTypeEnum eventType = null;

  public HubCreate callback(String callback) {
    this.callback = callback;
    return this;
  }

   /**
   * communication endpoint address provided by consumer who is subscribing to recieve events or notifications.
   * @return callback
  **/
  @Schema(required = true, description = "communication endpoint address provided by consumer who is subscribing to recieve events or notifications.")
  public String getCallback() {
    return callback;
  }

  public void setCallback(String callback) {
    this.callback = callback;
  }

  public HubCreate eventType(EventTypeEnum eventType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HubCreate hubCreate = (HubCreate) o;
    return Objects.equals(this.callback, hubCreate.callback) &&
        Objects.equals(this.eventType, hubCreate.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callback, eventType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HubCreate {\n");
    
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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
