class PinkCarDec extends CarDecorator {
    public PinkCarDec(car decorated) {
        super(decorated);
    }
    public void draw() {
        decorated.draw();
        setColor();
    }
    private void setColor(){
        System.out.println("Color: pink");
    }
}