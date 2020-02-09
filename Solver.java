import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Solver {


    class Cube {

        int[][][] data;

        public void reset(){
            int[][][] cubeData = 
            {
                {
                    {1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1}
                },
                {
                    {1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1}
                },
                {
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1}
                },
                {
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1}
                },
                {
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1}
                },
                {
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1}
                },
                {
                    {1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1}
                },
                {
                    {1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,0,0,0,0,1,1},
                    {1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1}
                },
            };

            data = cubeData;
        }
    }

    int[][][] piece1Data = 
    {
        {
            {1,1,1,1,0,0},
            {1,1,1,1,0,0},
            {0,0,1,1,1,1},
            {0,0,1,1,1,1},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {1,1,1,1,0,0},
            {1,1,1,1,0,0},
            {0,0,1,1,1,1},
            {0,0,1,1,1,1},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        }
    };

    int[][][] piece2Data = 
    {
        {
            {1,1,1,1},
            {1,1,1,1},
            {0,0,1,1},
            {0,0,0,0}
        },
        {
            {1,1,1,1},
            {1,1,1,1},
            {0,0,1,1},
            {0,0,0,0}
        },
        {
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}
        },
        {
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}
        }
    };

    int[][][] piece3Data = 
    {
        {
            {0,0,0,0},
            {0,0,0,0},
            {1,1,0,0},
            {1,1,0,0}
        },
        {
            {0,0,0,0},
            {0,0,0,0},
            {1,1,0,0},
            {1,1,0,0}
        },
        {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,0,0},
            {1,1,0,0}
        },
        {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,0,0},
            {1,1,0,0}
        }
    };

    int[][][] piece4Data = 
    {
        {
            {1,1,1,0,0,0},
            {1,1,1,0,0,0},
            {1,1,1,1,1,1},
            {1,1,1,1,1,1},
            {0,0,0,0,0,1},
            {0,0,0,0,0,1}
        },
        {
            {1,1,1,0,0,0},
            {1,1,1,0,0,0},
            {1,1,1,1,1,1},
            {1,1,1,1,1,1},
            {0,0,0,0,0,1},
            {0,0,0,0,0,1}
        },
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        }
    };


    int[][][] piece5Data = 
    {
        {
            {1,1,1,1,0,0},
            {1,1,1,1,0,0},
            {0,0,1,1,1,1},
            {0,0,1,1,1,1},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {1,1,1,1,0,0},
            {1,1,1,1,0,0},
            {0,0,1,1,1,1},
            {0,0,1,1,1,1},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,1,1,0,0},
            {0,0,1,1,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,1,1,0,0},
            {0,0,1,1,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        }
    };

    int[][][] piece6Data = 
    {
        {
            {0,0,1,1,1,1},
            {0,0,1,1,1,1},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {0,0,1,1,1,1},
            {0,0,1,1,1,1},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {1,1,1,1,0,0},
            {1,1,1,1,0,0},
            {1,1,1,1,0,0},
            {1,1,1,1,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {1,1,1,1,0,0},
            {1,1,1,1,0,0},
            {1,1,1,1,0,0},
            {1,1,1,1,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        }
    };

    int[][][] piece7Data = 
    {
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,1,1},
            {0,0,0,0,1,1},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,1,1},
            {0,0,0,0,1,1},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {1,1,0,0,0,0},
            {1,1,0,0,0,0},
            {1,1,0,0,1,1},
            {1,1,0,0,1,1},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {1,1,0,0,0,0},
            {1,1,0,0,0,0},
            {1,1,1,1,1,1},
            {1,1,1,1,1,1},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {1,1,0,0,0,0},
            {1,1,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        },
        {
            {1,1,0,0,0,0},
            {1,1,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        }
    };

    class Piece {
        int[][][] data;
        int id;
        int rotation;
        List positions = new ArrayList();

        public Piece(int id, int[][][] data){
            this.id = id;
            this.data = data;
        }

        public String toString() {
            return Integer.toString(id)+":"+Integer.toString(rotation);
        }
    }

    Cube cube;
    Piece[] pieces;

    public static void main(String[] args) {
        new Solver().init().run();
    }

    private Solver init() {
        this.cube = new Cube();

        Piece piece1 = new Piece(2, piece1Data);
        Piece piece2 = new Piece(3, piece2Data);
        Piece piece3 = new Piece(4, piece3Data);
        Piece piece4 = new Piece(5, piece4Data);
        Piece piece5 = new Piece(6, piece5Data);
        Piece piece6 = new Piece(7, piece6Data);
        Piece piece7 = new Piece(8, piece7Data);
        
        Piece[] pieces = {piece7, piece4, piece6, piece1, piece5, piece3, piece2};
         this.pieces = pieces;

         findPiecesPositions();

        return this;
    }
    
    private void run() {
        usePosition(5,0);
    }

    private void findPiecesPositions() {
        for (int k = 0; k < 7; k++) {
            cube.reset();
            Piece piece = pieces[k];
            findPositions(piece);
            System.out.println(piece.positions.size());
        }
    }

    long piecesTried = 0;

    private void rotatePiece(Piece piece) {
        int[][][] matrix = piece.data;
        int[][][] rotated = new int[matrix.length][matrix[0].length][matrix[0][0].length];
        
        for (int z = 0; z < matrix.length; z++) {
            for (int y = 0; y < matrix[z].length; y++) {
                for (int x = 0; x < matrix[z][y].length; x++) {
                    if(matrix[z][y][x] == 1){

                        int x2;
                        int y2;
                        int z2;

                        if(piece.rotation == 4 || piece.rotation == 8 || piece.rotation == 12){
                            // rotate 90 around x and translate along y
                            x2 = x;
                            y2 = -z + matrix[0].length - 1;
                            z2 = y;
                        } else if(piece.rotation == 16 || piece.rotation == 20){
                            // rotate 90 around y and translate along z
                            x2 = z;
                            y2 = y;
                            z2 = -x + matrix[0].length - 1;
                        } else {
                            // rotate 90 clockwice around z and translate along x into first quardrant into new matrix
                            x2 = -y + matrix[0].length - 1;
                            y2 = x;
                            z2 = z;
                        }

//                        System.out.println(x+","+y+","+z+"->"+x2+","+y2+","+z2);
                        rotated[z2][y2][x2] = 1;
                    }
                }
            }
        }
        piece.rotation = piece.rotation<24?piece.rotation+1:1;
        piece.data = rotated;
    }

    private void usePosition(int positionIndex, int pieceIndex) {
        int[][][] position = ((int[][][])pieces[pieceIndex].positions.get(positionIndex));
        boolean success = true;
        //check
        for (int x = 0; x < cube.data.length; x++) {
            for (int y = 0; y < cube.data[x].length; y++) {
                for (int z = 0; z < cube.data[x][y].length; z++) {
                    if(position[x][y][z] == 1) {
                        if(cube.data[x][y][z] != 0) {
                            success = false;
                        }
                    }
                }
            }
        }

        //update
        if(success) {
            for (int x = 0; x < cube.data.length; x++) {
                for (int y = 0; y < cube.data[x].length; y++) {
                    for (int z = 0; z < cube.data[x][y].length; z++) {
                        if(position[x][y][z] == 1) {
                            cube.data[x][y][z] = pieces[pieceIndex].id;
                        }
                    }
                }
            }
            if(pieceIndex+1 < pieces.length) {
                usePosition(0, pieceIndex+1);

                for (int x = 0; x < cube.data.length; x++) {
                    for (int y = 0; y < cube.data[x].length; y++) {
                        for (int z = 0; z < cube.data[x][y].length; z++) {
                            if(position[x][y][z] == 1) {
                                cube.data[x][y][z] = 0;
                            }
                        }
                    }
                }
            } else {
                System.out.println(" found solution");
//                printMatrix3d(cube.data);
                printMinecraftCommand(cube.data);
            }
        } 
        
        if(positionIndex+1 < pieces[pieceIndex].positions.size()) {
            usePosition(positionIndex+1, pieceIndex);
        }
    }

    private void findPositions(Piece piece) {

        for (int k = 0; k < 24; k++) {
            rotatePiece(piece);
            
            for (int x = 0; x < cube.data.length; x=x+2) {
                for (int y = 0; y < cube.data[x].length; y=y+2) {
                    for (int z = 0; z < cube.data[x][y].length; z=z+2) {

                        int[][][] space = new int[8][8][8];
                        boolean fits = true;
                        for (int x1 = 0; x1 < piece.data.length; x1++) {
                            for (int y1 = 0; y1 < piece.data[x1].length; y1++) {
                                for (int z1 = 0; z1 < piece.data[x1][y1].length; z1++) {
                                    if(piece.data[x1][y1][z1] == 1) {
                                        if(x+x1 >= cube.data.length || y+y1 >= cube.data[x].length || z+z1 >= cube.data[x][y].length){
                                            fits = false;
                                        } else if(cube.data[x+x1][y+y1][z+z1] != 0){
                                            fits = false;
                                        } else {
                                            space[x+x1][y+y1][z+z1] = 1;
                                        }
                                    }
                                }
                            }
                        }
                        if(fits) {
                            piece.positions.add(space);
                        }
                    }
                }
            }
        }
    }

    private void printMatrix3d(int[][][] matrix3d) {
        Arrays.asList(matrix3d).stream().forEach(slice -> {
            Arrays.asList(slice).stream().forEach(row -> {
                System.out.println(Arrays.toString(row));
            });
            System.out.println();
        });
    }

    private void printMinecraftCommand(int[][][] matrix3d) {

        for (int z = cube.data.length-1; z >= 0; z--) {
            for (int y = 0; y < cube.data[z].length; y++) {
                for (int x = 0; x < cube.data[z][y].length; x++) {
                    String block = "brown_stained_glass";
                    switch (cube.data[z][y][x]){
                        case 1:
                            block = "brown_stained_glass";
                            break;
                        case 2:
                            block = "yellow_stained_glass";
                            break;
                        case 3:
                            block = "blue_stained_glass";
                            break;
                        case 4:
                            block = "green_stained_glass";
                            break;
                        case 5:
                            block = "gray_stained_glass";
                            break;
                        case 6:
                            block = "black_stained_glass";
                            break;
                        case 7:
                            block = "white_stained_glass";
                            break;
                        case 8:
                            block = "red_stained_glass";
                            break;
                    }
                    System.out.println("setblock ~"+x+" ~"+y+" ~"+z+" "+block);
                }
            }
        }
    }
}