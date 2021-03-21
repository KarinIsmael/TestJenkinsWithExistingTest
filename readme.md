Laboration 2
Syftet med laboration 2 är att träna på att skapa ett java projekt med tillhörande tester.
Byggande av projektet och körning av testerna ska ske med hjälp av byggverktyget maven.
Laborationen består av 3 uppgifter som lämpligen utförs i samma projekt och antingen
ensam eller tillsammans i grupp. Vid arbete i grupp ska gruppens medlemmar turas om att
skriva koden och alla ska därför när uppgiften är klar bidragit med ungefär samma antal
commits.

Uppgift1:
Gör en clone eller fork av git projektet https://github.com/kappsegla/MockingExample
och öppna det med IntelliJ. Den kod som redan finns i projektet kommer vi att
använda i uppgift 2.

Lägg till de dependencies som behövs för att skriva tester med Junit5.
Uppgift 1 utförst lämpligen genom att jobba enligt TDD och skriva testkod före ni
implementerar funktionaliteten.

 Projektet ska versionshanteras med git och efter varje steg ska ni göra en
commit.

 Inlämning av uppgiften sker genom att dela den på github och skicka in länken
till git repot på kurshemsidan.

 Försök att inte läsa kommande steg i förväg, gör ett steg i taget, arbeta
inkrementellt.

 I den här uppgiften behöver vi inte testa för felaktigt formaterad input.

 Glöm inte att refaktorera koden innan du påbörjar nästa steg ifall det behövs.

Step 1
Create a simple String calculator with a method signature:
int add(String numbers)
The method can take up to two numbers, separated by commas, and will return their
sum.
For example “” or “1” or “1,2” as inputs.
For an empty string it will return 0.

Step 2
Allow the add method to handle an unknown amount of numbers.

Step 3
Allow the add method to handle new lines between numbers (instead of commas):
 The following input is ok: “1\n2,3” (will equal 6)
 The following input is NOT ok: “1,\n” (not need to prove it - just clarifying)

Step 4
Support different delimiters:
 To change a delimiter, the beginning of the string will contain a separate line
that looks like this: “//[delimiter]\n[numbers…]” for example “//;\
n1;2” should return three where the default delimiter is ‘;’.
 The first line is optional. All existing scenarios should still be supported.

Step 5
Calling add with a negative number will throw an exception “negatives not
allowed” - and the negative that was passed.
If there are multiple negatives, show all of them in the exception message.
Use Runtime exception types.

Step 6
Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2

Step 7
Delimiters can be of any length with the following format: “//[delimiter]\n” for
example: “//[***]\n1***2***3” should return 6.

Step 8
Allow multiple delimiters like this: “//[delim1][delim2]\n” for example “//[*]
[%]\n1*2%3” should return 6.

Step 9
Make sure you can also handle multiple delimiters with length longer than one char.

Uppgift 2:
Koden för uppgift 2 finns i projektet under com/example
Vi behöver tester för metoden payEmployees i klassen EmployeeManager i paketet
com.example. Klassen har 2 beroenden på interface som inte finns tillgängliga när vi kör unit
tester. Vi behöver alltså skapa testdoubles för dessa klasser för att kunna köra tester.

 Gör minst ett test som använder en test double som du skapat själv. En test double
klass placerar vi I test/java foldern.

 Gör minst ett test som använder mockito för att lösa problemet.

 Skriv de tester som behövs för att få 100% kodtäckning av metoden.

Uppgift 3:
Integrations test

 Implementera en in memory version av interfacet EmployeeRepository
tillsammans med tester för implementationen. Placera klassen i ett paket
under main/java katalogen.

 Testerna ska verifiera funktionaliteten I metoderna findAll och save. Anropar
man save med en Employee med ett id som redan finns lagrat ska den
befintliga ersättas.

 Det ska gå att initializera repositoriet med en lista av Employess när man
skapar det.

 Skapa ett integrationstest som testar EmployeeManager tillsammans med in
memory repositoriet du skapat. Namnge klassen med integrationstest till
*IT.java.

 Testa att köra mvn test, mvn verify samt mvn failsafe:integration-test och
observera att rätt tester körs under rätt test typ.