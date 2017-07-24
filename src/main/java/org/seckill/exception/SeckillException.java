package org.seckill.exception;

/**
 * 秒杀相关异常
 * Created by xjy on 2017/4/22.
 */
public class SeckillException extends RuntimeException{
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
