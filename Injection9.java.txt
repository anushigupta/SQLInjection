String sql = "select * from employee where name ='" + name + "'";
try (Connection c = dataSource.getConnection();
   ResultSet rs = c.createStatement().executeQuery(sql)) {
   List<Employee> employees = new ArrayList<>();
   while (rs.next()) {
       employees.add(new Employee(
               rs.getLong("id"),
               rs.getString("name"),
               rs.getString("password"),
               Role.valueOf(rs.getString("role"))
       ));
   }
   return employees;
} catch (SQLException ex) {
   throw new RuntimeException(ex);
}
