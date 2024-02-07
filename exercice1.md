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

### i et j sont de type int , x = float 2.0f , et y = float 3.0f;

- 16
- j = 4
- i = 3
- (3 * i(3) - 2 * j(4) ) / (2 * x(2.0) - y(3.0) ) = 1 / 1 = 1
- 2 * ((i(3) / 5) +(4 * (j(4) - 3)) % (i + j - 2)) = on applique ici les priorités Mathématique: 
- Parenthèses.
  Multiplications et divisions (y compris modulo), de gauche à droite.
  Additions et soustractions, de gauche à droite.
- donc resultat = 8.0;

- 1.125

# Exercice 9 : 

- x + n % p = 5 INT
- x + n / p = 0.57 double
- (x + n ) / p = 1.71 double
-   5 . * n = 50 int
- (n + 1) / n = -1.1 double
- (n + 1.0) / n = -1.1 double
- r + s / t  = 8.3 double
- r + t / s = 11 INT
- ( r + t ) / s = 4.14 double
- r + t % s = 8 INT
- (r + t ) % s = 1 INT
- r + s / r + s  =  15.8 double
- (r + s ) / ( r + s ) = 1 INT
- r + s % t = 9.7 double 

# Exercice  10 : 


## int valeur  = 7 , chiffre = 2,i1, i2 -- float f1,f2

- i1 = 3
- i2 = 0

-----------------------------------------------
# CHAPITRE 2 :

## exercice 1 : 

### int i = 233 , j = 135;
    float a = 335.5f , b = 20.5f;
    char R = 'R', T = 'T' ;


## réponses : 

- 223
- 335.5 + 223 - 135
- 20.5 , 6887.75/100
- R , T

## Suite voir exercice.java
# Exercice 2.3 : 

                  // Exercice champitre 2 , 2.2 :
            // double x = 4.0, y=2;
            //  System.out.println("Racine carré de " + x + " = " + y);
            // System.out.print(x + " a la puissance " + y + " = " +(x * x));
       /* double x = 9, y=3;
        System.out.println("Racine carre de "+ x + " = " + Math.sqrt(x));
        System.out.println(x + " a la puisance "+ y + " = " + Math.pow(x,y)); */
         int x , y;
//        Scanner lectureClavier  = new Scanner(System.in);
//        System.out.println("Entrez la valeur de x:");
//        x = lectureClavier.nextInt();
//        System.out.println("Entrez la valeur de y:");
//        y = lectureClavier.nextInt();
//        System.out.println("Entrez la valeur de x:");
//        x = lectureClavier.nextInt();
//        x = x + y; // 7
//        System.out.println(" x = " + x); // 7
//        System.out.println("y = " + y); // 3
//        int franc;
//        double  conversion,resultat;
//        Scanner lectureClavier = new Scanner(System.in);
//        lectureClavier.useLocale(Locale.US);
//        System.out.println("Entrez le nombre de franc");
//        franc = lectureClavier.nextInt();
//        System.out.println("entrez le taux de conversion : ");
//        conversion = lectureClavier.nextDouble();
//        System.out.println(" nous allons convertir " + franc + " franc , au taux suivant : " + conversion);
//        resultat = franc / conversion;
//        System.out.print("vous avez desormais :" + String.format("%.2f", resultat)+ " € ");




