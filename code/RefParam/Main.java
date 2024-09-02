class Main{
    public static void main(String[] args){
        Mascota m = new Mascota("Maggie");
        System.out.println("Antes de intentar cambiar el nombre...");
        m.saludar();
        // Intentar cambiar nombre
        intentarCambiarNombre(m);
        System.out.println("Despues de intentar cambiar el nombre...");
        m.saludar();
    }
    
    /*
        Demostración de que el objeto se puede cambiar desde otra función
    */

    public static void intentarCambiarNombre(Mascota unaMascota){
        unaMascota.setNombre("Guayaba");
    }
}