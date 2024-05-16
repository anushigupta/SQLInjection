String user = request.getParameter("user");
String pass = request.getParameter("pass");
String query = "SELECT user_id FROM user_data WHERE user_name = '" 
+ user + "' and user_password = '" + pass +"'";
try {
Statement statement = connection.createStatement( );
}
ResultSet results = statement.executeQuery( query ); // Unsafe!}
