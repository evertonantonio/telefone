package telefoneSistema;

import java.util.ArrayList;
import java.util.List;

public class Telefone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean isPlaying;
    private String currentSong;
    private boolean isCallActive;
    private boolean isVoicemailActive;
    private String currentURL;
    private List<String> openTabs;

    @Override
    public void tocar() {
        if (!isPlaying) {
            isPlaying = true;
            System.out.println("Iniciando a reprodução da música.");
        }
    }

    @Override
    public void pausar() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Pausando a reprodução da música.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        currentSong = musica;
        System.out.println("Selecionando a música: " + currentSong);
    }

    @Override
    public void ligar(String numero) {
        if (!isCallActive) {
            isCallActive = true;
            System.out.println("Ligando para: " + numero);
        }
    }

    @Override
    public void atender() {
        if (isCallActive) {
            isCallActive = false;
            System.out.println("Chamada atendida.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if (isCallActive && !isVoicemailActive) {
            isVoicemailActive = true;
            System.out.println("Iniciando correio de voz.");
        }
    }

    @Override
    public void exibirPagina(String url) {
        currentURL = url;
        System.out.println("Exibindo página: " + currentURL);
    }

    @Override
    public void adicionarNovaAba(String url) {
        if (openTabs == null) {
            openTabs = new ArrayList<>();
        }
        openTabs.add(url);
        System.out.println("Nova aba adicionada com a URL: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página: " + currentURL);
    }
}

