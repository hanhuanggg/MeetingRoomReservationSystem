package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MeetingRoomDAO {
   public ArrayList<MeetingRoom> selectAll(){

     ArrayList<MeetingRoom> list=new ArrayList<>();

        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;

        try {
            connection=DBUtil.getConnection();
            String sql="select * from meetingroom";
            statement=connection.prepareStatement(sql);
            resultSet=statement.executeQuery();
            while(resultSet.next()){
               MeetingRoom meetingRoom=new MeetingRoom();
               meetingRoom.setMeetingNumber(resultSet.getInt("meetingNumber"));
               meetingRoom.setArea(resultSet.getInt("area"));
               meetingRoom.setStates(resultSet.getString("states"));
               meetingRoom.setSubject(resultSet.getString("subject"));


               list.add(meetingRoom);
           }
           return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,statement,resultSet);
        }

        return null;
   }

}
