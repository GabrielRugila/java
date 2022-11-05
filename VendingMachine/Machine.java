package VendingMachine;

public class Machine {

    // sell action
    private Item[][] items;

    //constructor
    public Machine(Item[][] items){
        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] =  new Item(items[i][j]);
            }
        }
    }

    //setters
    public void setItem(Item item, int row, int spot) {
        this.items[row][spot] = new Item(item);
    }

    //getters
    public Item getItem(int row, int spot) {

        return new Item(this.items[row][spot]);
    }

    //actions
    public boolean dispense(int row, int spot){
        if (this.items[row][spot].getQuantity() > 0) {
            this.items[row][spot].setQuantity(this.items[row][spot].getQuantity() -1);
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        String temp = "";
        for (int i = 0; i < this.items.length; i++) {
            for (int j = 0; j < this.items[i].length; j++) {
                System.out.print(this.items[i][j].toString());
            }
            System.out.println("\n");
        }
        System.out.println("******************************************************************");
        return temp;
    }

}
