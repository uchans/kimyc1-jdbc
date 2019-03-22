package org.kyc.jdbc.raw;

import java.util.List;

public interface ArticleDao {

	/**
	 * 목록
	 */
	List<Article> listArticles();

	/**
	 * 조회
	 */
	Article getArticle(String articleId);

	/**
	 * 등록
	 * 
	 * @return 추가된 행의 갯수
	 */
	int addArticle(Article article);

	/**
	 * 수정
	 * 
	 * @return 수정된 행의 갯수
	 */
	int updateArticle(Article article);

	/**
	 * 삭제
	 * 
	 * @return 삭제된 행의 갯수
	 */
	int deleteArticle(String articleId);
}