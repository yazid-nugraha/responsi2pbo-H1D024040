class Member extends Customer {
    private int poinReward;
    private String levelKeanggotaan;
    
    public Member(String nama, String idCustomer, int totalBelanja, int poinReward, String levelKeanggotaan) {
        super(nama, idCustomer, totalBelanja);
        this.poinReward = poinReward;
        this.levelKeanggotaan = levelKeanggotaan;
    }
    
    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + poinReward + " | Level: " + levelKeanggotaan);
    }
}