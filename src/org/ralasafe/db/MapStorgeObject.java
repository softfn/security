package org.ralasafe.db;

import java.util.HashMap;
import java.util.Map;

public class MapStorgeObject {
	private Map storage = new HashMap();

	public MapStorgeObject(Map map) {
		this.storage = map;
	}

	public MapStorgeObject() {
	}

	public Map getStorage() {
		return storage;
	}

	public void put(String key, Object value) {
		storage.put(key, value);
	}

	public Object get(String key) {
		return storage.get(key);
	}

	public boolean containsKey(String key) {
		return storage.containsKey(key);
	}
}
