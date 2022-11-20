package Exercise_10_Proxy;

public class ProxyDescarga implements DescargaSpotify {

    private ServicioDescarga servicioDescarga = new ServicioDescarga();

    @Override
    public void descarga(Usuario usuario, String cancion) {
        if(esUsuarioPremium(usuario)) {
            servicioDescarga.descarga(usuario, cancion);
        }else {
            System.out.println("Usuario ID: " + usuario.getId() + " no puede descargar " + cancion + " porque no es premium");
        }
    }

    private boolean esUsuarioPremium(Usuario usuario) {
        return usuario.getTipoUsuario().equalsIgnoreCase("premium");
    }
}
