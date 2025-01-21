package com.patrones.estructurales.proxy.finanzas;

import java.util.HashSet;
import java.util.Set;

public class User {
    private final String name;
    private final Set<String> permissions;

    public User(String name) {
        this.name = name;
        this.permissions = new HashSet<>();
    }

    public void grantPermission(String permission) {
        permissions.add(permission);
    }

    public boolean hasPermission(String permission) {
        return permissions.contains(permission);
    }

    public String getName() {
        return name;
    }
}
