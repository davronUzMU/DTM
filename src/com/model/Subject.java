package com.model;

import java.util.UUID;

public class Subject {
    private UUID uuid;
    private String subject;

    public Subject(UUID uuid, String subject) {
        this.uuid = uuid;
        this.subject = subject;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "uuid=" + uuid +
                ", subject='" + subject + '\'' +
                '}';
    }
}
