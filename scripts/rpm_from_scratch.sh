#!/bin/sh

APP=sbt
VER=0.13.12
PDIR=/var/tmp/RPM_BUILD
TDIR=$PDIR/$APP/$VER

[ -d  $PDIR  ]  &&  rm  -rf  $PDIR

mkdir -p $PDIR/$APP/$VER/RPMS
mkdir -p $PDIR/$APP/$VER/BUILD
mkdir -p $PDIR/$APP/$VER/SOURCES
mkdir -p $PDIR/$APP/$VER/SPECS


SLEEP=0


echo
echo [`date`] - Created $PDIR
echo
tree $PDIR
echo
sleep $SLEEP


FILE=~/.rpmmacros
echo  "%_topdir $TDIR"  >  $FILE

echo
echo [`date`] created $FILE
echo
cat  ~/.rpmmacros
echo
sleep $SLEEP
echo


FILE=$TDIR/SPECS/sbt.spec

cat << EOF > $FILE
Summary: SBT - Simple Build Tool for Scala
Name: sbt
Version: 0.13.2
Release: 1
Group: Applications/Engineering
EOF

echo
echo [`date`] created $FILE
echo
cat $FILE
echo
