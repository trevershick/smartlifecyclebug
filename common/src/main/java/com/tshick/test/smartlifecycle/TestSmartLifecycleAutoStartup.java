package com.tshick.test.smartlifecycle;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("TestSmartLifecycleAutoStartup.xml")
public class TestSmartLifecycleAutoStartup {

	@Autowired
	AutoStartupBean autostartupBean;
	
	@Autowired
	NonAutoStartupBean nonAutostartupBean;

	/**
	 * @see https://jira.springsource.org/browse/SPR-8912
	 */
	@Test
	public void test_dependent_bean_with_autostartup_false_doesnt_start() {
		assertTrue("The auto startup bean should be started", autostartupBean.isRunning());
		assertFalse("The non-autostartup bean isRunning should be false", nonAutostartupBean.isRunning());
	}
}
