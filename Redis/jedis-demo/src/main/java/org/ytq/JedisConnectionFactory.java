package org.ytq;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisConnectionFactory {
    private static final JedisPool jedispool;
    static{
        // 配置连接池
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        // 建立连接池对象
        jedispool = new JedisPool(poolConfig, "127.0.0.1", 6379, 1000, null);
        poolConfig.setMaxTotal(8);
        poolConfig.setMaxIdle(8);
        poolConfig.setMinIdle(0);
        poolConfig.setMaxWaitMillis(1000);
    }

    public static Jedis getJedis(){
        return jedispool.getResource();
    }
}
