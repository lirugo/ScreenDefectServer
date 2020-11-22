package com.smartalliance.sd.service;

import com.smartalliance.sd.analyzing.image.Image;
import com.smartalliance.sd.analyzing.image.YuvPlane;
import com.smartalliance.sd.entity.AnalyzingRequest;
import com.smartalliance.sd.entity.FrameInfo;

import java.net.http.HttpRequest;

public interface ParseAnalyzingRequest {
    /*
        Get from request AnalyzingRequest
        Get from request Client
        Get from request Device
        Get from request FrameInfo
        Get from request Partner
    */
    AnalyzingRequest parse(HttpRequest httpRequest);

    /*
        Save YUV file from request
    */
    Image parseYuv(FrameInfo frameInfo, YuvPlane yuvPlane);
}
