package project.models;


import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionAndAnswer {

    private Integer answerNum;
    private Integer questionId;
    private String answer;
    private String question;
    private String theme;


    public QuestionAndAnswer(Integer answerNum, Integer questionId, String answer,
                             String question, String theme) {
        this.answerNum = answerNum;
        this.questionId = questionId;
        this.answer = answer;
        this.question = question;
        this.theme = theme;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getAnswerNum() {
        return answerNum;
    }

    public void setAnswerNum(Integer answerNum) {
        this.answerNum = answerNum;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public static QuestionAndAnswer getQuestionAndAnswerMapper(ResultSet rs, int amount)
            throws SQLException {
        return new QuestionAndAnswer(rs.getInt("answer_num"),
                rs.getInt("question_id"),
                rs.getString("answer"),
                rs.getString("question"),
                rs.getString("theme"));
    }
}
