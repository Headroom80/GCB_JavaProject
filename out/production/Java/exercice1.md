# Exercice 1:

- a = declaration valide de 3 variables qu'on initialise en INT.
- b = pas valide , puisque le calcul est a gauche.
- c = declaration valide
- d =declaration valide d'un variable de type CHAR.
- j = pas valide 
- f = declaration valide d'une variable X en int .
- g = declaration valide( mais sans bonne pratique) d'une variable 'A' en FLOAT (chiffre a virgule sans double précision)
- h = valide 
- i = valide 
- j = non valide.

# Exercice 2 : 

- C = 5
- B = 8.5
- A = 8.5

## 2.b : 

- B = 0.1
- C  = 0.1
- A = 0.1

# Exercice 3 :
- a = 6
- b = 2

## 3.b :

- valeur = 1

## 3.c : 

- x = 5
- y = 10
- z = 7
# Exercice 4 : 

### 1 :

- a = 7
- b = 7

### 2 :

- a = 5
- b = 5

---------------

# Exercice 5 : 

- a=b
- b=a

# Exercice 6 : 

```java
int a,b,c,tmp;

b=a;
c=b;
a=c;

si a = 1 , b = 2 , c = 3 :

2 = 1
1 = 3
a = 3, b = 1, c = 3
tmp = a - b;
c = tmp;
------------
b = a;
a = c;
tmp = a - b ; 
c = tmp;
```
# Exercice 7 : 

- echanger les valeur de a et b.

# Exercice 8 : 

### i et j sont de type int , x = float 2.0 , et y = float 3.0;

- 16
- j = 4
- i = 3
- (3 * i(3) - 2 * j(4) ) / (2 * x(2.0) - y(3.0) ) = 1 / 1 = 1
- 2 * ((i(3) / 5) +(4 * (j(4) - 3)) % (i + j - 2)) = 