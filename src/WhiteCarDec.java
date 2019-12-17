class WhiteCarDec extends CarDecorator {
    public WhiteCarDec(car decorated) {
        super(decorated);
    }
    public void draw() {
        decorated.draw();
        setColor();
    }
    private void setColor(){
        System.out.println("Color: white");
    }
}