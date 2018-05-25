package com.olympus.hora.common.web.component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PagingBean {
	/**
	 * 全ページラベル表示数（マージン数＊２＋現在ページ）
	 */
	final int pagelabelCount;
	/**
	 * 前後ページラベル表示数
	 */
	final int margin;
	/**
	 * 総ページ数
	 */
	final int allPageCount;
	/**
	 * 現在ページ番号
	 */
	final int currentPageNumber;
	/**
	 * 開始ページ番号
	 */
	final int startPageNumber;
	/**
	 * 終了ページ番号
	 */
	final int endPageNumber;

	public PagingBean(int margin, int allPageCount, int currentPageNumber) {
		super();
		this.pagelabelCount = margin * 2 + 1;
		this.margin = margin;
		this.allPageCount = allPageCount;
		this.currentPageNumber = currentPageNumber;
		this.startPageNumber = startPageNo();
		this.endPageNumber = endPageNo();
	}

	private int startPageNo() {
		// トータルページ数が表示ページ数よりも少ない場合は１から
		if (allPageCount <= pagelabelCount) {
			return 1;
		}
		// マージンが２であって、2よりも小さいページの場合は１から。
		if (margin >= currentPageNumber) {
			return 1;
		}
		if (currentPageNumber + margin <= allPageCount) {
			// 現在ページにマージンを足してもトータルページ内に収まる場合
			return currentPageNumber - margin;
		} else {
			// 現在ページにマージンを足すとトータルページ数を超えてしまう場合は
			return allPageCount - pagelabelCount + 1;
		}
	}

	private int endPageNo() {
		if (allPageCount <= pagelabelCount) {
			return allPageCount;
		}
		return startPageNumber + pagelabelCount - 1;
	}

	public int getPagelabelCount() {
		return pagelabelCount;
	}

	public int getMargin() {
		return margin;
	}

	public int getAllPageCount() {
		return allPageCount;
	}

	public int getCurrentPageNumber() {
		return currentPageNumber;
	}

	public int getStartPageNumber() {
		return startPageNumber;
	}

	public int getEndPageNumber() {
		return endPageNumber;
	}
	
	public List<Integer> getPages(){
		return IntStream.rangeClosed(startPageNumber, endPageNumber).boxed().collect(Collectors.toList());
	}
	public boolean isExistNextPage() {
		return currentPageNumber != allPageCount;
	}
	public boolean isExistPrevPage() {
		return currentPageNumber != 1;
	}

}
