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
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,statement,resultSet);
        }

        return null;
    }
}
