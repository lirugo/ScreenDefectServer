package com.smartalliance.sd.service;

import com.smartalliance.sd.analyzing.image.Image;
import com.smartalliance.sd.analyzing.image.YuvPlane;
import com.smartalliance.sd.entity.AnalyzingRequest;
import com.smartalliance.sd.entity.FrameInfo;

import java.net.http.HttpRequest;

public class ParseAnalyzingRequestImpl implements ParseAnalyzingRequest {
    @Override
    public AnalyzingRequest parse(HttpRequest httpRequest) {
        throw new UnsupportedOperationException("Not implemented yet ..."); // TODO
    }

    @Override
    public Image parseYuv(FrameInfo frameInfo, YuvPlane yuvPlane) {
        throw new UnsupportedOperationException("Not implemented yet ..."); // TODO
    }
}
