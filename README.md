# DespachoDistribuidoraJava
# Proyecto: Aplicación de Despacho de Distribuidora de Alimentos

## Descripción
Este proyecto consiste en desarrollar una aplicación que permita a los usuarios realizar compras de productos de una distribuidora de alimentos y calcular automáticamente los costos de despacho según las reglas de negocio especificadas.

## Requerimientos Funcionales

1. **Registro y Autenticación de Usuarios**
   - Los usuarios deben poder registrarse utilizando sus cuentas de Gmail.
   - El sistema debe autenticar a los usuarios antes de permitirles realizar compras.

2. **Selección de Productos**
   - Los usuarios deben poder navegar y seleccionar productos disponibles en la distribuidora.
   - La aplicación debe mostrar información detallada de cada producto, incluyendo precio, descripción y disponibilidad.

3. **Cálculo Automático del Costo de Despacho**
   - Para compras superiores a 50,000 pesos, el despacho debe ser gratuito dentro de un radio de 20 km.
   - Para compras entre 25,000 y 49,999 pesos, se debe cobrar una tarifa de 150 pesos por kilómetro recorrido.
   - Para compras menores a 25,000 pesos, se debe cobrar una tarifa de 300 pesos por kilómetro recorrido.
   - El sistema debe calcular y mostrar automáticamente el costo total del despacho basado en la distancia ingresada por el usuario.

4. **Proceso de Pago**
   - Los usuarios deben poder realizar el pago de sus compras a través de la aplicación.
   - El sistema debe generar un recibo digital y enviarlo al correo electrónico del usuario tras la confirmación del pago.

5. **Historial de Compras**
   - Los usuarios deben poder visualizar un historial de sus compras anteriores, incluyendo detalles de los productos adquiridos y los costos de despacho.

## Requerimientos No Funcionales

1. **Seguridad**
   - El sistema debe asegurar la protección de los datos personales y financieros de los usuarios.
   - La autenticación y el manejo de sesiones deben estar encriptados.

2. **Usabilidad**
   - La aplicación debe tener una interfaz intuitiva y fácil de usar, accesible desde dispositivos móviles y de escritorio.
   - El proceso de compra debe ser sencillo y no debe requerir más de 5 clics para completar.

3. **Rendimiento**
   - La aplicación debe ser capaz de manejar al menos 1000 transacciones simultáneas sin degradar el rendimiento.
   - El cálculo del costo de despacho debe realizarse en menos de 1 segundo.

4. **Disponibilidad**
   - La aplicación debe estar disponible 24/7, con un tiempo de inactividad máximo de 1 hora al mes para mantenimiento.

5. **Compatibilidad**
   - La aplicación debe ser compatible con los navegadores más populares (Chrome, Firefox, Safari) y debe funcionar en dispositivos móviles con Android y iOS.

6. **Mantenibilidad**
   - El código debe estar documentado y estructurado de manera que sea fácil de mantener y actualizar.
   - Las actualizaciones futuras deben poder implementarse sin afectar las funcionalidades existentes.

## Instalación y Uso

### Requisitos Previos
- JDK 8 o superior
- Maven
- Git

### Clonar el Repositorio
```bash
git clone https://github.com/tu-usuario/tu-repositorio.git
