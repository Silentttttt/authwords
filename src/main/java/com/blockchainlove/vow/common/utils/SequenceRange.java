/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.common.utils;

import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * @author zhangyu
 * @version $Id: SequenceRange.java, v 0.1 2018年05月06日 上午12:24 zhangyu Exp $
 */
public class SequenceRange {
    private final long       min;
    private final long       max;
    /** */
    private final AtomicLong value;
    /** 是否超限 */
    private volatile boolean over = false;

    /**
     * 构造.
     *
     * @param min
     * @param max
     */
    public SequenceRange(long min, long max) {
        this.min = min;
        this.max = max;
        this.value = new AtomicLong(min);
    }

    /**
     * <p>Gets and increment</p>
     *
     * @return
     */
    public long getAndIncrement() {
        long currentValue = value.getAndIncrement();
        if (currentValue > max) {
            over = true;
            return -1;
        }

        return currentValue;
    }
}