package com.smartalliance.sd.service;

import com.smartalliance.sd.analyzing.image.Image;
import com.smartalliance.sd.analyzing.image.ImageDom;
import com.smartalliance.sd.analyzing.image.ImageMask;

public class AnalyzingImageImpl implements AnalyzingImage {
    @Override
    public ImageMask getMaskLvl1(Image image) {
        throw new UnsupportedOperationException("Not implemented yet ..."); // TODO
    }

    @Override
    public ImageMask getMaskLvl2(ImageMask imageMaskLv1) {
        throw new UnsupportedOperationException("Not implemented yet ..."); // TODO
    }

    @Override
    public ImageDom getImageDomFromImageMask(ImageMask imageMaskLv2) {
        throw new UnsupportedOperationException("Not implemented yet ..."); // TODO
    }

    @Override
    public ImageDom analyzing(ImageDom imageDom) {
        throw new UnsupportedOperationException("Not implemented yet ..."); // TODO
    }
}
