package com.wjk;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.zh_cn.假设;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;

/**
 *	日期： 2017年6月6日
 *	时间：下午11:09:22
 */
public class ToDo {
	
	@Before
	public void init(){
		System.out.println(Thread.currentThread().getName());
		System.out.println("初始化数据");
		
	}
	
	@假设("^我的任务清单里有(\\d+)个任务$")
	public void 我的任务清单里有_个任务(int arg1) throws Throwable {
		System.out.println("我的任务清单里面有："+arg1);
	}

	@当("^我完成(\\d+)件任务之后$")
	public void 我完成_件任务之后(int arg1) throws Throwable {
		System.out.println("我完成："+arg1);
	}

	@那么("^我还剩下(\\d+)件未完成的任务$")
	public void 我还剩下_件未完成的任务(int arg1) throws Throwable {
		System.out.println("我还剩下："+arg1);
	}
	
	@After
	public void releaseResource(){
		System.out.println("释放 资源");
	}
}
