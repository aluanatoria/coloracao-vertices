# Autores
# Breno Meira Silva - 23.2.8005
# João Henrique da Silva Guimarães - 23.2.8111
# Luana da Silva Ferreira - 23.1.8029

JAVAC = javac
JAVA = java
SCR_DIR = scr
BIN_DIR = bin
MAIN_CLASS = App

all: compile

compile:
		@mkdir -p $(BIN_DIR)
		$(JAVAC) -D $(BIN_DIR)/*.java

run: compile
		$(JAVA) -cp $(BIN_DIR) $(MAIN_CLASS)

clean:
		rm -rf $(BIN_DIR)/.class
