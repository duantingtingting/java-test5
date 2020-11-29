# java-test5

##实验目的 
掌握字符串String及其方法的使用
掌握文件的读取/写入方法
掌握异常处理结构

##实验内容
文件A包括两部分内容：
一是学生的基本信息；
二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：
每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
允许提供输入参数，统计古诗中某个字或词出现的次数
输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
考虑操作中可能出现的异常，在程序中设计异常处理程序

##实验方法
public static void write() throws Exception {
   File file = new File("C:\\Users\\Admin\\Desktop\\长恨歌B.txt");
   FileInputStream fis = new FileInputStream(file);
   byte[] buf = new byte[1024];
   int len = -1;
   StringBuffer sbuf = new StringBuffer("");
   while ((len = (fis.read(buf))) != -1) {
    sbuf.append(new String(buf, 0, len));
   }
   fis.close();
   StringBuilder file1 = new StringBuilder(sbuf.toString());
   File file0 = new File("C:\\Users\\Admin\\Desktop\\长恨歌A.txt");
   FileOutputStream fos = new FileOutputStream(file0);
    int last = file1.length();
          for(int i = 7; i <last+60 ; i+=18) {
              file1.insert(i,'，');
              file1.insert(i+8,'。');
              file1.insert(i+9,'\r');
              file1.insert(i+10,'\n');
          }
              System.out.print(file1.toString());
   fos.write(file1.toString().getBytes());
   fos.close();
   
   ##实验感想 
   通过这次的实验我掌握字符串String及其方法的使用，掌握文件的读取/写入方法，并且利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作。复习了采用交互式方式实例化某学生的方法，受益颇多。
