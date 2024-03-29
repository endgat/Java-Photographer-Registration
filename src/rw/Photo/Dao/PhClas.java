package rw.Photo.Dao;

import java.sql.*;

public class PhClas  {
    private String Url = "jdbc:postgresql://localhost:5432/test";
    private String user="postgres";
    private String passcode= "auca2020$";
    public boolean Signupuser(int cameraid, String firstName, String lastName, String email, String password) {
        try (Connection con = DriverManager.getConnection(Url, user, passcode)) {
            String insert = "INSERT INTO test(camid, firstname, lastname, email,  password) VALUES (?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(insert);

            st.setInt(1, cameraid);
            st.setString(2, firstName);
            st.setString(3, lastName);
            st.setString(4, email);
            st.setString(5, password);

            int rowsInserted = st.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("The user is inserted ");
                return true;
            } else {
                System.out.println("The user is not inserted");
                return false;
            }

        } catch (SQLException e) {
            System.out.println("ERROR IN CONNECTION");
            e.printStackTrace();
            return false;
        }
    }

}




