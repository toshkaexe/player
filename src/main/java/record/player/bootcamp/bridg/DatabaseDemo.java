package record.player.bootcamp.bridg;

//Ваша система работает с базами данных, такими как MySQL и PostgreSQL.
// Теперь вам нужно добавить поддержку NoSQL базы данных, например, MongoDB.
//Примените паттерн Моста для того, чтобы отделить абстракцию
// работы с базой данных от конкретных реализаций различных типов баз данных


public class DatabaseDemo {
    public static void main() {
        Database mySqlDatabase = new AnyDatabase(new MySqlDatabase());
        mySqlDatabase.connect();
        mySqlDatabase.executeQuery("SELECT * FROM USERS;");
        mySqlDatabase.disconnect();

        Database postgreSqlDatabase = new AnyDatabase(new PostgreSqlDatabase());
        postgreSqlDatabase.connect();
        postgreSqlDatabase.executeQuery("SELECT * FROM USERS;");
        postgreSqlDatabase.disconnect();
    }


    interface DatabaseImplementation {
        void connect();
        void executeQuery(String query);
        void disconnect();
    }

   public static class MySqlDatabase implements DatabaseImplementation {
        @Override
        public void connect() {
            System.out.println("Connected to MySql.");
        }

        @Override
        public void executeQuery(String query) {
            System.out.println("Executing query in MySql:" + query);
        }

        @Override
        public void disconnect() {
            System.out.println("Disconnected to MySql.");
        }
    }


   public static class PostgreSqlDatabase implements DatabaseImplementation {
        @Override
        public void connect() {
            System.out.println("Connected to PostgreSql.");
        }

        @Override
        public void executeQuery(String query) {
            System.out.println("Executing query in PostgreSql:" + query);
        }

        @Override
        public void disconnect() {
            System.out.println("Disconnected to PostgreSql.");
        }
    }

    abstract static class Database {
        protected DatabaseImplementation databaseImplementation;

        public Database(DatabaseImplementation databaseImplementation) {
            this.databaseImplementation = databaseImplementation;
        }

        abstract void connect();
        abstract void executeQuery(String query);
        abstract void disconnect();
    }

    public static class AnyDatabase extends Database {
        public AnyDatabase(DatabaseImplementation databaseImplementation) {
            super(databaseImplementation);
        }

        @Override
        public void connect() {
            databaseImplementation.connect();
        }

        @Override
        public void executeQuery(String query) {
            databaseImplementation.executeQuery(query);
        }

        @Override
        public void disconnect() {
            databaseImplementation.disconnect();
        }

    }
}
















