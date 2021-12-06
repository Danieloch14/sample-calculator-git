package ec.epn.edu.git.calculator;

public class Calculator {

    private int answer;

    public int addition(int a, int b){
        return a + b;
    }

    public int substraction(int a, int b){
        return a - b;
    }
    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public double division(int a, int b) {
        return a / b;
    }
    public void timeout(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void getAnswer(int answer){
        this.answer = answer;
    }

    public void setAnswer(int answer){
        this.answer = answer;
    }
}
