package com.cangjie.designpatternexercise.bridge;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/25 16:36
 * email：cangjie2016@gmail.com
 */
public class DataFromOrcal implements DataFrom {
    @Override
    public void obtainData() {
        DebugLog.w("data from orcal");
    }
}
