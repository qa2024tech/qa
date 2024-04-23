public class Demo {
    public static void main(String[] args) throws SQLException {
       String url = "jdbc:postgresql://localhost:5432/postgres";
        String userName = "postgres";
        String password = "postgres";

        Connection conn = DriverManager.getConnection(url, userName, password);
        Statement statement = conn.createStatement();
        String sql = "SELECT CUSTOMER_ID, FIRST_NAME, LAST_NAME," +
                " EMAIL FROM CUSTOMER WHERE CUSTOMER_ID = 1";

        ResultSet rs = statement.executeQuery(sql);
    }
}
