package com.tshick.test.smartlifecycle;

import org.springframework.context.SmartLifecycle;

public class BasicSmartLifecycleBean implements SmartLifecycle {
	public boolean running;
	public boolean autostartup;
	public int phase;

	public BasicSmartLifecycleBean() {
	}
	
	public void setPhase(int phase) {
		this.phase = phase;
	}

	public void start() {
		running = true;
	}

	public void stop() {
		running = false;
	}

	public boolean isRunning() {
		return running;
	}

	public int getPhase() {
		return phase;
	}

	public void setAutoStartup(boolean value) {
		this.autostartup = value;
	}
	
	public boolean isAutoStartup() {
		return autostartup;
	}

	public void stop(Runnable callback) {
		stop();
		callback.run();
	}
}