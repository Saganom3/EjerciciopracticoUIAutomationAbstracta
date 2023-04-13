# EjerciciopracticoUIAutomationAbstracta

* Para este proyecto se uso el driver de Chrome versión (ChromeDriver 111.0.5563.64)asegurese de tener  la versión mencionada en su maquina

* Asegúrate de tener Gradle 7 o superior instalado(Configurados con variables de entorno correspondientes)

* Asegúrate de tener JDK 11 instalado

EJECUCIÓN SCRIPT IDE

Para ejecutar un script de Gradle en el runner desde el IDE, sigue estos pasos:

1 - Abre tu proyecto en el IDE que estés usando (por ejemplo, IntelliJ IDEA, Eclipse, etc.).

2 - Una vez que se hayan cargado las dependencias del proyecto, busca la tarea que deseas ejecutar en la sección "runner".

3 - Haz clic derecho sobre la tarea y selecciona "Run".

Opcional 

4 - Si necesitas agregar argumentos o opciones adicionales a la tarea, puedes hacerlo en la sección Edit Configuration,en este caso podemos agregar Gradle,ingrese nombre del runner, en campo de texto Run agregue clean test y guarde la información.

6 - Seleccione el runner cuyo nombre ingreso anteriormente en la lista desplegable

5 -  Haz clic en el botón "Run" para ejecutar la tarea.


PRUEBA DE ESCRITORIO

1 - Cree una carpeta en la ruta que desee

2 - Cree un archivo .txt

3 - Ingrese las siguientes lineas de comando:

git clone https://github.com/Saganom3/EjerciciopracticoUIAutomationAbstracta.git

cd EjerciciopracticoUIAutomationAbstracta //La ruta como se llama la carpeta que va descargar desde el repositorio

call gradle -D"cucumber.options=--tags @Test" test

pause

4 - Guarde la informacion del archivo y modifique el tipo de extensión a .bat

5- Dele doble click sobre la misma

Con estos pasos, podrás ejecutar un script de Gradle desde la línea de comandos.



JENKINS PIPELINE

Para ejecutar un script de Gradle en Jenkins Pipeline desde un Jenkinsfile, sigue estos pasos:

Prerrequisitos: 

Plugin Jenkins

- Blue Ocean
- Cucumber reports
- HTML Publisher plugin

Pasos a seguir:

1 - Asegúrate de tener Gradle instalado en la máquina donde está corriendo Jenkins.

2 - Crea un archivo Jenkinsfile en la raíz de tu repositorio(Cabe resaltar que el repositorio que comparto ya lo tiene).

NOTA: Si necesitas agregar más comandos de Gradle al pipeline, simplemente agrégalos dentro del bloque de "steps".

3 - En Jenkins, crea un nuevo pipeline y selecciona "Pipeline script from SCM".

4 - En la sección "SCM", selecciona el sistema de control de versiones que estás usando para tu proyecto (Git, SVN, etc.) y agrega la URL del repositorio.

5 - En la sección "Script Path", agrega la ruta al archivo Jenkinsfile.

6 - Guarda y ejecuta el pipeline.


EJECUTAR DESDE GIT ACTIONS (github)

1 - Dirijase al proyecto alojado en el repositorio

2 - de Click en la opcion Actions

3 - Si no tiene configurado ninguna Actions aparecera la ventana Choose a workflow

4 - Seleccione Java with Gradle y de click en la opción Configure

5 - El sistema mostrara el yml a editar

6 - Dirijase al final del archivo donde se encuentra  arguments: build y cambielo por run: -D"cucumber.options=--tags @Test" test

7 - De click en el boton Start commit

