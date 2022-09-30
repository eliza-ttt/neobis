// Importing required classes

// Main class
class MainClass {

    // Main driver method
    public static void main(String[] args)
    {

        // Making a POJO class method to
        // set and retrieve some values
        product pr = new product();

        // Setting the values with setters
        pr.setPrid(1);
        pr.setName("Carrot");
        pr.setQuantity(40);

        // Retrieving some values from getters
        System.out.println("The product ID is "
                + pr.getPrid());
        System.out.println("The name of the product is "
                + pr.getName());
        System.out.println("The quantity of the product is "
                + pr.getQuantity());
    }
}
