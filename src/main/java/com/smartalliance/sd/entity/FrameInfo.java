package com.smartalliance.sd.entity;

import lombok.Data;

@Data
public class FrameInfo {
    private long id;
    private short width;
    private short height;
    private short yPlaneRowStride;
    private short uPlaneRowStride;
    private short vPlaneRowStride;
    private short yPlanePixelStride;
    private short uPlanePixelStride;
    private short vPlanePixelStride;
    private short planeYLen;
    private short planeULen;
    private short planeVLen;
}
