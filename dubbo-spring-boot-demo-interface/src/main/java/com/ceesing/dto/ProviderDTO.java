package com.ceesing.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * RPC接口DTO
 * 注意这里要实现序列化接口
 * @author zhang
 */
@Data
@Builder
public class ProviderDTO implements Serializable {
    /**
     * ID
     */
    private Integer id;
    /**
     * 名字
     */
    private String name;
    /**
     * 序号
     */
    private Integer number;
}
