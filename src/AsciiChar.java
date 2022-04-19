public class AsciiChar {
    public class AsciiCharSequence implements CharSequence {

        private byte[] args;

        public AsciiCharSequence(byte ... args){
            this.args = args;
        }

        @Override
        public int length(){
            return args.length;
        }

        @Override
        public char charAt(int index){
            return (char)args[index];
        }

        @Override
        public CharSequence subSequence(int start, int end){
            byte[] sequence = new byte[end - start];
            for (int i = 0, j = start; i < (end - start); i++, j++){
                sequence[i] = args[j];
            }
            return new AsciiCharSequence(sequence);
        }
        @Override
        public String toString(){
            StringBuilder sequence = new StringBuilder();
            for (int i = 0; i < args.length; i++){
                sequence.append((char)args[i]);
            }
            return sequence.toString();
        }

    }

}
