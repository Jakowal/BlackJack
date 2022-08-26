Vedlagt ligger noen linjer av kildekoden til Blackjack. Det er en kjørende konsollapplikasjon, men uten at veldig mye virker. Gjør alle endringene du føler er nødvendig for å løse oppgavene og sikre at svarene er riktig.

## Oppgave 1:
Dersom man får over 21 poeng har man tapt og kan ikke trekke flere kort. Implementer dette

_Endret condition for while-løkken i Program_

## Oppgave 2:
Kortene lagres nå som et tall fra 1 til 13. Endre dette slik at Knekt, Dame, Konge og Ess skrives ut som J, Q, K og A.

_Laget toString() for Card_

## Oppgave 3:
I Blackjack kan ess fungere både som 1 og 11 Spillet skal automatisk velge det som er det beste for spilleren. 

_Flyttet Hand ut i egen klasse og laget sum()-metoden_

## Oppgave 4:
Endre så kortene trekkes fra kortstokken i tilfeldig rekkefølge

_Laget shuffle()-metoden i Deck_

## Oppgave 5:
Blackjack spilles som regel mot en dealer. Implementer en dealer som får utdelt egne kort. Dealeren skal få utdelt ett kort opp på starten. Deretter skal spilleren spille ferdig før dealeren spiller videre. Dealeren trekker kort til han får 17 eller flere poeng

_Laget Hand for å slippe å duplisere kode og ny while-løkke i Program_

## Oppgave 6
Spillet skal skrive ut hvem som vant: Dealer eller spiller

_Lagt inn logikk i slutten av Program_



