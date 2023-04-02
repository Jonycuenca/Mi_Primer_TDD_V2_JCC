	import org.junit.jupiter.api.Assertions;
	import org.junit.jupiter.api.Test;

	public class CocheTest {

	    @Test
	    public void test_al_crear_un_coche_su_velocidad_es_cero(){
	        Coche nuevoCoche = new Coche();
	        Assertions.assertEquals(0,nuevoCoche.velocidad);
	    }
	    @Test
	    public void test_al_acelerar_un_coche_su_velocidad_es_aumenta(){
	        Coche nuevoCoche = new Coche();
	        nuevoCoche.acelerar_Jonattan(30);
	        Assertions.assertEquals(30,nuevoCoche.velocidad);
	    }
	    @Test
	    public void test_al_decelerar_un_coche_su_velocidad_es_disminuye(){
	        Coche nuevoCoche = new Coche();
	        nuevoCoche.velocidad = 50;
	        nuevoCoche.decelerar_Jonattan(20);
	        Assertions.assertEquals(30,nuevoCoche.velocidad);
	    }
	    @Test
	    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_0(){
	        Coche nuevoCoche = new Coche();
	        nuevoCoche.velocidad = 50;
	        nuevoCoche.decelerar_Jonattan(80);
	        Assertions.assertEquals(0,nuevoCoche.velocidad);
	    }
	}

