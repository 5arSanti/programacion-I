class Mascota{
    private String nombre;
    public Mascota(String nombre){
        this.nombre = nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void saludar(){
        System.out.println("Guau! me llamo " + this.nombre);
        
    }
    
}