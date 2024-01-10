package record.player.bootcamp.heritance;

public class Mellt {
    public void showNummer(){
        System.out.print(10);
        return;
    }

    public static void main(String[] args) {
        int ii = 55;



        for(int i =0; i!=3;i+=10){
            System.out.println(ii);
        }
        boolean bool  = true;
        System.out.println(2+2*2);
        int i = 5;
        switch (i){
            case 4: System.out.println(4);
            case 5: System.out.println(5);

        }
        System.out.println("1" + 1+1);
        double dd = 5/4;
        System.out.println(dd);
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

// Интерфейс
interface MyInterface {
    void myMethod1();
    void myMethod2();
}

// Обычный класс, реализующий интерфейс
class MyClass implements MyInterface {
    // Реализация методов интерфейса
    public void myMethod1() {
        System.out.println("myThe");
    }

    public void myMethod2() {
        // ваш код
    }

    // Дополнительные методы или поля могут быть добавлены здесь
}
