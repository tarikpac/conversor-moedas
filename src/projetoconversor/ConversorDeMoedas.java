package projetoconversor;
public class ConversorDeMoedas {
    private double dolar = 5.3;
    private double euro = 5.6;
    private double libraEsterlina = 6.30;
    private double pesoArgentino = 40.80;
    private double pesoChileno = 154.2;

    private double arredondar(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }

    public double converterReaisParaDolar(double valor) {
        return arredondar(valor / dolar);
    }

    public double converterDolarParaReais(double valor) {
        return arredondar(valor * dolar);
    }

    public double converterReaisParaEuro(double valor) {
        return arredondar(valor / euro);
    }

    public double converterEuroParaReais(double valor) {
        return arredondar(valor * euro);
    }

    public double converterReaisParaLibraEsterlina(double valor) {
        return arredondar(valor / libraEsterlina);
    }

    public double converterLibraEsterlinaParaReais(double valor) {
    	return arredondar(valor * libraEsterlina);
    }
    public double converterReaisParaPesoArgentino(double valor) {
    	return arredondar(valor * pesoArgentino);
    }
    public double converterPesoArgentinoParaReais(double valor) {
    	return arredondar(valor / pesoArgentino);
    }
    public double converterReaisParaPesoChileno(double valor) {
    	return arredondar(valor * pesoChileno);
    }
    public double converterPesoChilenoParaReais(double valor) {
    	return arredondar(valor / pesoChileno);
    }
}    
