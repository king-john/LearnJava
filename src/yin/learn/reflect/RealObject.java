package yin.learn.reflect;

public class RealObject implements Interface {

	@Override
	public void doSomething() {
		System.out.println("doSomething");
	}

	@Override
	public void somethingElse(String args) {
		// TODO Auto-generated method stub
		System.out.println("somethingElse"+args);
	}

}
