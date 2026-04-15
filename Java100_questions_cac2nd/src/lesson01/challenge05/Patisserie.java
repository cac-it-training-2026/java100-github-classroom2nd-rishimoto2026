/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		int cit = 30;
		int cho = 30;
		int pis = 30;

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン\t\t\\250・・・残り" + cit + "個");
		System.out.println("ショコラ\t\t\\280・・・残り" + cho + "個");
		System.out.println("ピスターシュ\t\\320・・・残り" + pis + "個");

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン\t\t>");
		String citnum = reader.readLine();
		System.out.print("ショコラ\t\t>");
		String chonum = reader.readLine();
		System.out.print("ピスターシュ\t>");
		String pisnum = reader.readLine();

		System.out.println("\nシトロン\t\t" + citnum + "個");
		System.out.println("ショコラ\t\t" + chonum + "個");
		System.out.println("ピスターシュ\t" + pisnum + "個");

		int citnum2 = Integer.parseInt(citnum);
		int chonum2 = Integer.parseInt(chonum);
		int pisnum2 = Integer.parseInt(pisnum);

		System.out.println("\n合計個数\t" + (citnum2 + chonum2 + pisnum2) + "個");
		System.out.println("合計金額\t" + (citnum2 * 250 + chonum2 * 280 + pisnum2 * 320) + "円");

		System.out.println("\nをお買い上げですね。\n承りました。");

	}

}
