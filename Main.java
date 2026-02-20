import java.util.Scanner;

public class Main{
    public static void main( String[] args){
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];
        String[] itemNames = new String[10];

    }
    public static void printInventory(String[] names, double[] prices,int [] stocks){
        System.out.println("Inventory");
        for(int i = 0; i<names.length; i++){
            if (names[i] !=null){
                System.out.println(names[i] + "-$" + prices[i] + "-Stock:" + stocks[i]);
            }else{

            }
        }
    }
    public static void restockItem(String[] names, int[] stocks, String target, int amount){

    }

}