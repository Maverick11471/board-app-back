package com.bit.boardappbackend.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application.properties")
@Getter
public class NaverConfiguration {
    @Value("ncp_iam_BPASKR54D7BN02zlI6q5")
    private String accessKey;
    @Value("ncp_iam_BPKSKRRj6sx0v9My5qbEu9eWn4DhN2N0ug")
    private String secretKey;
    @Value("${ncp.regionName}")
    private String regionName;
    @Value("${ncp.endPoint}")
    private String endPoint;
}
