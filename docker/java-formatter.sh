#! /bin/bash -eu
eclipse \
    -nosplash \
    -application org.eclipse.jdt.core.JavaCodeFormatter \
    -config /root/eclipse.prefs \
    -verbose `find /output -name '*.java'`
