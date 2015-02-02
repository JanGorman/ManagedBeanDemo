package com.schnaub.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;
import org.hibernate.validator.constraints.NotEmpty;

public class Error {

    @NotEmpty
    @JsonProperty
    private final String devicePlatform;

    @NotEmpty
    @JsonProperty
    private final String deviceType;

    @NotEmpty
    @JsonProperty
    private final String errorClass;

    @NotEmpty
    @JsonProperty
    private final String errorMethod;

    @NotEmpty
    @JsonProperty
    private final String message;

    @NotEmpty
    @JsonProperty
    private final long timestamp;

    public Error(@JsonProperty("devicePlatform") final String devicePlatform,
                 @JsonProperty("deviceType") final String deviceType,
                 @JsonProperty("errorClass") final String errorClass,
                 @JsonProperty("errorMethod") final String errorMethod,
                 @JsonProperty("message") final String message,
                 @JsonProperty("timestamp") final long timestamp) {
        this.devicePlatform = devicePlatform;
        this.deviceType = deviceType;
        this.errorClass = errorClass;
        this.errorMethod = errorMethod;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getDevicePlatform() {
        return devicePlatform;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getErrorClass() {
        return errorClass;
    }

    public String getErrorMethod() {
        return errorMethod;
    }

    public String getMessage() {
        return message;
    }


    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(devicePlatform, deviceType, errorClass, errorMethod, message);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Error other = (Error) obj;
        return Objects.equal(this.devicePlatform, other.devicePlatform)
                && Objects.equal(this.deviceType, other.deviceType)
                && Objects.equal(this.errorClass, other.errorClass)
                && Objects.equal(this.errorMethod, other.errorMethod)
                && Objects.equal(this.message, other.message);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("devicePlatform", devicePlatform)
                .add("deviceType", deviceType)
                .add("errorClass", errorClass)
                .add("errorMethod", errorMethod)
                .add("message", message)
                .add("timestamp", timestamp)
                .toString();
    }

}
