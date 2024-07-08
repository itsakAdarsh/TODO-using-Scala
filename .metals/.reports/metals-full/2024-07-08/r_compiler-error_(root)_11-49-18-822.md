file:///A:/developement/scala%20project/todo/todolist/app/controllers/TaskList1.scala
### java.lang.NullPointerException: Cannot invoke "scala.reflect.internal.Types$Type.typeSymbol()" because "tp" is null

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.14
Classpath:
<WORKSPACE>\todolist\conf [exists ], <WORKSPACE>\todolist\.bloop\root\bloop-bsp-clients-classes\classes-Metals-v_vVez2VSKS-audUE6L4-w== [exists ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.9.10\semanticdb-javac-0.9.10.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.14\scala-library-2.13.14.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\playframework\twirl\twirl-api_2.13\2.0.6\twirl-api_2.13-2.0.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\playframework\play-server_2.13\3.0.4\play-server_2.13-3.0.4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\playframework\play-logback_2.13\3.0.4\play-logback_2.13-3.0.4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\playframework\play-pekko-http-server_2.13\3.0.4\play-pekko-http-server_2.13-3.0.4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\playframework\play-filters-helpers_2.13\3.0.4\play-filters-helpers_2.13-3.0.4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\playframework\play-guice_2.13\3.0.4\play-guice_2.13-3.0.4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-xml_2.13\2.2.0\scala-xml_2.13-2.2.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\playframework\play_2.13\3.0.4\play_2.13-3.0.4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\ch\qos\logback\logback-classic\1.5.6\logback-classic-1.5.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\playframework\play-streams_2.13\3.0.4\play-streams_2.13-3.0.4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\apache\pekko\pekko-http-core_2.13\1.0.1\pekko-http-core_2.13-1.0.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\google\inject\guice\6.0.0\guice-6.0.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\google\inject\extensions\guice-assistedinject\6.0.0\guice-assistedinject-6.0.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\playframework\play-build-link\3.0.4\play-build-link-3.0.4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\playframework\play-configuration_2.13\3.0.4\play-configuration_2.13-3.0.4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\slf4j\slf4j-api\2.0.13\slf4j-api-2.0.13.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\slf4j\jul-to-slf4j\2.0.13\jul-to-slf4j-2.0.13.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\slf4j\jcl-over-slf4j\2.0.13\jcl-over-slf4j-2.0.13.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\apache\pekko\pekko-actor_2.13\1.0.2\pekko-actor_2.13-1.0.2.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\apache\pekko\pekko-actor-typed_2.13\1.0.2\pekko-actor-typed_2.13-1.0.2.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\apache\pekko\pekko-slf4j_2.13\1.0.2\pekko-slf4j_2.13-1.0.2.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\apache\pekko\pekko-serialization-jackson_2.13\1.0.2\pekko-serialization-jackson_2.13-1.0.2.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\fasterxml\jackson\core\jackson-core\2.14.3\jackson-core-2.14.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\fasterxml\jackson\core\jackson-annotations\2.14.3\jackson-annotations-2.14.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.14.3\jackson-datatype-jdk8-2.14.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.14.3\jackson-datatype-jsr310-2.14.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\fasterxml\jackson\core\jackson-databind\2.14.3\jackson-databind-2.14.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\fasterxml\jackson\dataformat\jackson-dataformat-cbor\2.14.3\jackson-dataformat-cbor-2.14.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\fasterxml\jackson\module\jackson-module-parameter-names\2.14.3\jackson-module-parameter-names-2.14.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\fasterxml\jackson\module\jackson-module-scala_2.13\2.14.3\jackson-module-scala_2.13-2.14.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\jsonwebtoken\jjwt-api\0.11.5\jjwt-api-0.11.5.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\jsonwebtoken\jjwt-impl\0.11.5\jjwt-impl-0.11.5.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\jsonwebtoken\jjwt-jackson\0.11.5\jjwt-jackson-0.11.5.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\playframework\play-json_2.13\3.0.4\play-json_2.13-3.0.4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\google\guava\guava\32.1.3-jre\guava-32.1.3-jre.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\javax\inject\javax.inject\1\javax.inject-1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\typesafe\ssl-config-core_2.13\0.6.1\ssl-config-core_2.13-0.6.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\1.1.2\scala-parser-combinators_2.13-1.1.2.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\ch\qos\logback\logback-core\1.5.6\logback-core-1.5.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\reactivestreams\reactive-streams\1.0.4\reactive-streams-1.0.4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\apache\pekko\pekko-stream_2.13\1.0.2\pekko-stream_2.13-1.0.2.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\apache\pekko\pekko-parsing_2.13\1.0.1\pekko-parsing_2.13-1.0.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\parboiled\parboiled_2.13\2.5.0\parboiled_2.13-2.5.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\jakarta\inject\jakarta.inject-api\2.0.1\jakarta.inject-api-2.0.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\aopalliance\aopalliance\1.0\aopalliance-1.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\google\errorprone\error_prone_annotations\2.21.1\error_prone_annotations-2.21.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\playframework\play-exceptions\3.0.4\play-exceptions-3.0.4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\typesafe\config\1.4.3\config-1.4.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\lz4\lz4-java\1.8.0\lz4-java-1.8.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\thoughtworks\paranamer\paranamer\2.8\paranamer-2.8.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\playframework\play-functional_2.13\3.0.4\play-functional_2.13-3.0.4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.14\scala-reflect-2.13.14.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\google\guava\failureaccess\1.0.1\failureaccess-1.0.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\google\guava\listenablefuture\9999.0-empty-to-avoid-conflict-with-guava\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\google\code\findbugs\jsr305\3.0.2\jsr305-3.0.2.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\checkerframework\checker-qual\3.37.0\checker-qual-3.37.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\google\j2objc\j2objc-annotations\2.8\j2objc-annotations-2.8.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\apache\pekko\pekko-protobuf-v3_2.13\1.0.2\pekko-protobuf-v3_2.13-1.0.2.jar [exists ]
Options:
-deprecation -unchecked -encoding utf8 -Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 458
uri: file:///A:/developement/scala%20project/todo/todolist/app/controllers/TaskList1.scala
text:
```scala
package controllers

import javax.inject._
import play.api.mvc.ControllerComponents
import play.api.mvc.BaseController
import Models.TaskListInMemonryModel

@Singleton
class TaskList1 @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def taskList=Action {
    val tasks = TaskListInMemonryModel.getTasks("Mark")
    Ok(views.html.taskList1(tasks))
  }

  def login()=Action{
    Ok(views.html.login1())
  }
  def signup()@@
  def validateLogin1()=Action{
    Ok("Inside validation")
  }

  def validateLogin() = Action { req =>
    val formData = req.body.asFormUrlEncoded
    formData.map { args =>
      val username = args.get("username").head
      val password = args.get("password").head
      if(TaskListInMemonryModel.validateUser(username.head,password.head)){
        Redirect(routes.TaskList1.taskList())
      }
      else{
        Ok("Incvalid user and pass")
      }
    }.getOrElse { 
      Redirect(routes.TaskList1.login())
    }
  }

  def product(productType:String,id:Int)=Action{
    Ok(s"Product trype : $productType , Product Num : $id")
  }
}

```



#### Error stacktrace:

```
scala.reflect.internal.Definitions$DefinitionsClass.isByNameParamType(Definitions.scala:428)
	scala.reflect.internal.TreeInfo.isStableIdent(TreeInfo.scala:140)
	scala.reflect.internal.TreeInfo.isStableIdentifier(TreeInfo.scala:113)
	scala.reflect.internal.TreeInfo.isPath(TreeInfo.scala:102)
	scala.tools.nsc.interactive.Global.stabilizedType(Global.scala:974)
	scala.tools.nsc.interactive.Global.typedTreeAt(Global.scala:822)
	scala.meta.internal.pc.SignatureHelpProvider.signatureHelp(SignatureHelpProvider.scala:23)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$signatureHelp$1(ScalaPresentationCompiler.scala:332)
```
#### Short summary: 

java.lang.NullPointerException: Cannot invoke "scala.reflect.internal.Types$Type.typeSymbol()" because "tp" is null