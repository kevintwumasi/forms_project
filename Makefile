JAVAE = /usr/bin/java
BIN = bin
all	:
	if [ ! -d ${BIN} ]; then \
		mkdir ${BIN}; \
		fi
	cd Structs; \
		make; \
		cd .. ;
	##
	cd Data; \
		make ; \
		cd .. ;
	##
	cd Calc; \
		make ; \
		cd ..;
	##
	cd Menu; \
		make ; \
		cd .. ;
	##
	cd Docs; \
		make ; \
		cd ..;
test	:
	cd ${BIN}; \
		${JAVAE} Main;
