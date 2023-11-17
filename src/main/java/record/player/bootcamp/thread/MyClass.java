package record.player.bootcamp.thread;


import java.io.*;

class Result {

    /*
     * Complete the 'bestInGenre' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING genre as parameter.
     *
     * Base URL: https://jsonmock.hackerrank.com/api/tvseries?page=
     */


          public static String bestInGenre(String genre) {
  //       Write your code here
              String baseUrl = "https://jsonmock.hackerrank.com/api/tv_series";
        return baseUrl;
          }



}

class Data{
    String name;
    String runtime_of_series;
    String certificate;
    String runtime_of_episodes;
    String genre;
    double imdb_rating;
    String overview;
    int no_of_votes;
    int id;
    public Data(String name, String runtime_of_series, String certificate, String runtime_of_episodes, String genre,
                double imdb_rating, String overview, int no_of_votes, int id) {
        this.name = name;
        this.runtime_of_series = runtime_of_series;
        this.certificate = certificate;
        this.runtime_of_episodes = runtime_of_episodes;
        this.genre = genre;
        this.imdb_rating = imdb_rating;
        this.overview = overview;
        this.no_of_votes = no_of_votes;
        this.id = id;
    }

    // Getters and setters for the fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRuntime_of_series() {
        return runtime_of_series;
    }

    public void setRuntime_of_series(String runtime_of_series) {
        this.runtime_of_series = runtime_of_series;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getRuntime_of_episodes() {
        return runtime_of_episodes;
    }

    public void setRuntime_of_episodes(String runtime_of_episodes) {
        this.runtime_of_episodes = runtime_of_episodes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getImdb_rating() {
        return imdb_rating;
    }

    public void setImdb_rating(double imdb_rating) {
        this.imdb_rating = imdb_rating;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public int getNo_of_votes() {
        return no_of_votes;
    }

    public void setNo_of_votes(int no_of_votes) {
        this.no_of_votes = no_of_votes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", runtime_of_series='" + runtime_of_series + '\'' +
                ", certificate='" + certificate + '\'' +
                ", runtime_of_episodes='" + runtime_of_episodes + '\'' +
                ", genre='" + genre + '\'' +
                ", imdb_rating=" + imdb_rating +
                ", overview='" + overview + '\'' +
                ", no_of_votes=" + no_of_votes +
                ", id=" + id +
                '}';
    }
}

public class MyClass {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String genre = bufferedReader.readLine();

        String result = Result.bestInGenre(genre);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
