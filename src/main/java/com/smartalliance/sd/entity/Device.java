package com.smartalliance.sd.entity;

import com.smartalliance.sd.enums.OperatingSystem;
import lombok.Data;

@Data
public class Device {
    private long id;
    private OperatingSystem operatingSystem;
    private String board;
    private String bootloader;
    private String brand;
    private String device;
    private String display;
    private String fingerprint;
    private String hardware;
    private String idDevice;
    private String host;
    private String manufacturer;
    private String model;
    private String product;
    private String serial;
}
