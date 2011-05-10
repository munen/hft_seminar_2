paper:
	pdflatex paper.tex
	bibtex paper
	makeindex paper.nlo -s nomencl.ist -o paper.nls
	pdflatex paper.tex

small:
	pdflatex paper.tex

clean:
	find -iname '*aux' -exec rm {} \;
	find -iname '*log' -exec rm {} \;
	find -iname '*idx' -exec rm {} \;
	find -iname '*lof' -exec rm {} \;
	find -iname '*lol' -exec rm {} \;
	find -iname '*out' -exec rm {} \;
	find -iname '*toc' -exec rm {} \;
	find -iname '*lot' -exec rm {} \;
	find -iname '*nlo' -exec rm {} \;
	find -iname '*bbl' -exec rm {} \;
	find -iname '*blg' -exec rm {} \;
	find -iname '*brf' -exec rm {} \;
	find -iname '*ilg' -exec rm {} \;
	find -iname '*ind' -exec rm {} \;
	find -iname '*nls' -exec rm {} \;
