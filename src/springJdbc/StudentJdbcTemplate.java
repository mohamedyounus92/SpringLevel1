/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springJdbc;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author md_yo
 */
public class StudentJdbcTemplate implements IStudentDAO{
    private Student studentObj;
    private DataSource ds;
    private JdbcTemplate template;
    
    public void setDataSource(DataSource ds)
    {
        this.ds = ds;
        this.template = new JdbcTemplate(ds);
    }

    public void create(Student s) {
        this.studentObj = s;
        int studentId = s.getId();
        String studentName = s.getName();
        String sqlQuery = "insert into student (id,name) values (" + "'" + studentId +
                "', '" + studentName + "')";
        template.execute(sqlQuery);
        System.out.println("Record inserted successfully.");
    }
}
