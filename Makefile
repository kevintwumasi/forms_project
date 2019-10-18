JCBIN = /usr/bin/javac
JBIN = /usr/bin/java
JFLAGS = -cp .
JEFLAGS = org.junit.runner.JUnitCore
JTFILES = :junit-4.12.jar:hamcrest-core-1.3.jar 
all	:	*.java
	${JCBIN} ${JFLAGS}${JTFILES} $?
test	:	
	${JBIN} StrengthStandard

