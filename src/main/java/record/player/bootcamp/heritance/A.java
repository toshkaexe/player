package record.player.bootcamp.heritance;

 class A {

        static{
               System.out.print(" 1");
        }
        private  A(){
               System.out.print(" 2");
        }
        {
               System.out.print(" 31");
        }

        public static void main(String[] args) {
               {
                      new A();
               }
System.out.println("--");
               System.out.println("1"+1+1);
               double d = 5/2; System.out.println(d);
        }

}
