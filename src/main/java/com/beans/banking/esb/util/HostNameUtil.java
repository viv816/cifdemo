package com.beans.banking.esb.util;

import java.net.InetAddress;

public class HostNameUtil {
	public static String getLocalHost() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            return "unknown";
        }
    }
}
