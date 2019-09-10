# offset highlighter concept
## Lucene Hackday September 2019

This code demonstrates adding offsets to a highlighter formatter.

This plugin provides an `OffsetFormatter` which supports pre tags with `$score` and `$offset` placeholders.  If these placeholders are included in the tag they will be replaced with the tokengroup score and offset for the matching text.

To build the plugin run `mvn package`, check out the test configuration files for an idea of how to get set up in an actual solr instance.
