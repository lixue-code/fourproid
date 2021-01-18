package com.lixue.autoconfigdemo.service;

import com.lixue.autoconfigdemo.bean.IpPortProp;

public class IpPortService {
    private IpPortProp ipPortProp;

    public IpPortService(IpPortProp ipPortProp) {
        this.ipPortProp = ipPortProp;
    }

    public String getIpPortProp(){
        return ipPortProp.getIp()+":"+ipPortProp.getPort();
    }
}
