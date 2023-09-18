package com.example.demo.RedisLockDemo;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @date:2023/9/18 11:16
 * @author: ilpvc
 */
@RestController
public class IndexController {

    @Autowired
    private RedissonClient redisson;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/stock")
    public String deductStock() throws InterruptedException {
        String lockKey = "product_101";
        RLock redissonLock = redisson.getLock(lockKey);
        try {
            //执行锁
            redissonLock.lock();  //setIfAbsent(lockKey, clientId, 30, TimeUnit.SECONDS);
            int stock = Integer.parseInt(stringRedisTemplate.opsForValue().get("stock")); // jedis.get("stock")
            if (stock > 0) {
                int realStock = stock - 1;
                stringRedisTemplate.opsForValue().set("stock", realStock + ""); // jedis.set(key,value)
                System.out.println("扣减成功，剩余库存:" + realStock);
            } else {
                System.out.println("扣减失败，库存不足");
            }
            Thread.sleep(100);
        } finally {
            //释放锁
            redissonLock.unlock();

        }

        return "end";
    }

}
