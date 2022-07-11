package com.model;

import java.util.UUID;

public class Question {
    private UUID uuid;
    private String subjeck;
    private String question;
    private Object answer;

    public Question(UUID uuid, String subjeck, String question, Object answer) {
        this.uuid = uuid;
        this.subjeck = subjeck;
        this.question = question;
        this.answer = answer;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getSubjeck() {
        return subjeck;
    }

    public void setSubjeck(String subjeck) {
        this.subjeck = subjeck;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Object getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "uuid=" + uuid +
                ", subjeck='" + subjeck + '\'' +
                ", question='" + question + '\'' +
                ", answer=" + answer +
                '}';
    }
}
