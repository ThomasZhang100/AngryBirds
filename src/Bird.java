public class Bird extends Object {
    public double initialSpeed = 0.0;
    public Bird(String img,double mass,double height, double width){
        super(img, height, width);
        this.initialSpeed = Math.sqrt(2*250/mass);
    }
    public void initialVelocity(){
        double MouseXdis = StdDraw.mouseX()*50-xPos;
        double MouseYdis = StdDraw.mouseY()*50-yPos;
        if (MouseXdis == 0){
            if (MouseYdis >0){
                yVelocity=-initialSpeed;
            }
            else if (MouseYdis < 0){
                yVelocity=initialSpeed;
            }
        }
        else if (MouseXdis < 0){
            xVelocity = -Math.cos(Math.atan(MouseYdis/MouseXdis)+Math.PI)*initialSpeed;
            yVelocity = -Math.sin(Math.atan(MouseYdis/MouseXdis)+Math.PI)*initialSpeed;
        }
        else if (MouseXdis > 0){
            xVelocity = -Math.cos(Math.atan(MouseYdis/MouseXdis))*initialSpeed;
            yVelocity = -Math.sin(Math.atan(MouseYdis/MouseXdis))*initialSpeed;
        }
    }
}
