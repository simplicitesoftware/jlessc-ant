package com.simplicite.ant;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import com.inet.lib.less.Less;

public class JLesscAntTask extends Task {
	String file;
	public void setFile(String f) { file = f; }

	String output;
	public void setOutput(String f) { output = f; }

	private void writeCSSFile(String css) throws IOException {
		FileOutputStream out = new FileOutputStream(output);
		out.write(css.getBytes());
		out.close();
		log("CSS file written: " + output);
	}

	@Override
	public void execute() {
		if (file == null) throw new BuildException("Missing file");
		try {
			log("Processing LESS file: " + file);
			String css = Less.compile(new File(file), true);
			if (output == null) {
				if (file.endsWith(".less")) {
					output = file.replaceFirst("\\.less$", ".css");
					writeCSSFile(css);
				} else
					log(css);
			} else
				writeCSSFile(css);
		} catch (Exception e) {
			throw new BuildException(e);
		}
	}
}