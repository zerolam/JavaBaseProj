package com.zerolam.exception;
/**
 * 测试异常使用案例，明确异常捕捉情况
 * @author Administrator
 */
public class TestException {
	public TestException() {
	}

	@SuppressWarnings("finally")
	boolean testEx() throws Exception {
		boolean ret = true;
		try {
			ret = testEx1();
		} catch (Exception e) {
			System.out.println("testEx, catch exception");
			ret = false;
			throw e;
		} finally {
			System.out.println("testEx, finally; return value=" + ret);
			return ret;
		}
	}

	@SuppressWarnings("finally")
	boolean testEx1() throws Exception {
		boolean ret = true;
		try {
			ret = testEx2();
			if (!ret) {
				return false;
			}
			System.out.println("testEx1, at the end of try");
			return ret;
		} catch (Exception e) {
			System.out.println("testEx1, catch exception");
			ret = false;
			throw e;
		} finally {
			System.out.println("testEx1, finally; return value=" + ret);
			return ret;
		}
	}

	@SuppressWarnings("finally")
	boolean testEx2() throws Exception {
		boolean ret = true;
		try {
			int b = 12;
			for (int i = 2; i >= -2; i--) {
				int c = b / i;
				System.out.println("i=" + i + ";c="+c);
			}
			return true;
		} catch (Exception e) {
			System.out.println("testEx2, catch exception");
			ret = false;
			throw e;
		} finally {
			System.out.println("testEx2, finally; return value=" + ret);
			return ret;
		}
	}

	public static void main(String[] args) {
		TestException testException1 = new TestException();
		try {
			testException1.testEx();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
