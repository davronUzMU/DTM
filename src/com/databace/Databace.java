package com.databace;

import com.model.Question;
import com.model.Subject;
import com.model.User;

import java.util.*;

public class Databace {
    public static Set<Subject> subjects=new HashSet<>();
    public  static Set<Question> questions=new HashSet<>();
    public static List<User>users=new ArrayList<>();
    static {
        User user1=new User(UUID.randomUUID(),"Davron","Buriboyev","AC1990000",true);
        User user2=new User(UUID.randomUUID(),"Sardor","Buriboyev","AC1990002",false);
        users.add(user1);
        users.add(user2);

        Subject subject0=new Subject(UUID.randomUUID(),"Matematika ");
        Subject subject1=new Subject(UUID.randomUUID(),"Geografiya ");
        Subject subject2=new Subject(UUID.randomUUID(),"Fizika ");
        subjects.add(subject0);
        subjects.add(subject1);
        subjects.add(subject2);

        Question question0=new Question(UUID.randomUUID(),"Matematika","2*2=",4);
        Question question1=new Question(UUID.randomUUID(),"Matematika","2*3=",1);
        Question question2=new Question(UUID.randomUUID(),"Matematika","8+12=",3);
        questions.add(question0);
        questions.add(question1);
        questions.add(question2);
    }
}
