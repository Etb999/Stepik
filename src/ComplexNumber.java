public class ComplexNumber {
        private final double re;
        private final double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

    @Override
    public int hashCode() {
        int summ = (int)re + (int)im;

        if (summ > 0){
            return 1000000000 + summ;
        }
            return 2000000000 - summ;
    }

    @Override
        public boolean equals(Object obj)
        {
            ComplexNumber complex = (ComplexNumber) obj;
            double a = complex.getRe();
            double b = complex.getIm();
            return ((Double.valueOf(this.re).compareTo(Double.valueOf((a))) == 0 ) & ((Double.valueOf(this.im).compareTo(Double.valueOf((b))) == 0)));
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }
}

