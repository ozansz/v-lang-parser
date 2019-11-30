#!/bin/zsh

set -e

#java -jar /usr/local/lib/antlr-4.7.2-complete.jar VLexer.g4 VParser.g4
java -jar /usr/local/lib/antlr-4.7.2-complete.jar V.g4
javac V*.java

for source in `ls tests/*.v`; do
    printf "(i) Running parser for %s...\n", $source
    java org.antlr.v4.gui.TestRig V program $source
done

./cleanup.sh