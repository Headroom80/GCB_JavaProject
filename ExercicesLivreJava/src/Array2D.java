public class Array2D {
    public static void main(String[] args) {
        char[][] data = new char[7][7];

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                data[i][j] = '0';
                int center = data.length / 2 ;
                data[center][center] = '*';
                data[center+1][center] = '*';
                data[center-1][center] = '*';
                data[center-2][center] = '*';
                data[center+2][center] = '*';
                data[center-3][center] = '*';
                data[center+3][center] = '*';
                data[center][center+1] = '*';
                data[center][center-1] = '*';
                data[center][center+2] = '*';
                data[center][center-2] = '*';
                data[center][center+3] = '*';
                data[center][center-3] = '*';
                data[center-1][center-1] = '*';
                data[center-2][center-2] = '*';
                data[center-3][center-3] = '*';
                data[center-1][center+1] = '*';
                data[center-2][center+2] = '*';
                data[center-3][center+3] = '*';
                data[center+1][center-1] = '*';
                data[center+2][center-2] = '*';
                data[center+3][center-3] = '*';
                data[center+1][center+1] = '*';
                data[center+2][center+2] = '*';
                data[center+3][center+3] = '*';
                System.out.print(data[i][j]);
            }
            System.out.println();
        }

        }





}
