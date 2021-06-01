package com.Dao;

import java.util.List;

import com.Model.Rent;

public interface RentDao {
	public Integer addRent(Rent rent);
	public List<Rent> getRents();
	public void deleteRent(Integer id);
	//public Integer getIdByAuthor(String author_name);
    public Rent getRentById(int id);
    public Integer updateRent(Rent rent);
}
