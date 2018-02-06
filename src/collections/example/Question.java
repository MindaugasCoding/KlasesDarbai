package collections.example;

import java.util.List;

public class Question {

    private String questionTex;
    private List<String> variants;
    private int answer;

    public Question(String questionTex, List<String> variants, int answer) {
        this.questionTex = questionTex;
        this.variants = variants;
        this.answer = answer;

    }

    public String getQuestionTex() {
        return questionTex;
    }

    public List<String> getVariants() {
        return variants;
    }

    public int getAnswer() {
        return answer;
    }
}
