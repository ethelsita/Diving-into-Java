package ejercicio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("ejercicio")

public class PruebaConfigPalabrasInvertir {
	@Bean
	public IProcesar palabras() {
	return new Palabras();
	}
	@Bean
	public ICodificar invertir() {
	return new Invertir();
	}
}
