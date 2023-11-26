package record.player.bootcamp.heritance;

public class Mellt {
    public void showNummer(){
        System.out.print(10);
        return;
    }

    public static void main(String[] args) {
        boolean bool  = true;

        if (bool==false){
            System.out.print(" a ");
        } else if (bool){
            System.out.print(" b ");
        } else if (!bool){
            System.out.print(" c ");
        }else {
            System.out.print(" d ");
        }
    }
}
