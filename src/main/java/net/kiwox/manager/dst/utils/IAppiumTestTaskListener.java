package net.kiwox.manager.dst.utils;

import net.kiwox.manager.dst.wrappers.AppiumTestTaskItem;

public interface IAppiumTestTaskListener {
	
	boolean runTest(long probeId, AppiumTestTaskItem item, boolean onlyPing) throws InterruptedException;
	
	void markDisconnected(long testResultId);
	
}
