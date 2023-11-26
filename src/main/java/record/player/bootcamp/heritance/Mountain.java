package record.player.bootcamp.heritance;





class Mountain extends Rock {
    Mountain(){
        super("granite ");
        new Rock ("granite");
    }

    public static void main(String[] args) {
        new Mountain();
    }

}
