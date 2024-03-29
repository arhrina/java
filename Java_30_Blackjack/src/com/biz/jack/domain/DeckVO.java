package com.biz.jack.domain;

/*
 * 플레잉카드
 * 한벌 52. 조커제외
 * 
 * suit : 빨강(다이아몬드◆, 하트♥), 검정(클로버♣, 스페이드♠)
 * denomination(끝수) : 13가지 종류
 * 숫자, 알파벳
 * 2~10, J(Jack), Q(Queen), K(King), A(Ace) 
 */
public class DeckVO {
	private String suit;
	private String denomination;
	private int value;

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "[suit=" + suit + ", denomination=" + denomination + ", value=" + value + "]";
	}

}
