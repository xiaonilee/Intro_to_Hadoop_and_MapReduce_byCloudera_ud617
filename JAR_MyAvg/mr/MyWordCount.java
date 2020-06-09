package com.df.QF_OnLine.mr;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * wordcount
 * @author xiaoni
 *
 *
 *input
 *
 *words
 *hello qianfeng hello world
 *hi qianfeng hi world
 *best best best
 *
 *map阶段
 *行偏移量：每一行的第一个字母距离该文件的首位置的距离
 *Mapper<KEYIN, VALUEIN, KEYOUT< VALUEOUT>
 *map阶段的输入：
 *
 *0  hello qianfeng hello world
 *27 hi qianfeng hi world
 *47 best best best
 *
 *map阶段的输出：
 *
 *reduce阶段：
 *reduce阶段的输入：
 *		reduce阶段的输入key类型必须和map阶段的输出key类型相同，
 *		reduce阶段输入value类型必须和map阶段输出value类型相同
 *		reduce阶段最终输出key类型
 *		reduce阶段最终输出value类型
 *
 *reduce阶段的输出
 *
 */


public class MyWordCount {
	
	public static class MyMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
		public static Text k = new Text();
		public static IntWritable v = new IntWritable();
		@Override
		protected void map(LongWritable key, Text value, Context context)
				throws IOException, InterruptedException {
			//1，从输入数据中获取每一个文件的每一行的值
			String line = value.toString();
			//2， 对每一行数据进行拆分
			String [] words = line.split(" ");
			//3， 循环处理
			for (String word : words) {
				k.set(word);
				v.set(1);
				//map output
				context.write(k, v);								
			}
		}		
	}
	
	public static class MyReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

		@Override
		protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
			//自定义一个计数器
			int counter = 0;
			// loop
			for (IntWritable i : values) {
				counter += i.get();
			} 
			// reduce output
			context.write(key, new IntWritable(counter));					
		}		
	}
	//drive
	public static void main (String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		//获取配置对象信息
		Configuration conf = new Configuration();
		//获取job对象
		Job job = Job.getInstance(conf, "mywordcount");
		//设置job运行主类
		job.setJarByClass(MyWordCount.class);
		// set map
		job.setMapperClass(MyMapper.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		FileInputFormat.addInputPath(job, new Path(args[0]));
		
		// set reduce
		job.setReducerClass(MyReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		
		// submit job & print
		int isok = job.waitForCompletion(true)? 0 : 1;
		//exit job
		System.exit(isok);
	}
}
