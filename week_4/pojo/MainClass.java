class MainClass {


    public static void main(String[] args)
    {

        product pr = new product();
        category ct = new category();
        deliver dv = new deliver();


        pr.setPrid(1);
        pr.setName("Carrot");
        pr.setQuantity(40);

        ct.setCt_id(3);
        ct.setCategory_name("Vegetables");

        dv.setDv_id(2);
        dv.setDeliver_name("FUD");
        dv.setCountry("Japan");
        dv.setCost(2.1);



        System.out.println("The product ID is "
                + pr.getPrid());
        System.out.println("The name of the product is "
                + pr.getName());
        System.out.println("The quantity of the product is "
                + pr.getQuantity());

        System.out.println("The product's category ID is "
                + ct.getCt_id());
        System.out.println("The product's category name is "
                + ct.getCategory_name());

        System.out.println("The deliver's ID is "
                + dv.getDv_id());
        System.out.println("The name of the product's deliver is "
                + dv.getDeliver_name());
        System.out.println("The country of the deliver is "
                + dv.getCountry());
        System.out.println("The country of the deliver is "
                + dv.getCost());
    }
}
