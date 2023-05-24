class HelloWorld {
    public static void main(String[] args) {
        int ALPT = 0; // Average Lookup Page Time
        double hitratio = 0.8;
        int ARLT = 120; // Associative Registers Lookup Time
        int MPTLT = 600; // Main-memory page-table lookup time
        
        Algorithm algorithm = new Algorithm();
        algorithm.calculate1(ALPT, hitratio, ARLT, MPTLT);
    }
    
    private static class Algorithm {
        private void calculate1(int ALPT, double hitratio, int ARLT, int MPTLT) {
            double ARPT = hitratio * ARLT * (1 - hitratio) * MPTLT;
            System.out.println(ARPT);
        }
    }
}
