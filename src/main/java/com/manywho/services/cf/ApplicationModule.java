package com.manywho.services.cf;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.manywho.services.cf.guice.*;
import redis.clients.jedis.JedisPool;

public class ApplicationModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(JedisPool.class).toProvider(JedisPoolProvider.class).in(Singleton.class);
    }
}
