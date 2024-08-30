# Historias de Usuario

## Historia de Usuario 1: Registro de Usuario

**Como** usuario nuevo,  
**quiero** registrarme en la aplicación utilizando mi cuenta de Gmail,  
**para** poder acceder a todas las funcionalidades de la aplicación.

### Criterios de Aceptación
- El usuario debe poder iniciar sesión utilizando su cuenta de Gmail a través de un botón "Iniciar sesión con Google".
- La autenticación debe estar asegurada y los datos del usuario deben ser protegidos.
- Si el usuario ya tiene una cuenta registrada, el sistema debe redirigirlo a la página principal.
- Si el usuario no tiene una cuenta, el sistema debe crear una nueva cuenta y guardar sus datos básicos (nombre, correo electrónico).

### Supuestos
- El sistema está integrado con la API de Google para la autenticación.
- Los usuarios deben tener una cuenta de Gmail válida.

---

## Historia de Usuario 2: Selección de Productos

**Como** usuario autenticado,  
**quiero** ver y seleccionar productos de la distribuidora,  
**para** poder añadirlos a mi carrito de compras y proceder a la compra.

### Criterios de Aceptación
- El usuario debe poder navegar a través de una lista de productos disponibles.
- El sistema debe mostrar detalles del producto, como nombre, precio, y descripción.
- El usuario debe poder seleccionar la cantidad de cada producto antes de añadirlo al carrito.
- El carrito de compras debe actualizarse dinámicamente con cada producto añadido.

### Supuestos
- La lista de productos está actualizada y muestra solo aquellos disponibles en stock.
- El sistema permite la adición de productos al carrito desde múltiples dispositivos.

---

## Historia de Usuario 3: Cálculo del Costo de Despacho

**Como** usuario,  
**quiero** que el sistema calcule automáticamente el costo de despacho,  
**para** saber cuánto debo pagar en total según la distancia de entrega y el monto de mi compra.

### Criterios de Aceptación
- El sistema debe calcular el costo de despacho basado en la distancia ingresada y el monto total de la compra.
- Para compras superiores a 50,000 pesos, el despacho debe ser gratuito dentro de un radio de 20 km.
- Para compras entre 25,000 y 49,999 pesos, se debe cobrar 150 pesos por kilómetro.
- Para compras menores a 25,000 pesos, se debe cobrar 300 pesos por kilómetro.
- El costo total, incluido el despacho, debe mostrarse antes de la confirmación del pago.

### Supuestos
- El usuario puede ingresar manualmente la distancia desde su ubicación hasta la distribuidora.
- El sistema tiene acceso a una API de mapas para verificar y calcular distancias.

---

## Historia de Usuario 4: Realizar el Pago

**Como** usuario,  
**quiero** pagar mi compra utilizando una opción de pago en línea,  
**para** completar mi compra y recibir los productos en mi domicilio.

### Criterios de Aceptación
- El usuario debe poder elegir entre diferentes métodos de pago, como tarjeta de crédito o débito.
- El sistema debe procesar el pago de manera segura.
- Tras la confirmación del pago, el sistema debe enviar un recibo digital al correo electrónico del usuario.
- El historial de compras del usuario debe actualizarse con la nueva transacción.

### Supuestos
- La integración con una pasarela de pago está configurada y funcionando.
- El sistema maneja errores de pago y muestra mensajes claros al usuario en caso de fallos.

---

## Historia de Usuario 5: Ver Historial de Compras

**Como** usuario,  
**quiero** ver un historial de todas mis compras anteriores,  
**para** revisar los productos que he comprado y los costos de despacho asociados.

### Criterios de Aceptación
- El historial de compras debe mostrar detalles como fecha de compra, productos adquiridos, montos pagados, y costos de despacho.
- El usuario debe poder filtrar el historial por fechas y/o por productos.
- El usuario debe poder ver detalles completos de cada transacción individual.

### Supuestos
- El sistema guarda un registro completo y detallado de todas las compras realizadas por cada usuario.
- Los datos del historial están disponibles incluso si el usuario accede desde diferentes dispositivos.


