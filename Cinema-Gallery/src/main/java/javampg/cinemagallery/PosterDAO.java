package javampg.cinemagallery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PosterDAO {
    String url = "jdbc:mysql://localhost:3306/cinema_gallery";
    String user = "root";
    String password = "madhouse@@6372";

    public List<Poster> getAllPosters() {
        List<Poster> posters = new ArrayList<>();
        String query = "SELECT * FROM posters";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Poster poster = new Poster();
                poster.setId(rs.getInt("id"));
                poster.setTitle(rs.getString("title"));
                poster.setReleaseYear(rs.getInt("release_year"));
                poster.setGenre(rs.getString("genre"));
                poster.setPosterUrl(rs.getString("poster_url"));
                posters.add(poster);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return posters;
    }
}
