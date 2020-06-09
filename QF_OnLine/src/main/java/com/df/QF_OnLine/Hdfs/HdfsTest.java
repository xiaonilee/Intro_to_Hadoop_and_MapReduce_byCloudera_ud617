package com.df.QF_OnLine.Hdfs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

import org.apache.commons.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * 用java代码操作hdfs文件系统
 * @author xiaoni
 *
 */

public class HdfsTest {
	public static void main(String[] args) throws IOException {
		//readFileToConsole("/test/operator.sh");
		readFileToLocal("/test/operator.sh");
	}
	
	//读取hdfs文件系统中的文件
	public static void readFileToConsole(String path) throws IOException {
		//获取配置
		Configuration conf = new Configuration();
		//配置
		conf.set("fs.defaultFS", "hdfs://127.0.0.1:9000");
		//获取文件系统的操作对象
		FileSystem fs = FileSystem.get(conf); 
		
		//具体对文件的操作
		FSDataInputStream fis = fs.open(new Path(path));
		IOUtils.copy(fis, System.out, 4096);
	}
	
	//读取hdfs文件系统中的文件
		public static void readFileToLocal(String path) throws IOException {
			FSDataInputStream fis = null;
			OutputStream out = null;
			
			try {
				//获取配置
				Configuration conf = new Configuration();
				//获取文件系统的操作对象
				FileSystem fs = FileSystem.get(new URI("hdfs://127.0.0.1:9000"), conf, "root");
				
				//具体对文件的操作
				fis = fs.open(new Path(path));
				out = new FileOutputStream(new File("/home/xiaoni/Desktop/shell/test01.text"));
				IOUtils.copy(fis, out, 4096);
				} catch (Exception e) {
					
				} finally {
					
				}
			}
}
