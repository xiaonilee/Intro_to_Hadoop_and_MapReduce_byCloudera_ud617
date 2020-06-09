package com.df.QF_OnLine.mr;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;

import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


/**
 * 将汽车生产流水线的三个时间段的记录算一个平均值。
 * 
 * 
 * 
 * @author xiaoni
 *
 *L   z   w   y
 *L_1 393 430 276
 *L-2 388 560 333
 *L_3 450 600 312
 *
 *
 */

public class AvgDemo {
	public static class MyMapper extends Mapper<LongWritable, Text, Text, FloatWritable> {
		public static Text k = new Text();
		public static FloatWritable v = new FloatWritable();
		
		
		//只在map阶段执行之前执行一次（用于初始化等一次性操作）
		@Override
		protected void setup(Context context)
				throws IOException, InterruptedException {			
		}

		@Override
		protected void map(LongWritable key, Text value, Context context)
				throws IOException, InterruptedException {
			//1，从输入数据中获取每一个文件的每一行的值
			String line = value.toString();
			//2， 对每一行数据进行拆分
			String [] words = line.split("\t");
			//3， 处理
			String lineName = words[0];
			int z = Integer.parseInt(words[1]);
			int w = Integer.parseInt(words[2]);
			int y = Integer.parseInt(words[3]);
			k.set(lineName);
			float avg = (float)((z+w+y)*1.0/(words.length-1));
			v.set(avg);
			context.write(k, v);						
		}
		
		//在更个map执行之后执行一次
		@Override
		protected void cleanup(Context context)
				throws IOException, InterruptedException {
		}		
	}
	
	public static class MyReducer extends Reducer<Text, FloatWritable, Text, FloatWritable> {
		
		
		//在reduce阶段之前执行，仅一次
		@Override
		protected void setup(Context context)
				throws IOException, InterruptedException {
			context.write(new Text("生产线 平均生产值"), new FloatWritable());
		}

		@Override
		protected void reduce(Text key, Iterable<FloatWritable> values, Context context) 
				throws IOException, InterruptedException {
			
			// reduce output
			context.write(key, new FloatWritable(values.iterator().next().get()));					
		}
		
		//在reduce执行之后执行一次，仅一次
		@Override
		protected void cleanup(Context context)
				throws IOException, InterruptedException {
		}				
	}
	//drive
	public static void main (String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		//获取配置对象信息
		Configuration conf = new Configuration();
		//获取job对象
		Job job = Job.getInstance(conf, "myAvg");
		//设置job运行主类
		job.setJarByClass(MyWordCount.class);
		// set map
		job.setMapperClass(MyMapper.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(FloatWritable.class);
		FileInputFormat.addInputPath(job, new Path(args[0]));
		
		// set reduce
		job.setReducerClass(MyReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(FloatWritable.class);
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		
		// submit job & print
		int isok = job.waitForCompletion(true)? 0 : 1;
		//exit job
		System.exit(isok);
	}

}
