package tw.bookv2.myclass;

import javax.xml.crypto.Data;

/*
 * entity
 * 最常用實體類，基本和數據表一一對應，一個實體一張表。
 */

public class BookV2Entity {

	/* 編號 */
	private Integer id;

	/* 書名 */
	private String title;

	/* 作者 */
	private String author;

	/* 出版商 */
	private String publisher;

	/* 出版日期 */
	private Data data;

	/* 書籍分類 */
	private Integer bclass;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Integer getBclass() {
		return bclass;
	}

	public void setBclass(Integer bclass) {
		this.bclass = bclass;
	}

}
