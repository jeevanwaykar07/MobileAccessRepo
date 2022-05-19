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
 * MobileAccessPostRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-12T04:30:03.026Z[GMT]")
public class MobileAccessPostRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("serviceSpecification")
  private ServiceSpecification serviceSpecification = null;

  @SerializedName("serviceCharacteristic")
  private List<ServiceCharacteristic> serviceCharacteristic = new ArrayList<ServiceCharacteristic>();

  @SerializedName("serviceRelationship")
  private List<ServiceRelationship> serviceRelationship = null;

  @SerializedName("relatedParty")
  private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();

  @SerializedName("supportingService")
  private List<SupportingServiceCreatePostRequest> supportingService = null;

  public MobileAccessPostRequest name(String name) {
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

  public MobileAccessPostRequest description(String description) {
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

  public MobileAccessPostRequest state(StateEnum state) {
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

  public MobileAccessPostRequest serviceSpecification(ServiceSpecification serviceSpecification) {
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

  public MobileAccessPostRequest serviceCharacteristic(List<ServiceCharacteristic> serviceCharacteristic) {
    this.serviceCharacteristic = serviceCharacteristic;
    return this;
  }

  public MobileAccessPostRequest addServiceCharacteristicItem(ServiceCharacteristic serviceCharacteristicItem) {
    this.serviceCharacteristic.add(serviceCharacteristicItem);
    return this;
  }

   /**
   * A list of service characteristics (ServiceCharacteristic [*]) represented as name/value pairs. Used to store instance specific values of attributes.
   * @return serviceCharacteristic
  **/
  @Schema(required = true, description = "A list of service characteristics (ServiceCharacteristic [*]) represented as name/value pairs. Used to store instance specific values of attributes.")
  public List<ServiceCharacteristic> getServiceCharacteristic() {
    return serviceCharacteristic;
  }

  public void setServiceCharacteristic(List<ServiceCharacteristic> serviceCharacteristic) {
    this.serviceCharacteristic = serviceCharacteristic;
  }

  public MobileAccessPostRequest serviceRelationship(List<ServiceRelationship> serviceRelationship) {
    this.serviceRelationship = serviceRelationship;
    return this;
  }

  public MobileAccessPostRequest addServiceRelationshipItem(ServiceRelationship serviceRelationshipItem) {
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

  public MobileAccessPostRequest relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public MobileAccessPostRequest addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

   /**
   * Party linked at the service level (e.g. a User).
   * @return relatedParty
  **/
  @Schema(required = true, description = "Party linked at the service level (e.g. a User).")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public MobileAccessPostRequest supportingService(List<SupportingServiceCreatePostRequest> supportingService) {
    this.supportingService = supportingService;
    return this;
  }

  public MobileAccessPostRequest addSupportingServiceItem(SupportingServiceCreatePostRequest supportingServiceItem) {
    if (this.supportingService == null) {
      this.supportingService = new ArrayList<SupportingServiceCreatePostRequest>();
    }
    this.supportingService.add(supportingServiceItem);
    return this;
  }

   /**
   * SupportingService is a collection of child Service Instances. Must contain full specification of a supporting service.
   * @return supportingService
  **/
  @Schema(description = "SupportingService is a collection of child Service Instances. Must contain full specification of a supporting service.")
  public List<SupportingServiceCreatePostRequest> getSupportingService() {
    return supportingService;
  }

  public void setSupportingService(List<SupportingServiceCreatePostRequest> supportingService) {
    this.supportingService = supportingService;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileAccessPostRequest mobileAccessPostRequest = (MobileAccessPostRequest) o;
    return Objects.equals(this.name, mobileAccessPostRequest.name) &&
        Objects.equals(this.description, mobileAccessPostRequest.description) &&
        Objects.equals(this.state, mobileAccessPostRequest.state) &&
        Objects.equals(this.serviceSpecification, mobileAccessPostRequest.serviceSpecification) &&
        Objects.equals(this.serviceCharacteristic, mobileAccessPostRequest.serviceCharacteristic) &&
        Objects.equals(this.serviceRelationship, mobileAccessPostRequest.serviceRelationship) &&
        Objects.equals(this.relatedParty, mobileAccessPostRequest.relatedParty) &&
        Objects.equals(this.supportingService, mobileAccessPostRequest.supportingService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, state, serviceSpecification, serviceCharacteristic, serviceRelationship, relatedParty, supportingService);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileAccessPostRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    serviceSpecification: ").append(toIndentedString(serviceSpecification)).append("\n");
    sb.append("    serviceCharacteristic: ").append(toIndentedString(serviceCharacteristic)).append("\n");
    sb.append("    serviceRelationship: ").append(toIndentedString(serviceRelationship)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    supportingService: ").append(toIndentedString(supportingService)).append("\n");
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
