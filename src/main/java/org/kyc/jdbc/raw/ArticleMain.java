package org.kyc.jdbc.raw;

import java.util.List;


public class ArticleMain {
	ArticleDao articleDao = new ArticleDaoImplUsingRawJdbc();

/**
 * main 메서드
 */
public static void main(String[] args) {
    new ArticleMain().listArticles();
}

public void listArticles() {
    List<Article> articles = articleDao.listArticles();
    System.out.println(articles);
}

public void getArticle() {
    Article article = articleDao.getArticle("3");
    System.out.println(article);
}

public void addArticle() {
    Article article = new Article();
    article.setTitle("This is title.");
    article.setContent("This is content");
    article.setUserId("1");
    article.setName("김유찬");
    articleDao.addArticle(article);
}

public void updateArticle() {
    Article article = new Article();
    article.setArticleId("7");
    article.setTitle("This is modified title.");
    article.setContent("This is modified content");
    articleDao.updateArticle(article);
}

public void deleteArticle() {
    articleDao.deleteArticle("8");
	}
}




