JAVAC = /usr/bin/javac
JAVAE = /usr/bin/java
JAR = /usr/bin/jar
BIN = bin
BASEDIR = $(shell basename $(shell pwd))
VERSION = 0.1
JCFLAGS = -cp .:../Structs-0.1.jar
all	:	*.java
	if [ ! -d ${BIN} ]; then \
		mkdir ${BIN}; \
		fi
	${JAVAC} ${JCFLAGS} $? -d ${BIN};
	${JAR} cf ../${BASEDIR}-${VERSION}.jar $?;
test	:	
	cd ${BIN}; \
		${JAVAE} test;

clean	:
	if [ -d ${BIN} ]; then \
		cd ${BIN}; \
		rm *.class; \
		cd ..; \
		fi;
	rm *~;
	$(echo "Done cleaning.";)
