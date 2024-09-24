using System;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int w = 0x144; //defina hexa
            //int w = 300;
            int ww = 0144; //defina octa
            int Num;
            byte ss = 2;
            int x = 300, z = 100;
            decimal y = 25.25m;
            float s = 123.4656f;
            Double t = 34.5678d;
            string nombre = "Segundo semestre";
            char C = 'A';
            bool tem = false;

            DateTime fecha = DateTime.MinValue;
            DateTime fecha2 = new DateTime(2021, 4, 9);


            //Convierte un valor entero de 32 bits en un string segun la base esecificada
            Console.WriteLine(Convert.ToString(w, 2)); 

            // Se pasan como parametros los valores que se quieren ingresar, y definen su posicion segun la posicion del parametro
            Console.WriteLine("Hexal = {0}", w); 

            // Cumple la misma funcion anterior pero con un numero octal
            Console.WriteLine("Octal = {0}", ww);

            // Imprime la variable nombre en consola (Saluda al ingeniero nombre)
            Console.WriteLine(" Hola ingenieros " + nombre);

            // Muestra un valor decimal con el numero de decimales especificados en f. (En este caso muestra un solo decimal)
            Console.WriteLine("decimal = {0:f1}", t);

            // Muestra los valores ingresados como una especificada formateada como fecha
            Console.WriteLine(fecha2);

            // Muestra la cadena Colombia = Segundo semestre
            Console.WriteLine("Colombia = " + nombre);

            


            // Esta sumando el valor asci del char 'A'
            x = (int)C + (int)C;
            Console.WriteLine(x);
                
            // Muestra el valor convertido en char de la suma de C + C
            // En este caso la suma es 130 y el ascii solo llega hasta 127
            Console.WriteLine("caracter = " + (char) x);



            //Muestra y convierte el valor booleano en string
            Console.WriteLine("Booleano = " + tem.ToString());
            //Muestra el valor booleano
            Console.WriteLine("Booleano = " + tem);
            // Convierte y muestra el valor booleano a su valor en decimal
            Console.WriteLine("Booleano = " + Convert.ToInt32(tem));


            //Muestra el valor almacenado en fecha. En este caso el minimo vlor posible que es 1/01/0001
            Console.WriteLine("Fecha = " + fecha);
            //Muestra la fecha en un formato mas corto
            Console.WriteLine("Fecha = " + fecha.ToShortDateString());
            // Muestra la fecha 2 en consola.
            Console.WriteLine("Fecha = " + fecha2);
            // Muestra la fecha 2 en consola en un formato mas corto.
            Console.WriteLine("Fecha2 = " + fecha2.ToShortDateString());


            //Muestra el valor de x en hexadecimal
            Console.WriteLine("x= {0:X}", x);
            //Muestra los valores de x y z segun el orden especificado
            Console.WriteLine("x= {0} z = {1}", x, z);


            //Formatea y muestra la fecha actual de la forma (24 martes septiembre)
            string FormatString1 = String.Format("{0:dd dddd MMMM}", DateTime.Now);
            Console.WriteLine(FormatString1);


            // Muestra el valor entero como valor en formato divisa
            int MyInt = 1000000;
            Console.WriteLine("MyInt  = {0:C}", MyInt);
            //Formatea el numero para mostrar dos centavos
            string FormatString2 = String.Format("{0:$ #,###,##0.00}", MyInt);
            Console.WriteLine(FormatString2);


            Num = Convert.ToInt32(Console.ReadLine());
            
        }
    }
}