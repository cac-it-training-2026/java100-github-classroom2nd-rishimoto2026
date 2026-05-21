/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		int[] sales = new int[3];
		sales[0] = (int) (citnum2 * 250);
		sales[1] = (int) (chonum2 * 280);
		sales[2] = (int) (pisnum2 * 320);

		int[] ratio = new int[3];
		ratio[0] = sales[0] * 100 / sumprice;
		ratio[1] = sales[1] * 100 / sumprice;
		ratio[2] = sales[2] * 100 / sumprice;

		System.out.println("閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");
		System.out.println("\n売上の割合");
		System.out.println("売上合計\t\\" + sumprice);
		System.out.println("\n内訳");
		System.out.println("シトロン\t\t\\" + sales[0] + "・・・" + ratio[0] + "%");
		System.out.println("ショコラ\t\t\\" + sales[1] + "・・・" + ratio[1] + "%");
		System.out.println("ピスターシュ\t\\" + sales[2] + "・・・" + ratio[2] + "%");

		//System.out.println("シトロン\t\t\\" + sales[0] + "・・・" + (sales[0] * 100 / sumprice) + "%");
		//System.out.println("ショコラ\t\t\\" + sales[1] + "・・・" + (sales[1] * 100 / sumprice) + "%");
		//System.out.println("ピスターシュ\t\\" + sales[2] + "・・・" + (sales[2] * 100 / sumprice) + "%");
	}

}
