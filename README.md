# ImageViewer

Se trata de un programa que es capaz de dada una ruta inicial y un filtro establecido (en nuestro caso es ".jpg"), se visualiza las imágenes que se encuentran en dicho directorio y que además cumple con el filtro establecido. Esta visualización será cíclica, por lo que al llegar al final se visualizará la primera, y viceversa. 
Para ello la hemos implementado con el patrón Proxy, para no tener en memoria todas las imágenes, sino solamente la que se quiera visualizar en ese momento, además se ha establecido un contador para saber cuántas veces se han accedido a cada imagen haciendo uso del método Singleton.
