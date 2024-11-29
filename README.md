### Definicion de Datos y Clases Genericas 

## ¿Que son los datos genericos?
Los datos genéricos son una forma de abstraer el tipo de dato que una estructura o clase puede manejar. Permiten que una clase, método o estructura de datos trabaje con cualquier tipo de dato sin necesidad de escribir implementaciones específicas para cada tipo.
Por ejemplo:
* Una lista genérica puede almacenar tanto enteros como cadenas u objetos personalizados.
* El metodo de busqueda binaria y burbuja genérica puede manejar cualquier tipo de dato definido en tiempo de compilación.
Esta flexibilidad se logra mediante el uso de parámetros de tipo (como <T>), que se especifican al momento de usar la clase o el método.

## ¿Que son las clases genericas?
Las clases genéricas son plantillas que permiten definir una clase que puede operar con diferentes tipos de datos, declarados dinámicamente al momento de instanciarla. En Java, estas clases utilizan notación con ángulos (<>) para definir uno o más parámetros de tipo.
Por ejemplo:
* En lugar de crear una clase PilaDeEnteros y otra PilaDeCadenas, podemos crear una única clase Pila<T> que funcione para cualquier tipo T.
Ventajas de las clases genéricas:
1. Reutilización de código: No necesitas crear múltiples versiones de la misma estructura para diferentes tipos de datos.
2. Seguridad de tipos: Los errores de tipo se detectan en tiempo de compilación, evitando fallos en tiempo de ejecución.
3. Flexibilidad: Puedes trabajar con cualquier tipo de dato sin limitar la funcionalidad de la clase.
4. 
## Interpretacion
Al poder crear una lista de diferentes datos el codigo no se hace tan extenso, y se evita de programar una infinidad de listas.
Las clases genericas son muy eficientes a la hora de trabajar con diferentes tipos de datos, y me ayudan a evitar crear varios codigos de ordenamiento o busqueda para cada lista que contiene diferentes tipos de datos.

## Ejemplo del proyacto
En este proyecto se inplementa un ejemplo de datos genericos con numeros, palabras y un objeto persona que tiene nombre y edad. POr otro lado se implementara una clase generica con una metodo de ordenamiento burbuja y uno de busqueda binaria.
