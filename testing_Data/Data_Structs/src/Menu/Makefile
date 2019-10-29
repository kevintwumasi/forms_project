JAVAC = /usr/bin/javac
JAVAE = /usr/bin/java
BIN = bin
JFLAGS = -cp .:Data.jar:Structs.jar
all	:	*.java
	${JAVAC} ${JFLAGS} $? -d ${BIN}

test	:
	cd ${BIN} ; \
		${JAVAE} Main;
