package batch_address;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlPath {
	public static void main(String[] args) {
		String path = "/config/test.xml";
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); //팩토리는 new = 안됨  newInstance해야함 =>
	                              //DocumentBuilderFactory = 다큐멘트를 생성하는 공장
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputStream is = XmlPath.class.getResourceAsStream(path);//XmlPath.class는 현 클래스 이름이다
			Document doc = db.parse(is);
			NodeList foodList = doc.getElementsByTagName("foods");
			
			for(int i=0,max=foodList.getLength();i<max;i++) {
				Node food = foodList.item(i);
				System.out.println(food.getTextContent());
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
}
