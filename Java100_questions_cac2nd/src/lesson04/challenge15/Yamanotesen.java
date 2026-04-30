package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("※※※ 山手線ゲーム ※※※");
		System.out.println("      ゲームスタート！    ");

		String[] stations = { "東京", "新宿", "新橋", "御徒町", "五反田", "秋葉原", "浜松町", "渋谷", "田町", "恵比寿", "有楽町", "目黒", "大崎", "原宿",
				"品川", "目白", "大塚", "上野", "池袋", "日暮里", "西日暮里", "駒込", "田端", "高田馬場", "神田", "鴬谷", "代々木", "新大久保", "巣鴨",
				"高輪ゲートウェイ" };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[] stationFlag = new boolean[stations.length];
		Arrays.fill(stationFlag, true);

		Random rand = new Random();

		boolean hitFlag = false;

		int gameCount = 0;

		do {
			String inputStationName = br.readLine();

			for (int i = 0; i < stations.length; i++) {

				if (stations[i].equals(inputStationName)) {

					if (stationFlag[i]) {

						hitFlag = true;

						stationFlag[i] = false;

						break;

					} else {

						break;
					}
				}
			}
			gameCount++;
			if (!hitFlag || (gameCount == stations.length)) {

				break;
			}

			hitFlag = false;

			while (!hitFlag) {

				int num = rand.nextInt(stations.length);

				if (stationFlag[num]) {

					System.out.println(stations[num]);

					stationFlag[num] = false;

					hitFlag = true;
				}
			}

			gameCount++;
			hitFlag = false;

		} while (gameCount != stations.length);
		if (gameCount == stations.length) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}

	}

}
