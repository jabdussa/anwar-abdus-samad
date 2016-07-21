#!/bin/sh

APP=sbt
VER=0.13.12
PDIR=/var/tmp/RPM_BUILD
TDIR=$PDIR/$APP/$VER
TMP=$PDIR/_tmp

CUR_DIR="`pwd`"

[ -d  $PDIR  ]  &&  rm  -rf  $PDIR
[ -d  $TMP  ]  &&  rm  -rf  $TMP

mkdir -p $TDIR/RPMS
mkdir -p $TDIR/BUILD
mkdir -p $TDIR/SOURCES
mkdir -p $TDIR/SPECS
mkdir -p $TMP/ROOT

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

#
#FILE=$TDIR/SPECS/sbt.spec
#
#cat << EOF > $FILE
#Summary: SBT - Simple Build Tool for Scala
#Name: sbt
#Version: 0.13.2
#Release: 1
#Group: Applications/Engineering
#License: ASL 2.0
#
#%description
#SBT - Simple Build Tool for Scala
#EOF

echo
echo [`date`] created $FILE
echo
cat $FILE
echo


FILE=sbt.0.13.12
cp ./$FILE.tar.gz  $TMP
cd $TMP
tar zxf $FILE.tar.gz


RPM_TAR_ROOT=$TMP/ROOT/${APP}-${VER}

RPM_TAR_ROOT=$TMP/ROOT/${APP}-${VER}/opt/local/sbt/bin

mkdir -p $RPM_TAR_ROOT

install -m 755 $TMP/sbt/bin/sbt  $RPM_ROOT_TAR/opt/local/sbt/bin
install -m 755 $TMP/sbt/bin/sbt.bat  $RPM_ROOT_TAR/opt/local/sbt/bin
install -m 755 $TMP/sbt/bin/sbt-launch.jar  $RPM_ROOT_TAR/opt/local/sbt/bin
install -m 755 $TMP/sbt/bin/sbt-launch-lib.bash  $RPM_ROOT_TAR/opt/local/sbt/bin

echo
echo [`date`] @ `pwd`
echo


echo
echo [`date`] @ `pwd`
echo Creating $TDIR/SOURCES/${APP}-${VER}-TAR-4-RPM.tar.gz
echo
tar cvf $TDIR/SOURCES/${APP}-${VER}-TAR-4-RPM.tar.gz *
echo


cd $CUR_DIR
