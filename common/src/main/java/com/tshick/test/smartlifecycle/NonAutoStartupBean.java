package com.tshick.test.smartlifecycle;

public class NonAutoStartupBean extends BasicSmartLifecycleBean {
	public NonAutoStartupBean() {
		setAutoStartup(false);
	}
}