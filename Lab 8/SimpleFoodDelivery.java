class Delivery extends Thread{
    String order;
    
    //constructor
    Delivery(String order){
        this.order=order;
    }

    //Run method- executed when thread starts
    public void run(){
        System.out.println(order + " Delivery started...");
        try{
            Thread.sleep(2000); //simulate time taken to deliver
        }catch (InterruptedException e){
            System.out.println(" delivery Interruped for"+ order);
        }
        System.out.println(order + " Delivered");
    }
}
public class SimpleFoodDelivery{
    public static void main (String[]args){
        System.out.println("Food delivery service started \n");

        //create delivery threads
        Delivery d1= new Delivery("Pizza");
        Delivery d2= new Delivery("Burger");
        Delivery d3= new Delivery ("Pasta");

        //start deliveries (each runs on a separate thread)
        d1.start();
        d2.start();
        d3.start();

        System.out.println("\n All orders are being delivered...");
    }
}