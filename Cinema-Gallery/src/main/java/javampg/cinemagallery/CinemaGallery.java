/* Interactive cinema gallery
    @author Addie Domanico
    @version 8/11/2024
 */

package javampg.cinemagallery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class CinemaGallery {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        javampg.cinemagallery.PosterDAO posterDAO = new javampg.cinemagallery.PosterDAO();
        List<Poster> posters = posterDAO.getAllPosters();

        for (Poster poster : posters) {
            System.out.println("ID: " + poster.getId());
            System.out.println("Title: " + poster.getTitle());
            System.out.println("Year: " + poster.getReleaseYear());
            System.out.println("Genre: " + poster.getGenre());
            System.out.println("Poster URL: " + poster.getPosterUrl());
            System.out.println();
        }
    }
}
