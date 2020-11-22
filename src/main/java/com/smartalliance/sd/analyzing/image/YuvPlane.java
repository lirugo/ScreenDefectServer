package com.smartalliance.sd.analyzing.image;

import lombok.Data;

@Data
public class YuvPlane {
    private byte[] planeY;
    private byte[] planeU;
    private byte[] planeV;
}
