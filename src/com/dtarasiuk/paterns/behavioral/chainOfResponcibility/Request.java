package com.dtarasiuk.paterns.behavioral.chainOfResponcibility;

class Request {
    private String type;

    public Request(String type){
        this.type=type;
    }

    public String getType(){
        return type;
    }
}
