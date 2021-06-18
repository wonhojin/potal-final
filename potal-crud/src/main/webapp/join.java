public int join(User user) {
  String sql = "insert into user values(?, ?, ?, ?, ?)";
  try {
    pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, user.getUserID());
    pstmt.setString(2, user.getUserPassword());
    pstmt.setString(3, user.getUserName());
    pstmt.setString(4, user.getUserGender());
    pstmt.setString(5, user.getUserEmail());
    return pstmt.executeUpdate();
  }catch (Exception e) {
 	e.printStackTrace();
  }
  return -1;
}