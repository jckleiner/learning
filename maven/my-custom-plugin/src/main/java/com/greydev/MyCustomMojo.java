package com.greydev;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;


/**
 * Says "Hi" to the user.
 */
@Mojo(name = "sayhi", defaultPhase = LifecyclePhase.COMPILE)
public class MyCustomMojo extends AbstractMojo {
	public void execute() throws MojoExecutionException {
		getLog().info("Hello, world.");
	}
}

