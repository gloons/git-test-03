package project.test.travel.dto;

import java.sql.Timestamp;

public class BoardVO {
  
  private int num;
  private String continent;
  private String country;
  private int cost;
  private int period;
  private String nickname;
  private String title;
  private String content; 
  private int readcount;
  private Timestamp writedate;
  public int getNum() {
    return num;
  }
  public void setNum(int num) {
    this.num = num;
  }
  public String getContinent() {
    return continent;
  }
  public void setContinent(String continent) {
    this.continent = continent;
  }
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }
  public int getCost() {
    return cost;
  }
  public void setCost(int cost) {
    this.cost = cost;
  }
  public int getPeriod() {
    return period;
  }
  public void setPeriod(int period) {
    this.period = period;
  }
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
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
