package ex05_muo_chuara;
import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    this.name = name;
    this.itemList = new ArrayList<>();
    this.storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if (index > this.itemList.size() - 1) {
        System.out.println("Item does not exist");
    } else {
        earnings += this.itemList.get(index).getCost();
        System.out.println("Good job! You have successfully purchased " + this.itemList.get(index).getName() + ".");
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean czech = false;
    for(Item item: this.itemList) {
        String ieleven = item.getName();
        if (ieleven.equals(name) == true){
            earnings += item.getCost();
            System.out.println("Congratulations for purchasing " + item.getName() + ".");
            czech = true;
        }
    }
    if (czech == false){
        System.out.println("This store doesn't have " + name + ". Please go to the nearest Ayala Malls they might have it.");
    }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    
     boolean czech = false;
    for(Item item: this.itemList) {
        if (item == i){
            earnings += item.getCost();
            System.out.println("Congratulations for purchasing " + item.getName() + ".");
            czech = true;
        }
    }
    if (czech == false){
        System.out.println("This store doesn't have " + name + ". Please go to the nearest Ayala Malls they might have it.");
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    for (Item j: this.itemList) {
        if (j.getType().equals(type) == true) {
            System.out.println(j.getName() + ", " + j.getCost());
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
        for (Item j: this.itemList) {
        if (j.getCost() <= maxCost) {
            System.out.println(j.getName() + ", " + j.getCost());
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    for (Item j: this.itemList) {
        if (j.getCost() >= minCost) {
            System.out.println(j.getName() + ", " + j.getCost());
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for(int i = 0; i < storeList.size(); i++){
        System.out.println(storeList.get(i).getName() + " earned " + storeList.get(i).getEarnings());
    }
  }
}
