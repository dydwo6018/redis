package com.example.redis;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("order")
public class ItemOrder {
    @Id
    private String id;
    private String item;
    private Integer count;
    private Long totalPrice;
    private String status;

}
