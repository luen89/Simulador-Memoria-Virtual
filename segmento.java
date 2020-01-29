public class Segment{
long dir_ini; // Se creo la clase segment
long dir_fin;
int index;
Segment(long dir_ini, long dir_fin, int index){
	this.dir_ini=dir_ini;
	this.dir_fin=dir_fin;
	this.index=index;
}

int is_in(long diri,long dirf){
	if(diri>=dir_ini && dirf<=dir_fin) // Verifica que la pagina este dentro del segmento si es asi retorna el valor del segmento caso contrario retorna -1
		return index;
	else
		return -1;

}
}
