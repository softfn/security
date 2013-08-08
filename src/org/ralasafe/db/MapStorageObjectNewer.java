package org.ralasafe.db;

import org.ralasafe.ObjectNewer;

public class MapStorageObjectNewer implements ObjectNewer {
    public Object newObject() {
        return new MapStorgeObject();
    }
}
