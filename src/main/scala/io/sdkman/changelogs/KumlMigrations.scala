package io.sdkman.changelogs

import com.github.mongobee.changeset.{ChangeLog, ChangeSet}
import com.mongodb.client.MongoDatabase

@ChangeLog(order = "095")
class KumlMigrations {
  @ChangeSet(
    order = "001",
    id = "001_add_kuml_candidate",
    author = "betschwa"
  )
  def migration001(implicit db: MongoDatabase) =
    Candidate(
      candidate = "kuml",
      name = "kUML",
      description =
        "A Kotlin-native DSL for UML 2.x, SysML 2, and C4 architecture diagrams. Models are plain Kotlin scripts: type-safe, refactorable, diff-friendly, and LLM-ready. The `kuml` CLI renders diagrams to SVG/PNG, validates models, formats them canonically, and embeds them in Markdown. Requires an active Java 21+ (`sdk install java`).",
      websiteUrl = "https://kuml.dev",
      distribution = "UNIVERSAL"
    ).insert()
}
