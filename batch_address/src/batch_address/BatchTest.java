package batch_address;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BatchTest {

	public static void main(String[] args) throws IOException {
		String path = "C:\\jsp_study\\zipcode_DB";
		File f = new File(path);
		System.out.println("폴더 유무 : " + f.isDirectory());
		System.out.println("대상폴더 유무 : " + f.exists());
		File[] fList = f.listFiles();
		List<List<String>> list = new ArrayList<List<String>>();
		for(File ff:fList) {
			if(ff.getName().endsWith("광주광역시.txt")) {
				list = new ArrayList<List<String>>();
				FileInputStream fis = new FileInputStream(ff);
				InputStreamReader fr = new InputStreamReader(fis,"euc-kr");
				BufferedReader br = new BufferedReader(fr);
				String line;
				br.readLine();
				while((line=br.readLine())!=null) {
					String[] strs = line.split("\\|");
					List<String> strList = new ArrayList<String>();
					for(int i=0,max=9;i<=max;i++) {
						strList.add(strs[i]);
					}
					strList.add(strs[11]);
					strList.add(strs[12]);
					list.add(strList);
				}
				br.close();
				fr.close();
				
				AddrListDAO aldao = new AddrListDAOImpl();
				int totalInsertCnt = aldao.insertDAOBatch(list);
				System.out.println("입력할 갯수 : " + list.size());
				System.out.println("입력된 갯수 : " + totalInsertCnt);
				
				System.out.println("exit");
			}
		}
	}
}
