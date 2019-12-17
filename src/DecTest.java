public class DecTest {//тест
    public static void main(String[] args) {
        car c1 = new WhiteCarDec(new PassengerCar());
        car c2 = new BlackCarDec(new SportCar());
        car c3 = new PinkCarDec(new Truck());
        car c4 = new PinkCarDec(new PassengerCar());
        System.out.println();
        c1.draw();
        c2.draw();
        c3.draw();
        c4.draw();
    }
}