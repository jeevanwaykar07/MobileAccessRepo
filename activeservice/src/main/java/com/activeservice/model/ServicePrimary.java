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

import com.activeservice.model.OperatingStateEnum;
import com.activeservice.model.ProcessStatus;
import com.activeservice.model.RelatedParty;
import com.activeservice.model.ServiceCharacteristic;
import com.activeservice.model.ServiceRelationship;
import com.activeservice.model.ServiceSpecification;
import com.activeservice.model.StateEnum;
import com.activeservice.model.SupportingService;
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
 * ServicePrimary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-12T04:30:03.026Z[GMT]")
public class ServicePrimary {
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

  @SerializedName("serviceDate")
  private String serviceDate = "Today";

  @SerializedName("operatingState")
  private OperatingStateEnum operatingState = null;

  @SerializedName("processStatus")
  private List<ProcessStatus> processStatus = null;

  @SerializedName("serviceSpecification")
  private ServiceSpecification serviceSpecification = null;

  @SerializedName("serviceCharacteristic")
  private List<ServiceCharacteristic> serviceCharacteristic = null;

  @SerializedName("serviceRelationship")
  private List<ServiceRelationship> serviceRelationship = null;

  @SerializedName("relatedParty")
  private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();

  @SerializedName("supportingService")
  private List<SupportingService> supportingService = null;

  public ServicePrimary id(String id) {
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

  public ServicePrimary href(String href) {
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

  public ServicePrimary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the service.
   * @return name
  **/
  @Schema(description = "Name of the service.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServicePrimary description(String description) {
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

  public ServicePrimary state(StateEnum state) {
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

  public ServicePrimary serviceDate(String serviceDate) {
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

  public ServicePrimary operatingState(OperatingStateEnum operatingState) {
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

  public ServicePrimary processStatus(List<ProcessStatus> processStatus) {
    this.processStatus = processStatus;
    return this;
  }

  public ServicePrimary addProcessStatusItem(ProcessStatus processStatusItem) {
    if (this.processStatus == null) {
      this.processStatus = new ArrayList<ProcessStatus>();
    }
    this.processStatus.add(processStatusItem);
    return this;
  }

   /**
   * Telstra Extension to TMF. Process Status provides additional details on services being transitioned to a new state.  It also provides information on failed transactions. processStatus will be an array.
   * @return processStatus
  **/
  @Schema(description = "Telstra Extension to TMF. Process Status provides additional details on services being transitioned to a new state.  It also provides information on failed transactions. processStatus will be an array.")
  public List<ProcessStatus> getProcessStatus() {
    return processStatus;
  }

  public void setProcessStatus(List<ProcessStatus> processStatus) {
    this.processStatus = processStatus;
  }

  public ServicePrimary serviceSpecification(ServiceSpecification serviceSpecification) {
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

  public ServicePrimary serviceCharacteristic(List<ServiceCharacteristic> serviceCharacteristic) {
    this.serviceCharacteristic = serviceCharacteristic;
    return this;
  }

  public ServicePrimary addServiceCharacteristicItem(ServiceCharacteristic serviceCharacteristicItem) {
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

  public ServicePrimary serviceRelationship(List<ServiceRelationship> serviceRelationship) {
    this.serviceRelationship = serviceRelationship;
    return this;
  }

  public ServicePrimary addServiceRelationshipItem(ServiceRelationship serviceRelationshipItem) {
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

  public ServicePrimary relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ServicePrimary addRelatedPartyItem(RelatedParty relatedPartyItem) {
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

  public ServicePrimary supportingService(List<SupportingService> supportingService) {
    this.supportingService = supportingService;
    return this;
  }

  public ServicePrimary addSupportingServiceItem(SupportingService supportingServiceItem) {
    if (this.supportingService == null) {
      this.supportingService = new ArrayList<SupportingService>();
    }
    this.supportingService.add(supportingServiceItem);
    return this;
  }

   /**
   * SupportingService is a collection of child Service Instances.
   * @return supportingService
  **/
  @Schema(description = "SupportingService is a collection of child Service Instances.")
  public List<SupportingService> getSupportingService() {
    return supportingService;
  }

  public void setSupportingService(List<SupportingService> supportingService) {
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
    ServicePrimary servicePrimary = (ServicePrimary) o;
    return Objects.equals(this.id, servicePrimary.id) &&
        Objects.equals(this.href, servicePrimary.href) &&
        Objects.equals(this.name, servicePrimary.name) &&
        Objects.equals(this.description, servicePrimary.description) &&
        Objects.equals(this.state, servicePrimary.state) &&
        Objects.equals(this.serviceDate, servicePrimary.serviceDate) &&
        Objects.equals(this.operatingState, servicePrimary.operatingState) &&
        Objects.equals(this.processStatus, servicePrimary.processStatus) &&
        Objects.equals(this.serviceSpecification, servicePrimary.serviceSpecification) &&
        Objects.equals(this.serviceCharacteristic, servicePrimary.serviceCharacteristic) &&
        Objects.equals(this.serviceRelationship, servicePrimary.serviceRelationship) &&
        Objects.equals(this.relatedParty, servicePrimary.relatedParty) &&
        Objects.equals(this.supportingService, servicePrimary.supportingService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, description, state, serviceDate, operatingState, processStatus, serviceSpecification, serviceCharacteristic, serviceRelationship, relatedParty, supportingService);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePrimary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    serviceDate: ").append(toIndentedString(serviceDate)).append("\n");
    sb.append("    operatingState: ").append(toIndentedString(operatingState)).append("\n");
    sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
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
