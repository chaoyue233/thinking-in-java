package com.chaoyue.test.local;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        getIP("www.taobao.com");
        System.out.println("----------------------------");
        getHost("114.80.174.46");
    }

    private static void getIP(String hostName) throws UnknownHostException {
        InetAddress[] inetAddressList = InetAddress.getAllByName(hostName);
        for (InetAddress inetAddress : inetAddressList) {
            System.out.println(inetAddress);
        }
    }

    private static void getHost(String ip) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName(ip);
        System.out.println(inetAddress.getHostName());
    }
}
