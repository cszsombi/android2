package com.example.cszsombi.android_2016_09_22;

import com.data.DSymbol;
import com.data.DValue;

import java.util.ArrayList;

/**
 * Created by cszsombi on 2016.10.09..
 */

public class FootballDataProvider {

    private ArrayList<DSymbol> mSymbols;

    public FootballDataProvider(){
        mSymbols=new ArrayList<DSymbol>();

        //Minta adatok
        {
            ArrayList<DValue> dValues=new ArrayList<DValue>();
            DSymbol dSymbol= new DSymbol("MINTA", dValues);
            for (int i=0; i<10; i++) {
                DValue dValue = new DValue(System.currentTimeMillis() % 10, 10d + i * 1000 % 10, dSymbol);
                dValues.add(dValue);
            }
            mSymbols.add(dSymbol);
        }

        {
            ArrayList<DValue> dValues=new ArrayList<DValue>();
            DSymbol dSymbol= new DSymbol("MINTA1", dValues);
            for (int i=0; i<10; i++) {
                DValue dValue = new DValue(System.currentTimeMillis() % 10, 10d + i * 1000 % 10, dSymbol);
                dValues.add(dValue);
            }
            mSymbols.add(dSymbol);
        }

        {
            ArrayList<DValue> dValues=new ArrayList<DValue>();
            DSymbol dSymbol= new DSymbol("MINTA2", dValues);
            for (int i=0; i<10; i++) {
                DValue dValue = new DValue(System.currentTimeMillis() % 10, 10d + i * 1000 % 10, dSymbol);
                dValues.add(dValue);
            }
            mSymbols.add(dSymbol);
        }




    }
    public ArrayList<DSymbol> getSymbols(){
        return mSymbols;
    }
    public void addSymbolByCode(String code){
        DSymbol dSymbol=new DSymbol();
        dSymbol.setCode(code);
        mSymbols.add(dSymbol);
        refreshSymbol(dSymbol);

    }
    public void refreshAllSymbols(){
        for (int i=0; i<mSymbols.size();i++)
        {
            refreshSymbol(mSymbols.get(i));
        }

    }
    public void refreshSymbol(DSymbol symbol){

    }
}
