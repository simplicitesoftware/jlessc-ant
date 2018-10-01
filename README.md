![Simplicit&eacute; Software](https://www.simplicite.io/resources/logos/logo250.png)
***

Apache Ant task for JLessC
==========================

This is an Apache Ant task for the [JLessC](https://github.com/i-net-software/jlessc) Less compiler.

Build
-----

	mvn clean package

Usage
-----

```xml
<taskdef name="jlessc" classname="com.simplicite.ant.JLessCAntTask">
	<classpath>
		<pathelement location="<path to>/jlessc-x.y.jar"/>
		<pathelement location="<path to>/jlessc-ant-x.y.jar"/>
	</classpath>
</taskdef>
 
<target name="test">
	<jlessc file="<path to>/mytest.less"[ output="<path to>/mytest.css"]/>
</target>
```
