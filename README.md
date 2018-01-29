# serializable
My first GitHub project
序列化不同对象到同一文件中，并利用RandomAccessFile 的seek 按位置读取，并且反序列化的过程
实现了序列化List对象

`private int addItemToArr(StringBuilder dayPrint, int flag, ScheduleItem item, int day) {
		// 遍历当天数组，如果电影名字之前存在，就不打印出来
		for (int i = 0; i < items[day].length; i++) {
			// 如果数组该位置还是null 的话会出现空指针异常
			// 所以此处new了一个Movie并且setName避免空指针异常
			if (items[day][i] == null) {
				items[day][i] = new ScheduleItem();
				Movie m = new Movie();
				m.setMovieName("");
				items[day][i].setMovie(m);
			}
			// 如果数组元素的电影名与item的电影名一致，直接跳出循环
			if (items[day][i].getMovie().getMovieName().equals(item.getMovie().getMovieName())) {
				break;
			} else if (!items[day][i].getMovie().getMovieName().equals(item.getMovie().getMovieName())
					&& i == items[0].length - 1) {
				// 如果遍历到数组最后一位且电影名不等，就拼接字符串
				dayPrint.append(item.getMovie().getMovieName() + "\t" + "  " + "\t");
			}
		}
		items[day][flag] = item;
		flag++;
		return flag;
	}`
  ##这里的代码O不OK
  
  |给大家来个表格|diyici|用markdown|
  |---|:---|:---|
  |ojbk|第一次|试一下效果|
  
 [去百度](http://www.baidu.com/)
