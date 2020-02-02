package com.stantaylor.saneScanServer.model;

import com.asprise.util.jsane.JSaneDevice;
import org.springframework.beans.factory.annotation.Value;

public class Sane {

    private String host;
    private int port;

    public Sane() {
    }

    public Sane(@Value("${sane.host}") String host, @Value("${sane.host}") int port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

}
