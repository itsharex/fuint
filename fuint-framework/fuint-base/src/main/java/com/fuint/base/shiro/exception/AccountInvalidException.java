package com.fuint.base.shiro.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * 账户无效异常
 * <p/>
 * Created by hanxiaoqiang on 16/7/12.
 */
public class AccountInvalidException extends AuthenticationException {

    public AccountInvalidException() {
        super();
    }

    public AccountInvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountInvalidException(String message) {
        super(message);
    }

    public AccountInvalidException(Throwable cause) {
        super(cause);
    }
}
