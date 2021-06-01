package com.Model;

import com.DaoImp.CategoryDaoImp;

public class Test {
	public static void main(String args[]) {
		Category c=new Category();
		CategoryDaoImp cDao=new CategoryDaoImp();
		c.setCategory("Science");

		((CategoryDaoImp) cDao).addCategory(c);
		
	}

}
