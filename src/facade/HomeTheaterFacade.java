package facade;

public class HomeTheaterFacade {
    private StereoSystem stereoSystem;
    private Projector projector;
    private LightsControl lightsControl;

    public HomeTheaterFacade(){
        stereoSystem = new StereoSystem();
        projector = new Projector();
        lightsControl = new LightsControl();
    }

    public void watchMovie(){
        System.out.println("Watching movie");
        stereoSystem.on();
        projector.on();
        lightsControl.on();
    }

    public void endMovie(){
        System.out.println("Ending movie");
        stereoSystem.off();
        projector.off();
        lightsControl.off();
    }
}
