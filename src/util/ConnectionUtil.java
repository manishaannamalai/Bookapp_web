package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {

	public static void main(String[] args) throws Exception {

		

	}

	
	public static DataSource getDataSource() {
		 
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://35.154.162.204:3337//kvcet_manisha_db");
        		ds.setUsername("kvcet_manisha");
        ds.setPassword("kvcet_manisha");            
        return ds;
 
    }
     
    public static JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        DataSource dataSource = getDataSource();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

}
