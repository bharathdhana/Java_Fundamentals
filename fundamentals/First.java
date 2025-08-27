//execution class
public class First {
    public static void main(String[] args) {
        Second sc = new Second();
        sc.findBmi(160, 45); //  BMI calculation
        Second sca = new Second();
        sca.findBmi(170, 60);
        Thread t1 = new Thread(sc, "Ram");
        Thread t2 = new Thread(sca, "Kumar");
        Thread t3 = new Thread(sc, "Ravi");
        t1.start();
        t2.start();
        t3.start();
    }
}

// Resource class
class Second implements Runnable {
    public void findBmi(double height, double weight) {
        height /= 100;
        double bmi = weight / (height * height);
        if (bmi <= 18.0)
            System.out.println("You are underweight");
        else if (bmi > 18.0 && bmi <= 24.0)
            System.out.println("Normal weight");
        else if (bmi > 24.0 && bmi <= 30.0)
            System.out.println("You are overweight");
        else
            System.out.println("You are obese");
    }

    @Override
    public synchronized void run() {
        System.out.println("Greetings " + Thread.currentThread().getName());
        // System.out.println("Thanks for visiting " + Thread.currentThread().getName());
    }
}


