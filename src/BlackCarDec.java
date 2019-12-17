class BlackCarDec extends CarDecorator {
    public BlackCarDec (car decorated) {
        super(decorated);
    }
    public void draw() {
        decorated.draw();
        setColor();
    }
    private void setColor(){
        System.out.println("Color: black");
    }
}