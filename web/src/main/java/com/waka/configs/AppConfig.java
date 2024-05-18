package com.waka.configs;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

public class AppConfig extends ResourceConfig {

    public AppConfig(){
        packages(("com.waka.controllers"));
        register(JspMvcFeature.class);
        property(JspMvcFeature.TEMPLATE_BASE_PATH, "/WEB-INF/views");
    }
}
