// Module 9 Excercise 9.8 
// By Addison Roy 

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public String getColor() {
        return color;
    }
    

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void setOn(boolean on) {
        this.on = on;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    

    public String toString() {
        if (on) {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius;
        } else {
            return "Fan color: " + color + ", radius: " + radius + ", fan is off";
        }
    }
    

    public static void main(String[] args) {
// First fan object
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        
// Second fan object
        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        
// Display Output 
        System.out.println("First fan: " + fan1);
        System.out.println("Second fan: " + fan2);
    }
}