// Source: http://www.java-tips.org/java-se-tips/javax.xml.parsers/how-to-read-xml-file-in-java.html
// http://www.itblogging.de/java/java-und-xml-tutorial/

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RatpesXML {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			  File file = new File("y:\\Projekte\\Ratpes\\GO_CONS_EGG_NOM_1b_20100116T011733_20100116T024716_0002.EEF.xml");
			  //File file = new File("y:\\Projekte\\Ratpes\\GO_CONS_tiny.xml");
			  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			  DocumentBuilder db = dbf.newDocumentBuilder();
			  Document doc = db.parse(file);
			  doc.getDocumentElement().normalize();
			  NodeList nodeLst = doc.getElementsByTagName("EGG_NLA_1i");
			  
			  System.out.println("Tt_GPS X Y Z A1 A2 A3 A4 A5 A6");
			  for (int s = 0; s < nodeLst.getLength(); s++) {
				  Element fstElmnt = (Element) nodeLst.item(s);
				  String tt_gps = fstElmnt.getElementsByTagName("Tt_GPS").item(0).getTextContent().trim();
				  String x = fstElmnt.getElementsByTagName("X").item(0).getTextContent().trim();
				  String y = fstElmnt.getElementsByTagName("Y").item(0).getTextContent().trim();
				  String z = fstElmnt.getElementsByTagName("Z").item(0).getTextContent().trim();
				  String acc1 = fstElmnt.getElementsByTagName("A1").item(0).getTextContent().trim();
				  String acc2 = fstElmnt.getElementsByTagName("A2").item(0).getTextContent().trim();
				  String acc3 = fstElmnt.getElementsByTagName("A3").item(0).getTextContent().trim();
				  String acc4 = fstElmnt.getElementsByTagName("A4").item(0).getTextContent().trim();
				  String acc5 = fstElmnt.getElementsByTagName("A5").item(0).getTextContent().trim();
				  String acc6 = fstElmnt.getElementsByTagName("A6").item(0).getTextContent().trim();
				  System.out.println(tt_gps + " " + x + " " + y + " " + z + " " + acc1 + " " + acc2 + " " + acc3 + " " + acc4 + " " + acc5+ " " + acc6);
				  }

			  
			  } catch (Exception e) {
			    e.printStackTrace();
			  }
			 }
	

}
