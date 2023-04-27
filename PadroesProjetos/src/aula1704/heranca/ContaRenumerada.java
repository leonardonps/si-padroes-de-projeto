package aula1704.heranca;

public class ContaRenumerada extends Conta{

    void aplicaRendimentos(double taxa){
        depositar(getSaldo() * taxa);
    }
}
