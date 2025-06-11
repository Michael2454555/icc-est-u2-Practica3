

# Práctica Listas Enlazadas

## 📌 Información General

- **Título:** Práctica de Algoritmos de Ordenamiento
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Michael Yumbla, Mateo Cordero
- **Fecha:** 10/06/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Descripción general: - Permite agregar, buscar, eliminar y listar contactos, donde cada contacto tiene un nombre y un teléfono. - Los contactos se almacenan en una lista enlazada genérica (LinkedList), implementada desde cero. - La interacción con el usuario se realiza a través de la consola (ConsoleView). - El controlador (MenuController) se encarga de recibir las instrucciones del usuario, pedir la información necesaria y coordinar las acciones entre la vista y el modelo. - El modelo está compuesto por las clases Contact (contacto genérico), Node (nodo de la lista enlazada) y LinkedList (lista enlazada genérica). - El ContactManager gestiona la lógica relacionada con los contactos, como agregar, buscar y eliminar por nombre. - El proyecto es fácil de extender y sirve como ejemplo de uso de genéricos, listas enlazadas y el patrón MVC en Java.

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Entrada

```plaintext
1. Anadir contacto
2. Buscar contacto
3. Borrar contacto
4. Mostrar contacto
5. Salir
Elija una opcion valida: 1
Ingrese el nombre: juan
Ingrese el numero telefonico: 123456
Contacto ananido.
1. Anadir contacto
2. Buscar contacto
3. Borrar contacto
4. Mostrar contacto
5. Salir
Elija una opcion valida: 2
Ingrese el nombre para buscar: juan
Encontrado: Contacto [nombre=juan, telefono=123456]
1. Anadir contacto
2. Buscar contacto
3. Borrar contacto
4. Mostrar contacto
5. Salir
Elija una opcion valida: 4
Contacto [nombre=juan, telefono=123456]
1. Anadir contacto
2. Buscar contacto
3. Borrar contacto
4. Mostrar contacto
5. Salir
Elija una opcion valida: 3
Ingrese el nombre a borrar: juan
Contacto borrado.
1. Anadir contacto
2. Buscar contacto
3. Borrar contacto
4. Mostrar contacto
5. Salir
Elija una opcion valida: 5
```

---

