# UAX - Entornos de desarrollo - Reto 2
## Reto GitHub para mostrar las posiblidades de un alojamiento de proyectos utilizando el sistema de control de versiones Git.
### En particular se ha subido código fuente en Java para el cálculo de area de las figuras geométricas Cuadrado, Rectángulo y Triángulo para posteriormente añadir el Círculo.

Recordamos aquí las fórmulas correspondientes (las imágenes corresponden a sus respectivos autores):

![Área figuras geométricas](https://github.com/fmartbui/retogit/assets/169456118/51295751-2a4f-43c9-9c1b-a048f87a1fb5)

**1.- Crea un repositorio nuevo que se llame retogit:**
Se crea el repositorio pulsando sobre el botón + y luego se hace click en *Nuevo repositorio*.

**2.- Realiza la subida de la carpeta src de un proyecto en java:**
Se hace click en el botón *Add code* para subir los fuentes al proyecto, empezando con la clase principal y las clases Cuadrado, Círculo y Triángulo.

**3.-Crea una nueva rama que se llame desarrolloPersona:**
Se pincha sobre la rama *Main (retogit)* que nos lleva a la pantalla de ramas **(Branches)** y dentro hacemos click sobre el botón *New branch* para añadir la nueva rama **desarrolloPersona**

**4.-Descarga el contenido de la rama a tu repositorio local:**
Se procede a la descarga de la rama al repositorio local a través de un pull. De esta forma tenemos los fuentes disponibles para editar en local.

**5.-Crea una clase nueva y realiza la actualización de la rama en el repositorio, documenta este proceso con el comentario “Nueva clase – nombre de la clase”:**
Se crea la nueva clase llamada Círculo.java para el cálculo del área de esta figura geométrica. A su vez se modifica el fuente del programa principal llamado Geometria.java para añadir el código que permite llamar a la nueva clase. Luego dichos cambios se actualizan a través de un push y un commit.

**6.-Modifica algún atributo de la clase nueva y realiza la actualización de la rama en el repositorio, documenta este proceso con el comentario “Edición clase – nombre de la clase:”**
Modificamos el valor de la constante PI dentro de Circulo.java para cambiar el valor de 3.1415 a 3.1416. Dicho cambio se almacena y se actualiza a través de un push y un commit.

**7.-Realiza una comprobación de los cambios:**
Verificamos los cambios realizados a través de la opción *Commit* y a su vez entrando en cada Commit, se observa qué ha cambiado dentro de los fuentes.

**8.-Fusiona la rama “desarrolloPersona” con la rama principal “main”:**
Efectuamos un merge de la rama *desarrolloPersona* con la rama principal *retogit* después de haber efectuado el Pull Request correspondiente
.
