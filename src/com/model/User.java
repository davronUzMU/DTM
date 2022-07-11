package com.model;

import java.util.UUID;

public class User {
    private UUID uuid;
    private String fullname;  //8600572920189201 Nabijoniv;;
    private String lastname;
    private String password;
    private boolean isAdmin;


    public User(UUID uuid, String fullname, String lastname, String password, boolean isAdmin) {
        this.uuid = uuid;
        this.fullname = fullname;
        this.lastname = lastname;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", fullname='" + fullname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
