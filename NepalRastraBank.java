public class NepalRastraBank {
    public static void printDetail(Bank bank){
        bank.displayInterestRate();
        if(bank instanceof NICAsiaBank){
            NICAsiaBank nic = (NICAsiaBank)bank;
            nic.enableNicAsiaMobileBanking();
        }
        if(bank instanceof NabilBank){
            NabilBank nabil = (NabilBank)bank;
            nabil.enableNabilSmsBanking();
        }
    }
    public static void main(String[] args) {
        Bank bank = new Bank();
        printDetail(bank);

        Bank nicAsiaBank = new NICAsiaBank();
        printDetail(nicAsiaBank);

        Bank nabilBank = new NabilBank();
        printDetail(nabilBank);
    }
}
