package com.alibaba.arthas.tunnel.server.vo;

/**
 * Created by hocgin on 2021/9/16
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
public class AgentInfoVo {
    private String agentId;
    private String title;
    private String version;
    private String hostname;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
}
