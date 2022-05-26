public class Main {

    public static void main(String[] args) {
        Model3 m3 = new Model3();
        ModelS mS = new ModelS();
        ModelY mY = new ModelY();
        ModelX mX = new ModelX();

        System.out.println("Model 3 Features ::");
        System.out.println("Miles per Charge: " + m3.milagePerCharged);
        System.out.println(m3.monitor);
        System.out.println("Total Seat: " + m3.seat);
        System.out.println("Has Sunroof: " + m3.sunRoof);

        System.out.println(" ");

        System.out.println("Model S Features ::");
        System.out.println("Miles per Charge: " + mS.milagePerCharged);
        System.out.println(mS.monitor);
        System.out.println("Total Seat: " + mS.seat);
        System.out.println("Has Sunroof: " + mS.sunRoof);

        System.out.println(" ");

        System.out.println("Model Y Features ::");
        System.out.println("Miles per Charge: " + mY.milagePerCharged);
        System.out.println(mY.monitor);
        System.out.println("Total Seat: " + mY.seat);
        System.out.println("Has Sunroof: " + mY.panoramicSunroof);

        System.out.println(" ");

        System.out.println("Model X Features ::");
        System.out.println("Miles per Charge: " + mX.milagePerCharged);
        System.out.println(mX.monitor);
        System.out.println("Total Seat: " + mX.seat);
        System.out.println("Has Sunroof: " + mX.panoramicSunroof);
    }
}
