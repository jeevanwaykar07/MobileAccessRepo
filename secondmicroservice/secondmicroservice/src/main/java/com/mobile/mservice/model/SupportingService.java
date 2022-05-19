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
public class SupportingService {
  @SerializedName("id")
  private String id = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("operatingState")
  private OperatingStateEnum operatingState = null;

  @SerializedName("serviceDate")
  private String serviceDate = "Today";

  @SerializedName("serviceSpecification")
  private ServiceSpecification serviceSpecification = null;

  @SerializedName("serviceCharacteristic")
  private List<ServiceCharacteristic> serviceCharacteristic = null;

  @SerializedName("serviceRelationship")
  private List<ServiceRelationship> serviceRelationship = null;

  @SerializedName("relatedParty")
  private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();

  public SupportingService id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Created by Domain. Identifier of a Service Instance. Required to be unique. Used in URIs as the identifier of the service (for modify or delete use cases). This should be in UUID format.
   * @return id
  **/
  @Schema(required = true, description = "Created by Domain. Identifier of a Service Instance. Required to be unique. Used in URIs as the identifier of the service (for modify or delete use cases). This should be in UUID format.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SupportingService href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Created by Domain. Complete URI Reference to the Service (useful for delete or modify command)
   * @return href
  **/
  @Schema(required = true, description = "Created by Domain. Complete URI Reference to the Service (useful for delete or modify command)")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public SupportingService name(String name) {
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

  public SupportingService description(String description) {
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

  public SupportingService state(StateEnum state) {
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

  public SupportingService operatingState(OperatingStateEnum operatingState) {
    this.operatingState = operatingState;
    return this;
  }

   /**
   * Get operatingState
   * @return operatingState
  **/
  @Schema(required = true, description = "")
  public OperatingStateEnum getOperatingState() {
    return operatingState;
  }

  public void setOperatingState(OperatingStateEnum operatingState) {
    this.operatingState = operatingState;
  }

  public SupportingService serviceDate(String serviceDate) {
    this.serviceDate = serviceDate;
    return this;
  }

   /**
   * Date when the service was created (whatever its status). This parameter is not required during POST Call, but should be provided in response (by Domain) to service creation and retrieval call.
   * @return serviceDate
  **/
  @Schema(required = true, description = "Date when the service was created (whatever its status). This parameter is not required during POST Call, but should be provided in response (by Domain) to service creation and retrieval call.")
  public String getServiceDate() {
    return serviceDate;
  }

  public void setServiceDate(String serviceDate) {
    this.serviceDate = serviceDate;
  }

  public SupportingService serviceSpecification(ServiceSpecification serviceSpecification) {
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

  public SupportingService serviceCharacteristic(List<ServiceCharacteristic> serviceCharacteristic) {
    this.serviceCharacteristic = serviceCharacteristic;
    return this;
  }

  public SupportingService addServiceCharacteristicItem(ServiceCharacteristic serviceCharacteristicItem) {
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

  public SupportingService serviceRelationship(List<ServiceRelationship> serviceRelationship) {
    this.serviceRelationship = serviceRelationship;
    return this;
  }

  public SupportingService addServiceRelationshipItem(ServiceRelationship serviceRelationshipItem) {
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

  public SupportingService relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public SupportingService addRelatedPartyItem(RelatedParty relatedPartyItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportingService supportingService = (SupportingService) o;
    return Objects.equals(this.id, supportingService.id) &&
        Objects.equals(this.href, supportingService.href) &&
        Objects.equals(this.name, supportingService.name) &&
        Objects.equals(this.description, supportingService.description) &&
        Objects.equals(this.state, supportingService.state) &&
        Objects.equals(this.operatingState, supportingService.operatingState) &&
        Objects.equals(this.serviceDate, supportingService.serviceDate) &&
        Objects.equals(this.serviceSpecification, supportingService.serviceSpecification) &&
        Objects.equals(this.serviceCharacteristic, supportingService.serviceCharacteristic) &&
        Objects.equals(this.serviceRelationship, supportingService.serviceRelationship) &&
        Objects.equals(this.relatedParty, supportingService.relatedParty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, description, state, operatingState, serviceDate, serviceSpecification, serviceCharacteristic, serviceRelationship, relatedParty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportingService {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    operatingState: ").append(toIndentedString(operatingState)).append("\n");
    sb.append("    serviceDate: ").append(toIndentedString(serviceDate)).append("\n");
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
