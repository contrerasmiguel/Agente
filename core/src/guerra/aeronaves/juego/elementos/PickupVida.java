package guerra.aeronaves.juego.elementos;

import com.badlogic.gdx.math.Vector2;
import guerra.aeronaves.GuerraAeronaves;

public class PickupVida extends Elemento {

    public PickupVida(Vector2 posInicial) {
        super("reparacion.png", GuerraAeronaves.ID_PICKUP_VIDA, posInicial, GuerraAeronaves.VIDA_INFINITA);
    }
    
    @Override
    public final void colocarEnPosicionInicial() {
        super.colocarEnPosicionInicial();
    }
    
}