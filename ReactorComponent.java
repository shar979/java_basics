class ReactorComponent {

    // Private attributes
    private String componentName;
    private double mass;
    private double temperature;

    // Constructor where we used it to initialize the  attributes
    public ReactorComponent(String componentName,
                            double mass,
                            double temperature) {

        this.componentName = componentName;
        this.mass = mass;
        this.temperature = temperature;
    }

    // Method to display information
    public void displayInfo() {
       
        System.out.println("Component Name: " + componentName);
        System.out.println("Mass: " + mass + " kg");
        System.out.println("Temperature: " + temperature + " Celsius");
    }
    public static void main(String[] args) {

        // Creating an objector where we discussed about instantiation
        ReactorComponent component =
            new ReactorComponent("Cooling System", 250.5, 85.0);

        component.displayInfo();
    }
}
