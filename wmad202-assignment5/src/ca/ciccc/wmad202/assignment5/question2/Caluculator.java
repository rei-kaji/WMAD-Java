package ca.ciccc.wmad202.assignment5.question2;

public class Caluculator {
    private int number1;
    private int number2;
    public String operator;

    public Caluculator() {
        this.number1 = 0;
        this.number2 = 0;
        this.operator = "";
    }

    public Caluculator(int number1, int number2, String operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator.toLowerCase();
    }

    public void setCaluculator(int number1, int number2, String operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator.toLowerCase();
    }

    public void getResultCaluculator() {
        int result = 0;
        switch (this.operator) {
            case "+":
                result = this.number1 + this.number2;
                break;
            case "-":
                result = this.number1 - this.number2;
                break;
            case "*":
                result = this.number1 * this.number2;
                break;
            case "/":
                result = this.number1 / this.number2;
                break;
        }
        System.out.println(this.number1 + this.operator + this.number2 + "=" + result);
    }
}
