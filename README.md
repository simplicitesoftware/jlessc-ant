Apache Ant task for JLessc
==========================

Build
-----

	mvn clean package

Usage
-----

```xml
<taskdef name="jlessc" classname="com.inet.lib.less.LessAntTask">
	<classpath>
		<pathelement location="<path to>/jlessc-x.y.jar"/>
		<pathelement location="<path to>/jlessc-ant-x.y.jar"/>
	</classpath>
</taskdef>
 
<target name="test">
	<jlessc file="<path to>/mytest.less"[ output="<path to>/mytest.css"]/>
</target>
```
