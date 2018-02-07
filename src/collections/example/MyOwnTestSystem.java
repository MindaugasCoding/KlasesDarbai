package collections.example;

import org.omg.CORBA.INTERNAL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiFunction;

public class MyOwnTestSystem {

    public static void main(String[] args) {
        MyOwnTestSystem myOwnTestSystem = new MyOwnTestSystem();
        Map<Integer, Question> questionMap = myOwnTestSystem.readQuestions();
        List<Integer>questions = new ArrayList<>();
/*
        for (Integer key : questionMap.keySet()) {
            Question q = questionMap.get(key);
            System.out.println(q.getQuestionTex());
            for (String v : q.getVariants()) {
                System.out.println(v);
            }
        }*/

        Scanner sc = new Scanner(System.in);
        int correectAnswerCount = 0;
        for (int i = 0; i < 10; i++) {
            int numb;
            while (true){
                Random random = new Random();
                numb = random.nextInt(questionMap.size()) +1;
                if(!questions.contains(numb)){
                    break;
                }
            }
            questions.add(numb);
            /*Random random = new Random();//naudojama generuoti rando skaicius
            int numb = random.nextInt(questionMap.size()) + 1; //grazina skaiciu random nuo 1 iki map ilgio
            if(questions.contains(numb)){

            }*/
            Question question = questionMap.get(numb);
            System.out.println(question.getQuestionTex());
            for (String variant : question.getVariants()) {
                System.out.println(variant);
            }
            System.out.println("Įveskite savo atsakymą >>");
            int userAnswer = sc.nextInt();
            if (userAnswer == question.getAnswer()) {
                correectAnswerCount++;
            }
        }
        System.out.println("Jūsų testo balas yra >>>>>" + correectAnswerCount + "<<<<<<");
    }

    private Map<Integer, Question> readQuestions() {
        Map<Integer, Question> questionMap = new HashMap<>();

        try {
            BufferedReader bf = new BufferedReader((new FileReader(new File("Quesions.txt"))));
            String line;
            int key = 1;
            while ((line = bf.readLine()) != null) { //isskaidom po eilute is failo
                String[] items = line.split(";"); //isskaidom per ;
                String[] examples = items[1].split(" "); //iskaidome variantus per tarpa
                List<String> myItems = Arrays.asList(examples); //sudedame visus vatiantus i lista utils pagalba
                int answer = Integer.valueOf(items[2].trim());  //konvertuoja ats is String into INteger remove all empty space
                Question question = new Question(items[0], myItems, answer); //sudedam items i objekta
                questionMap.put(key++, question);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return questionMap;
    }
}
