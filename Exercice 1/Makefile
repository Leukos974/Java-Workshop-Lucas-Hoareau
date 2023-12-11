##
## EPITECH PROJECT, 2023
## Makefile Exercice 1
## File description:
## Compilateur executeur java
##

.suffix = .java .class

SRC	=	JavaProgram.java

EXEC	=	JavaProgram.java	\
			vehicle.java

all:	classes
	@java $(EXEC)

classes:
	@javac $(SRC)

clean:
	@rm -f *.class

fclean:	clean

re: fclean all