/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン\t\t\\250・・・残り" + (cit - citnum2) + "個");
		System.out.println("ショコラ\t\t\\280・・・残り" + (cho - chonum2) + "個");
		System.out.println("ピスターシュ\t\\320・・・残り" + (pis - pisnum2) + "個");

	}

}
