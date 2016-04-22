package benworks.java.lang.thread.daemon;

/**
 * @author Ben
 * @date 2016年4月18日下午9:32:29
 */
public class TestDemo {
	public static void main(String[] args) {
		Thread t1 = new MyCommon();
		Thread t2 = new Thread(new MyDaemon());
		t2.setDaemon(true); // 设置为守护线程
		t2.start();
		t1.start();
	}
}

class MyCommon extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("线程1第" + i + "次执行！");
			try {
				Thread.sleep(7);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyDaemon implements Runnable {

	public void run() {
		for (long i = 0; i < 9999999L; i++) {
			System.out.println("后台线程第" + i + "次执行！");
			try {
				Thread.sleep(7);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
