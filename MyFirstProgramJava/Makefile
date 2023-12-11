##
## EPITECH PROJECT, 2023
## Makefile
## File description:
## Java compilateur
##

.suffix = .java .class

EXEC	=	MyFirstJavaProgram

SRC	=	MyFirstJavaProgram.java


all:	classes
	@java $(EXEC)

classes:
	@javac $(SRC)

clean:
	@rm -f *.class

fclean:	clean

re: fclean all