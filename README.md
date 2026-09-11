![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
#  Caso: SpeedFast -Desarrollo Orientado a Objetos II

## 👤 Autor del proyecto 
- **Nombre Completo:** [Katherine del Carmen Avila Mecia]
- **Sección:** 003A
- **Carrera:** Analista programador Computacional
- **Bimestre:** 3
- **Sede:** Campus Virtual

---
## 📘 Actividad Sumativa N.º 2 (Semana 5): sincronizando procesos en sistemas concurrentes

## Descripción del Proyecto:
Sistema concurrente y multihilo desarrollado en Java que simula la distribución simultánea de paquetes para la empresa
Speedfast.

### Clases principales
* **`EstadoPedido` (Enum)**: define el ciclo de vida por el cual transita una encomienda(`PENDIENTE`, `EN_REPARTO`, `ENTREGADO`).
* **`Pedido` (Modelo de datos)**: Encapsula la información del pedido en tránsito (`id`, `direccionEntrega` y `estadoPedido`).
* **`ZonaDeCarga` (Recurso compartido)**:Estructura que administra la cola de pedidos pendientes.
* **`Repartidor` (Hilos)**: Implementa la interfaz `Runnable`. Representa a un agente de reparto que retira los pedidos de la zona de carga, actualiza el estado del pedido a `EN_REPARTO` y `ENTREGADO` y simula los tiempos de viaje mediante pausas controladas con `Thread.sleep()`
* **`Main`(Orquesta el sistema)**: Inicializa el recurso compartido, registra los paquetes iniciales, levanta simultáneamente 3 hilos independientes y coordina el cierre ordenado mediante  `join()`, confirmando el exito de la jornada con el mensaje `"Todos los pedidos han sido entregados correctamente"`

### Características destacadas
* **Exclusión mutua y Sincronización**: Protección de secciones críticas en `ZonaDeCarga` mediante `Synchronized`, permitiendo que un unico hilo acceda a la colección compartida a la vez.
* **Concurrencia**: salida por consola estructurada y diferenciada por hilo identificando el nombre del repartidor, el ID del pedido y la fase de reparto en tiempo real.
* **Transición de Estados**: Control de estados consistente desde su ingreso como `PENDIENTE`, su asignación en `EN_REPARTO` y su confirmación como `ENTREGADO`.

---
## Instrucciones de Ejecución
1. Asegúrate de tener configurado el JDK en tu entorno (IntelliJ IDEA recomendado).
2. Clona o descarga este repositorio en tu computadora local.
3. Abre el proyecto en el IDE y navega hasta el paquete de la aplicación
4. ejecuta la clase `Main.java`.

## 📁 Estructura del Proyecto

``` plaintext
SpeedFast_Semana5/
│
├── .idea/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── cl/
│   │   │       └── duoc/
│   │   │           ├── model/
│   │   │           │   ├── EstadoPedido.java
│   │   │           │   ├── Pedido.java
│   │   │           │   └── Repartidor.java
│   │   │           ├── Main.java
│   │   │           └── ZonaDeCarga.java
│   │   └── resources/
│   └── test/
│
├── target/
├── .gitignore
├── pom.xml
└── README.md
---

