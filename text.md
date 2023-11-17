# Stream i przyjaciele

## 0. About

Na dzień dobry max 10 minut teorii, żeby zainteresowani wiedzieli, gdzie dalej pogłębiać wiedzę.\
Zajęcia będą w 100% praktyczne, ale wierzę, że warto wiedzieć, skąd się biorą pewne rzeczy.\
I dlaczego robimy, co robimy.\
W przeciwnym razie uprawiamy cult cargo programming (a kto nie wie co to, proszę sobie zapisać i doczytać po
zajęciach).\
Obiecuję, że potem będą zadania.\

To, czego się nauczymy, na początku może wydawać się trudne i niepotrzebne, bo mamy już kolekcje i pętle.\
Za ich pomocą można osiągnąć dowolnie skomplikowane efekty.\
Po co więc się tego uczymy?\
Ponieważ, dzięki streamom i lambdom, możemy skupić się na tym co chcemy zrobić, a nie jak to zrobić.\
Kod jest bardziej czytelny, łatwiejszy do zrozumienia i debugowania.\
Na pewno zdarzyło się Wam pomylić o jeden w pętli, albo zapomnieć o inkrementacji iteratora.\
W streamach nie ma takich problemów.\
Przez to, że streamy są immutable, nie mamy problemy ze śledzeniem, jaką wartość ma dana zmienna w danym momencie.\

Proszę się nie bać i zadawać pytania.\

## 1. Intro

W Javie 8 dodano możliwości funkcyjnego programowania, na tyle na ile pozwala konstrukcja javy.\
Nauczymy się wykonywać operacje na kolekcjach i pisać programy w bardziej deklaratywny sposób.\
Będziemy korzystać ze streamów i lambd.\
Programowanie funkcyjne ma swoje korzenie w matematyce, a w szczególności w rachunku lambda.\
Jednak, żeby z niego korzystać, nie musimy znać rachunku lambda, ani matematyki ponad poziom gimnazjum.\
Lambda to funkcja anonimowa, wyglądająca jak strzałka.\
`x -> x + 1`\
Stream jest abstrakcją, wrapperem, która pozwala nam wykonywać operacje na danych w sposób funkcyjny.\
Jest on bardzo podobny do monad z Haskella. (Nie będziemy o tym mówić, ale warto wiedzieć, że to istnieje).\
Nam wystarczy, że umożliwia nam wykonywanie operacji funkcyjnych, zdefiniowanych w interfejsie Stream.\
Takich jak map, filter, reduce.\
Java nie jest najlepszym językiem do programowania funkcyjnego, ponieważ, powstała jako język obiektowy.\
Nie ma w niej nawet pojęcia funkcji, tak jak w C czy Javascripcie.\
Java promuje enkapsujacje, a jej typy są zazwyczaj mutowalne.\
Programowanie funkcyjne promuje niezmienność i unikanie side-effectów.\
Funkcja bez side-effectów jest deterministyczna, czyli dla tych samych argumentów zawsze zwraca ten sam wynik.\
Dlatego samo programowanie obiektowe nie jest funkcyjne, bo zakłada chociażby, że metody mogą zmieniać stan obiektu.\
Side-effectem jest również np. wypisanie czegoś na ekran.\
Dzięki niemutowalności i braku side-effectów, łatwiej jest śledzić błędy w programie, debugować go i pisać programy
równoległe.\
Mimo to, dzięki streamom i lambdom, możemy pisać kod w bardziej funkcyjny sposób i jest to całkiem ładnie
zaimplementowane w Javie.

## 1. Kolekcje

Java dysponuje arrayami, ale nie są one zbyt wygodne w użyciu.\
W większośći przypadków korzystamy z kolekcji.\
W javie mamy różne kolekcje, np. listy, sety, mapy.\
Wykonywanie na nich operacji jest łatwe, dzięki korzystaniu ze streamów.\
Obecnie arrayie wykorzystujemy w zasadzie tylko gdy jakieś legacy API ich wymaga.\
Albo gdy zależy nam na każdym bajcie pamięci, bo np piszemy embedded - jednak Java raczej nie służy do takich zasotoswań.\

## 2. Funkcja Lambda

Ponieważ w javie nie istnieją funckje, tylko metody, to lambdy są obiektami, które implementują interfejs (funkcyjny).\
Interfejs funkcyjny to interfejs z dokładnie jedną nie defaultową metodą, oznaczoną adnotacją @FunctionalInterface.\
Normalnie jak chcemy skorzystać z interfejsu, musimy zaimplementować jego wszystkie, niedefaultowe publiczne metody.\
W przypadku interfejsu funkcyjnego, wystarczy zaimplementować jedną metodę.\
W dodatku, możemy to zrobić właśnie za pomocą lambdy.\

Pokaż przykład

## 3. Stream

Stream to strumień danych, który możemy przetwarzać.\
Możemy go utworzyć na podstawie kolekcji, tablicy, pliku, itp.\
Stream tworzy z danych strumień, który możemy przetwarzać za pomocą operacji funkcyjnych, zdefiniowanych w interfejsie.\
Jest wiele operacji, ale możemy je generalnie podzielić na dwie grupy:\
- operacje pośrednie - zwracają nowy stream, np. map, filter, sorted, distinct, limit, skip
- operacje terminalne - zwracają inny obiekt, np. forEach, collect, reduce, count, anyMatch, allMatch, noneMatch
Streamy są lazy, czyli dopóki nie wywołamy metody terminalnej, to nic się nie wykona.\
Pozwala to oczywiscie na chainowanie operacji.\
Dzięki temu możemy np. zrobić nieskończony stream, a potem wziąć z niego 10 pierwszych elementów.\
Wtedy nie musimy się martwić, że program się zawiesi.\
Streamy są immutable, pozwalają na łatwiejsze debugowanie i pisanie programów równoległych.\
Nie musimy się martwić, że gdzieś jakaś metoda zmieni nam dane.\
Ułatwia to bardzo debugowanie.\
Streamy mogą być sekwencyjne lub równoległe.\
Domyślnie są sekwencyjne, ale możemy je zmienić na równoległe za pomocą metody `parallel()`.\
Wtedy operacje będą wykonywane równolegle.\
Warto jednak pamiętać, że nie zawsze równoległe operacje są szybsze, ponieważ wymagają synchronizacji - dodatkowego overheadu.\
My nie będziemy się jednak nimi w ogóle zajmować.
