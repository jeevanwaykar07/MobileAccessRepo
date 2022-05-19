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
import java.util.ArrayList;
import java.util.List;
/**
 * SupportingServiceCreatePostRequest must be used to provide full specification of a Supporting Service in a POST request if the intention is to create a new supporting service instance.
 */
@Schema(description = "SupportingServiceCreatePostRequest must be used to provide full specification of a Supporting Service in a POST request if the intention is to create a new supporting service instance.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-12T04:30:03.026Z[GMT]")
public class SupportingServiceCreatePostRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("serviceSpecification")
  private ServiceSpecification serviceSpecification = null;

  @SerializedName("serviceCharacteristic")
  private List<ServiceCharacteristic> serviceCharacteristic = null;

  @SerializedName("serviceRelationship")
  private List<ServiceRelationship> serviceRelationship = null;

  @SerializedName("relatedParty")
  private List<RelatedParty> relatedParty = null;

  public SupportingServiceCreatePostRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Friendly Name of the Service Instance.
   * @return name
  **/
  @Schema(description = "Friendly Name of the Service Instance.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SupportingServiceCreatePostRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A free-text description of the service (what it provides).
   * @return description
  **/
  @Schema(description = "A free-text description of the service (what it provides).")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SupportingServiceCreatePostRequest state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(required = true, description = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public SupportingServiceCreatePostRequest serviceSpecification(ServiceSpecification serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
    return this;
  }

   /**
   * Get serviceSpecification
   * @return serviceSpecification
  **/
  @Schema(required = true, description = "")
  public ServiceSpecification getServiceSpecification() {
    return serviceSpecification;
  }

  public void setServiceSpecification(ServiceSpecification serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
  }

  public SupportingServiceCreatePostRequest serviceCharacteristic(List<ServiceCharacteristic> serviceCharacteristic) {
    this.serviceCharacteristic = serviceCharacteristic;
    return this;
  }

  public SupportingServiceCreatePostRequest addServiceCharacteristicItem(ServiceCharacteristic serviceCharacteristicItem) {
    if (this.serviceCharacteristic == null) {
      this.serviceCharacteristic = new ArrayList<ServiceCharacteristic>();
    }
    this.serviceCharacteristic.add(serviceCharacteristicItem);
    return this;
  }

   /**
   * A list of service characteristics (ServiceCharacteristic [*]) represented as name/value pairs. Used to store instance specific values of attributes.
   * @return serviceCharacteristic
  **/
  @Schema(description = "A list of service characteristics (ServiceCharacteristic [*]) represented as name/value pairs. Used to store instance specific values of attributes.")
  public List<ServiceCharacteristic> getServiceCharacteristic() {
    return serviceCharacteristic;
  }

  public void setServiceCharacteristic(List<ServiceCharacteristic> serviceCharacteristic) {
    this.serviceCharacteristic = serviceCharacteristic;
  }

  public SupportingServiceCreatePostRequest serviceRelationship(List<ServiceRelationship> serviceRelationship) {
    this.serviceRelationship = serviceRelationship;
    return this;
  }

  public SupportingServiceCreatePostRequest addServiceRelationshipItem(ServiceRelationship serviceRelationshipItem) {
    if (this.serviceRelationship == null) {
      this.serviceRelationship = new ArrayList<ServiceRelationship>();
    }
    this.serviceRelationship.add(serviceRelationshipItem);
    return this;
  }

   /**
   * A list of service relationships (ServiceRelationship [*]). Describes links with other service(s) in the inventory (useful for describing relies-on, relies-from between CFS for example). This is an optional Reference to related services (e.g. components of a service chain).
   * @return serviceRelationship
  **/
  @Schema(description = "A list of service relationships (ServiceRelationship [*]). Describes links with other service(s) in the inventory (useful for describing relies-on, relies-from between CFS for example). This is an optional Reference to related services (e.g. components of a service chain).")
  public List<ServiceRelationship> getServiceRelationship() {
    return serviceRelationship;
  }

  public void setServiceRelationship(List<ServiceRelationship> serviceRelationship) {
    this.serviceRelationship = serviceRelationship;
  }

  public SupportingServiceCreatePostRequest relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public SupportingServiceCreatePostRequest addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

   /**
   * Party linked at the service level (e.g. a User).
   * @return relatedParty
  **/
  @Schema(description = "Party linked at the service level (e.g. a User).")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportingServiceCreatePostRequest supportingServiceCreatePostRequest = (SupportingServiceCreatePostRequest) o;
    return Objects.equals(this.name, supportingServiceCreatePostRequest.name) &&
        Objects.equals(this.description, supportingServiceCreatePostRequest.description) &&
        Objects.equals(this.state, supportingServiceCreatePostRequest.state) &&
        Objects.equals(this.serviceSpecification, supportingServiceCreatePostRequest.serviceSpecification) &&
        Objects.equals(this.serviceCharacteristic, supportingServiceCreatePostRequest.serviceCharacteristic) &&
        Objects.equals(this.serviceRelationship, supportingServiceCreatePostRequest.serviceRelationship) &&
        Objects.equals(this.relatedParty, supportingServiceCreatePostRequest.relatedParty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, state, serviceSpecification, serviceCharacteristic, serviceRelationship, relatedParty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportingServiceCreatePostRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    serviceSpecification: ").append(toIndentedString(serviceSpecification)).append("\n");
    sb.append("    serviceCharacteristic: ").append(toIndentedString(serviceCharacteristic)).append("\n");
    sb.append("    serviceRelationship: ").append(toIndentedString(serviceRelationship)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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
