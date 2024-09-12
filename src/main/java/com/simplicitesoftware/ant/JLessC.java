package com.simplicitesoftware.ant;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import com.inet.lib.less.Less;

/**
 * JLessC Ant task
 * @author Simplicite Software
 */
public class JLessC extends Task {
	private String file;

	/**
	 * Set source file
	 * @param f File path
	 */
	public void setFile(String f) { file = f; }

	private String output;

	/**
	 * Set output file
	 * @param f File path
	 */
	public void setOutput(String f) { output = f; }

	private void writeCSSFile(String css) throws IOException {
		try (FileOutputStream out = new FileOutputStream(output)) {
			out.write(css.getBytes());
		}
		log("CSS file written: " + output);
	}

	@Override
	/**
	 * Execute JLessC task
	 */
	public void execute() {
		if (file == null) throw new BuildException("Missing file");
		try {
			log("Processing LESS file: " + file);
			String css = Less.compile(new File(file), true);
			if (output == null) {
				if (file.endsWith(".less")) {
					output = file.replaceFirst("\\.less$", ".css");
					writeCSSFile(css);
				} else {
					log(css);
				}
			} else {
				writeCSSFile(css);
			}
		} catch (Exception e) {
			throw new BuildException(e);
		}
	}
}