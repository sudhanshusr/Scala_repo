//Organization
organization := "com.cybage.hellosbt"

//Version of your project
version := "0.1.0"

//Scala version
scalaVersion := "2.11.6"

//Name of Project
name := "Scala_test_plugin_created"

jacoco.settings


libraryDependencies ++= 
			Seq("junit" % "junit" % "4.10",
			"com.novocode" % "junit-interface" % "0.11" % Test,
				"org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
    		)
    		
    		
libraryDependencies +="io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.6" % "test"

libraryDependencies +="io.gatling" % "gatling-test-framework"  % "2.1.6" % "test"

enablePlugins(GatlingPlugin)
    		
