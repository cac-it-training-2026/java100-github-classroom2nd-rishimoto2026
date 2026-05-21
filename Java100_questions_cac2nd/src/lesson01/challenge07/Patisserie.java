/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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

		double citnum2 = Double.parseDouble(citnum);
		double chonum2 = Double.parseDouble(chonum);
		double pisnum2 = Double.parseDouble(pisnum);

		System.out.println("\n合計個数\t" + (citnum2 + chonum2 + pisnum2) + "個");
		int sumprice = (int) (citnum2 * 250 + chonum2 * 280 + pisnum2 * 320);
		System.out.println("合計金額\t" + sumprice + "円");

		System.out.println("\nをお買い上げですね。\n承りました。");

		int citrest = (int) (cit - citnum2);
		int chorest = (int) (cho - chonum2);
		int pisrest = (int) (pis - pisnum2);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン\t\t\\250・・・残り" + citrest + "個");
		System.out.println("ショコラ\t\t\\280・・・残り" + chorest + "個");
		System.out.println("ピスターシュ\t\\320・・・残り" + pisrest + "個");

	}

}
