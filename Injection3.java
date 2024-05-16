public List<BankAccount> FindAccountsByCustomerId(String Id) 
    throws SQLException 
{ 
    // not secure 
    String sql 
        = "SELECT customerid, acc_number, balance FROM Accounts WHERE customerid = '"
          + Id + "'"; 
    
    Connection c = dataSource.getConnection(); 
    ResultSet rs = c.createStatement().executeQuery(sql); 
