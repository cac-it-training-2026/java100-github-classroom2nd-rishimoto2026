/**
 * 第7章 武士のお仕事
 *
 * 問題13 インターフェース②
 *
 * 文化人インターフェースを作る。
 *
 * 抽象メソッドlearn()を持つ文化人インターフェースICelebrityを
 * 作成し、藩士クラスと浪人クラスにそれぞれ実装し、<実行例>と
 * 同じメッセージを表示してください。
 *
 * <実行例>
 * 藩士1：
 * 茶道を嗜むよ～。
 *
 * 浪人1：
 * 塾を開くよ～。
 *
 *
 */

package lesson07.challenge13;

//ここにICelebrityインターフェースを記述
interface ICelebrity {
	abstract void learn();
}

//ここにSamuraiクラスを記述
class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

}

//ここにRetainerクラスを記述
class Retainer extends Samurai implements ICelebrity {

	/**
	 * 
	 */
	public Retainer() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	protected String domain;

	public Retainer(String name, String domain) {
		this.name = name;
		this.domain = domain;
	}

	void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	public String toString() {
		return "拙者は" + domain + "藩士、" + name + "ともうす。";
	}

	@Override
	public boolean equals(Object obj) {
		boolean isMatch = false;
		Retainer retainer = (Retainer) obj;
		if (this.domain.equals(retainer.domain)) {
			isMatch = true;
		} else {
			isMatch = false;
		}
		return isMatch;
	}

	void learn() {
		System.out.println("茶道を嗜むよ～。");
	}
}

//ここにRoninクラスを記述
class Ronin extends Samurai {

	/**
	 * 
	 */
	public Ronin() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
	 * 
	 */
	public Ronin(String name) {
		super();
		this.name = name;
	}

	public void work() {
		System.out.println("傘張るよ～。");
	}

	@Override
	public String toString() {
		return "拙者は武州○△□村の浪人、" + name + "ともうす。";
	}

	void learn() {
		System.out.println("塾を開くよ～。");
	}

}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		//ここに適切な処理を記述
		Retainer retainer = new Retainer();
		retainer.learn();

		System.out.println("\n浪人1：");

		//ここに適切な処理を記述
		Ronin ronin = new Ronin();
		ronin.learn();

	}
}
