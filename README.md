## Inleiding
Je bent net begonnen als developer bij een bedrijf genaamd Tech It Easy, dat TV's verkoopt. Tijdens de cursus Spring Boot ga jij een backend applicatie programmeren voor het bedrijf. De winkel heeft een inventaris van televisies die moet worden bijgehouden. Na iedere les gaan we deze applicatie een stukje verder uitbouwen door middel van de huiswerkopdrachten. Zo krijg je stap-voor-stap meer ervaring in het bouwen van een backend applicatie. Aan het einde van de cursus zullen we een werkende Tech It Easy backend applicatie hebben!

## Opdrachtbeschrijving
Je gaat via de Spring Boot Initialzr een project aanmaken, waarbij je gebruikmaakt van de volgende dependency:
- Spring Web

Gedurende de cursus Spring Boot zal het langzamerhand duidelijk worden waarom je deze dependency nodig hebt. Voor nu mag je dit gewoon van ons aannemen! 

## Randvoorwaarden
De opdracht moet voldoen aan de volgende voorwaarden:

- Het project bevat, op de juiste plaats in de map-structuur, een map genaamd `Controllers`;
- Het project bevat, op de juiste plaats in de map-structuur, een map genaamd `Exceptions`;
- Het project bevat een `TelevisionsController`;
- Het project bevat een `ExceptionController`;
- Het project bevat een `RecordNotFoundException`;
- De **TelevisionsController** bevat: 
  - een GET-request voor alle televisies
  - een GET-request voor 1 televisie
  - een POST-request voor 1 televisie
  - een PUT-request voor 1 televisie
  - een DELETE-request voor 1 televisie
- De **ExceptionController** bevat:
  - een exceptionhandler
- De **RecordNotFoundException** bevat:
  - een default exception 
  - een exception met message

### Belangrijk
Bij het inleveren van deze opdracht is de applicatie nog niet functioneel, omdat we hier meer kennis over andere technieken voor nodig hebben die later in de cursus aan bod komt.

Je mag de volgende return fragmenten gebruiken:
  - `ResponseEntiteit.ok()`
  - `ResponseEntiteit.created()`
  - `ResponseEntiteit.noContent()`

Door het gebruik van deze return fragmenten zul je de volgende foutmeldingen tegenkomen:
- `incompatible types found`
- `created .... cannot be applied to ()`
Deze mag je negeren tijdens het maken van deze opdracht.

## Stappenplan
_Let op_: het is uitdagender om jouw eigen stappenplan te maken. Mocht je niet zo goed weten waar je moet beginnen, kun je onderstaand stappenplan volgen:

1. Zet een nieuw project op via Spring Boot Initialzr genaamd TechItEasy.
2. Maak een nieuwe map aan in je project genaamd Controllers.
3. Maak een nieuwe map aan in je project genaamd Exceptions.
4. Maak een nieuwe klasse aan in de map Controllers voor de TelevisionController.
5. Voorzie de klasse van de juiste annotatie.
6. Maak in de klasse de gevraagde requests aan met de juiste response entities.
7. Maak een nieuwe klasse aan in de map Controllers voor de ExceptionController.
8. Voorzie de klasse van de juiste annotatie.
9. Maak in de klasse een exceptionHandler met de juiste notatie en response entitiy.
10. Maak een nieuwe klasse aan in de map Exceptions.
11. Extent de klasse met de RunTimeException.
12. Vul de klasse aan aan de hand van het voorbeeld in hoofdstuk 5.11 van de cursus Spring Boot.
------------------------------------------------------------------------------------------------------------------------

# Opdrachtbeschrijving Model/Repository

## Inleiding

Je bent net begonnen als developer bij een bedrijf genaamd Tech It Easy, dat TV's verkoopt. Tijdens de cursus Spring Boot ga jij een backend applicatie voor hen programmeren. De winkel heeft een inventaris van televisies die moet worden bijgehouden. Na iedere les gaan we deze applicatie een stukje verder uitbouwen in de vorm van huiswerk. Zo krijgen we stap-voor-stap meer ervaring in het bouwen van een backend applicatie. Aan het einde van de cursus zullen we een werkende Tech It Easy backend hebben!

## Recap van vorige opdracht

Je hebt de vorige les een begin gemaakt voor de applicatie voor je werkgever TechItEasy. Je hebt een controller aangemaakt met verschillende endpoints. Deze kunnen aangeroepen worden via een frontend. Jij maakt hiervoor gebruik van Postman. Omdat we niet weten of alles bestaat wat de gebruiker opvraagt heb je ook een exception controller gemaakt en een RecordNotFound exception. Na een nieuwe les Spring boot ben je klaar voor de volgende stap van het bouwen van je applicatie.

## Randvoorwaarden

- Het project bevat, op de juiste plaats in de map-structuur, een map genaamd `Models`;
- Het project bevat, op de juiste plaats in de map-structuur, een map genaamd `Repositories`;
- Het project bevat een `Television` in de map `Models`;
- Het project bevat een `TelevisionRepository`;
- Het project bevat de volgende dependencies:
  - `Spring Web`
  - `Spring Data Jpa`
  - `PostgreSQL Driver`
- De **Application.properties** bevat de properties uit hoofdstuk 9.2 van de cursus Spring Boot(met aangepaste namen)
- De **TelevisionRepository** extends JpaRepository met de juiste parameters
- De **Television** bevat:
  -de attributen:
  - Long id (incl. annotaties id en generatedValue)
  - String type
  - String brand
  - String name
  - Double price
  - Double availableSize
  - Double refreshRate
  - String screenType
  - String screenQuality
  - Boolean smartTv
  - Boolean wifi
  - Boolean voiceControl
  - Boolean hdr
  - Boolean bluetooth
  - Boolean ambiLight
  - Integer originalStock
  - Integer sold
  - default constructor
  - constructor
  - alle getters en setters

### Belangrijk
- Bij het inleveren van deze opdracht is deze applicatie nog niet functioneel, hier hebben we meer kennis over andere technieken voor nodig.
- Laat de _application.properties_ overeenkomen met de gegevens van `PgAdmin`
- Je mag de volgende return fragmenten gebruiken:
  - `ResponseEntiteit.ok()`
  - `ResponseEntiteit.created()`
  - `ResponseEntiteit.noContent()`

Door het gebruik van deze return fragmenten zul je de volgende foutmeldingen tegenkomen:
- `incompatible types found`
- `created .... cannot be applied to ()`
  Deze mag je negeren tijdens het maken van deze opdracht.

## Stappenplan
_Let op_: het is uitdagender om jouw eigen stappenplan te maken. Mocht je niet zo goed weten waar je moet beginnen, kun je onderstaand stappenplan volgen:

1. Voeg de benodigde dependencies toe aan je _POM.xml_ en laat `Maven` deze instaleren
2. Voeg aan de _application.properties_ de benodigde properties toe
3. Maak een nieuwe database aan in `PgAdmin` (zorg dat de naam overeenkomt met de properties in je _application.properties)
4. Maak een nieuwe map aan in je project voor `Models`
5. Maak een nieuwe klasse genaamd `Television`
6. Voeg de annotatie **@Entity** toe aan de klasse
7. Voeg de juiste _attributen_ toe aan de klasse
8. Voeg de beide _constructors_ toe aan de klasse
9. Voeg alle _getters & setters_ toe aan de klasse
10. Maak een nieuwe map aan in je project voor `Repositories`
11. Voeg aan deze map een nieuwe klasse toe genaamd `TelevisionRepository`
12. Extend de _repository_ met de `JpaRepository` en geef de juiste attributen mee 

------------------------------------------------------------------------------------------------------------------------

# Opdrachtbeschrijving

## Inleiding
Je bent net begonnen als developer bij een bedrijf genaamd Tech It Easy, dat TV's verkoopt. Tijdens de cursus Spring Boot ga jij een backend applicatie programmeren voor het bedrijf. De winkel heeft een inventaris van televisies die moet worden bijgehouden. Na iedere les gaan we deze applicatie een stukje verder uitbouwen door middel van de huiswerkopdrachten. Zo krijg je stap-voor-stap meer ervaring in het bouwen van een backend applicatie. Aan het einde van de cursus zullen we een werkende Tech It Easy backend applicatie hebben!

## Recap van vorige opdracht
Je hebt in de vorige les de applicatie voor je werkgever TechItEasy uitgebreid met een `Model` en een `Repository`. Een `Model` is een _Klasse_ in je project en bevat _variabelen_ en _constructors_, en geven de mogelijkheid om meerdere objecten aan te maken in je database van deze _Klasse_. De `Repository` is verlengd met de `JpaRepository`, daardoor kan je de standaard find-functies uitvoeren in de `Service` die we in de komende les toevoegen aan het project. Naast de standaard _query's_ die al staan in de `JpaRepository` kunnen we later eventueel nog _query's_ schrijven in de `Repository` voor wat moeilijkere _find_ functies. Maar hoe gaaf zou het zijn als het project zou kunnen draaien? Goed nieuws: na deze les werkt het project en geeft het de juiste response als we requests doen via `Postman`.

## Randvoorwaarden
De opdracht moet voldoen aan de volgende voorwaarden:
- Het project bevat, op de juiste plaats in de map-structuur, een map genaamd `Services`;
- De map `Services` bevat een _klasse_ genaamd `TelevisionService`;
- De `TelevisionService` bevat:
  - de juiste _annotatie_
  - een _private_ variabele `TelevisionRepository`
  - de connectie van de `Service` en de `Repository` door middel van een _autowired_
  - een _functie_ voor het ophalen van alle `Televisions`
  - een _functie_ voor het ophalen van 1 `Television`
  - een _functie_ voor het opslaan van 1 `Television`
  - een _functie_ voor het verwijderen van 1 `Television`
  - een _functie_ voor het updaten van 1 `Television`
- De `Controller` is door middel van een _autowired_ gelinkt aan de `Service`;
- Het project bevat, op de juiste plaats in de map-structuur, een map genaamd `Dtos`;
- De map `Dtos` bevat een `TelevisionDto` en een `TelevisionInputDto`;
- De _requestMappings_ in de `Controller` worden aangepast zodat deze de juiste response doorgeven via de `Service`;
- De `Service` maakt gebruik van de gegevens die we via de `Controller` doorkrijgen van de `Dtos`;
- Het project bevat de _validator_ dependency uit paragraaf 8.1 van de cursus Spring Boot in Edhub.

### Belangrijk
- Na deze les moeten de _requestMappings_ in de controller de juiste responses geven.
- Na deze les is de applicatie voor het eerst functioneel.

Het is belangrijk om goed te begrijpen hoe de lagen in onze multi-tier application samenwerken:
- De `Controller` ontvangt een verzoek op een _endpoint_, als er _variable_ worden meegeven aan dit verzoek komen die binnen via de `TelevisionInputDto` ->
- De `Controller` geeft aan de hand van het verzoek en eventuele meegekregen _variable_ dit door aan de `Service` ->
- De `Service` spreekt aan de hand van de geschreven functie de `Repository` aan met de juiste _find_ functie/query ->
- De `Repository` gaat aan de hand van het bijbehorende `Model` zoeken naar de juiste gegevens en stuurt deze terug naar de `Service` ->
- De `Service` past de logica toe uit de functie en geeft de response aan de hand van de `TelevisionDto` terug aan de `Controller`
  (De controller wordt vanuit de _front-end_ of vanuit _Postman_ aangesproken, en geeft ook het antwoord weer terug.)

## Stappenplan
_Let op_: het is uitdagender om jouw eigen stappenplan te maken. Mocht je niet zo goed weten waar je moet beginnen, kun je onderstaand stappenplan volgen:

1. Voeg de benodigde dependencies toe aan je _POM.xml_ en laat `Maven` deze installeren.
2. Maak een map genaamd `Services` aan in de map-structuur.
3. Maak een _klasse_ genaamd `TelevisionService` aan in de map `Services`.
4. Voeg de `Service` _annotatie_ boven de _klasse_ toe.
5. Maak in de `TelevisionService` een _private_ variabele aan voor de `TelevisionRepository`.
6. Voeg een `@Autowired` toe om de `Repository` in de `TelevisionService` te kunnen gebruiken.
7. Maak in de `TelevisionService` de functie _getTelevisions_ aan de hand van het voorbeeld in paragraaf 6.2 van de cursus Spring Boot cursus in Edhub.
8. Doe dit ook voor de _getTelevision_, _saveTelevision_, _updateTelevision_ en de _deleteTelevision_.
9. Maak in de `TelevisionController` een `@Autowired` om de `Service` te kunnen gebruiken in de `Controller`.
10. Maak in het project een map aan genaamd `Dtos`.
11. Maak in deze map een klasse aan genaamd `TelevisionDto`.
12. Definieer in deze klasse alle variabele die een `Television` object bevat (dezelfde als in het model gedefinieerd staan).
13. Maak daaronder een `public` `static` functie aan genaamd _fromTelevision_. Deze heeft als returnwaarde `TelevisionDto` en als attribuut `Television television`.
14. Maak in deze functie een `var dto = new TelevisionDto();`.
15. Voeg in de functie voor iedere _variable_, die je boven deze functie hebt gedeclareerd een toewijzing naar de dto variable (bijvoorbeeld: `dto.name = television.getName();` ).
16. Return als laatste stap in deze functie het _dto_ object en sluit de functie af.
17. Maak een klasse aan in de map `Dtos` genaamd `TelevisionInputDto`.
18. Definieer ook in deze klasse alle variabelen die een `Television` object bevat.
19. Maak een `public` functie genaamd `toTelevision()` met returnwaarde `Television`.
20. Maak in deze functie een `var television = new Television();`.
21. Voeg in de functie voor iedere _variable_, die je boven deze functie hebt gedeclareerd, een toewijzing naar de television variabele (bijvoorbeeld: `television.setName(name);` ).
22. Pas de `RequestMappings` in de `TelevisionController`, zodat de controller het verzoek doet aan de _servicelaag_ en het response ook ontvangt van de _servicelaag_ (dit is omdat we de `Controller` eigenlijk zo dom mogelijk willen houden).
23. Pas de _servicelaag_ zo aan dat deze gebruikmaakt van de gegevens die de _controllerlaag_ doorgeeft. De `Service` moet hier dan de logica aan toepassen om met gebruik van de `Dtos` een _returnwaarde_ terug te kunnen sturen naar de controller.

------------------------------------------------------------------------------------------------------------------------

# Opdrachtbeschrijving

## Inleiding

Je bent net begonnen als developer bij een bedrijf dat TV's verkoopt: Tech It Easy. Tijdens de cursus Spring Boot ga jij een backend applicatie programmeren voor het bedrijf. De winkel heeft een inventaris van televisies die moet worden bijgehouden. Na iedere les gaan we deze applicatie een stukje verder uitbouwen door middel van de huiswerkopdrachten. Zo krijg je stap-voor-stap meer ervaring in het bouwen van een backend applicatie. Aan het einde van de cursus zullen we een werkende Tech It Easy backend applicatie hebben!

## Recap van vorige opdracht

Je hebt inmiddels je applicatie draaiende gekregen. Dit geeft je de mogelijkheid om in een database bij te houden welke tv's er zijn in de inventaris van TechItEasy. Als je de benamingen hebt aangehouden die we tot nu toe hebben gebruikt, kunnen we een _data.sql_ gaan maken waardoor we gegevens in de database kunnen zetten. Dit is een soort van pre-fill van je database.

## Opdrachtbeschrijving
In deze opdracht ga je aan de slag met het toevoegen van relaties aan je applicatie.

## Randvoorwaarden
De opdracht moet voldoen aan de volgende voorwaarden:

Het project bevat de volgende `Models`:
- `Television`
- `RemoteController` met de _variables_:
  -_Long_`id`
  -_String_`compatibleWith`
  -_String_`batteryType`
  -_String_`name`
  -_String_`brand`
  -_Double_ `price`
  -_Integer_ `originalStock`
- `CI-Module` met de _variables_:
  -_Long_ `id`
  -_String_ `name`
  -_String_ `type`
  -_Double_ `price`
- `WallBracket` met de _variables_:
  -_Long_ `id`
  -_String_ `size`
  -_Boolean_ `ajustable`
  -_String_ `name`
  -_Double_ `price`
  Voor elk van deze modellen bevat je applicatie ook een `Repository`, `Controller`, `Dto`, `InputDto` en een `Service`.

Daarnaast bevat het project:
- Een `OneToOne` relatie tussen `Television` en `RemoteController`
- Een `OneToMany` relatie tussen `Television` en `CI-Module`
- Een `ManyToMany` relatie tussen `Television`en `WallBracket`

### Belangrijk
Je mag de constructors uit de modellen weglaten. Deze vult Spring Boot automatisch in als ze niet gedefinieerd zijn. Ook uit de `Television` mogen de constructors verwijderd worden.

## Stappenplan
_Let op_: het is uitdagender om jouw eigen stappenplan te maken. Mocht je niet zo goed weten waar je moet beginnen, kun je onderstaand stappenplan volgen:

1. Maak in de map `Models` een _klasse_ aan voor `RemoteController`, `CI-Module` en `WallBracket` (voeg de juiste _annotatie_, _variables_, _getters&setters_ en _constructors_ toe).
2. Maak in de map `Repositories` voor elk model een `Repository` aan (die elk de `JpaRepository` _extends_ bevat).
3. Maak in de map `Controllers` voor elk model een `Controller` aan (met juiste _annotatie_, _@Autowired_ en _requestMappings_).
4. Maak in de map `Dtos` voor elk model een `Dto` en `InputDto` aan (met juiste _variables_ en toewijzingen).
5. Maak in de map `Services` voor elk model een `Service` aan (met juiste _annotatie_, _@Autowired_ en _functions_).
6. Leg een OneToOne relatie tussen `Television` en `RemoteController` door in beide _models_ _@OneToOne_ toe te voegen, gevolgd door het model waar de relatie mee ligt in de vorm van `Model` `object` (bijvoorbeeld `Television` `television`) op de volgende regel.
7. Een OneToOne relatie heeft een eigenaar nodig. Maak de `Television` eigenaar door in `RemoteController` achter de _@OneToOne_ _mappedBy_ toe te voegen op deze manier _@OneToOne(mappedBy = "remotecontroller"). Dit zorgt ervoor dat in de `Television` tabel een kolom wordt toegevoegd met de naam `remotecontroller_id`. Vergeet niet de getter en setter toe te voegen na het leggen van de relatie in de modellen.
8. Om deze kolom te vullen zal je in _servicelaag_ ook een functie moeten maken die een koppeling maakt tussen de `Television` en de `RemoteController`. Dit doe je in de `TelevisionService`.
9. Voeg de functie "assignRemoteControllerToTelevision" toe in de `TelevisionService`. Zoals je ziet, herkent de `TelevisionService` de `RemoteControllerRepository` niet, dit komt omdat we deze nog niet gekoppeld hebben met een _@Autowired_, gelukkig hoef je niet alles opnieuw te doen. Je kan bovenaan in de `TelevisionService` onder de private `TelevisionRepository` een private `RemoteControllerRepository` declareren. En dan in de bestaande _@Autowired_ deze toevoegen op dezelfde manier als de `TelevisionRepository`. Dit resulteert in:
   `@Autowired
   public TelevisionService (TelevisionRepository televisionRepository, RemoteControllerRepository remoteControllerRepository) {
   this.televisionRepository = televisionRepository;
   this.remoteControllerRepository = remoteControllerRepository;}`
10. Om deze functie uit te kunnen voeren moet je in de `TelevisionController` een _PutRequest_ maken met endpoint _"/televisions/{id}/remotecontroller"_ om aan te spreken. Voeg deze toe en geef de _televisionId_ mee als _@PathVariable_ en de _remoteControllerId_ als _@RequestBody_ door middel van een `IdInputDto` _input_.
11. Hiervoor missen we nog de `IdInputDto`. Maak in het mapje `Dtos` een nieuwe klasse aan voor de `IdInputDto`. Declareer in deze dto een _public Long id_ toe, meer hoeft er niet in.
12. Gefeliciteerd, je hebt zo juist de eerste relatie gelegd in je applicatie!
13. Alleen als je nu met een get alle `Televisions` ophaalt, zie je geen `RemoteController`. Dit komt omdat we in de `TelevisionDto` nog niks hebben verteld over de `RemoteController`. De makkelijkste manier om hier de connectie te leggen is de `public RemoteControllerDto remoteController;` toe te voegen aan de variabele van de `TelevisionDto`
14. Test alle functies die je tot nu toe hebt gemaakt met Postman.

## Bonusopdrachten
In deze opdracht heb ik een relatie uitgelegd aan de hand van het stappenplan. Als je hier makkelijk doorheen gaat, mag je ook de _one to many_ relatie maken tussen `Television` en `CIModule`. Hierbij is het nodig dat meerdere tv's één ci-module kunnen hebben.
Als zelfs de _one to many_ redelijk eenvoudig voor je is, mag je een _many to many_ relatie leggen tussen `Television` en `WallBracket`. Dus meerdere tv's kunnen meerdere wallbrackets hebben en andersom.

-------------------------------------------------------------------------------------------------------------------------

# Opdrachtbeschrijving

## Inleiding

Je bent net begonnen als developer bij een bedrijf genaamd Tech It Easy, dat tv’s verkoopt. Tijdens de cursus Spring Boot ga jij een backend applicatie voor het bedrijf programmeren. De winkel heeft een inventaris van televisies die moet worden bijgehouden. Na iedere les gaan we deze applicatie een stukje verder uitbouwen in de vorm van huiswerk. Zo krijgen we stap-voor-stap meer ervaring in het bouwen van een backend applicatie. Aan het einde van de cursus zullen we een werkende Tech It Easy backend hebben!

## Recap van vorige opdracht

De vorige opdracht was een best pittige opgave, maar als alles gelukt is, heb je een applicatie met meerdere modellen en relaties gevormd. Super gaaf! Hier wordt de opdrachtgever dolblij van, maar hij vindt wel dat er veilig gebruikgemaakt moet worden van de app. Het zou niet tof zijn als de inventaris bijvoorbeeld door klanten zelf aangepast kan worden. Hiervoor moet je gaan nadenken over een inlogsysteem. Daar komt veel bij kijken. Je wilt namelijk niet dat een `Hacker` deze met gemak het inlogsysteem kan omzeilen. Daarom is het belangrijk om het inloggen te beveiligen. Dat ga je in deze opdracht doen.

## De opdracht
Maak de beveiliging voor de applicatie met een JWT. Zorg hierbij dat er een user(employee) aangemaakt kan worden door de admin en dat de user en admin verschillende dingen (taken) mogen/kunnen. Enkel iemand met een admin-rol mag bijvoorbeeld authorities aanmaken of verwijderen en alle users opvragen.

## Randvoorwaarden
De opdracht moet voldoen aan de volgende voorwaarden:
- De `POM` bevat de _spring-boot-starter-security_ dependency
- De applicatie bevat:
  - `GlobalCorsConfiguration`
  - `SpringSecurityConfig`
  - `AuthenticationController`
  - `UserController`
  - `UserDto` (of `UserDto en UserInputDto`)
  - `UsernameNotFoundException`
  - `JWTFilter`
  - `Authority`
  - `AuthorityKey`
  - `User`
  - `AuthenticationRequest`(vorm van inputDto)
  - `AuthenticationResponse` (vorm van dto)
  - `UserRepository`
  - `CustomUserDetailService`
  - `UserService`
  - `JwtUtil`
  - `RandomStringGenerator`
- Binnen de applicatie wordt rekening gehouden met CORS
- De applicatie moet draaien met toegang tot de endpoints voor de juiste gebruikers geven

### Belangrijk
- De applicatie moet geen toegang geven zonder authenticatie en identificatie;
- De applicatie heeft een user(employee)- en een admin-rol;
- De applicatie moet draaien met toegang tot de endpoints voor de juiste gebruikers;
- Los alle comments op uit de toegevoegde klassen, na het kopiëren en plakken van die klassen.

## Stappenplan

1. Voeg de volgende dependencies toe aan je POM.XML.
- `<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-security</artifactId>
  </dependency>`
- `<dependency>
  <groupId>io.jsonwebtoken</groupId>
  <artifactId>jjwt</artifactId>
  <version>0.9.1</version>
  </dependency>`

2. Voeg de `User`, `Authority` en de `AuthorityKey` toe als modellen.

3. Voeg een `UserRepository` toe aan het project.

4. Voeg de `UserDto` toe aan de applicatie.

5. Voeg een map toe genaamd `utils`. Voeg hier de `JwtUtil` en de `RandomStringGenerator` toe aan het project.

6. Voeg de `UserService` en de `CustomUserDetailService` toe aan het project.

7. Voeg de `BadRequestException` en de `UsernameNotFoundException` toe aan je project en zorg dat de exception handlers zijn toegevoegd in je `ExceptionController`.

8. Voeg een nieuwe map genaamd `payload` met daarin de `AuthenticationRequest` en de `AuthenticationResponse` toe aan het project.

9. Voeg de `AuthenticationController` en de `UserController` toe aan je project.

10. Voeg de `JwtRequestFilter` toe aan je project in een map genaamd `filter`.

11. Voeg als laatste de `SpringSecurityConfig` en de `GlobalCorsConfiguration` toe aan het project.

12. Kijk goed of je in de `SpringSecurityConfig` nog antmatchers wil/moet toevoegen.

13. Update de data.sql met users en authorities.

14. Check goed of je alle opdracht-comments hebt uitgevoerd.


