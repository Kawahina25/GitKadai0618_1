import java.io.FileReader;
import java.io.IOException;

public class sample {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			//ファイルを開く
			fr = new FileReader("aaa.txt");
			//ファイルから１文字読み込む
			int i = fr.read();

			//末尾になるまで読み込んで画面出力
			while(i != -1) {
				char c = (char)i;
				System.out.print(c);
				i = fr.read();
			}
		}catch(IOException e) {
			System.out.println("エラーが発生");
		}finally {
			//最後に閉じる！！！
			try {
				fr.close();
			} catch (IOException e) {
				System.out.println("閉じるの失敗！");
			}
		}
	}

}
