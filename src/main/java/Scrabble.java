class Scrabble {

    public static void main(String[] args) {
        String b = "HORSEMH";
        char[] s = b.toCharArray();
        int count = 0;

        for (int i = 0; i <= s.length - 1; i++) {
            System.out.println(valueOfLetter(s[i]));
            count += valueOfLetter(s[i]);
        }

        System.out.println("Score: " + count);
    }

    public static int valueOfLetter(char s) {
        int count = 0;

        //10 arrays. The index stands for points.
        char[][] worth = {{'1'}, {'A', 'I', 'E', 'U', 'N', 'R', 'O', 'S', 'L', 'T'}, {'1'}, {'C', 'P', 'B', 'M'}, {'F', 'V', 'Y', 'W', 'H'}, {'K'}, {'1'}, {'1'}, {'J', 'X'}, {'1'}, {'Q', 'Z'}};

        for (int i = 0; i < 10; i++) {
            for (int e = 0; e <= worth[i].length - 1; e++) {
                if (s == worth[i][e]) {
                    count = i;
                }
            }
        }

        return count;
    }
}