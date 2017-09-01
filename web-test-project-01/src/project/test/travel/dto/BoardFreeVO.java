package project.test.travel.dto;

import java.sql.Timestamp;

public class BoardFreeVO {
  
  private int num;
  private String title;
  private String content;
  private String nickname;
  private int readcount;
  private Timestamp writedate;
  public int getNum() {
    return num;
  }
  public void setNum(int num) {
    this.num = num;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }
  public int getReadcount() {
    return readcount;
  }
  public void setReadcount(int readcount) {
    this.readcount = readcount;
  }
  public Timestamp getWritedate() {
    return writedate;
  }
  public void setWritedate(Timestamp writedate) {
    this.writedate = writedate;
  }
  
  
  
  
}
