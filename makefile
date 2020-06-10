# +---------------+
# | LAPL Makefile |
# +---------------+

all:
	cd antlr && make
	mkdir -p antlrFiles
	java -jar antlr/antlr-4.8-complete.jar -Dlanguage=Cpp -no-listener -visitor lapl.g4 -o antlrFiles
	c++ lapl.cpp -o lapl --std=c++11 -I"antlr/run/usr/local/include/antlr4-runtime/" -I"antlr/run/usr/local/lib" -l:libantlr4-runtime.a

clean:
	rm -f lapl
	rm -rf antlrFiles