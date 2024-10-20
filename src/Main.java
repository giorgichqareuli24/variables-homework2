public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(" a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println(" a = " + a + ", b = " + b);




        int A = 5;
        int B = 10;
        System.out.println(" A = " + A + ", B = " + B);

        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println(" A = " + A + ", B = " + B);




        double num = 77.983;
        double aramteli = num - (int) num;
        System.out.println("არამთელი ნაწილი: " + aramteli);



        int number = 36344;
        if (number >= 100 && number <= 999 || number <= -100 && number >= -999) {
            System.out.println(number + " რიცხვი სამნიშნაა :).");
        } else {
            System.out.println(number + " რიცხვი არაა სამნიშნა :(.");
        }




        char lowerCase = 'g';
        char upperCase = (char)(lowerCase - 32);
        System.out.println("დიდი ასო არის: " + upperCase);




        double numberr = 77.2;
        int roundedNumber = (int)(numberr + 0.5);
        System.out.println("დამრგვალებული რიცხვი არის: " + roundedNumber);




        int d = 13;
        int f = 2;
        int h = 5;

        int length = (int) Math.ceil((double) d / h);
        int width = (int) Math.ceil((double) f / h);

        int allSquares = length * width;
        System.out.println("საჭიროა " + allSquares + " კვადრატი, რომ დაიფაროს ფართობი.");




        int totalSeconds = 8002;
        int hours = 0;
        if (totalSeconds >= 3600) {
            hours = totalSeconds / 3600;
            totalSeconds = totalSeconds % 3600;
        }

        int minutes = 0;
        if (totalSeconds >= 60) {
            minutes = totalSeconds / 60;
            totalSeconds = totalSeconds % 60;
        }

        int seconds = totalSeconds;
        System.out.println(hours + ":" + minutes + ":" + seconds);





        int totalSecondss = 2008;
        int hourss = totalSecondss / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutess = remainingSeconds / 60;
        int secondss = remainingSeconds % 60;
        System.out.println(hourss + ":" + minutess + ":" + secondss);


    }
}