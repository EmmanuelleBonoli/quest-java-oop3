public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying){
        this.flying= flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff(){
        setFlying(true);
        System.out.printf("%s takes off in the sky.", this.getName());
    };

    @Override
    public void ascend(int meters){
        if(isFlying()){
            this.altitude = this.altitude + meters;
            System.out.printf("%s flies upward, altitude: %d%n ", this.getName(), this.altitude);
        }
    }

    @Override
    public void glide(){
        if(isFlying()){
            System.out.println("glides into the air.");
        }
    }

    @Override
    public void descend(int meters){
        if(isFlying()){
            this.altitude = getAltitude() - meters;
            System.out.printf("%s flies downward, altitude: %d%n ", this.getName(), this.altitude);
        }
    }

    @Override
    public void land(){
        if(isFlying() && getAltitude()> 5){
            System.out.printf("%s is too high, it can't land.", getName());
        }
        if(isFlying() && getAltitude()<5){
            System.out.printf("%s lands on the ground.", getName());
        }
    }
}
