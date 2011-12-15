package com.tshick.test.smartlifecycle;

public class AutoStartupBean extends BasicSmartLifecycleBean {
	private NonAutoStartupBean nonAutoStartupBean;

	public AutoStartupBean() {
		setAutoStartup(true);
	}

	public NonAutoStartupBean getNonAutoStartupBean() {
		return nonAutoStartupBean;
	}

	public void setNonAutoStartupBean(NonAutoStartupBean nonAutoStartupBean) {
		this.nonAutoStartupBean = nonAutoStartupBean;
	}
	
	
}