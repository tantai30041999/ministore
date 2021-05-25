package util;

import java.util.ArrayList;

import bean.Product;
import dao.ProductDAO;

public class GenerateFilter {

	public static ArrayList<Integer> autoCreateFileter(ArrayList<Product> listProductInStock) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int size = listProductInStock.size();
		int[] index =  {1,3,5};
		for(int i = 0 ; i < index.length; i++) {
			if((size - index[i]) > 0) {
				result.add(index[i]);
			}
		}
		
		
		return result;
 		
		
		
	}
	public static void main(String[] args) {
		for(Integer i : autoCreateFileter((ArrayList<Product>) ProductDAO.getAllProductInStock())) {
			System.out.println(i);
		}
	}
}
