import java.util.ArrayList;

public class Scene {
    public Bird bird = null;
    public ArrayList<Object> Objects = new ArrayList<Object>(0);
    public Scene(String birdName, double initX, double initY){
        pickBird(birdName);
        Objects.add(bird);
        bird.xPos = initX;
        bird.yPos = initY;
        bird.xScnPos = bird.xPos/50.0;
        bird.yScnPos = bird.yPos/50.0;

    }
    public void InitialScene(){
        StdDraw.clear();
        for (int i = 0 ; i<Objects.size();i++ ){
            StdDraw.picture(Objects.get(i).xScnPos,Objects.get(i).yScnPos,Objects.get(i).imageName,Objects.get(i).imageWidth,Objects.get(i).imageHeight);
        }
        StdDraw.show();
    }
    public void pickBird(String arg){
        if (arg.equals("chuck")) {
            bird = new Bird("Chuck.png", 37.5, 25.0 / 1000.0, 28.54 / 1000.0);
        }
        else if (arg.equals("terence")) {
            bird = new Bird("Terence.png", 90.0, 32.5 / 1000.0, 35.0 / 1000.0);
        }
        else if (arg.equals("bomb")) {
            bird = new Bird("Bomb.png", 45.0,44.0 / 1000.0, 30.0 / 1000.0);
        }
        else{
            bird = new Bird("Red.png", 30.0, 25.0 / 1000.0, 25.0 / 1000.0);
        }
    }
    public void Shooter(){
        while (!StdDraw.isMousePressed()){
            StdDraw.pause(10);
        }
        while (StdDraw.isMousePressed()){
            StdDraw.clear();
            StdDraw.line(StdDraw.mouseX(),StdDraw.mouseY(),bird.xScnPos,bird.yScnPos);
            StdDraw.picture(bird.xScnPos,bird.yScnPos,bird.imageName,bird.imageWidth,bird.imageHeight);
            StdDraw.show();
            StdDraw.pause(10);
        }
        bird.initialVelocity();
    }
    public void update(){
        for (int i = 0; i<Objects.size(); i++){
            Objects.get(i).update();
        }
    }
    public void draw(){
        for (int i = 0; i<Objects.size(); i++){
            Objects.get(i).draw();
        }
    }

}


