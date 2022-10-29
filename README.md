# Software Contab

¡Bienvenido a la documentación de Contab!
**Contab** es una aplicación de escritorio simple, rápida y de fácil uso para comprar pasajes de distintos tipos de aerolíneas.

## ¿Qué hacemos?
Te ayudamos a comprar tus pasajes y administrarlos, principalmente en aerolíneas. Para ello, disponemos de diferentes sistemas que nos permiten identificar todas las
variabilidades que podrían afectar en tu viaje.

## Administramos todo en un solo lugar
Dentro de nuestros módulos poseemos control sobre:
- Vuelos
- Pasajes
- Distintos tipos de aviones
- Lugares favoritos


¡Instala nuestra aplicación y verás como puedes administrar mejor!


# Comandos útiles:

Puedes utilizar estos comandos desde la línea de comandos utilizando `maven`:

```bash
# Correr el instalador, compilar y probar el código
mvn clean install 

# Sólo ejecutar el test, sin compilar.
mvn test

# Generar build
mvn package

# Para limpiar la carpeta de ejecuciones
mvn clean
```

Para git:
```bash
# Clonar el repositorio
git clone {url de este repositorio}

# Agregar todos cambios
git add .

# Agregar cambios de un archivo en particular
git add {nombre del archivo}

# Confirmar los cambios y empaquetarlos con un mensaje
git commit -m "{mi mensaje}"

# Subir los cambios al servidor
git push {servidor} {rama}
# ejemplo: git push origin main

# Traer los cambios del servidor
git pull {servidor} {rama}
# ejemplo: git pull origin main

# Crear rama y moverme a ella
git checkout -b {nombre de la rama}
# ejemplo: git checkout -b mi_rama

# Cambiar entre ramas
git checkout {rama}

# Eliminar una rama
git branch -d {rama}
```

# Recomendaciones

- Mantener el código limpio.
- Respetar los archivos que ya existen.
- Crear archivos que no existan.
- Verificar las clases abstractas y las interfaces
- Completar el código restante
- Preocuparse por la funcionalidad