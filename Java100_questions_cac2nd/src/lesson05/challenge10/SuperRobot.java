package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Robot {

	public String makeDishes(int num1, int num2, int num3, int num4) {
		if (num1 >= 1 && num2 >= 2 && num3 >= 100 && num4 >= 1) {
			return "麻婆豆腐";
		} else {
			return "";
		}
	}
}

class ClearRobot {
	public void clearTable(int[] ingredients) {
		for (int i = 0; i < ingredients.length; i++) {
			ingredients[i] = 0;
		}
	}
}

public class SuperRobot {

	public static void main(String[] args) throws IOException {

		System.out.println("Rさん：");
		System.out.println("あとかたづけをしてくれるロボットも欲しいところですね。\n");
		System.out.println("G博士：");
		System.out.println("そうれはもう作ってあるぞ。\n");
		System.out.println("Rさん：");
		System.out.println("えっ！どうやって使うんですか？\n");
		System.out.println("G博士：");
		System.out.println("今まで使ってきた材料をまとめて、料理と一緒に渡すときれいにしてくれるんじゃ。\n");
		System.out.println("Rさん：");
		System.out.println("早速やってみます。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("豆板醤の量を入力してください（小さじ）＞");
		String flourNumStr = br.readLine();
		int num1 = Integer.parseInt(flourNumStr);

		System.out.print("\n甜面醤の量を入力してください（大さじ）＞");
		String sugarNumStr = br.readLine();
		int num2 = Integer.parseInt(sugarNumStr);

		System.out.print("\n挽肉の量を入力してください（グラム）＞");
		String eggNumStr = br.readLine();
		int num3 = Integer.parseInt(eggNumStr);

		System.out.print("\n豆腐の量を入力してください（丁）＞");
		String butterNumStr = br.readLine();
		int num4 = Integer.parseInt(butterNumStr);

		//ここでRobotクラスのインスタンスを作り、
		//（インスタンス名はrobot）
		//makeEggDishesを実行する。
		//標準出力でメニューを表示する。
		Robot robot = new Robot();
		String menu = robot.makeDishes(num1, num2, num3, num4);
		if (menu != null) {
			System.out.println("\n" + menu + "が出来ました。");
		} else {
			System.out.println("何も作れません");
		}

		System.out.println("\nあとかたづけをします。\n");
		int[] ingredients = new int[4];
		ingredients[0] = num1;
		ingredients[1] = num2;
		ingredients[2] = num3;
		ingredients[3] = num4;

		ClearRobot clearRobot = new ClearRobot();
		clearRobot.clearTable(ingredients);

		System.out.println("豆板醬  ：小さじ" + ingredients[0]);
		System.out.println("甜面醤  ：大さじ" + ingredients[1]);
		System.out.println("挽肉    ：" + ingredients[2] + "g");
		System.out.println("豆腐 　 ：" + ingredients[3] + "丁");

		System.out.println("\nきれいになりました。");

	}

}
