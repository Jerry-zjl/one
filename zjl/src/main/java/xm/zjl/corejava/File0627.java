package xm.zjl.corejava;

import java.util.concurrent.TimeUnit;

public class File0627 {

	private int c = 0;

	public synchronized void method1() {

		for (int i = 0; i < 1000; i++) {
			c++;
		}
		System.out.println("method------>" + c);
	}

	public synchronized void method2() throws InterruptedException {
		for (int i = 0; i < 1000; i++) {
			c++;
		}
		System.out.println("method1------------>" + c);
	}

	public synchronized void method3() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			c++;
			TimeUnit.SECONDS.sleep(2);
		}

	}

	public static void main(String[] args) throws InterruptedException {
		final File0627 file = new File0627();
		new Thread(new Runnable() {
			public void run() {
				try {
					file.method3();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				try {
					file.method2();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		

	}
}
