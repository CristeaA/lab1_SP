(deftemplate Animal (slot Specie)(slot Sex)(slot inaltime))  
(deffacts Arca 
    (Animal(Specie soarece)(Sex Mascul)(inaltime 5))
    (Animal(Specie soarece)(Sex Femela)(inaltime 4))
    (Animal(Specie veverita)(Sex Mascul)(inaltime 22))
    (Animal(Specie veverita)(Sex Femela)(inaltime 20))
    (Animal(Specie pisica)(Sex Mascul)(inaltime 30))
    (Animal(Specie pisica)(Sex Femela)(inaltime 25))
    (Animal(Specie caine)(Sex Mascul)(inaltime 50))
    (Animal(Specie caine)(Sex Femela)(inaltime 45))
    (Animal(Specie vaca)(Sex Mascul)(inaltime 150))
    (Animal(Specie vaca)(Sex Femela)(inaltime 150))
    (Animal(Specie elefant)(Sex Mascul)(inaltime 300))
    (Animal(Specie elefant)(Sex Mascul)(inaltime 300)))
(reset)
(facts)

(printout t "Afisare animale din Arca:" crlf)

(defrule regula_pozitie1
    (Animal (Specie $?x)(Sex ?y){Sex == Femela || Sex == Mascul })
    =>(printout t " specie: " $?x " este: " $?y  crlf))

(run)    