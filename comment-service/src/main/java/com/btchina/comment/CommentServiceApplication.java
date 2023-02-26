package com.btchina.comment;

import com.btchina.amqp.config.EnableMq;
import com.btchina.common.mybatis.config.EnableMybatisPlus;
import com.btchina.common.swagger.config.EnableSwagger;
import com.btchina.core.config.EnableLongToStringConfig;
import com.btchina.core.exception.EnableDefaultExceptionAdvice;
import com.btchina.feign.config.DefaultFeignConfiguration;
import com.btchina.redis.config.EnableRedisSerialize;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableMybatisPlus
@EnableSwagger
@EnableRedisSerialize
@SpringBootApplication
@EnableDefaultExceptionAdvice
@EnableLongToStringConfig
@EnableMq
@EnableFeignClients(basePackages = {"com.btchina.feign.clients"}, defaultConfiguration = DefaultFeignConfiguration.class)
public class CommentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommentServiceApplication.class, args);
    }

}
