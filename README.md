# Validación Concurrente de Contraseñas (Java)

Este proyecto es una modificación de la Actividad #9, donde se valida una lista de contraseñas de manera concurrente en Java y se registra el resultado en un archivo de texto.

## Funcionalidades

- Validación de contraseñas utilizando **expresiones lambda**.
- Manejo de archivos para guardar los resultados de las validaciones.
- Ejecución **concurrente** usando `ExecutorService`.

## Reglas de Validación

Una contraseña es **válida** si cumple todas las siguientes condiciones:
- Contiene al menos una **letra mayúscula**.
- Contiene al menos una **letra minúscula**.
- Contiene al menos un **número**.
- Tiene una **longitud mínima** de 8 caracteres.

## Cómo ejecutar

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu_usuario/tu_repositorio.git
   ```
2. Entra al directorio:
   ```bash
   cd tu_repositorio
   ```
3. Compila el programa:
   ```bash
   javac ValidadorContraseñas.java
   ```
4. Ejecuta el programa:
   ```bash
   java ValidadorContraseñas
   ```

5. Revisa el archivo `registro_contraseñas.txt` para ver los resultados.

## Estructura del Proyecto

```
📁 tu_repositorio/
 ├── ValidadorContraseñas.java
 ├── registro_contraseñas.txt
 └── README.md
```

## Requisitos

- Java 8 o superior

## Autor

- [Romario Ramirez]
