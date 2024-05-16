public List
  getUserByUserId(String userId)
  throws SQLException {
    String sql = "select "
      + "first_name,last_name,username "
      + "from users where userid = '"
      + userId 
      + "'";
    Connection c = dataSource.getConnection();
    ResultSet rs = c.createStatement().executeQuery(sql);
}

