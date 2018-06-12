# Filosofos-Comiendo (Hecho en JAVA)
 El problema de los filosofos comiendo es un problema clásico en las Ciencias de la Computación para representar el problema de la sincronización de procesos en un sistema operativo
 
 Cinco filósofos se sientan alrededor de una mesa y pasan su vida cenando y pensando. Cada filósofo tiene un plato de fideos y un palillo a la izquierda de su plato. Para comer los fideos son necesarios dos palillos y cada filósofo sólo puede tomar los que están a su izquierda y derecha. Si cualquier filósofo toma un tenedor y el otro está ocupado, se quedará esperando, con el palillo en la mano, hasta que pueda tomar el otro palillo, para luego empezar a comer.
 
 ![Filosofos comiendo img](https://alexbasededatos.files.wordpress.com/2016/09/cenafilosofos.gif?w=676)

Si dos filósofos adyacentes intentan tomar el mismo palillo a una vez, se produce una condición de carrera: ambos compiten por tomar el mismo tenedor, y uno de ellos se queda sin comer.

Si todos los filósofos toman el palillo que está a su derecha al mismo tiempo, entonces todos se quedarán esperando eternamente, porque alguien debe liberar el palillo que les falta. Nadie lo hará porque todos se encuentran en la misma situación (esperando que alguno deje sus palillos). Entonces los filósofos se morirán de hambre. Este bloqueo mutuo se denomina interbloqueo o deadlock.

El problema consiste en encontrar un algoritmo que permita que los filósofos nunca se mueran de hambre.

### Projecto hecho en NetBeans IDE 8.2
