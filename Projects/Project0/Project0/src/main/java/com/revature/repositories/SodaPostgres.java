package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.models.Customer;
import com.revature.models.Soda;
import com.revature.util.ConnectionUtil;

public class SodaPostgres implements SodaDao{

	@Override
	public Soda add(Soda s) {
		String sql = "insert into soda (s_id, s_name, s_brand, s_flavor, s_price, s_quantity, s_isDiet, s_inStock)"
				+ "values(?,?,?,?,?,?,?,?) returning s_id;";
		
		try(Connection con = ConnectionUtil.getConnectionFromEnv()){
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1,  s.getId());
			ps.setString(2,  s.getName());
			ps.setString(3, s.getBrand());
			ps.setString(4, s.getFlavor());
			ps.setInt(5, s.getPrice());
			ps.setInt(6, s.getQuantity());
			ps.setBoolean(7, false);
			ps.setBoolean(8, true);
			ResultSet rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

	@Override
	public Soda getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Soda remove(Soda t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Soda> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Soda t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Soda getSodabyName(String name) {
		String sql =
				"select * from Soda";
		Soda soa = null;
		
		try(Connection con = ConnectionUtil.getConnectionFromEnv()){
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeQuery();
			ResultSet rs = ps.executeQuery();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return soa;
	}


	@Override
	public Soda[] getAllSoda() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Soda addSoda(Soda s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean editSoda(Soda s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSoda(int name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSodaByName(Soda s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Soda getSodaByName(int name) {
		// TODO Auto-generated method stub
		return null;
	}

}
