package agentes;

public class NaveJogador extends AgenteBase {

    public int vida;

    public NaveJogador() {
        time = Time.Jogador;
        tamanho = 25;
    }

    protected void setup() {
        super.setup();
        rp.adicionarGetter("vida", () -> vida);
    }

    @Override
    public void update(double delta) {
    }
}
