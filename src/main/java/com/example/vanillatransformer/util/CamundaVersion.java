package com.example.vanillatransformer.util;

import com.example.vanillatransformer.exception.VersionNotSupportedException;

public enum CamundaVersion {
    CAMUNDA_8("8"),
    CAMUNDA_7("7"),

    CAMUNDA_8_5("8.5.0"),
    CAMUNDA_7_21("7.21.0");

    private String version;

    CamundaVersion(String version){
        this.version = version;
    }

    public static CamundaVersion fromString(String text) {
        for (CamundaVersion b : CamundaVersion.values()) {
            if (b.version.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }

    public CamundaVersion getMajorVersion() {
        if(this == CamundaVersion.CAMUNDA_7_21){
            return CamundaVersion.CAMUNDA_7;
        }
        if(this == CamundaVersion.CAMUNDA_8_5){
            return CamundaVersion.CAMUNDA_8;
        }

        throw new VersionNotSupportedException("No Mayor Version found for " + version);
    }
}
