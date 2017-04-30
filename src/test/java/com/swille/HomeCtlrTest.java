package com.swille;


import com.swille.controllers.HomeCtlr;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HomeCtlrTest {

	@Test
	public void homeCtlr() {
        HomeCtlr ctlr = new HomeCtlr();
        String resp = ctlr.home();
        assertThat(resp, is("Ready to work"));
    }

}
