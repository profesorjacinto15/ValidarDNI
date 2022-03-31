import static org.junit.jupiter.api.Assertions.*;

class ValidarDNITest {

    @org.junit.jupiter.api.Test
    void extraerLetraDNI() {
        String midni = "52845401A";
        char letraes = 'A';
        char eperada = ValidarDNI.extraerLetraDNI(midni);
        assertEquals(letraes, eperada);

    }

    @org.junit.jupiter.api.Test
    void extraerNumeroDNI() {
        String midni = "52845401A";
        int numdni = 52845401;
        int valores = ValidarDNI.extraerNumeroDNI(midni);
        assertEquals(numdni, valores);
    }

    @org.junit.jupiter.api.Test
    void calcularLetraDNI() {
        int numdni = 52845401;
        char letra = 'A';
        char resu = ValidarDNI.calcularLetraDNI(numdni);
        assertEquals(letra, resu);
    }

    @org.junit.jupiter.api.Test
    void validarDNI() {
        String dni = "12345678K";
        boolean espe = true;
        boolean resu = ValidarDNI.validarDNI(dni);
        assertEquals(espe, resu);
    }
}