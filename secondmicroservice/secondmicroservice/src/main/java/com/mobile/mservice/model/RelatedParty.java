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
 * Party linked at the service level (it may be a User for example).
 */
@Schema(description = "Party linked at the service level (it may be a User for example).")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-12T04:30:03.026Z[GMT]")
public class RelatedParty {
  @SerializedName("id")
  private String id = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("name")
  private String name = null;

  public RelatedParty id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Placeholder for Group ID. Consumer needs to populate this detail during POST. Can be modified as part of PATCH and should be part of instance data so that the same can be included in GET response and should be included in header of Listener API by Domain. ID is conditional mandatory under the role type &#x3D; InstanceConsumerGroup
   * @return id
  **/
  @Schema(required = true, description = "Placeholder for Group ID. Consumer needs to populate this detail during POST. Can be modified as part of PATCH and should be part of instance data so that the same can be included in GET response and should be included in header of Listener API by Domain. ID is conditional mandatory under the role type = InstanceConsumerGroup")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedParty role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Role of the related party eg. \&quot;InstanceConsumerGroup\&quot; or \&quot;PairingId\&quot;
   * @return role
  **/
  @Schema(required = true, description = "Role of the related party eg. \"InstanceConsumerGroup\" or \"PairingId\"")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedParty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the related party.
   * @return name
  **/
  @Schema(description = "Name of the related party.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedParty relatedParty = (RelatedParty) o;
    return Objects.equals(this.id, relatedParty.id) &&
        Objects.equals(this.role, relatedParty.role) &&
        Objects.equals(this.name, relatedParty.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, role, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedParty {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
