package com.thefool.ratelimiter.rule.struct;

import lombok.Data;

@Data
public class UniformRuleConfig {
    String api;
    int limit;
    int unit = 1;
}