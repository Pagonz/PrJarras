package prJarras;

public class Jarras {
	    private int cantidad;
	    private int capacidad;
	    
	    public Jarras(int capInicial){
	    	capacidad=capInicial;
	    	cantidad=0;
	    }
	    public void llena(){
	    	cantidad=capacidad;
	    }
	    public void vacia(){
	    	cantidad=0;
	    }
	    public int capacidad(){
	    	return capacidad;
	    }
	    public int cantidad(){
	    	return cantidad;
	    }
	    public void llenadesde(Jarras j){
	    	int cabe=capacidad - cantidad;
	    	if(cabe >= j.cantidad){
	    		//cabe todo y la otra queda vacia
	    		cantidad+=j.cantidad;
	    		j.cantidad=0;
	    	}else{
	    	 //no cabe todo. se llena y la otra le sobra
	    		cantidad-=j.cantidad;
	    		j.cantidad=cabe;
	    	}
	    	
	    }
	    public String toString(){
	    	return "j("+cantidad+"/"+capacidad+")";
	    }
	}
