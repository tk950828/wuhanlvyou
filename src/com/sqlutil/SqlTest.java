package com.sqlutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Random;

import com.dao.imp.DelicacyImp;
import com.dao.imp.HistoricImp;
import com.dao.imp.LeaveImp;
import com.dao.imp.NewImp;
import com.entity.Delicacy;
import com.entity.News;


public class SqlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Connection conn = DBUtil.open();
		// DBUtil.close(conn);
		HistoricImp h = new HistoricImp();
		System.out.println(h.getAllMessage());
	}
}
