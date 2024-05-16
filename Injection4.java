public List<AccountDTO>
  unsafeFindAccountsByCustomerId(String customerId)
  throws SQLException {
    // UNSAFE !!! DON'T DO THIS !!!
    String sql = "select "
      + "customer_id,acc_number,branch_id,balance "
      + "from Accounts where customer_id = '"
      + customerId 
      + "'";
    Connection c = dataSource.getConnection();
    ResultSet rs = c.createStatement().executeQuery(sql);
    // ...
}
