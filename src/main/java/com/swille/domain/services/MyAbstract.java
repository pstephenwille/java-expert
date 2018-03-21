package com.swille.domain.services;

public abstract class MyAbstract {

    private final XService xService;
    private final IService iService;
    private final String MY_FINAL_STRING = "woot";

    public MyAbstract(final XService xservice, final IService iservice) {
        this.xService = xservice;
        this.iService = iservice;
    }

    public String getXData(){
        return xService.getData();
    }
    public String getIData(){
        return iService.getData();
    }
}
