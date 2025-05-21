# 1. Etapele Dezvoltării Aplicațiilor

## Procesul Software
Un set structurat de activități necesare pentru dezvoltarea unui sistem software, incluzând specificația, proiectarea, implementarea, validarea și evoluția. Un model de proces software este o reprezentare abstractă a acestuia.

## Modele Generice de Procese de Dezvoltare
- **Modelul Cascadă:** Faze separate și distincte de specificare și dezvoltare.
- **Modelul Evoluționar:** Specificația, dezvoltarea și validarea sunt etape interconectate.
- **Dezvoltarea Bazată pe Componente:** Sistemul este asamblat din componente pre-existente.

## Abordare Pragmatică
Un plan general al unui proiect software ar trebui să răspundă la întrebările: Ce trebuie făcut? De ce? Când? Cine? Cum? Nu există un model universal valabil, iar alegerea unui proces adecvat îmbunătățește calitatea produsului.

## Fazele unui Proces (SDLC - Software Development Life Cycle)
- **Analiza:** Specificarea cerințelor utilizatorului (rezultat: document de cerințe).
- **Proiectare:** Specificarea structurii și componentelor aplicației (rezultat: model al sistemului).
- **Implementare:** Scrierea/modificarea programului (rezultat: program executabil "alpha").
- **Testare:** Verificarea sistematică a defectelor (rezultat: program executabil "release").
- Alte etape pot include: deployment/lansare, operare, suport, instruire, mentenanță.

## Probleme Uzuale și Soluții
- **Modificări ad-hoc:** Duc la încurcarea structurii și costuri mari. Soluția este o etapă de proiectare care definește structura.
- **Programul nu satisface utilizatorul:** Soluția este o etapă de analiză pentru specificarea cerințelor.
- **Verificarea funcționalității:** Proces dificil, necesită code review, instrumente de analiză statică, metode de testare.
- **Minimizarea timpului (Time-to-market):** Presiune pentru dezvoltare rapidă. Angajarea mai multor programatori poate ajuta, dar introduce overhead de comunicare și constrângeri secvențiale.

## Interfețe
Componentele dezvoltate ideal sunt independente, dar trebuie să lucreze împreună. Interfețele definesc granițe între componente și oameni, asigurând funcționarea sistemului și izolarea modificărilor interne.

## Arhitectura Software
Definirea interfețelor permite descompunerea sistemului în părți separate. Descompunerea depinde de funcționalitatea sistemului, modul de construcție și echipa implicată (ex: compilator, sistem Google).

## Instrumente de Dezvoltare
Diverse instrumente pentru **build** (make, ant), **compilare** (gcc, Visual Studio), **depanare** (gdb), **generare documentație** (doxygen), **control versiuni** (git, svn), **analiză statică** (lint), etc. 

**IDE-urile (Eclipse, Visual Studio)** integrează multe dintre acestea pentru proiecte mari și aplicații enterprise (performanță, scalabilitate, robustețe).

## Ingineria Programelor Software
Comparată cu construcția industrială (poduri, zgârie-nori), implică specificare, proiectare, implementare și validare. 

Probleme uzuale includ dimensiunea, interacțiunea umană, siguranța, securitatea, portabilitatea, costul și certitudinea cerințelor.
<br>
<br>
<br>

# 2. Modele Software și Instrumente de Modelare

## Importanța Modelării
De ce este necesară modelarea în dezvoltarea software (pentru a înțelege complexitatea, a comunica designul, a reduce erorile).

## Tipuri de Modele Software
- **Modele Structurale:** Reprezentarea statică a sistemului (ex: diagrame de clase UML, diagrame de componente).
- **Modele Comportamentale:** Reprezentarea dinamică a sistemului (ex: diagrame de secvență UML, diagrame de stare).
- **Modele de Arhitectură:** Vederea de ansamblu a structurii sistemului.

## Limbaje de Modelare
- **UML (Unified Modeling Language):** Cel mai răspândit limbaj de modelare, cu diverse tipuri de diagrame (clase, obiecte, cazuri de utilizare, secvență, activitate, stare, componente, desfășurare).
- **Arhimate (Archimate):** Pentru modelarea arhitecturilor de întreprindere.

## Instrumente de Modelare (CASE Tools)
- **Funcționalități:** Suport pentru desenarea diagramelor, generarea de cod schelet, inginerie inversă, verificare consistență.
- **Exemple:** Enterprise Architect, Visual Paradigm, draw.io, Lucidchart.

## Avantaje
Îmbunătățirea comunicării între echipe, detectarea timpurie a erorilor de design, facilitarea mentenanței și a reutilizării.
<br>
<br>
<br>

# 3. Asigurarea Calității Produselor Software

## Refactorizarea
- "Arta de a îmbunătăți designul codului existent într-un mod corect", fără a schimba funcționalitatea (conservarea semanticii).
- Nu se referă la repararea bug-urilor sau adăugarea de funcționalități noi.
- Încurajează programarea exploratorie și calitatea codului.
- Cazurile de test sunt esențiale pentru a verifica că refactorizarea nu introduce erori.
- **"Smells" (Indicii de probleme de design):**
    - **Long Method:** Metode cu prea multe linii de cod. Soluția este extragerea de metode mai mici.
    - **Large Class:** Clase cu prea multe variabile, metode sau linii de cod. Soluția este extragerea de clase/subclase/interfețe.
    - **Magic Number:** Valori constante definite de mai multe ori. Soluția este înlocuirea cu constante simbolice sau enumerări.
    - **Cod Duplicat:** Fragmente de cod identice sau aproape identice. Soluția este extragerea de metode sau utilizarea metodelor șablon.
    - **"Ask What Kind" Anti-Pattern (Moștenirea Simulată):** Utilizarea ```switch``` sau ```if-instanceof``` pentru a distinge tipuri de obiecte. Soluția este utilizarea polimorfismului prin subclase.
- **Refactorizarea în Eclipse:** Instrumente integrate pentru refactorizări automate (Rename, Extract Method, Pull Up, Push Down, etc.).

## Simplitatea
- Principiul "Keep it Short and Simple" (KISS).
- Evitarea complexității inutile (cod neutilizat, nume neclare).
- Codarea pentru oameni: claritate, accesibilitate, înțelegere.
- Mentenanța este mai importantă decât performanța.

## Modularitatea
- Descompunerea sistemelor complexe în părți mai mici, independente, cu interfețe bine definite (module).
- **Avantaje:** ușurință în înțelegere, dezvoltare, mentenanță; izolare defecte; reutilizare.
- **Separarea Preocupărilor (SoC):** Spargerea problemelor mari în piese mici și concentrarea pe rezolvarea uneia la un moment dat.
- **Coeziunea și Cuplarea:**
    - **Coeziune puternică:** Liniile de cod dintr-un modul lucrează bine împreună pentru o singură funcționalitate.
    - **Cuplare slabă:** Puține dependențe între module, permițând modificări independente.

## Ascunderea Informației
- Restricționarea vizibilității informațiilor interne ale unei clase/modul/program.
- Previne dependențele nedorite și permite modificări interne fără a afecta alte componente.
- Utilizarea modificatorilor de acces (public, protected, private) și a interfețelor Java.
- **Conceptul de Interfață:** Definește și restricționează modul de utilizare a unei clase, asigurând că utilizatorii interacționează doar prin intermediul ei.

## Depanarea Programelor
- Procesul de identificare și corectare a erorilor software, în special cele de runtime.
- Utilizarea depanatoarelor grafice (Eclipse, Visual Studio) cu funcționalități precum breakpoints, step-uri (into, over, return), watches.

## Profiling:
- Formă de analiză dinamică a execuției programului, concentrată pe aspecte măsurabile (timp, utilizare memorie, fire de execuție).
- Identifică "bottleneck-urile" pentru optimizare.
- **Tipuri:** memory profilers, thread profilers, code coverage profilers.
- **Exemple Java:** JProfiler, NetBeans Profiler, Eclipse TPTP.
<br>
<br>
<br>

# 4. Instrumente în Ciclul de Dezvoltare Software. Best Practices.

## SDLC (Software Development Life Cycle)
Reafirmarea etapelor (analiză, proiectare, implementare, testare, mentenanță) și a importanței unui proces structurat.

## Instrumente Specifice Fiecărei Etape
- **Analiză și Cerințe:** Instrumente de management al cerințelor (Jira, Confluence), de prototipare (Figma, Sketch).
- **Proiectare:** Instrumente de modelare UML (Enterprise Architect), IDE-uri cu suport pentru design patterns.
- **Implementare:** IDE-uri (Eclipse, IntelliJ, Visual Studio Code), sisteme de control versiuni (Git, SVN), build tools (Maven, Gradle, Ant).
- **Testare:** Unit testing frameworks (JUnit, NUnit), integration testing tools, performance testing tools (JMeter), static code analysis (SonarQube, Lint).
- **Deployment:** CI/CD tools (Jenkins, GitLab CI, GitHub Actions), containerization (Docker), orchestration (Kubernetes).
- **Mentenanță și Operare:** Monitoring tools (Prometheus, Grafana), logging systems (ELK stack).

## Medii de Dezvoltare Integrate (IDEs)
- Oferă un pachet complet de instrumente pentru întregul ciclu de dezvoltare (editare cod, compilare, depanare, control versiuni).
- **Exemple:** Eclipse, IntelliJ IDEA, Visual Studio.

## Bune Practici (Best Practices)
- **Controlul Versiunilor:** Utilizarea sistemelor de control versiuni (Git) pentru a gestiona modificările codului, colaborarea și istoricul.
- **Integrare Continuă (CI):** Automatizarea procesului de build și testare la fiecare modificare de cod pentru a detecta erorile rapid.
- **Livrare Continuă (CD):** Automatizarea procesului de deployment către medii de testare sau producție.
- **Test-Driven Development (TDD):** Scrierea testelor înainte de codul de producție pentru a ghida designul și a asigura acoperirea testelor.
- **Code Review:** Verificarea codului de către alți membri ai echipei pentru a îmbunătăți calitatea și a răspândi cunoștințele.
- **Refactorizare Continuă:** Îmbunătățirea constantă a calității codului.
- **Documentație:** Menținerea unei documentații adecvate (nu excesive) pentru a facilita înțelegerea și mentenanța.
- **Principii SOLID:** Set de principii de design orientat obiect pentru a crea sisteme mai ușor de înțeles, flexibile și mentenabile.

## Importanța Echipelor și a Comunicării
Bunele practici nu sunt doar despre instrumente, ci și despre colaborare eficientă și comunicare deschisă în cadrul echipei.
<br>
<br>
<br>

# 5. Rapid Application Development (RAD)

## Rapid Software Development
- Necesitatea adaptării continue la schimbările mediului de business.
- Rapiditatea dezvoltării și livrării este o cerință critică (speed-to-market, time-to-market).
- Abordarea în cascadă este nepractică în medii volatile.
- Se preferă o abordare bazată pe specificații și livrare iterative.

## Caracteristicile Proceselor RAD
- Procesele de specificare, proiectare și implementare sunt concurente.
- Documentația de proiectare este minimală.
- Sistemul este dezvoltat în incremente, evaluate de utilizatorii finali.
- Interfețele utilizator sunt dezvoltate interactiv.

## Avantajele Dezvoltării Incrementale
- Livrare rapidă de funcționalități către clienți.
- Implicarea utilizatorilor în dezvoltare, ducând la un sistem mai aliniat cu cerințele.

## Problemele Dezvoltării Incrementale
- Dificultăți în aprecierea progresului și rezolvarea problemelor din cauza documentației minime.
- Probleme contractuale (lipsa unei specificații detaliate).
- Probleme de validare (fără o specificație clară, împotriva a ce se testează?).
- Costuri mari de mentenanță din cauza schimbărilor continue ce pot corupe structura software.

## Prototiparea
- Dezvoltarea unui sistem experimental pentru a formula sau valida cerințele.
- Poate fi folosită în ingineria cerințelor, proiectare (explorarea opțiunilor UI) sau testare.
- **Throw-away prototyping:** Prototipul nu este păstrat după ce cerințele sunt stabilite. Se începe cu cerințele cel mai puțin înțelese.
- **Dezvoltare incrementală vs. Prototipare:** Obiective conflictuale – livrare funcțională rapidă vs. validare/derivare cerințe.

## Metode Agile
- Apărute ca reacție la metodele tradiționale "greoaie".
- Focus pe cod, abordare iterativă, livrare rapidă de software funcțional.
- Adecvate pentru sisteme de business mici și medii.
- **Principii Agile:** Implicarea clientului, livrare incrementală, oameni nu procese, adoptarea schimbării, menținerea simplității.
- **Probleme Agile:** Dificultatea menținerii interesului clienților, membri de echipă neadecvați, prioritizarea schimbărilor, costul menținerii simplității, probleme contractuale.

## SCRUM:
- Proces de dezvoltare iterativ-incrementală cu roluri și practici predefinite.
- **Roluri:** Product Owner (vocea clientului, definește cerințele), Scrum Master (administrează procesul, similar PM), Team (echipa de dezvoltare, auto-organizată, responsabilă de livrare).
- **Practici:**
    - **Product Backlog:** Set prioritizat de cerințe funcționale.
    - **Sprint:** Perioadă fixă (2-4 săptămâni) în care se livrează un increment funcțional.
    - **Sprint Planning Meeting:** Decizii despre ce itemi din Product Backlog sunt incluși în Sprint.
    - **Sprint Backlog:** Itemii ce trebuie rezolvați într-un Sprint.
    - **Daily Scrum:** Întâlnire zilnică scurtă pentru sincronizare.
    - **Sprint Review Meeting & Sprint Retrospective:** Întâlniri la sfârșitul Sprintului pentru evaluare și îmbunătățire.
- **Avantaje:** Echipe auto-organizate, încurajează comunicarea verbală și co-locarea.

## eXtreme Programming (XP):
- Una dintre cele mai cunoscute metode Agile, centrată pe cod.
- **Valori:** Comunicare, Feedback, Simplitate, Curaj, Respect.
- **Practici:**
    - **Pair Programming:** Doi programatori lucrează la același cod.
    - **Test Driven Development (TDD):** Scrierea testelor înainte de cod.
    - **Continuous Integration:** Integrarea frecventă a modificărilor.
    - **Refactoring:** Îmbunătățirea constantă a designului codului.
    - **Small Releases:** Livrări frecvente de incremente mici.
    - **Whole Team:** Implicarea clientului în echipă.
    - **Collective Code Ownership:** Toată lumea e responsabilă de întreg codul.
    - **Simple Design, System Metaphor, Coding Standard, Sustainable Pace.**
- **Terminologie:** User story (funcționalități descrise de client), Release, Spike (prototip proof-of-concept), Iteration, Project velocity.
- **XP și Schimbarea:** Susține refactorizarea continuă pentru a facilita integrarea schimbărilor, în loc de anticiparea lor.
- **Testarea în XP:** Dezvoltare "test-first", teste automate rulate cu fiecare versiune nouă.
- **Avantaje Pair Programming:** Dezvoltarea simțului proprietății, răspândirea cunoștințelor, verificare informală, încurajează refactorizarea.

## SCRUM și XP
SCRUM este adesea folosit ca un "wrapper" peste XP, combinând managementul de proiect cu practicile tehnice.

## Dezvoltarea Orientată spre Testare (TDD)
- Filozofia: "Any program feature without an automated test simply doesn’t exist."
- **Unit Tests:** Testarea segmentelor individuale de cod. Facilitează refacerea codului și integrarea.
- **JUnit:** Framework popular pentru unit testing în Java.
- **TestCase:** Clasă de test JUnit. Metodele care încep cu "test" sunt executate.
- **Aserțiuni:** Metode (ex: ```assertTrue```, ```assertEquals```) pentru a verifica proprietăți și a determina verdictul testului.
- **setUp():** Metodă executată înainte de fiecare test.
- **TestSuite:** Colecție de teste rulate ca un grup.

## Nivele de Testare
Unit testing, Integration testing, Subsystem testing, System testing, Acceptance testing (Alpha, Beta, Gamma).

## COTS (Commercial Off-The-Shelf)
Abordare de dezvoltare rapidă prin configurarea și legarea sistemelor existente.
<br>
<br>
<br>

# 6. Reutilizabilitatea Software

## Reflecția
- Abilitatea unui program de a observa și, posibil, modifica propria structură și comportament la runtime.
- **Introspecția:** Observarea programului (structuri de date, cod).
- **Intervenția:** Modificarea programului.
- Poate fi statică (înainte de runtime) sau dinamică (în timpul runtime).
- **Protocoale de MetaObiecte (MOPs):** Entitățile interne programului (tipuri, metode) sunt reprezentate ca metaobiecte, instanțe ale unor metaclase.

## Introspecția Structurilor de Date
Permite unui program să lucreze cu structuri de date necunoscute la compilare (ex: încărcarea dinamică de clase). Clasa ```Class``` în Java este metaobiectul pentru tipuri.

## Introspecția Codului
Analiza corpurilor metodelor și instrucțiunilor (mai puțin suportată în limbaje comune, dar posibilă prin AST - Abstract Syntax Trees).

## Intervenția
Modificarea structurilor de date sau a codului la runtime (mecanism rar și potențial periculos, deoarece poate afecta invarianții).

## Java Reflection API
- Suportă un anumit grad de reflecție: introspecția tipurilor, semnăturilor de metode, accesului la tipuri și metode.
- Permite instanțierea dinamică, accesul la câmpuri și invocarea metodelor.
- Aruncă excepții pentru operații nesigure.
- **Când este necesară reflecția:** În programe care procesează alte programe (containere web, plug-in-uri, sisteme de testare automată).
- **Clasa ```Class```:** Obținerea metaobiectului unei clase prin ```obj.getClass()```, ```Button.class```, ```Class.forName(str)```.
- **```ClassLoader```:** Pentru încărcarea dinamică a claselor.
- **Metode pentru introspecție:** ```getName()```, ```getSuperclass()```, ```getModifiers()``` (cu clasa Modifier), ```getInterfaces()```, ```getFields()```, ```getConstructors()```, ```getMethods()```.
- **Invocare Dinamică:** ```Method.invoke()```, ```Constructor.newInstance()```, ```Field.set()/get()```.
- **Array:** Clasa ```Array``` oferă metode statice pentru crearea și manipularea array-urilor dinamic.
- **Acces la membrii non-publici:** Metodele ```getDeclaredXYZ()``` (ex: ```getDeclaredFields()```) permit accesul la membri privați, dar nu la cei moșteniți. Necesită ```setAccessible(true)```.

## Reflecție Comportamentală
Posibilitatea de a modifica nu doar programul, ci și sistemul de rulare (ex: în MetaJ, prin "Reflective Towers" - inserarea de interpretoare intermediare). Aceasta permite modificarea semanticii operaționale a limbajului, dar este complexă și periculoasă.

## Concluzie Reflecție
Un instrument puternic, dar care trebuie folosit cu prudență, deoarece poate duce la nesiguranță și confuzie dacă nu este gestionat corect.
<br>
<br>
<br>

# 7. Instrumente și Implementare

## Protocoale de Comunicație:
- Set de reguli ce dictează cum comunică entitățile (sintaxă, semantică, timing).
- Necesită robustețe, securitate și fiabilitate.

## HTTP (Hypertext Transfer Protocol)
- **Model client/server:** clientul inițiază cererea, serverul răspunde.
- Ubiquitous în Web, permite refolosirea resurselor.
- **Metode HTTP:** GET, POST, PUT, DELETE.
- **Anatomia unei cereri HTTP:** Linia de cerere (metodă, resursă), headere (informații suplimentare), body (date opționale).
- **URL și Parametrii în Query:** ```http://host:port/path?key=value```.
- **Tipuri MIME & Headere:** ```Content-type``` (ex: ```image/jpg```, ```text/html```) pentru a descrie formatul datelor.
- **Body Encoding:** ```url encoded``` (pentru formulare mici), ```multi part``` (pentru fișiere mari).

## Web Services over HTTP
- Servicii auto-descriptive și stateless, oferind funcționalitate peste rețea.
- **WSDL (Web Services Description Language):** Descrie serviciile în XML.
- **SOAP:** Protocol strict, folosit la început.
- **REST (Representational State Transfer):**
    - Modalitate de reprezentare a resurselor prin URL-uri (ex: ```/video/1```, ```/video/1/duration```).
    - Interacțiunea cu resursele se face prin metode HTTP (GET, PUT, POST).
    - Accent pe resurse și operații standard.

##  Object Marshalling
- Conversia obiectelor Java în formate text (JSON, XML) pentru transmitere peste HTTP și invers.
- Biblioteci precum XStream, Jackson pentru automatizare.

## JSON (JavaScript Object Notation)
- Mecanism pentru descrierea obiectelor în format text (```key:value```, obiecte embedded, liste).
- Mai condensat și mai eficient energetic decât XML.

## Retrofit
- Bibliotecă open-source Java pentru interacțiunea HTTP cu serverul (conversie obiecte).
- Oferă un API fluent, automatizează conversia cererilor și răspunsurilor HTTP în/din obiecte Java.

## HTTP Polling
- Clientul inițiază periodic cereri către server pentru a verifica actualizări.
- Ineficient pentru actualizări frecvente, consumă resurse.
- **Long Polling:** Serverul menține conexiunea deschisă până la un eveniment sau timeout.

## Web Sockets
- Conexiune bidirecțională persistentă între client și server.
- Permite trimiterea de mesaje mici, fără headere HTTP repetate.
- **Dezavantaje:** necesită gestionarea erorilor de către client în cazul întreruperii conexiunii (ex: semnal WiFi pierdut).

## Push Messaging (ex: Google Cloud Messaging - GCM)
- Serverul poate "împinge" mesaje către client (ex: Android).
- Conexiune persistentă (XMPP) sau re-creată automat.
- **Push-to-sync model:** Serverul trimite o notificare mică, iar clientul face apoi un PULL HTTP pentru datele mari.

## Java Servlets
- Obiecte Java cu metode speciale (```doGet```, ```doPost```, etc.) pentru gestionarea cererilor HTTP.
- **Web Container:** Rutează cererile HTTP către Servlet-uri pe baza configurației ```web.xml```.

## Securitate - No Injection Attacks
Prevenirea atacurilor de injecție (ex: SQL Injection, Cross-Site Scripting - XSS) prin validarea și sanitizarea intrărilor.

## Object Relational Mapping (ORM)
- Maparea obiectelor Java la tabele de baze de date.
- **JPA (Java Persistence API):** Standard pentru persistența datelor în Java (cu adnotări ```@Entity```, ```@Id```).
- **Spring Repository:** Interfețe pentru operații CRUD (Create, Read, Update, Delete) simplificate cu JPA.

## Securitate în Aplicații Web (Spring Security, OAuth 2.0)
- **Autentificare:** Verificarea identității utilizatorului.
- **Autorizare:** Controlul accesului la resurse.
- **OAuth 2.0:** Protocol pentru autorizarea accesului la resurse protejate, fără a expune credențialele utilizatorului (folosește token-uri).

## Scalare pe Orizontală
- Abilitatea de a suporta volume mari de utilizatori prin adăugarea de mai multe instanțe ale serverului (replici).
- **Load Balancer:** Distribuie cererile între replici.
- **Stateless vs. Stateful:** Aplicațiile stateless sunt mai ușor de scalat. Pentru stateful, necesită "sticky sessions" sau gestionarea stării în baza de date.
- **Auto-scaling:** Proces automatizat în Cloud pentru ajustarea numărului de instanțe.

## Optimizări (Reads vs. Writes)
Designul sistemului trebuie să prioritizeze optimizarea pentru citiri sau scrieri, în funcție de nevoile aplicației (ex: sharding pentru scrieri concurente).
<br>
<br>
<br>

# 8. Dezvoltarea Orientată pe Componente

## Definiția Componentei Software
- O unitate software independentă, reutilizabilă, cu o interfață bine definită.
- Poate fi implementată, testată și livrată independent.
- Funcționalitate specifică și bine delimitată.

## Principii ale Dezvoltării pe Componente
- **Încapsulare:** Ascunderea detaliilor interne ale implementării.
- **Interfețe Clare:** Modul prin care componentele comunică între ele.
- **Reutilizabilitate:** Componentele sunt proiectate pentru a fi utilizate în multiple aplicații.
- **Compozabilitate:** Abilitatea de a asambla componente pentru a construi sisteme mai mari.
- **Substituibilitate:** O componentă poate fi înlocuită cu o altă componentă care implementează aceeași interfață.

## Avantaje
- Reducerea Costurilor și Timpului de Dezvoltare: Prin reutilizarea componentelor existente.
- **Creșterea Calității:** Componentele reutilizate sunt adesea bine testate și mature.
- **Mentenanță Facilitată:** Modificările la o componentă nu afectează alte componente dacă interfața rămâne stabilă.
- **Scalabilitate:** Sistemele bazate pe componente sunt mai ușor de scalat și de distribuit.
- **Dezvoltare Paralelă:** Echipe diferite pot lucra independent la componente diferite.

## Dezavantaje/Provocări
- **Costul inițial de dezvoltare:** Crearea componentelor reutilizabile poate fi mai scumpă la început.
- **Găsirea și Adaptarea Componentelor:** Dificultăți în a găsi componentele potrivite și a le integra.
- **Managementul Versiunilor:** Gestionarea multiplelor versiuni ale componentelor.
- **Testarea Sistemelor Compozite:** Testarea interacțiunilor dintre componente.

## Arhitecturi bazate pe Componente
- **EJB (Enterprise JavaBeans):** Un model Java pentru construirea de componente server-side.
- **.NET Components:** Componente în ecosistemul Microsoft.
- **Microservicii:** O abordare modernă de dezvoltare pe componente, unde serviciile sunt mici, independente și comunică prin API-uri.

## Instrumente pentru Dezvoltarea pe Componente
- IDE-uri cu suport pentru crearea și gestionarea componentelor.
- Sisteme de control versiuni.
- Build tools și sisteme de integrare continuă.
- Framework-uri de injecție de dependențe.
<br>
<br>
<br>

# 9. Docker

## Containere Software
- **Bazate pe "OS-level virtualization":** kernel-ul permite instanțe izolate de user space.
- Conțin codul aplicației, bibliotecile și runtime-ul necesar, fără dependențe externe.
- Permit dezvoltatorilor să se miște rapid, să facă deploy eficient și să opereze la scară.
- **Avantaje:** Mediu consistent (includ dependențe, previzibilitate), rulează oriunde (Linux, Mac, Windows, VM, bare metal), izolare (sandbox).
- **Imagine:** Cod + dependențe + biblioteci + runtime.
- **Container:** Instanță care rulează o imagine.
- Sunt mult mai lightweight decât mașinile virtuale (împart același kernel, pornesc mai repede, folosesc mai puțină memorie).

## Docker
- Platformă populară pentru dezvoltarea, livrarea și rularea aplicațiilor în containere.
- **De ce Docker:** Amprentă mică, deploy rapid, flexibil (rulează oriunde), scalabil, ecosistem bogat, izolare probleme, productivitate crescută.
- **Variante:** Community Edition (CE) și Enterprise Edition (EE).
- **Disponibilitate:** Desktop (Windows, macOS), Cloud (AWS, Azure), Server (CentOS, Ubuntu).
- **Docker Toolbox vs. Docker Desktop:** Toolbox este "legacy", Desktop oferă performanțe mai bune și suport nativ.

## Rularea unui Container
- **Docker Hub:** Registru public de imagini Docker (OS-uri, limbaje de programare, servere web).
- **Comenzi de bază:** ```docker image pull```, ```docker image ls```, ```docker run```, ```docker ls -a```, ```docker attach```, ```docker exec```, ```docker stop```, ```docker rm```.

## Crearea unei Imagini
- Scrierea unei aplicații.
- **Crearea unui Dockerfile:** Fișier care specifică pașii de construire a imaginii (copiere fișiere, mapări porturi, etc.).
- **Construirea imaginii:** ```docker build -t newimage .```

## Publicarea unei Imagini
- Necesită urcarea imaginii într-un registru (Docker Hub, GitHub Container Registry).
- **Pași:** ```docker login```, ```docker tag```, ```docker push```, ```docker run```.

## Networking în Docker
Subsistem pluggable cu drivere:
- **Bridge (implicit):** Permite containerelor de pe aceeași mașină să comunice.
- **Overlay:** Conectează mai multe mașini Docker și permite serviciilor dintr-un swarm să comunice.
- **Host:** Elimină izolarea de rețea.
- **Macvlan:** Asignează adrese MAC, containerul apare ca dispozitiv fizic.
- **None**.

## Persistența Datelor în Docker
- Datele containerului nu sunt persistate implicit.
- **Volume:** Mecanisme Docker pentru persistența datelor (ușor de salvat/migrat, controlate CLI/API, partajabile, pre-populate).
- **Bind mounts:** Similare volumelor, dar nu sunt gestionate de Docker, pot fi oriunde în sistemul de fișiere al gazdei.

## Docker Compose
- Utilitar pentru centralizarea configurării de rulare a containerelor într-o manieră declarativă.
- Utilizează fișiere YAML pentru a defini servicii, volume, rețele, secrete, variabile de mediu.

## Orchestrarea de Containere
- Necesitatea rulării containerelor la scară largă, pe mai multe gazde.
- Răspunde la întrebări precum: gruparea gazdelor în clustere, programarea containerelor pe gazde, comunicarea între containere pe gazde diferite, gestionarea stocării, accesibilitatea prin nume de serviciu.
- Include scheduling de containere și administrarea clusterelor/nodurilor.

## Docker Swarm
- Unealtă nativă de orchestrare de la Docker.
- Oferă descoperire de servicii, balansare a încărcării, replicare, regenerare.
- Grupează mai multe engine-uri Docker pentru a crea un engine virtual.
- Bazat pe algoritmul Raft pentru gestiunea stării globale a clusterului.
- Funcționează pe paradigma manager/workers (nodurile manager gestionează clusterul, nodurile worker execută taskuri).
- Asigură consistența stării prin consens (decidabilitate majoritară).
- **Servicii Docker:** Set de taskuri care gestionează containere în Swarm (replicare, balansare încărcare, regenerare, actualizare).
- **Rețele în Docker Swarm:** Serviciile rulează în rețele overlay, disponibile pe mai multe noduri fizice. Routing Mesh asigură balansarea încărcării între replicile unui serviciu.
- **Persistența datelor în Swarm:** Volumele sunt locale nodului; se folosește NFS (Network File System) pentru persistență distribuită.
- **Caracteristici Swarm:** Compatibilitate cu Docker API, suport nativ networking/volume, scheduler built-in (filtre, strategii), scalabilitate mare, failover și high availability, suport pentru pluggable schedulers (Mesos, Kubernetes), discovery de noduri.
<br>
<br>
<br>

# 10. Dezvoltare Orientată pe Cloud Services

## Utility Computing
Viziunea computingului ca a cincea utilitate (alături de apă, electricitate, gaz, telefonie), unde serviciile computaționale sunt accesate conform necesităților, cu plată per consum.

## Cloud Computing
- Model pentru accesul la resurse computaționale (rețele, servere, stocare, aplicații, servicii) la cerere, prin rețea, cu provizionare rapidă și efort minim de management.
- **Avantaje:** Reducerea costurilor, scalabilitate, disponibilitate ridicată, flexibilitate, rapiditate.
- **Caracteristici Esențiale (NIST):** Self-service la cerere, acces la rețea extins, pooling de resurse, elasticitate rapidă, serviciu măsurabil.
- **Perspectiva Utilizatorului:** Nu interesează infrastructura fizică, ci calitatea serviciului obținut și plata strict a resurselor consumate.

## Servicii
- Endpoint-uri de conexiune, bine definite, auto-conținute, independente de context/stare.
- **Servicii Web:** Funcții oferite peste rețea, auto-descriptive și stateless. API-uri pentru exploatarea funcționalității.
- **WSDL:** Descrie serviciile web (tipuri de date, mesaje, operații).

## Arhitectura Orientată pe Servicii (SOA)
- Organizează sistemele ca o colecție de servicii ce comunică între ele.
- Principii de design flexibile, servicii slab-cuplate, reutilizabile.
- Adasea implementată conform modelului de Serviciu Web.

## Calitatea Serviciului (QoS)
- Set de tehnologii pentru gestionarea traficului de rețea.
- Evaluarea relației cu clientul (impactul problemelor asupra experienței).
- Evaluări tehnologice (operarea eficientă a sistemului, optimizarea resurselor).

## Service Level Agreement (SLA)
- Contract între furnizor și client, specificând servicii și metrici măsurabile (QoS).
- **Include:** metrici de performanță (uptime, throughput, timp de răspuns), gestiunea problemelor, penalizări, capabilități de securitate.

## Proprietăți și Caracteristici ale Sistemelor Cloud
- **Scalabilitate:** Abilitatea de a suporta cantități crescânde de activități.
- **Elasticitate:** Abilitatea de a adapta dinamic resursele în timp real.
- **Disponibilitate:** Gradul cu care un sistem se află într-o stare operabilă (ex: "Five Nines" - 99.999%).
- **Fiabilitate:** Abilitatea sistemului de a efectua funcțiile specificate pentru o anumită perioadă.
- **Mentenabilitate:** Capabilitatea de auto-gestiune (self-configuration, self-healing, self-optimization, self-protection).
- **Interoperabilitate:** Abilitatea de a lucra cu alte produse/sisteme.
- **Accesibilitate:** Gradul de accesibilitate pentru cât mai multe persoane.
- **Portabilitate:** Abilitatea de a accesa servicii de pe orice dispozitiv, oricând, în condiții de mobilitate.
- **Performanță și Optimizare:** Garanția performanței aplicațiilor prin parallel computing, load balancing, job scheduling.

## Modele de Servicii Cloud
- **IaaS (Infrastructure as a Service):** Furnizează resurse de infrastructură (VM-uri, stocare, rețele). Utilizatorul gestionează SO, aplicațiile. Ex: AWS EC2, Google Compute Engine.
- **PaaS (Platform as a Service):** Furnizează o platformă de dezvoltare și deployment (runtime, baze de date, servere web). Utilizatorul gestionează aplicațiile. Ex: Google App Engine, Heroku.
- **SaaS (Software as a Service):** Furnizează aplicații complete, gata de utilizare. Utilizatorul interacționează cu software-ul. Ex: Gmail, Salesforce.

## Modele de Deployment Cloud
- **Cloud Public:** Infrastructura este disponibilă publicului larg și este deținută de un furnizor de servicii cloud (ex: Google Cloud, AWS, Azure).
- **Cloud Privat:** Infrastructura este operată de o singură organizație, gestionată intern sau de o terță parte ("internal cloud", "on-premise cloud").
- **Cloud Comunitar:** Infrastructura este partajată de câteva organizații cu interese comune.
- **Cloud Hibrid:** Combinație de două sau mai multe cloud-uri (publice, private, comunitare), legate prin tehnologii ce permit portabilitatea datelor și aplicațiilor.
<br>
<br>
<br>

# 11. Design Patterns

## Design Patterns (DPs)
- Tipare apărute în practica de proiectare software.
- Soluții reutilizabile la probleme de programare, aplicabile în diverse contexte.
- NU sunt clase sau biblioteci, ci modele conceptuale care trebuie implementate.
- Sunt independente de limbaj.
- Reprezintă experiență intelectuală și bune practici codificate.
- **Principii Generale:**
    - Contați pe o interfață, nu pe o implementare.
    - Favorizați compoziția înaintea moștenirii.
    - Delegare.
    - Proiectare pentru flexibilitate.

## Structura unui Design Pattern
- **Numele Pattern-ului:** Un nume intuitiv.
- **Problema:** Descrierea problemei sau contextului în care pattern-ul este util.
- **Soluția:** Descrierea elementelor de design, a relațiilor și responsabilităților.
- **Consecințe:** Avantaje și dezavantaje ale aplicării pattern-ului.

## Categorii de Design Patterns (GoF - Gang of Four)
- **Creational Patterns (Șabloane de Creare):** Se ocupă cu procesul de instanțiere a obiectelor.
    - **Factory Method:** Definește o interfață pentru crearea unui obiect, dar lasă subclasele să decidă ce clasă să instanțieze.
    - **Abstract Factory:** Oferă o interfață pentru crearea de familii de obiecte înrudite sau dependente, fără a specifica clasele concrete.
    - **Builder:** Separă construcția unui obiect complex de reprezentarea sa, permițând același proces de construcție să creeze reprezentări diferite.
    - **Singleton:** Asigură că o clasă are o singură instanță și oferă un punct global de acces la aceasta.
    - **Prototype:** Specifică tipurile de obiecte de creat folosind o instanță prototip și creează obiecte noi prin copierea acestui prototip.
- **Structural Patterns (Șabloane Structurale):** Se ocupă cu compunerea claselor și obiectelor.
    - **Adapter:** Convertește interfața unei clase într-o altă interfață pe care clienții o așteaptă.
    - **Bridge:** Decuplează o abstracție de implementarea sa, permițând ca cele două să varieze independent.
    - **Composite:** Compune obiecte în structuri arborescente pentru a reprezenta ierarhii parte-întreg. Permite clienților să trateze obiecte individuale și compoziții în mod uniform.
    - **Decorator:** Atașează responsabilități adiționale unui obiect dinamic. Oferă o alternativă flexibilă la moștenire pentru extinderea funcționalității.
    - **Facade:** Oferă o interfață unificată către un set de interfețe dintr-un subsistem.
    - **Flyweight:** Utilizează partajarea pentru a suporta un număr mare de obiecte fine-grained în mod eficient.
    - **Proxy:** Oferă un surogat sau un placeholder pentru un alt obiect pentru a controla accesul la acesta.
- **Behavioral Patterns (Șabloane Comportamentale):** Se ocupă cu algoritmii și alocarea responsabilităților între obiecte.
    - **Chain of Responsibility:** Evită cuplarea expeditorului unei cereri cu destinatarul său, permițând mai multor obiecte să încerce să o trateze.
    - **Command:** Încapsulează o cerere ca un obiect, permițând parametrizarea clienților cu operații diferite, cozi de cereri sau log-uri de operații.
    - **Iterator:** Furnizează o cale de acces secvențial la elementele unui obiect agregat, fără a expune reprezentarea sa internă.
    - **Mediator:** Definește un obiect care încapsulează modul în care un set de obiecte interacționează.
    - **Memento:** Capturează și externalizează starea internă a unui obiect fără a-i încălca încapsularea, astfel încât obiectul să poată fi restaurat la această stare ulterior.
    - **Observer:** Definește o dependență unu-la-mulți între obiecte, astfel încât, atunci când un obiect își schimbă starea, toate obiectele dependente sunt notificate și actualizate automat.
    - **State:** Permite unui obiect să-și modifice comportamentul atunci când starea sa internă se schimbă. Obiectul va părea că și-a schimbat clasa.
    - **Strategy:** Definește o familie de algoritmi, încapsulează fiecare dintre ei și îi face interschimbabili.
    - **Template Method:** Definește scheletul unui algoritm într-o operație, lăsând subclasele să redefinească anumiți pași ai algoritmului fără a-i schimba structura generală.
    - **Visitor:** Reprezintă o operație ce va fi efectuată pe elementele unei structuri de obiecte, permițând definirea unei operații noi fără a schimba clasele elementelor pe care operează.

## Avantaje
- **Reutilizabilitate:** Soluții testate și verificate.
- **Comunicare:** Un vocabular comun pentru design.
- **Flexibilitate și Extensibilitate:** Designuri mai adaptabile la schimbări.
- **Calitate:** Îmbunătățirea calității codului și a designului.

## Dezavantaje
- Pot adăuga complexitate dacă sunt folosite incorect.
- Necesită înțelegere profundă a problemei și a pattern-ului.
<br>
<br>
<br>

# 12. Dezvoltarea Orientată pe Aspecte

## Programarea Orientată Obiect (OOP):
- Paradigmă bazată pe modelarea entităților prin clase și comunicarea prin mesaje.
- **Concepte:** abstractizare, încapsulare, polimorfism.
- Beneficiază de șabloane de proiectare.

## Concerns (Interese)
- O funcționalitate necesară a unui sistem software, implementată de o secvență de cod.
- Problema apare când un concern (ex: logging, securitate, persistență) se "întretăie" cu funcționalitatea principală a mai multor clase.

## Crosscutting Concerns
- Situația în care o cerință a sistemului este îndeplinită prin plasarea de cod în diferite clase, dar acest cod nu ține de funcționalitatea specifică a conceptelor modelate de respectivele clase.
- **Exemple:** Logging, Securitate, Persistență.

## Împrăștierea Codului (Scattered Code)
Codul necesar unui concern este răspândit în mai multe clase și metode.

## Încâlcirea Codului (Tangled Code)
O singură metodă sau clasă implementează numeroase concern-uri.

## Efectele Întretăierii Intereselor:
- Clase dificil de administrat și de înțeles.
- Dificultăți în rescrierea, refolosirea, testarea, depanarea și optimizarea codului.

## Soluții OOP (limitate)
Template Pattern, Visitor Pattern. Acestea pot reduce împrăștierea, dar nu elimină complet problema crosscutting.

## Aspect Oriented Programming (AOP)
- Paradigmă de programare ce adresează separarea concern-urilor.
- Nu înlocuiește OOP, ci oferă un nivel suplimentar de abstractizare.
- Extinde platforme de programare existente.
- Pune la dispoziție un mecanism (limbaj, extensie) pentru descrierea concern-urilor ce întretăie alte componente.

## Programare la Meta-Nivel
- **Meta-obiecte:** entități ce descriu la nivel sintactic alte obiecte de bază.
- **Protocolul meta-obiectelor (MOP):** modalitate de a descrie și redefini semantica unui program.

## Abordarea Orientată pe Aspecte (Flux)
- **Descompunere:** Identificarea ```common concerns``` și ```crosscutting concerns```.
- **Implementare:** ```common concerns``` în clase, ```crosscutting concerns``` în aspecte.
- **Recompunere:** Un ```integrator``` (weaver) combină codul primar cu aspectele pe baza unor reguli de compunere.

## Tipurile de Integratoare (Weavers)
Compile-time, Link-time, Load-time, Run-time.

## Anatomia AOP
Limbaje de programare orientate pe aspecte (AspectJ, JBoss AOP, Spring AOP) și specificații pentru implementarea concern-urilor și definirea regulilor de integrare.

## AspectJ
- Extensie orientată aspect a platformei Java.
- Sintaxă Java-like.
- Standard de facto pentru AOP.
- **Specificațiile Limbajului:**
    - **Joinpoint:** O locație bine definită în codul primar unde un concern va întretăia aplicația (apel/execuție metodă/constructor, acces proprietate, tratare erori, inițializare statică).
    - **Pointcut:** Construcție sintactică ce specifică un set de joinpoints și expune contextul acestora (ex: ```call```, ```execution```, ```get```, ```set```).
    - **Advice:** Secvență de cod ce trebuie executată la un moment dat de un pointcut (```before```, ```after```, ```around```).
    - **Aspect:** O unitate modulară care încapsulează un crosscutting concern, conținând pointcuts, advice și declarații inter-type.

## Aspect vs. Clasă
- **Similitudini:** Ambele au tip, pot extinde, pot fi abstracte/concrete, pot avea stare și comportament.
- **Diferențe:** Aspectele pot avea pointcuts, advice, declarații inter-type; nu au constructori/destructori și nu pot fi create cu ```new```; aspectele privilegiate pot accesa membri privați.

## Scenarii de Utilizare a Aspectelor
- **Tracing:** Urmărirea fluxului informațiilor (apeluri de metode).
- **Verificarea Condițiilor:** Validarea și prelucrarea argumentelor metodelor.
- **Logging:** Înregistrarea cronologică a evenimentelor (apeluri, excepții).
- **Profiling:** Măsurarea performanței (timp de execuție).
- **Autorizare:** Controlul accesului la funcționalități pe baza permisiunilor utilizatorului.
