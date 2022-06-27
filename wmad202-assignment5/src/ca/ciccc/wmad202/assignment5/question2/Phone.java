package ca.ciccc.wmad202.assignment5.question2;

public class Phone {
    public class Alarm {
        private Integer time;

        public Alarm(Integer time) {
            this.time = time;
        }

        public void setTime(Integer time) {
            this.time = time;
            System.out.println("This Alarm's time was changed.");
        }

        public void showAlarm() {
            System.out.println("Next alarm time is "+time);
        }
    }

    public void createAlarmTime() {
        Alarm alarm = new Alarm(10);
        alarm.setTime(15);
        alarm.showAlarm();
    }
}
