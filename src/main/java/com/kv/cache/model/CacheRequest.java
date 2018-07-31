package com.kv.cache.model;

import lombok.Data;

@Data
public class CacheRequest {
	String key;
	Object response;
}
