# 1. Diseñe diagrama UML y construya programa en Java con base en los siguientes requerimientos:
### a) (2 puntos) 
Diseñe el diagrama UML (incluya paquete “lab_lis_ordinario”) de la aplicación
con base en los siguientes puntos (b-g).
### b) (2 puntos) 
Cree una clase Computer con los atributos model, manufacturer y
operatingSystem (tipo cadenas), agregue el método abstracto getComputerType
(el método no acepta ningún argumento y devuelve String "computadora de escritorio" o
"computadora portátil", según el tipo del objeto). Escriba también el método asbtracto
calculatePortabilityScore (sin argumentos, devuelve int), que devolverá la
categoría de portabilidad del dispositivo, de la siguiente manera: para laptop el método
devuelve el peso del dispositivo redondeado a un entero, y para desktop la fórmula es: 5 +
caseHeight/20. Asegúrese de que cada equipo debe implementar el método
calculatePortabilityScore.
### c) (1 punto) 
Cree la clase Desktop que hereda de la clase Computer, tiene el atributo
caseHeight (double)
### d) (1 punto) 
Cree la clase Laptop que hereda de la clase Computer e implementa de la
interface PortableDevice. La clase Laptop tiene los atributos batteryCapacity
(int) y weight (double).
### e) (1 punto) 
Cree la interface PortableDevice con los métodos getModel que regresa
cadena y getBatteryCapacity que regresa un entero.
### f) (1 punto) 
Cree una clase Notebook que hereda de Laptop. El método
calculatePortabilityScore de esta clase siempre devuelve 1 y
getComputerType devuelve "Computadora-laptop: NOTEBOOK". Además, coloque
‘final’ en la clase para que deshabilite la herencia, es decir, la clase Netbook no debe
heredar a otras subclases.
### g) (2 puntos) 
Escriba constructores con todos los atributos, los métodos get, set, y
toString en las clases. Además, escriba el método principal (main), en el que creará tres
objetos de cada clase (desktop, laptop, notebook), guárdelos en un ArrayList e imprima
datos de cada objeto.


Ejemplo de salida:

No. Modelo Marca SO Tipo
1 2020 IBM Linux Computadora de escritorio
2 2024 HP Win Computadora portátil
3 2022 Apple MacOS Computadora-laptop: NOTEBOOK
