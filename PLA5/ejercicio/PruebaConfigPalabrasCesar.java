package ejercicio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("ejercicio")

public class PruebaConfigPalabrasCesar {
	@Bean
	public IProcesar palabras() {
	return new Palabras();
	}
	@Bean
	public ICodificar cesar() {
	return new Cesar();
	}
	
	
	
}
