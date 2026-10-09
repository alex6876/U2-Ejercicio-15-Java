# 📦 Simulación de Centro Logístico y Seguimiento de Envíos (POO en Java)

Este proyecto es una aplicación en Java que modela la trazabilidad y actualización masiva del estado de paquetes dentro de una red de distribución logística. Demuestra cómo se propagan cambios de estado a través de una jerarquía de objetos en memoria (Centro Logístico ➔ Camiones de Reparto ➔ Paquetes).

---

## 🧩 Clases y Estructura del Sistema

El dominio del problema se organiza en 4 clases principales:

*   **`Paquete`**: Modela la unidad de envío individual.
    *   **Atributos encapsulados (`private`):** `codigo`, `destino` y `estado` ("En Depósito", "En Tránsito", etc.).
    *   **Métodos:** Métodos de acceso (*getters*) y modificación (*setters*) para actualizar dinámicamente el estado del envío.
*   **`CamionDeReparto`**: Representa la unidad de transporte que agrupa y traslada los envíos.
    *   **Atributos:** Contiene la composición de hasta 2 instancias de `Paquete` (`paquete1`, `paquete2`).
    *   **Métodos principales:**
        *   `actualizarEstadoPaquete()`: Busca un paquete por su código y modifica su estado individual.
        *   `actualizarTodosLosPaquetes()`: Modifica el estado de todos los paquetes cargados en el vehículo.
*   **`CentroLogistico`**: Actúa como el nodo central de coordinación.
    *   **Atributos:** Mantiene la referencia de los vehículos de la flota (`camion1`, `camion2`).
    *   **Métodos:** `difundirActualizacion(String nuevoEstado)`, propaga una orden de cambio de estado a toda la flota de camiones de forma centralizada.
*   **`Main`**: Instancia los paquetes, los asigna a la flota de camiones (contemplando espacios vacíos o `null`), configura el centro logístico y ejecuta la difusión masiva del nuevo estado.

---

## ⚙️ Reglas de Negocio y Control de Flujo

El sistema aplica la **propagación en cascada** de eventos respetando la integridad de las referencias en memoria:

1. **Invocación Centralizada:** El `CentroLogistico` recibe la instrucción global (ej. `"En Tránsito"`).
2. **Delegación Jerárquica:** El centro logístico delega la instrucción a cada `CamionDeReparto`.
3. **Validación de Seguridad (`null` Check):** Cada camión verifica que la referencia del paquete no sea nula (`if (paquete != null)`) antes de invocar `setEstado()`, evitando excepciones de tipo `NullPointerException` en unidades con carga parcial.
4. **Mutación de Estado:** Se actualiza el atributo `estado` directamente en los objetos creados originalmente en el `main`.

---

## 💻 Salida por Consola

Al ejecutar la
