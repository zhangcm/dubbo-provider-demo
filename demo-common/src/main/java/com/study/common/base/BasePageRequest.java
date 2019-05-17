package com.study.common.base;

import java.io.Serializable;

/**
 * 分页请求对象基类
 */
public class BasePageRequest implements Serializable {

    private int pageNo;

    private int pageSize;

}
