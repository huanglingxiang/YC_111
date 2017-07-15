package com.yc.bean;

public class FavoriteBiz {

	private FavoriteDAO favoriteDAO;
	private TagDAO tagDAO;
	
	public FavoriteBiz() {
		System.out.println("FavoriteBiz 构造方法...");
	}

	public FavoriteDAO getFavoriteDAO() {
		return favoriteDAO;
	}

	public void setFavoriteDAO(FavoriteDAO favoriteDAO) {
		this.favoriteDAO = favoriteDAO;
	}

	public TagDAO getTagDAO() {
		return tagDAO;
	}

	public void setTagDAO(TagDAO tagDAO) {
		this.tagDAO = tagDAO;
	}

}
