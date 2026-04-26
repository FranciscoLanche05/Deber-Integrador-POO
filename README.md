# Tarea Integradora: Programación Orientada a Objetos

## 👥 Integrantes
* Francisco Lanche
* Erick Patiño

## 📚 Curso y Paralelo
* **Asignatura:** Programación Orientada a Objetos
* **Paralelo:**  GR1
* **Institución:** Escuela Politécnica Nacional (EPN)

## 📝 Descripción del Proyecto
Este repositorio contiene la solución a dos problemas prácticos diseñados para aplicar los pilares fundamentales de la Programación Orientada a Objetos (POO) en Java:

1. **Sistema de Subsidio de Gasolina:** Una aplicación que mediante el uso de encapsulamiento estricto, getters, setters y lógica condicional, evalúa si un ciudadano ecuatoriano cumple con los requisitos gubernamentales para acceder al subsidio de combustible.
2. **Sistema Bancario (Ejercicio Reto):** Un simulador financiero desarrollado aplicando **Herencia, Abstracción y Polimorfismo**. El sistema administra una clase base abstracta `CuentaBancaria` de la cual heredan tres tipos de cuentas (Ahorros, Corriente e Inversión). El programa calcula automáticamente los intereses mensuales de todas las cuentas registradas sin utilizar condicionales para identificar los tipos de cuenta, demostrando un uso eficiente del polimorfismo.

## 🚀 Instrucciones para ejecutar el proyecto
1. Clonar el repositorio localmente en la terminal: 
   `git clone (https://github.com/FranciscoLanche05/Deber-Integrador-POO.git)` (o usar `git pull` si ya se tiene vinculado).
2. Abrir la carpeta del proyecto en un IDE compatible con Java (como IntelliJ IDEA).
3. Asegurarse de tener configurado el SDK de Java correctamente.
4. **Para probar el Ejercicio 1:** Navegar al paquete `Ejercicio1` y ejecutar el método `main` dentro de la clase principal correspondiente.
5. **Para probar el Ejercicio 2:** Navegar al paquete `sistemaBancario`, abrir la clase de gestión (donde se encuentra el ciclo polimórfico) y ejecutar su método `main`.
6. Los resultados de los cálculos y las validaciones se imprimirán directamente en la consola del IDE.

## ⚙️ Distribución de Aportes y Responsabilidades
* **Francisco Lanche:**
  * Desarrollo de la lógica principal de la clase `SolicitanteSubsidio` (Ejercicio 1), incluyendo el encapsulamiento de atributos privados, validaciones de los métodos *setters* (ingresos y vehículos) y el método de validación `subsidioAprobado()`.
  * Diseño e implementación completa de las reglas de negocio del Sistema Bancario (Ejercicio 2). Creación de la clase abstracta, herencia en las subclases y estructuración del polimorfismo para el cálculo de intereses.

* **Erick Patiño:**
  * Configuración inicial del repositorio en GitHub.
  * Desarrollo de la Parte 2 y 3 del Ejercicio 1, incluyendo la clase `Main` interactiva con `Scanner`, sobrecarga de métodos de cálculo de consumo mensual e impresión formateada de resultados.
