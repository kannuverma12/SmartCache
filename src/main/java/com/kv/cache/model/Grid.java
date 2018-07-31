package com.kv.cache.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@RedisHash(value="grid", timeToLive=30)
public class Grid {
	@Id
	private String gridId;
	private Object response;
}
