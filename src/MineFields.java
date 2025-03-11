import java.util.Scanner;

public class MineFields {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder();
        String line;

        while (!(line = scanner.nextLine()).isEmpty()) {
            input.append(line).append("\n");
        }

        String[] lines = input.toString().split("\n");
        int N = lines.length;
        int M = lines[0].length();
        char[][] field = new char[N][M];

        for (int i = 0; i < N; i++) {
            field[i] = lines[i].toCharArray();
        }

        int[][] result = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (field[i][j] == '*') {
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            int ni = i + di;
                            int nj = j + dj;
                            if (ni >= 0 && ni < N && nj >= 0 && nj < M && field[ni][nj] == '.') {
                                result[ni][nj]++;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (field[i][j] == '*') {
                    System.out.print('*');
                } else {
                    System.out.print(result[i][j]);
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}