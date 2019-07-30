public class Object {
    public double xPos = 0.0;
    public double yPos = 0.0;
    public double xScnPos = 0.0;
    public double yScnPos = 0.0;
    public double xVelocity = 0.0;
    public double yVelocity = 0.0;
    public String imageName = "";
    public double imageHeight = 0.0;
    public double imageWidth = 0.0;
    public Object(String img,double height, double width){

        this.imageName = img;
        this.imageHeight = height;
        this.imageWidth = width;
    }
    public void update(){
        yVelocity-=9.8*Main.deltaT;
        xPos+=xVelocity;
        yPos+=yVelocity;
        xScnPos=xPos/50.0;
        yScnPos=yPos/50.0;
    }
    public void draw(){
        StdDraw.picture(xScnPos,yScnPos,imageName,imageWidth,imageHeight);
    }
}
