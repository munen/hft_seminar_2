thesis:
	pdflatex thesis.tex
	bibtex thesis
	makeindex thesis.nlo -s nomencl.ist -o thesis.nls
	pdflatex thesis.tex

small:
	pdflatex thesis.tex

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
