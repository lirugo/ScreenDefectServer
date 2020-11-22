package com.smartalliance.sd.service;

import com.smartalliance.sd.analyzing.image.Image;
import com.smartalliance.sd.analyzing.image.ImageDom;
import com.smartalliance.sd.analyzing.image.ImageMask;

public interface AnalyzingImage {
    /*
        Mask lvl 1
        Make black&white image according to HSV
        Check that the screen is in the white area
    */
    ImageMask getMaskLvl1(Image image);

    /*
        Mask lvl 2
        Select only center rectangle from mask 1
     */
    ImageMask getMaskLvl2(ImageMask imageMaskLv1);

    /*
        Mask lvl 3
        Divide white area on ImageDom elements which only inside of screen
    */
    ImageDom getImageDomFromImageMask(ImageMask imageMaskLv2);

    /*
        Analyzing ImageDom
        Find cracks inside ImageDom elements
        Make predictions
    */
    ImageDom analyzing(ImageDom imageDom);
}
