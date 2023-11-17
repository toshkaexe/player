package record.player.bootcamp.thread;


public class Gerne {
   /* public static String getHTML(String urlToRead) throws Exception {

        StringBuilder html = new StringBuilder();
        try {
            URL url = new URL(urlToRead);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                html.append(line);
            }
            reader.close();
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return html.toString();
    }

    public static String bestInGenre(String genre) {
        // Write your code here
        String baseUrl = "https://jsonmock.hackerrank.com/api/tvseries";
        int currentPage = 1;
        double highestRating = Double.MIN_VALUE;
        String lowestName = "";

        do {
            try {
                URL url = new URL(baseUrl + "?page=" + currentPage + "&genre=" + genre);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                JSONObject jsonResponse = new JSONObject(response);
                JSONArray data = jsonResponse.getJSONArray("data");

                for (int i = 0; i < data.length(); i++) {
                    JSONObject show = data.getJSONObject(i);
                    double imdbRating = show.getDouble("imdb_rating");
                    String name = show.getString("name");

                    if (imdbRating > highestRating || (imdbRating == highestRating && name.compareToIgnoreCase(lowestName) < 0)) {
                        highestRating = imdbRating;
                        lowestName = name;
                    }
                }

                reader.close();
                connection.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }

            currentPage++;
        } while (currentPage <= 10); // You might need to adjust the number of pages to fetch

        return lowestName;

    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }/

    */

}
