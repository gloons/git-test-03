package project.test.travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import project.test.travel.dto.*;

import util.DBManager;

public class BoardDAO {
  private BoardDAO() {

  }

  private static BoardDAO instance = new BoardDAO();

  public static BoardDAO getInstance() {
    return instance;
  }

  public List<BoardVO> selectALLBoards() {
    String sql = "select * from content_table order by num desc";

    List<BoardVO> list = new ArrayList<BoardVO>();
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
      conn = DBManager.getConnection();
      stmt = conn.createStatement();

      rs = stmt.executeQuery(sql);

      while (rs.next()) {
        BoardVO bVo = new BoardVO();

        bVo.setNum(rs.getInt("num"));
        bVo.setContinent(rs.getString("continent"));
        bVo.setCountry(rs.getString("country"));
        bVo.setCost(rs.getInt("cost"));
        bVo.setPeriod(rs.getInt("period"));
        bVo.setTitle(rs.getString("title"));
        bVo.setNickname(rs.getString("nickname"));
        bVo.setContent(rs.getString("content"));
        bVo.setWritedate(rs.getTimestamp("writedate"));
        bVo.setReadcount(rs.getInt("readcount"));        

        list.add(bVo);
      } // while문

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, stmt, rs);
    }
    return list;    
  } // try end


  public List<BoardFreeVO> selectAllFreeBoard() {
    String sql = "select * from free_table order by num desc";

    List<BoardFreeVO> list = new ArrayList<BoardFreeVO>();
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
      conn = DBManager.getConnection();
      stmt = conn.createStatement();

      rs = stmt.executeQuery(sql);

      while (rs.next()) {
        BoardFreeVO bfVo = new BoardFreeVO();
        bfVo.setNum(rs.getInt("num"));
        bfVo.setTitle(rs.getString("title"));
        bfVo.setContent(rs.getString("content"));
        bfVo.setNickname(rs.getString("nickname"));
        bfVo.setReadcount(rs.getInt("readcount"));
        bfVo.setWritedate(rs.getTimestamp("writedate"));

        list.add(bfVo);
      } // while문

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, stmt, rs);
    }
    return list;    
  } // try end


  public void insertBoard(BoardVO bVo) {
    String sql = "insert into content_table(" + "num, continent, country, cost, period, title, nickname, content) " + 
        "values(board_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);

      pstmt.setString(1, bVo.getContinent());
      pstmt.setString(2, bVo.getCountry());
      pstmt.setInt(3, bVo.getCost());
      pstmt.setInt(4, bVo.getPeriod());
      pstmt.setString(5, bVo.getTitle());
      pstmt.setString(6, bVo.getNickname());
      pstmt.setString(7, bVo.getContent());

      pstmt.executeUpdate(); // sql update 실행!      
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt);
    }
  } // insert

  public void insertUser(UserVO uVo) {
    String sql = "insert into user_table(" + "email, pwd, name, nickname, phone, gender) " + 
        "values(?, ?, ?, ?, ?, ?)";

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);

      pstmt.setString(1, uVo.getEmail());
      pstmt.setString(2, uVo.getPwd());
      pstmt.setString(3, uVo.getName());
      pstmt.setString(4, uVo.getNickname());
      pstmt.setString(5, uVo.getPhone());
      pstmt.setInt(6, uVo.getGender());

      pstmt.executeUpdate(); // sql update 실행!      
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt);
    }
  }
  
  
  
  

  public UserVO selectAllUser(String email) {
    String sql = "select * from user_table where email = ?";

    UserVO uVo = null;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
      conn = DBManager.getConnection();

      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, email);

      rs = pstmt.executeQuery();

      if (rs.next()) {
        uVo = new UserVO();

        uVo.setEmail(rs.getString("email"));
        uVo.setPwd(rs.getString("pwd"));
        uVo.setName(rs.getString("name"));
        uVo.setNickname(rs.getString("nickname"));
        uVo.setPhone(rs.getString("phone"));
        uVo.setGender(rs.getInt("gender"));
        uVo.setPoint(rs.getInt("point"));


      } // while문

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt, rs);
    }
    return uVo;    
  }// try end

  
  public int userCheck(String email, String pwd) { // 회원 정보가 존재하는지 확인하는 메소드
    int result = -1; // 아이디가 일치하는 회원이 존재하지 않으면 -1 저장, result에 초기값 -1을 주어 일치하는 회원이 없는 것을 가정하고 시작
    String sql = "select pwd from member where email=?"; // 로그인 폼에서 입력받은 아이디로 member 테이블 조회, where절로 userid 검색하여 암호를 얻어옴
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, email); // select문의 ?에 매개 변수로 받아온 아이디를 binding 시킴
      rs = pstmt.executeQuery(); // 쿼리문의 결과값을 resultSer 객체인 rs에 저장

      // 아이디가 일치하는 행이 존재하면 rs.next가 true이므로 매개 변수로 받아온 암호와 디비에 저장된 암호가 일치하는지 체크하여
      // 일치하면 result에 1을 저장
      if(rs.next()) {
        if(rs.getString("pwd") != null && rs.getString("pwd").equals(pwd)) {
          result = 1;
        } else { // 아이디가 일치하지만 암호가 불일치 하면 result에 0을 저장
          result = 0;
        }
      } else { // 해당 아이디가 존재하지 않으면 result에 -1 저장
        result = -1;
      }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
        if(pstmt != null) pstmt.close();
        if(conn != null) conn.close();
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
    return result;
  }
  
  public void updateReadCount(String num) {
    String sql = "update content_table set readcount = readcount + 1 where num = ?";
    
    Connection conn = null;
    PreparedStatement pstmt = null;
    
    try {
      conn = DBManager.getConnection();
      
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, num);
      
      pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt);
    }
  } // updateReadCount
  
  public BoardVO selectOneBoardByNum(String num) {
    String sql = "select * from content_table where num = ?";
    
    BoardVO bVo = null;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    try {
      conn = DBManager.getConnection();
      
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, num);
      
      rs = pstmt.executeQuery();
      
      if (rs.next()) {
        bVo = new BoardVO();
        
        bVo.setNum(rs.getInt("num"));
        bVo.setContinent(rs.getString("continent"));
        bVo.setCountry(rs.getString("country"));
        bVo.setCost(rs.getInt("cost"));
        bVo.setPeriod(rs.getInt("period"));
        bVo.setTitle(rs.getString("title"));
        bVo.setNickname(rs.getString("nickname"));
        bVo.setContent(rs.getString("content"));
        bVo.setWritedate(rs.getTimestamp("writedate"));
        bVo.setReadcount(rs.getInt("readcount" ));
      } // if
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt, rs);
    }
    return bVo;
  }
  
  public void insertFreeBoard(BoardFreeVO bfVo) {
    String sql = "insert into free_table(" + "num, title, content, nickname) " + 
        "values(board_seq.nextval, ?, ?, ? )";

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);

      
      pstmt.setString(1, bfVo.getTitle());
      pstmt.setString(2, bfVo.getContent());
      pstmt.setString(3, bfVo.getNickname());

      pstmt.executeUpdate(); // sql update 실행!      
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt);
    }
  } // free board insert
  
  public void updateFreeReadCount(String num) {
    String sql = "update free_table set readcount = readcount + 1 where num = ?";
    
    Connection conn = null;
    PreparedStatement pstmt = null;
    
    try {
      conn = DBManager.getConnection();
      
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, num);
      
      pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt);
    }
  } // free updateReadCount
  

  public BoardFreeVO selectOneFreeBoardByNum(String num) {
    String sql = "select * from free_table where num = ?";
    
    BoardFreeVO bfVo = null;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    try {
      conn = DBManager.getConnection();
      
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, num);
      
      rs = pstmt.executeQuery();
      
      if (rs.next()) {
        bfVo = new BoardFreeVO();
        
        bfVo.setNickname(rs.getString("nickname"));
        bfVo.setWritedate(rs.getTimestamp("writedate"));
        bfVo.setReadcount(rs.getInt("readcount" ));
        bfVo.setTitle(rs.getString("title"));
        bfVo.setContent(rs.getString("content"));
      } // if
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt, rs);
    }
    return bfVo;
  } // update free board by num
}

