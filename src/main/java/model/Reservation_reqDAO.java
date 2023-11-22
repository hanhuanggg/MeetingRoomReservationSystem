package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Reservation_reqDAO {

    /**
     * 查询所有的预约请求
     * @param
     * @return
     */
    public List<Reservation_req> selectAll(){
        List<Reservation_req> list=new ArrayList<>();
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;

        try {
            connection=DBUtil.getConnection();
            String sql="select * from reservation_req";
            statement=connection.prepareStatement(sql);
            resultSet=statement.executeQuery();
            while(resultSet.next()){
                Reservation_req reservationReq=new Reservation_req();
                reservationReq.setR_id(resultSet.getInt("r_id"));
                reservationReq.setUsername("username");
                reservationReq.setRoom_number("room_number");
                reservationReq.setStates("states");
                reservationReq.setSubject("subject");
                reservationReq.setReqTime(resultSet.getString("reqTime"));
                reservationReq.setManager_name(resultSet.getString("manager_name"));
                reservationReq.setReason(resultSet.getString("reason"));
                reservationReq.setApprovalTime(resultSet.getString("approvalTime"));
                list.add(reservationReq);
            }
            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,statement,resultSet);
        }

        return null;
    }

        public List<Reservation_req> selectByUsername(String username){
        List<Reservation_req> list=new ArrayList<>();
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;

        try {
            connection=DBUtil.getConnection();
            String sql="select * from reservation_req where username=?";
            statement=connection.prepareStatement(sql);
            statement.setString(1,username);
            resultSet=statement.executeQuery();
            while(resultSet.next()){
                Reservation_req reservationReq=new Reservation_req();
                reservationReq.setR_id(resultSet.getInt("r_id"));
                reservationReq.setUsername("username");
                reservationReq.setRoom_number("room_number");
                reservationReq.setStates("states");
                reservationReq.setSubject("subject");
                reservationReq.setReqTime(resultSet.getString("reqTime"));
                reservationReq.setManager_name(resultSet.getString("manager_name"));
                reservationReq.setReason(resultSet.getString("reason"));
                reservationReq.setApprovalTime(resultSet.getString("approvalTime"));
                list.add(reservationReq);
            }
            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,statement,resultSet);
        }

        return null;
    }

}