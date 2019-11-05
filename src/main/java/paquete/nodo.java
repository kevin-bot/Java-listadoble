
package paquete;

class Nodo {
     Nodo sig;//sigueinte es un puntero
     Nodo ant;
    int valor;

    public Nodo(){//constructor de un nodo
       
        this.sig=null;
        this.valor=0;
        this.ant=null;
        
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
                
    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }  
}


 class Lista {
    Nodo inicio;
    int tamaño;
    int raiz;
   
    public Lista() {//constructor
        
        this.inicio=null;
        this.tamaño=0;
        this.raiz=0;
        
    }
    
    //METODO QUE VALIDA SI LA LISTA ESTA VACIA
    public boolean esvacialalista(){                   
        return inicio==null;              
    }
    
    
    public void agregarnodoalfinaldelalista(int valordelnodo){
        
        Nodo nodonuevo=new Nodo();//instancia de in nuevonodo
        
        nodonuevo.setValor(valordelnodo);
        
        if(esvacialalista()==true){
            inicio=nodonuevo;            
        }else{
            
            Nodo aux=inicio;
             
            while(aux.getSig()!=null){
                aux=aux.getSig();
            }
            
            aux.setSig(nodonuevo);                        
            nodonuevo.setAnt(aux);
        }
        
        tamaño++;
        
    }    
    
    public void agregaralinicio(int valor){
        
        Nodo nodonew=new Nodo();        
        nodonew.setValor(valor);
        
        if(esvacialalista()){
            inicio=nodonew;
        }else{
            
           nodonew.setSig(inicio);
           inicio.setAnt(nodonew);
           inicio=nodonew;            
        }
        tamaño++;
    }
    
    public void mostraslalista(){
                
        Nodo aux=inicio;
        
        String  mostrar="";
        
        while(aux !=null){
            mostrar+=aux.getValor()+"<=>";
            
            aux=aux.getSig();
        }  
        System.out.println("null "+mostrar+" null");
    }   
    
    public void eliminar(int valor){
        
        Nodo aux=inicio;
                                                                   
                                    
                    if(valor==inicio.getValor()){                        
                        inicio=inicio.getSig();           
                    }else{
                          while(aux !=null){
                              if(aux.getValor()==valor){
                                  if(aux.getSig()==null){
                                      aux=aux.getAnt();
                                      aux.setSig(null);
                                      break;
                                  }else{
                                    aux=aux.getAnt();
                                    aux.setSig(aux.getSig().getSig());
                                    aux=aux.getSig();
                                    aux.setAnt(aux.getAnt().getAnt());                          
                                    break;
                                  }                                    
                              }
                              aux=aux.getSig();                    
                          }
                            
                    }                                    
                                    
        tamaño--;
    }       
    public void buscar(int valorbuscar){
        Nodo aux=inicio;        
        boolean estaelvalorenlalista=false;        
        while(aux !=null){                                    
                if(aux.getValor()==valorbuscar){                   
                    estaelvalorenlalista=true;                    
                    break;
                }                  
                aux=aux.getSig();                
        } 
        
        if(estaelvalorenlalista==true)System.out.println("EL valor "+valorbuscar+" si se encuenta en la lista");                    
        else System.out.println("el valor "+valorbuscar+" no esta el la lista");
    }
    
    
    
    public void raiz(int valoraingresar){
         Nodo nodonew=new Nodo();
         nodonew.setValor(valoraingresar);
              
         //Nodo raiz=new Nodo();
         //raiz.setValor(5);
         
         if(esvacialalista()){
              inicio=nodonew;              
              
         }else{   
             Nodo aux=inicio;                         
             
            if(nodonew.getValor()>raiz){
                
                //CODIGO SI EL NODO A INGRESAR ES MAYOR QUE EL RAIZ 
                
                  while(aux.getSig()!=null){                   
                      aux=aux.getSig();
                  }                  
                  aux.setSig(nodonew);             
            }else{           
                  nodonew.setSig(inicio);
                  inicio=nodonew;                        
            }
         }
         tamaño++;
         
    }

    public int getRaiz() {
        return raiz;
    }

    public void setRaiz(int raiz) {
        this.raiz = raiz;
    }
    
    
    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
            
}



