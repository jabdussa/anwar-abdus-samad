#!/bin/sh

PDIR=/var/tmp/camel_kafka_streams

REPO=ssh://git@github.com/gxitrident/xiIntegrate.git

BRAN=work-in-progress

BDIR=sandboxes/camel_kafka_streams

[ -d $PDIR ] && rm -rf $PDIR

mkdir -p $PDIR
	
cd  $PDIR

git  clone $REPO  .
	
git  checkout $BRAN

