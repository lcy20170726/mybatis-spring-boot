package tk.mybatis.springboot.test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.Thumbnails.Builder;
import net.coobird.thumbnailator.geometry.Positions;

public class Demo {

	@Test
	public void run() throws Exception{
		//创建图片文件(此处为1024×768px的图片)和处理后的图片文件  
//        File fromPic=new File("D:\\picture\\7e5e147ee3f19382a30165d1d469d0a9.jpeg");
        File fromPic=new File("D:\\picture\\11.jpeg");
       
        File toPic=new File("D:\\picture\\112110034.jpeg"); 
		//File file = new File(pathname);
        //缩小 200*300
		/*Thumbnails.of(fromPic)  
	    .size(200, 300)  
	    .toFile(toPic);*/
        
        //放大 2056*2048
		/*Thumbnails.of(fromPic)
	    .size(2056, 3000)
	    .toFile(toPic);*/
		
		//按比例缩小 0.75倍
		//Thumbnails.of(fromPic).scale(0.75F).toFile(toPic);
	  
		//不按照比例，指定大小进行缩放
		/*Thumbnails.of(fromPic)  
	    .size(2056, 3000).keepAspectRatio(true)
	    .toFile(toPic);*/
		//旋转  rotate(角度),正数：顺时针负数：逆时针  
		/*Thumbnails.of(fromPic)  
	    .size(2056, 3000).keepAspectRatio(true).rotate(90)
	    .toFile(toPic);*/
		
		
		//watermark(位置，水印图，透明度)  
		/*Thumbnails.of("D:\\picture\\7e5e147ee3f19382a30165d1d469d0a9.jpeg")  
		    .size(1280,1024)  
		    .watermark(Positions.BOTTOM_RIGHT,ImageIO.read(new File("D:\\picture\\53f48500N2509ad7a.jpg")),0.1f)  
		    .outputQuality(0.2f)  
		    .toFile("D:\\picture\\t.jpg");*/  
		//图片尺寸不变，压缩图片文件大小outputQuality实现,参数1为最高质量  
		Thumbnails.of(fromPic).scale(1f).outputQuality(1f).toFile(toPic);
	}
	
	@Test
	public void run2() throws Exception{
		
		String imagePath = "D:\\picture\\7e5e147ee3f19382a30165d1d469d0a9.jpeg";  
		BufferedImage image = ImageIO.read(new File(imagePath));  
		Builder<BufferedImage> builder = null;  
		  
		int imageWidth = image.getWidth();  
		int imageHeitht = image.getHeight();  
		if ((float)300 / 400 != (float)imageWidth / imageHeitht) {  
		    if (imageWidth > imageHeitht) {  
		        image = Thumbnails.of(imagePath).height(300).asBufferedImage();  
		    } else {  
		        image = Thumbnails.of(imagePath).width(400).asBufferedImage();  
		    }  
		    builder = Thumbnails.of(image).sourceRegion(Positions.CENTER, 400, 300).size(400, 300);  
		} else {  
		    builder = Thumbnails.of(image).size(400, 300);  
		}  
		builder.outputFormat("jpeg").toFile("D:\\picture\\1121133");  
	}
	@Test
	public void run3() throws Exception{
		Thumbnails.of("F:\\image\\IMG_20131229_114806.png")  
	    .forceSize(400, 300) 
	    .toFile("D:\\picture\\1121133");  
	}
}
