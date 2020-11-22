package com.smartalliance.sd.color;

import lombok.Data;

@Data
public class YuvSchema extends ColorSchema {
    private int y;
    private int u;
    private int v;
}
