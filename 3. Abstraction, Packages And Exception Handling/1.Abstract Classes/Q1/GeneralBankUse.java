public class GeneralBankUse {
    public static void main(String[] args) {
        ICICIBank i = new ICICIBank();
        KotMBank k = new KotMBank();
        GeneralBank g1 = new KotMBank();
        GeneralBank g2 = new ICICIBank();

        System.out.println("ICICI BANK: ");
        System.out.println("Saving Rate = " + i.getSavingsInterestRate() + "%, Fixed Rate = "
                + i.getFixedDepositInterestRate() + "%");
        System.out.println();

        System.out.println("KotMBank: ");
        System.out.println("Saving Rate = " + k.getSavingsInterestRate() + "%, Fixed Rate = "
                + k.getFixedDepositInterestRate() + "%");
        System.out.println();

        System.out.println("General Bank1: ");
        System.out.println("Saving Rate = " + g1.getSavingsInterestRate() + "%, Fixed Rate = "
                + g1.getFixedDepositInterestRate() + "%");
        System.out.println();

        System.out.println("General Bank2: ");
        System.out.println("Saving Rate = " + g2.getSavingsInterestRate() + "%, Fixed Rate = "
                + g2.getFixedDepositInterestRate() + "%");
        System.out.println();
    }
}
