JAVAC = /usr/bin/javac
JAVAE = /usr/bin/javae
JAR = /usr/bin/jar
BIN = ../bin
BASEDIR = $(shell basename $(shell pwd))
VERSION = 0.1
all	:	*.java
	${JAVAC} $? -d ${BIN};
	${JAR} cf ../${BASEDIR}-${VERSION}.jar $?;
test	:	
	echo "Nothing to do..";
clean	:
	if [ -d ${BIN} ]; then \
		cd ${BIN}; \
		rm *.class; \
		cd ..; \
		fi;
	rm *~;
	$(echo "Done cleaning.";)
