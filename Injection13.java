param = java.net.URLDecoder.decode(param, ""UTF-8"");

String sql = ""INSERT INTO users (username, password) VALUES ('foo','""+ param + ""')"";

try {
  java.sql.Statement statement = org.owasp.benchmark.helpers.DatabaseHelper.getSqlStatement();
  // Updating db model without filtering user input
  org.owasp.benchmark.helpers.DatabaseHelper.outputUpdateComplete(sql, response);
} catch (java.sql.SQLException e) {
  e.prinStackTrace();
);



