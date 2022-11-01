package kodlamaioDemo.business;

import kodlamaioDemo.entities.Category;

public class CategoryManager {
	public void categoryAdd(Category category) throws Exception
	{
		
		if(category.getCategoryName() == "asda")
		{
			throw new Exception("Kategori adi tekrar edemez");
		}
		System.out.println("Kategori Adi "+category.getCategoryName());
		
	}
}
