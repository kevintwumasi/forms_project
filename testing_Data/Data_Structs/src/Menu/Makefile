JAVAC = /usr/bin/javac
JAVAE = /usr/bin/java
JAR = /usr/bin/jar
BIN = ../bin
BASEDIR = $(shell basename $(shell pwd))
VERSION = 0.1
JCFLAGS = -cp .:../Structs-0.1.jar:../Data-0.1.jar 
all	:	*.java
	${JAVAC} ${JCFLAGS} $? -d ${BIN};
	${JAR} cf ../${BASEDIR}-${VERSION}.jar $?;
test	:	
	cd ${BIN}; \
		if [ -f Main.class ]; then \
		${JAVAE} Main; \
		fi
clean	:
	if [ -d ${BIN} ]; then \
		cd ${BIN}; \
		rm *.class; \
		cd ..; \
		fi;
	rm *~;
	$(echo "Done cleaning.";)
