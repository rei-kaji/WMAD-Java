package ca.ciccc.wmad202.assignment9.question2;

public class TestLamda {
    public static void main(String[] args) {
        CompareLambda<String,String> checkLonger = (t,s) -> {
            return t.length() > s.length();
        };

        System.out.println(checkLonger.compare("Teriyaki", "Sushi"));

        CompareLambda<Integer,Integer> checkBigger = (t,s) -> {
            return t > s;
        };

        System.out.println(checkBigger.compare(500,200));
    }
}
