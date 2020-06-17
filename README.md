# offset highlighter concept

This code demonstrates adding offsets to a highlighter formatter. You can see it in action as part of this demonstration project: https://github.com/o19s/pdf-discovery-demo/.

This plugin provides an `OffsetFormatter` which supports pre tags with `$score`, `$numTokens`, `$endOffset`, `$startOffset` placeholders.  If these placeholders are included in the tag they will be replaced with the tokengroup score and offset for the matching text.

To build the plugin run `mvn package`, check out the test configuration files for an idea of how to get set up in an actual solr instance.

This component was first dreamed up at the September 2019 Lucene Hackday.
