# Documentation : Annotations de Tests JUnit

## @BeforeEach
- **Quand l’utiliser** :  
  Exécute une méthode **avant chaque test**.  
  Idéal pour **initialiser** ou **préparer** l’environnement de test.

## @AfterEach
- **Quand l’utiliser** :  
  Exécute une méthode **après chaque test**.  
  Parfait pour **nettoyer** ou **réinitialiser** après le test.

## @BeforeAll
- **Quand l’utiliser** :  
  Exécute une méthode **une seule fois avant tous les tests**.  
  Souvent utilisé pour **initialiser des ressources partagées** (doit être statique).

## @AfterAll
- **Quand l’utiliser** :  
  Exécute une méthode **une seule fois après tous les tests**.  
  Pratique pour **libérer les ressources** (doit être statique).

## @ParameterizedTest
- **Quand l’utiliser** :  
  Pour **répéter un test avec différentes données** d’entrée.  
  Utilise par exemple `@ValueSource` ou `@CsvSource`.

## @Timeout
- **Quand l’utiliser** :  
  Pour **limiter le temps d’exécution** d’un test.  
  Évite que des tests **trop longs ou bloqués** ne ralentissent la suite.
