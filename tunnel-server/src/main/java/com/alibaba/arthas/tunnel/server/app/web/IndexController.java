package com.alibaba.arthas.tunnel.server.app.web;

import com.alibaba.arthas.tunnel.server.AgentInfo;
import com.alibaba.arthas.tunnel.server.TunnelServer;
import com.alibaba.arthas.tunnel.server.vo.AgentInfoVo;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by hocgin on 2021/9/16
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@RestController
public class IndexController {
    @Autowired
    TunnelServer tunnelServer;

    @GetMapping("/agent/list")
    public List<AgentInfoVo> list() {
        Map<String, AgentInfo> agentInfoMap = tunnelServer.getAgentInfoMap();
        return agentInfoMap.entrySet().stream().map(entry -> {
            String key = entry.getKey();
            AgentInfo value = entry.getValue();
            AgentInfoVo item = new AgentInfoVo();
            item.setAgentId(key);
            item.setTitle(key);
            item.setHostname(value.getHost() + ":" + value.getPort());
            item.setVersion(value.getArthasVersion());
            return item;
        }).collect(Collectors.toList());
    }
}
