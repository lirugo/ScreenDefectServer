package com.smartalliance.sd.color;

import lombok.Data;

@Data
public class HsvSchema extends ColorSchema {
    private int h;
    private int s;
    private int v;
}
