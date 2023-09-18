package com.example.demo.RedisLockDemo;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * Description:
 *
 * @date:2023/9/18 11:40
 * @author: ilpvc
 */
@Configuration
public class MyRedissonConfig {

    @Bean
    public RedissonClient redisson() throws IOException {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://192.168.10.117:6379");
        config.useSingleServer().setPassword("123456");
        return Redisson.create(config);
    }
}
