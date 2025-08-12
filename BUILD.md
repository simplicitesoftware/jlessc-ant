![Simplicit&eacute; Software](https://platform.simplicite.io/logos/logo250.png)
***

Apache Ant task for JLessC
==========================

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=jlessc-ant&metric=alert_status)](https://sonarcloud.io/dashboard?id=jlessc-ant)

Build
-----

	rm -fr target
	mvn clean package

Test
----

	mvn dependency:copy-dependencies
	cd src/test/resources
	ant -Djlessc.lib.version=x.y -Djlessc.task.version=x.y.z test

where the above `x.y[.z]` version numbers correspond to the version numbers of the JLessC lib and of the Ant task (see the `pom.xml`).

Publish
-------

	mvn deploy

**Note**: before publishing make sure you have defined the `central` server with credentials in yous Maven's `setting.xml`, e.g.:

```text
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 https://maven.apache.org/xsd/settings-1.0.0.xsd">
(...)
  <servers>
    <server>
      <id>central</id>
      <username><your user token name></username>
      <password><your user token></password>
    </server>
  </servers>
(...)
</settings>
```

Such credentials can be generated on your [Sonatype account page](https://central.sonatype.com/account)

If everything works fine you should see the deployment on your [Sonatype publishing page](https://central.sonatype.com/publishing/deployment]
and you can publish it.