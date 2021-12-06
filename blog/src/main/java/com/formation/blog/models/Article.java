package com.formation.blog.models;

public class Article {
	private Integer idArticle;
	private String titre;
	private String image;
	private String legendImg;
	private String corps;
	private String auteur;

	public Integer getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Integer idArticle) {
		this.idArticle = idArticle;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLegendImg() {
		return legendImg;
	}

	public void setLegendImg(String legendImg) {
		this.legendImg = legendImg;
	}

	public String getCorps() {
		return corps;
	}

	public void setCorps(String corps) {
		this.corps = corps;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Article{" +
				"idArticle=" + idArticle +
				", titre='" + titre + '\'' +
				", image='" + image + '\'' +
				", legendImg='" + legendImg + '\'' +
				", corps='" + corps + '\'' +
				", auteur='" + auteur + '\'' +
				'}';
	}
}
