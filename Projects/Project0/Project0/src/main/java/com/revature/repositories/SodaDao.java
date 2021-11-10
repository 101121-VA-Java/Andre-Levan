package com.revature.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Soda;
import com.revature.util.ConnectionUtil;

public interface SodaDao extends GenericDao<Soda>{
	Soda[] getAllSoda();
	Soda getSodabyName(String name);
	Soda addSoda(Soda s);
	boolean editSoda(Soda s);
	boolean deleteSoda(int name);
	boolean deleteSodaByName(Soda s);
	Soda getSodaByName(int name);

	
	@Override
	public default List<Soda> getAll() {
		String sql = "select * from birds;";
		List<Soda> soda = new ArrayList<>();

		try (Connection con = ConnectionUtil.getConnectionFromEnv()) {
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("s_id");
				String name = rs.getString("s_name");
				String brand = rs.getString("s_brand");
				String flavor = rs.getString("s_flavor");
				int quantity = rs.getInt("s_quantity");
				int price = rs.getInt("s_price");
				boolean inStock = rs.getBoolean("s_stock");
				

				//Soda newSoda = new Soda(id, name, brand, flavor, quantity, price, inStock);
				//soda.add(newSoda);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return soda;
		
	}
}
