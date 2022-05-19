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
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Telstra Extension to TMF. The operating state provides information on how a service is currently performing (e.g. working, failed) and if the service is being modified from one state to another.
 */
@JsonAdapter(OperatingStateEnum.Adapter.class)
public enum OperatingStateEnum {
  UNKNOWN("Unknown");

  private String value;

  OperatingStateEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OperatingStateEnum fromValue(String input) {
    for (OperatingStateEnum b : OperatingStateEnum.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OperatingStateEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final OperatingStateEnum enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public OperatingStateEnum read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return OperatingStateEnum.fromValue((String)(value));
    }
  }
}
