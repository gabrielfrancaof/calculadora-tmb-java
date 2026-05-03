package br.com.gabrielfranca.calculadora;

public class CalculadoraNutricional {
    public double calcularTMB(Pessoa pessoa) {
        double tmbBase = (double)0.0F;
        if (pessoa.sexo.equalsIgnoreCase("m")) {
            tmbBase = (double)10.0F * pessoa.peso + (double)6.25F * (double)pessoa.altura - (double)(5 * pessoa.idade) + (double)5.0F;
        } else if (pessoa.sexo.equalsIgnoreCase("f")) {
            tmbBase = (double)10.0F * pessoa.peso + (double)6.25F * (double)pessoa.altura - (double)(5 * pessoa.idade) - (double)161.0F;
        }

        return tmbBase;
    }

    public double calcularGET(Pessoa pessoa, double tmbBase) {
        double gastoTotal = (double)0.0F;
        if (tmbBase > (double)0.0F) {
            gastoTotal = (double)0.0F;
            if (pessoa.atividade.equalsIgnoreCase("sedentario")) {
                gastoTotal = tmbBase * 1.2;
            } else if (pessoa.atividade.equalsIgnoreCase("leve")) {
                gastoTotal = tmbBase * (double)1.375F;
            } else if (pessoa.atividade.equalsIgnoreCase("moderado")) {
                gastoTotal = tmbBase * 1.55;
            } else if (pessoa.atividade.equalsIgnoreCase("ativo")) {
                gastoTotal = tmbBase * 1.725;
            }
        }

        return gastoTotal;
    }
}