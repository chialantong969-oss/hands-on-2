
enum AccountType {

    SAVINGS("SA", 2.5),
    CREDIT("CR", 0.0),
    DEPOSIT("DE", 3.0);

    private String code;
    private double interestRate;

    // Konstruktor enum
    AccountType(String code, double interestRate) {
        this.code = code;
        this.interestRate = interestRate;
    }

    public String getCode() {
        return code;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

// Program utama
public class handson2 {
    public static void main(String[] args) {

        System.out.println("=== DATA ACCOUNT TYPE ===");

        // Menampilkan semua tipe akun
        for (AccountType akun : AccountType.values()) {

            System.out.println("Nama Akun  : " + akun.name());
            System.out.println("Kode       : " + akun.getCode());
            System.out.println("Suku Bunga : " +
                akun.getInterestRate() + "%");

            System.out.println("-------------------------");
        }
    }
}

