abstract class CarDecorator implements car {
    protected car decorated;
    public CarDecorator(car decorated){
        this.decorated = decorated;
    }
    public void draw(){
        decorated.draw();
    }
}