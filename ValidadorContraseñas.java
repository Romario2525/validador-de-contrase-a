import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ValidadorContraseñas {

    public static void main(String[] args) {
        List<String> contraseñas = Arrays.asList(
                "Password123",
                "abc",
                "12345678",
                "ContraseñaSegura1",
                "passW0rd",
                "MiClave!"
        );

        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (String contraseña : contraseñas) {
            executor.execute(() -> validarYRegistrar(contraseña));
        }

        executor.shutdown();
    }

    public static void validarYRegistrar(String contraseña) {
        boolean esValida = validarContraseña(contraseña);

        String resultado = contraseña + ": " + (esValida ? "Válida" : "Inválida");

        synchronized (ValidadorContraseñas.class) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("registro_contraseñas.txt", true))) {
                writer.write(resultado);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(resultado);
    }

    public static boolean validarContraseña(String contraseña) {
        return contraseña.length() >= 8 &&
               contraseña.chars().anyMatch(Character::isUpperCase) &&
               contraseña.chars().anyMatch(Character::isLowerCase) &&
               contraseña.chars().anyMatch(Character::isDigit);
    }
}
