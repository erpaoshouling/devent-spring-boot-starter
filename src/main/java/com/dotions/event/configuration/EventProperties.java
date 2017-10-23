package com.dotions.event.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 * Event 相关配置项
 * </p>
 * 
 * @author wangyunfei 2017-10-16
 */
@ConfigurationProperties(prefix = "dotions.event")
public class EventProperties {

    private int threadPoolSize = 5;
    private String threadNamePrefix = "devent";

    public EventProperties() {
        super();
    }

    public EventProperties(int threadPoolSize, String threadNamePrefix) {
        super();
        this.threadPoolSize = threadPoolSize;
        this.threadNamePrefix = threadNamePrefix;
    }

    /**
     * @return the threadPoolSize
     */
    public int getThreadPoolSize() {
        return threadPoolSize;
    }

    /**
     * @param threadPoolSize
     *        the threadPoolSize to set
     */
    public void setThreadPoolSize(int threadPoolSize) {
        this.threadPoolSize = threadPoolSize;
    }

    /**
     * @return the threadNamePrefix
     */
    public String getThreadNamePrefix() {
        return threadNamePrefix;
    }

    /**
     * @param threadNamePrefix
     *        the threadNamePrefix to set
     */
    public void setThreadNamePrefix(String threadNamePrefix) {
        this.threadNamePrefix = threadNamePrefix;
    }

}
