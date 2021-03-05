package com.mytest.model;

import java.net.InetAddress;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/10
 */
public class ThirdComponent {
    private boolean enabled;

    private InetAddress remoteAddress;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public InetAddress getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(InetAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }
}
