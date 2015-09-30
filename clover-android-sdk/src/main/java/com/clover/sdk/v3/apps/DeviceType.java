/**
 * Copyright (C) 2015 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */

package com.clover.sdk.v3.apps;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class DeviceType implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }
  public java.lang.String getModels() {
    return genClient.cacheGet(CacheKey.models);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<DeviceType> {
    name {
      @Override
      public Object extractValue(DeviceType instance) {
        return instance.genClient.extractOther("name", java.lang.String.class);
      }
    },
    models {
      @Override
      public Object extractValue(DeviceType instance) {
        return instance.genClient.extractOther("models", java.lang.String.class);
      }
    },
    ;
  }

  private GenericClient<DeviceType> genClient = new GenericClient<DeviceType>(this);

  /**
   * Constructs a new empty instance.
   */
  public DeviceType() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public DeviceType(String json) throws IllegalArgumentException {
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public DeviceType(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public DeviceType(DeviceType src) {
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }


  @Override
  public void validate() {
    genClient.validateLength(getName(), 255);

    genClient.validateLength(getModels(), 255);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'models' field is set and is not null */
  public boolean isNotNullModels() {
    return genClient.cacheValueIsNotNull(CacheKey.models);
  }


  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'models' field has been set, however the value could be null */
  public boolean hasModels() {
    return genClient.cacheHasKey(CacheKey.models);
  }


  /**
   * Sets the field 'name'.
   */
  public DeviceType setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'models'.
   */
  public DeviceType setModels(java.lang.String models) {
    return genClient.setOther(models, CacheKey.models);
  }


  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'models' field, the 'has' method for this field will now return false */
  public void clearModels() {
    genClient.clear(CacheKey.models);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public DeviceType copyChanges() {
    DeviceType copy = new DeviceType();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(DeviceType src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new DeviceType(src).getJSONObject(), src.genClient);
    }
  }

  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    return genClient.getBundle();
  }

  @Override
  public String toString() {
    return genClient.toString();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    genClient.writeToParcel(dest, flags);
  }

  public static final android.os.Parcelable.Creator<DeviceType> CREATOR = new android.os.Parcelable.Creator<DeviceType>() {
    @Override
    public DeviceType createFromParcel(android.os.Parcel in) {
      DeviceType instance = new DeviceType(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public DeviceType[] newArray(int size) {
      return new DeviceType[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<DeviceType> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<DeviceType>() {
    @Override
    public DeviceType create(org.json.JSONObject jsonObject) {
      return new DeviceType(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean NAME_IS_REQUIRED = false;
    public static final long NAME_MAX_LEN = 255;

    public static final boolean MODELS_IS_REQUIRED = false;
    public static final long MODELS_MAX_LEN = 255;

  }

}
