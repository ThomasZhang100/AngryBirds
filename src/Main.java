public class Main {
    public static double deltaT = 0.05;
    public static void main(String[] args){
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(1000,1000);
        Scene scene = new Scene(args[0],40.0,25.0);
        scene.InitialScene();
        scene.Shooter();
        while (true){
            StdDraw.clear();
            scene.update();
            scene.draw();
            StdDraw.show();
            StdDraw.pause((int)(deltaT*1000.0));
        }
    }
}
