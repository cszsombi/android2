package com.data;

/**
 * Created by cszsombi on 2016.10.09..
 */

public class DValue {
    private Long mTimeStamp;
    private Double mValue;
    private DSymbol mSymbol;
    public DValue() {
    }

    public DValue(Long mTimeStamp, Double mValue, DSymbol mSymbol) {
        this.mTimeStamp = mTimeStamp;
        this.mValue = mValue;
        this.mSymbol = mSymbol;
    }

    public Long getTimeStamp() {
        return mTimeStamp;
    }

    public void setTimeStamp(Long mTimeStamp) {
        this.mTimeStamp = mTimeStamp;
    }

    public Double getmValue() {
        return mValue;
    }

    public void setValue(Double mValue) {
        this.mValue = mValue;
    }

    public DSymbol getSymbol() {
        return mSymbol;
    }

    public void setSymbol(DSymbol mSymbol) {
        this.mSymbol = mSymbol;
    }
}
