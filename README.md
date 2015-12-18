# SweepGradientProgress
SweepGradientProgress--圆形颜色渐变的进度条（学习使用SweepGradient）
![圆形的渐变进度条][1]

代码很烂，只是练习下如何写自定义控件

2015年12月6日19:29:38
如何设置进度：

    myProgress = myProgress + 10;
	progress.setProgress(myProgress);
	handler.sendEmptyMessageDelayed(1, 1000);

增加填充颜色的方法setArcColors：

    int[] arcColors = new int[]{
				Color.parseColor("#99cccc"),
				Color.parseColor("#ccffff"),
				Color.parseColor("#ffcccc"),
				Color.parseColor("#6699cc"),
				Color.parseColor("#99ccff"),
				Color.parseColor("#6699cc"),
				Color.parseColor("#cc6699"),
				Color.parseColor("#ffff00")
		};
		progress.setArcColors(arcColors );

效果如下：

![填充颜色progress][2]
 
其实最好把数组里面第一个颜色值 = 最后一个颜色值，过渡能自然点，否则就像上面你看到的那么丑：
如下设置：

    int[] arcColors = new int[]{
				Color.parseColor("#99cccc"),
				Color.parseColor("#ccffff"),
				Color.parseColor("#ffcccc"),
				Color.parseColor("#6699cc"),
				Color.parseColor("#99ccff"),
				Color.parseColor("#6699cc"),
				Color.parseColor("#cc6699"),
				Color.parseColor("#99cccc")
		};

看下效果：

![enter description here][3]

卧槽，就像加了特效，duang! duang !duang,完美

博客地址：
http://www.cnblogs.com/androidsuperman/p/5021872.html

  [1]: http://images2015.cnblogs.com/blog/554581/201512/554581-20151206174605769-265574250.gif
  [2]: http://images2015.cnblogs.com/blog/554581/201512/554581-20151206195027409-1921216229.gif
  [3]: http://images2015.cnblogs.com/blog/554581/201512/554581-20151206215524300-923878272.gif
