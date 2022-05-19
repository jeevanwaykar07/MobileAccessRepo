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
 * Optional parameter. A list of service characteristics (ServiceCharacteristic [*]) represented as name/value pairs. Used to store instance specific values of attributes.
 */
@Schema(description = "Optional parameter. A list of service characteristics (ServiceCharacteristic [*]) represented as name/value pairs. Used to store instance specific values of attributes.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-12T04:30:03.026Z[GMT]")
public class ServiceCharacteristic {
	@SerializedName("name")
	  private String name = null;
	 
	  @SerializedName("value")
	  private Object value = null;
	 
	  @SerializedName("@baseType")
	  private String _atBaseType = null;
	 
	  @SerializedName("@schemaLocation")
	  private String _atSchemaLocation = null;
	 
	  @SerializedName("@type")
	  private String _atType = null;
	 
	  public ServiceCharacteristic name(String name) {
	    this.name = name;
	    return this;
	  }
	 
	   /**
	   * The name of the ServiceCharacteristic.
	   * @return name
	  **/
	  @Schema(required = true, description = "The name of the ServiceCharacteristic.")
	  public String getName() {
	    return name;
	  }
	 
	  public void setName(String name) {
	    this.name = name;
	  }
	 
	  public ServiceCharacteristic value(Object value) {
	    this.value = value;
	    return this;
	  }
	 
	   /**
	   * Get value
	   * @return value
	  **/
	  @Schema(required = true, description = "")
	  public Object getValue() {
	    return value;
	  }
	 
	  public void setValue(Object value) {
	    this.value = value;
	  }
	 
	  public ServiceCharacteristic _atBaseType(String _atBaseType) {
	    this._atBaseType = _atBaseType;
	    return this;
	  }
	 
	   /**
	   * When sub-classing, this defines the super-class
	   * @return _atBaseType
	  **/
	  @Schema(description = "When sub-classing, this defines the super-class")
	  public String getAtBaseType() {
	    return _atBaseType;
	  }
	 
	  public void setAtBaseType(String _atBaseType) {
	    this._atBaseType = _atBaseType;
	  }
	 
	  public ServiceCharacteristic _atSchemaLocation(String _atSchemaLocation) {
	    this._atSchemaLocation = _atSchemaLocation;
	    return this;
	  }
	 
	   /**
	   * A URI to a JSON-Schema file that defines additional attributes and relationships
	   * @return _atSchemaLocation
	  **/
	  @Schema(description = "A URI to a JSON-Schema file that defines additional attributes and relationships")
	  public String getAtSchemaLocation() {
	    return _atSchemaLocation;
	  }
	 
	  public void setAtSchemaLocation(String _atSchemaLocation) {
	    this._atSchemaLocation = _atSchemaLocation;
	  }
	 
	  public ServiceCharacteristic _atType(String _atType) {
	    this._atType = _atType;
	    return this;
	  }
	 
	   /**
	   * When sub-classing, this defines the sub-class entity name
	   * @return _atType
	  **/
	  @Schema(description = "When sub-classing, this defines the sub-class entity name")
	  public String getAtType() {
	    return _atType;
	  }
	 
	  public void setAtType(String _atType) {
	    this._atType = _atType;
	  }
	 

	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    ServiceCharacteristic serviceCharacteristic = (ServiceCharacteristic) o;
	    return Objects.equals(this.name, serviceCharacteristic.name) &&
	        Objects.equals(this.value, serviceCharacteristic.value) &&
	        Objects.equals(this._atBaseType, serviceCharacteristic._atBaseType) &&
	        Objects.equals(this._atSchemaLocation, serviceCharacteristic._atSchemaLocation) &&
	        Objects.equals(this._atType, serviceCharacteristic._atType);
	  }
	 
	  @Override
	  public int hashCode() {
	    return Objects.hash(name, value, _atBaseType, _atSchemaLocation, _atType);
	  }
	 

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class ServiceCharacteristic {\n");

	    sb.append("    name: ").append(toIndentedString(name)).append("\n");
	    sb.append("    value: ").append(toIndentedString(value)).append("\n");
	    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
	    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
	    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
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