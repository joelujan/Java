
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
//        System.out.println("Hola Mundo desde Java");
//        int myVariable = 25;
////        String palabra = "/t hola";
//        System.out.println(myVariable);
//        myVariable = 30;
//        System.out.println(myVariable);
//        //tipo String
//        String miVariableCadena = "Bienvenidos";
//        System.out.println(miVariableCadena);
//        miVariableCadena = "Sigamos creciendo en programación";
//        System.out.println(miVariableCadena);

//Var - inferencia de tipos en Java
        /* var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //soutv + tab

        //Reglas para definir una variable en Java:
        //No se pueden usar numeros ni caracteres especiales como primer caracter de nuestra variable
        //La ariable si puede iniciar con _(guion bajo) pero no es comun
        //Tambien se puede utilizar el signo dolar ($)
        //Se pueden usar tildes pero tampoco es recomendable
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        //Para ordenar nuestro código podemos apretar click derecho y buscar la opción "format"
         */
 /*
        var a = 8;
        var b = 4;
        System.out.println(a + b); //Si la primer variable es una cadena, entonces va a concatenar las variables.
        //Si la primer variable es un número, va a intentar SUMAR las variables.
        //Si agrego paréntesis a las variables numéricas, va a concatenar la variable cadena con el resultado de la suma.
         */
 /*
        var nombre = "Natalia";
        System.out.println("Nueva linea:\n" + nombre); // \n genera un salto de linea.
        System.out.println("Tabulador: \t" + nombre); // \t genera un espacio ancho como cuando apretamos tab para espacio.
        System.out.println("\t\t.:MENÚ:.");
        System.out.println("Retroceso: \b\b" + nombre); // \b borra un espacio o letra por cada \b que ingresemos
        System.out.println("Comillas simples: \'" + nombre + "\'"); // \' te imprime una comilla simple en la posicion que hayas puesto
        System.out.println("Comillas dobles: \"" + nombre + "\""); // \"" imprime una comilla doble donde lo hayamos posicionado
         */
        //
        //Clase Scanner
        /*
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine(); //Se utiliza para leer dato ingresado por el usuario
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el título: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);
         */
 /*
        byte numEnteroByte = (byte)127; //Poner el tipo en parénesis quita el error de minimos y maximos pero agrega margen de erro y perdida de precision, en resumen no sirve para nada.
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor mínimo del Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo del Byte: " + Byte.MAX_VALUE);
        
        short numEnteroShort = (short)32767; //Poner el tipo en parénesis quita el error de minimos y maximos pero agrega margen de erro y perdida de precision, en resumen no sirve para nada.
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del short: " + Short.MAX_VALUE);
        
        int numEnteroInt = (int)2147483648L; //Para el caso del int es necesario aparte de agregarle (int) agregar L mayuscula al final.
        System.out.println("numEntero = " + numEntero);
        System.out.println("Valor minimo del int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del int: " + Integer.MAX_VALUE);
        
        long numEnteroLong = 9223372036854775807L; //Para un numero long hay que agregarle SI o Si la L al final.
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("El valor maximo de Long: " + Long.MAX_VALUE);
        System.out.println("El valor minimo de Long: " + Long.MIN_VALUE);
        
        float numFloat = 3.4028235E38F; //Se agrega la F mayuscula porque Java detecta el . decimal como tipo Double en vez de float
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de float es: " + Float.MIN_VALUE);
        System.out.println("El valor maximo de floar es: " + Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308; //No hace falta agregar la D porque por defecto detecta Double
        System.out.println("numDouble = " + numDouble);
        System.out.println("Max Double: " + Double.MAX_VALUE);
        System.out.println("Min Duble: "+ Double.MIN_VALUE);


// Inferencia de tipos var y tipos primitivos
        var numEntero = 20;//Las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0; //Automaticamente con el punto decimal se transforma en tipo double
        
        
        

//Tipos primitivos char
        /*      char miVariableChar = 'a';
        System.out.println("miVariableChar: " + miVariableChar);

        char varCaracter = '\u0024';//Indicamos a Java la asignacion con el codigo unicode
        System.out.println("varCaracter: " + varCaracter);

        char varCaracterDecimal = 36;//Valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal: " + varCaracterDecimal);

        char varCaracterSimbolo = '$';//Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo: " + varCaracterSimbolo);

   
        var varCaracter1 = '\u0024';//Indicamos a Java la asignacion con el codigo unicode
        System.out.println("varCaracter1: " + varCaracter1);

        var varCaracterDecimal1 = (char)36;//Valor entero y le asigna un tipo Int, luego hacemos el cambio
        System.out.println("varCaracterDecimal1: " + varCaracterDecimal1);

        var varCaracterSimbolo1 = '$';//Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1: " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';//el valor decimal q se le asigna en el unicode 
        System.out.println("varEnteroChar: " + varEnteroChar);

        int caracterChar = 'b';//aca encontramos el valor del juego de caracteres unicode
        System.out.println("caracterChar = " + caracterChar);
       
        //Tipos primitivos tipos booleanos
        boolean varBool = true;
        System.out.println("varBool = " + varBool);

        if (varBool) {
            System.out.println("La bandera es verde");

        } else {
            System.out.println("La bandera es roja");
        }

 
       //var num1 = 5, var = 4;  esto no se puede hacer con inferencia de tipos, es una restriccion
        int num1 = 5 ,num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion de la suma " + solucion);
        
        solucion = num1 - num2;
        System.out.println("solucion de la resta= " + solucion);
        
        solucion = num1 * num2;
        System.out.println("solucion de la multiplicacion= " + solucion);
        
        solucion = num1 / num2;
        System.out.println("solucion de la division= " + solucion);
        
        var solucion2 = 3.4/num2;
        System.out.println("solucion2 de la division= " + solucion2);
        
        solucion = num1 % num2; //guarda el residuo entero de la division
        System.out.println("solucion2 = " + solucion2);
        
        if (num1 % 2 == 0)
            System.out.println("Es un numero par");
        else
            System.out.println("Es un numero impar");
        
        //Operadores de composición
        int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2; // una operacion
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1; //varNum1 = varNum1 + 1;
        System.out.println("varNum1 sumandole 1= " + varNum1);
        
        //-= *= /= %=
       varNum1 -= 1;
        System.out.println("varNum1 restandole 1= " + varNum1);
        
       varNum1 *= 3;
        System.out.println("varNum1 multiplicado por 3= " + varNum1);
        
        varNum1 /= 3;
        System.out.println("varNum1 dividido 3= " + varNum1);
        
        varNum1 %= 3;
        System.out.println("varNum1 el residuo de 3 = " + varNum1);
         
 
         //Operadores de igualdad y relacionales 
         var aNum = 5;
         var bNum = 5;
         var cNum = (aNum == bNum); //true or false
         System.out.println("cNum = " + cNum);
         
         var dNum = aNum != bNum ;
         System.out.println("dNum = " + dNum);
        
        //Operadores Unarios: Cambio de signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        
        //Operadores de Negacion
        var varC = true; //Esta literal por default en Java es de tipo Boolean
        var varD = !varC; //Aqui esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //Operadores Unarios de incremento: Preincremento
        var varE = 9;//se va a modificar su valor
        var varF = ++varE; //SIMBOLO antes de la variable
        //Primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE);
        System.out.println("varF = " + varF);
        
        //PostIncremento(el simbolo va después de la variable
        var varG = 3;
        var varH = varG++;//Primero el valor, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //Operadores unarios de decremento: Predecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);//la variable ya esta con decremento
        System.out.println("varJ = " + varJ);
        
        //Postdecremento
        var varK = 8;
        var varL = varK--;//primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK);//aquí va a decrementar en 1
        System.out.println("varL = " + varL);
        
        //Operadores de igualdad y relacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;  //comparacion de referencias de objetos
        System.out.println("cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB); //comparacion de contenido de los objetos de tipo String
        System.out.println("fVar = " + fVar);

        var gVar = aNum >= bNum;       // > < >= <= == !=
        System.out.println("gVar = " + gVar);

        if (aNum % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        //Operador condicional And 
        var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establecido");
        }

        var vacaciones = false;
        var diaLibre = false;
        if (vacaciones || diaLibre) {
            System.out.println("Papá puede asistir al juego de su hijo");
        } else {
            System.out.println("Papá no puede asistir al juego de su hijo");
        }

        //Operadores ternarios(tiene 3 partes, la primera es una condicion a evaluar, la segunda despues de comparar nos va a regresar un valor y la tercera regresará un valor diferente
        //Se recomienda con expresiones sencillas
        var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);

        var numeroT = 4;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT" + resultadoT);
         */
        //Prioridad de los operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--; //primero va a preincrementar a x, luego postdecrementara a y, esto significa que deja el valor de y los sumar y decrementa y en su variable
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var solucionAritmetica = 4 + 5 * 6 / 3;//primero 5*6, (30, luego dividido 3),10 y despúes lo suma de 4, 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4 + 5) * 6 / 3; //4+5 primero, 9 * 6,54 luego lo divido por 3,18
    }
}
