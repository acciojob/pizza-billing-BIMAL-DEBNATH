package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private int extraCheese=80;
    private int extraTopping;
    private int PaperBag;

    private int totalPrice;
    private String bill;

    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isTakeawayAdded=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.PaperBag=20;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.extraTopping=70;
            //this.isVeg=true;
            totalPrice=300;
        }else {
            this.price=400;
            this.extraTopping=120;
            //this.isVeg=false;
            totalPrice=400;
        }
    }

    public int getPrice(){

        return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.totalPrice=this.totalPrice+this.extraCheese;
            this.isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded){
            this.totalPrice=this.totalPrice+this.extraTopping;
            isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeawayAdded){
            this.totalPrice=this.totalPrice+this.PaperBag;
            isTakeawayAdded=true;
        }
    }


    public String getBill(){
        // your code goes here

        String bill="Base Price Of The Pizza: "+this.price+"\n";

        if(isExtraCheeseAdded){
            bill=bill+"Extra Cheese Added: "+this.extraCheese+"\n";
        }

        if(isExtraToppingsAdded){
            bill=bill+"Extra Toppings Added: "+this.extraTopping+"\n";
        }

        if(isTakeawayAdded){
            bill=bill+"Paperbag Added: "+this.PaperBag+"\n";
        }

        bill=bill+"Total Price: "+this.totalPrice+"\n";

        return bill;
    }
}
