package com.serves;

import com.databace.Databace;
import com.model.Subject;

import java.util.UUID;

public class SubjectServes {
    public static String add(String subject) {

        if( subject==null || subject.isBlank()){
            return " Fan bo'lishi shart";
        }
        if(!subject.startsWith(subject.substring(0,1).toUpperCase())){
            return " error";
        }
        for (Subject subject1 : Databace.subjects) {
            if(subject1.getSubject().equals(subject)){
                return " bunday fan bor";
            }
        }
     Databace.subjects.add(new Subject(UUID.randomUUID(),subject));
        return " Yangi fan qo'shildi";
    }
}
