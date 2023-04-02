public class Coche {
    public int velocidad;

    public void acelerar_Jonattan(int aceleracion) {
        velocidad += aceleracion;
    }
  

    public void decelerar_Jonattan(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad<0) velocidad=0;
    }
}
