![Simplicit&eacute; Software](https://www.simplicite.io/resources/logos/logo250.png)
***

Apache Ant task for JLessC
==========================

This is an Apache Ant task for the [JLessC](https://github.com/i-net-software/jlessc) Less compiler.

Usage
-----

In your project's `build.xml`, define the `jlessc` task:

```xml
<taskdef name="jlessc" classname="com.simplicite.ant.JLessC">
	<classpath>
		<pathelement location="<path to>/jlessc-x.y.jar"/>
		<pathelement location="<path to>/jlessc-ant-x.y.jar"/>
	</classpath>
</taskdef>
 ```
 
 Then use it like this:
 
 ```xml
<target name="test">
	<jlessc file="<path to>/mytest.less"[ output="<path to>/mytest.css"]/>
</target>
```

License
=======

Copyright 2014-2024 Simplicit&eacute; Software

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at:

[](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.