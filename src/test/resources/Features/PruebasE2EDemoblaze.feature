#Autor : Natalia Henao
  # Fecha: 30-04-2024
  # language: es

  @HU
  Característica: DemoBlaze
    Descripcion: yo como analista de Automatizacion del banco Consubanco deseo realizar
    pruebas E2E para validar la pagina DemoBlaze y mostrar mis conocimientos, verificando las
    Funcionalidades, pantalla incial, login, Nombre de usuario, buscar productos, categorias,
    agregar al carrito, cart, delete y logout.

  Antecedentes:
    Dado que estoy en la pagina web de demoblaze

  @CA01
    Esquema del escenario: Creacion de cuenta <test>
    Cuando hacemos clic en “Sing UP”
    Y llenamos los datos
    |<usuario>|<clave>|
    Entonces la cuenta se crea exitosamente y se visualiza el mensaje "<mensaje>"

    Ejemplos:
    |test | usuario  | clave | mensaje |
    | exitoso| natalia34567     |  34567 |Sign up successful.|
    | existente| natalia1234    |  1234   |This user already exist.|

  @CA02
  Esquema del escenario: Inicio de sesion <test>
    Dado que contamos con una cuenta
    Cuando hacemos clic en “Log in”
    Y ingresamos "<usuario>" y "<clave>"
    Entonces  Ingresamos con exito

    Ejemplos:
      |test | usuario  | clave |
      |exitoso| natalia1234     |  1234  |

  @CA03
  Esquema del escenario: validar el nombre de usuario <test>
    Dado que contamos con una cuenta
    Cuando hacemos clic en “Log in”
    Y ingresamos "<usuario>" y "<clave>"
    Entonces nos debe aparecer nuestro nombre de usuario "<usuario>" en la esquina superior derecha.

    Ejemplos:
      |test | usuario  | clave |
      |exitoso| natalia1234     |  1234  |

  @CA04
    Escenario: Buscar categoria Phones
    Cuando hacemos clic en la categoria de “Phones”
    Entonces nos debe mostrar el listado de “Phones”

  @CA05
    Escenario: Escoge phone
    Cuando hacemos clic en la categoria de “Phones”
    Y hacemos clic en “Samsung galaxy s6 ”
    Entonces nos debe mostrar el label “Product description”

  @CA06
  Escenario: Agregar al carrito
    Cuando hacemos clic en la categoria de “Phones”
    Y hacemos clic en “Samsung galaxy s6 ”
    Y hacemos clic en “Add to Cart ”
    Entonces nos debe mostrar un modal con el mensaje “Product added”

  @CA07
  Escenario: validar carrito
    Cuando hacemos clic en la categoria de “Phones”
    Y hacemos clic en “Samsung galaxy s6 ”
    Y hacemos clic en “Add to Cart ”
    Y hacemos clic en la opción “Cart” del menú
    Entonces nos debe mostrar el producto agregado en nuestro carrito de compra

  @CA08
  Escenario: borrar producto
    Cuando hacemos clic en la categoria de “Phones”
    Y hacemos clic en “Samsung galaxy s6 ”
    Y hacemos clic en “Add to Cart ”
    Y hacemos clic en la opción “Cart” del menú
    Y hacemos clic en la opción “Delete”
    Entonces nos borrar el producto del listado

  @CA09
  Esquema del escenario: salir de la cuenta
    Dado que contamos con una cuenta
    Cuando hacemos clic en “Log in”
    Y ingresamos <usuario> y <clave>
    Y hacemos clic en la opción “Cart” del menú
    Y hacemos clic en la opción “Log Out”
    Entonces nos debe sacar de nuestra sessión y redireccionar a la página principal de demoblaze .

    Ejemplos:
      | usuario  | clave |
       |natalia12345     |  12345  |


