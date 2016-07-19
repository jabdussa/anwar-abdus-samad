#!/bin/sh

PDIR=/home/jabdussa/anwar_abdus_samad

REPO=ssh://git@github.com/jabdussa/anwar_abdus_samad.git

BRAN=files

BDIR=./

[ -d $PDIR ] && rm -rf $PDIR

mkdir -p $PDIR
	
cd  $PDIR

git  clone $REPO  .
	
git  checkout $BRAN

