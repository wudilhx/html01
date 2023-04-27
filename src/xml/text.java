package xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.testng.annotations.Test;

import java.util.List;

public class text {
    @Test
    public void cc() throws DocumentException {
//创建一个输入流，读取xml文件生成docment对象
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read("src\\xml\\book.xml");
//        System.out.println(read);
        //通过dom元素获取根元素
        Element rootElement = read.getRootElement();
//        System.out.println(rootElement);
        //通过根元素获取book标签元素
        List<Element> book = rootElement.elements("book");
        for (Element books :book) {
            //把标签对象转换成字符串
            String s = books.asXML();
            System.out.println(s);
            //获取文本内容
            String name = books.elementText("name");
            System.out.println(name);
            String author = books.elementText("author");
            String price = books.elementText("price");
            //获取属性值sn
            String s1 = books.attributeValue("sn");
            System.out.println(s1);
            System.out.println(new book(name,Double.parseDouble(price),author,s1));


        }


//        //获取文本内容
//        String text = element.getText();
//        System.out.println(text);
    }
}