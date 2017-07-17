package com.wjk;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.zh_cn.假设;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;

/**
 * 日期： 2017年6月13日 时间：下午8:22:24
 */
public class ToDo1 {

	@Before
	public void init() {
		
		System.out.println("111111111111111111111111111111111111111111111");
		System.out.println("ToDo1初始化数据");

	}

	@假设("^test我的任务清单里有(\\d+)个任务$")
	public void test我的任务清单里有_个任务(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@当("^test我完成(\\d+)件任务之后$")
	public void test我完成_件任务之后(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@那么("^test我还剩下(\\d+)件未完成的任务$")
	public void test我还剩下_件未完成的任务(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@After
	public void releaseResource() {
		System.out.println("ToDo1释放 资源");
	}
}
