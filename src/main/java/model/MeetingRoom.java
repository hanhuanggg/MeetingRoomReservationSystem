package model;

public class MeetingRoom {
   private int meetingNumber;
   private int capacity;
   private int area;
   private String subject;
   private String states;

   public String getSubject() {
      return subject;
   }

   public void setSubject(String subject) {
      this.subject = subject;
   }

   public String getStates() {
      return states;
   }

   public void setStates(String states) {
      this.states = states;
   }


   public int getMeetingNumber() {
      return meetingNumber;
   }

   public void setMeetingNumber(int meetingNumber) {
      this.meetingNumber = meetingNumber;
   }

   public int getCapacity() {
      return capacity;
   }

   public void setCapacity(int capacity) {
      this.capacity = capacity;
   }

   public int getArea() {
      return area;
   }

   public void setArea(int area) {
      this.area = area;
   }
}
