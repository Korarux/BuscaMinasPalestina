public class BuscaMinasPalestina {

    public static void main(String[] args) {
        System.out.println("Bienvenido al busca minas, Una pequeña introduccion:");
        System.out.println("Eres un palestino que desea ver a su familia, desactiva las bombas de los iranis!");

        //POSICIÓN ALEATORIA DE LA MINA
        int cordenadaX = (int)Math.floor(Math.random() * 4);      
        int cordenadaY = (int)Math.floor(Math.random() * 4);
        //  System.out.println(cordenadaX + " " + cordenadaY);

        //TABLERO INVISIBLE
        int[][] tablero = { {0, 0, 0, 0}, 
                            {0, 0, 0, 0},  
                            {0, 0, 0, 0}, 
                            {0, 0, 0, 0}};

        //COLOCACIÓN DE LA MINA
        tablero[cordenadaX][cordenadaY] = 3;

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print("[]");
            } 
            System.out.println();
        }  

        //TIRADA JUGADOR

    Boolean program = true;
    int intentos = 15;

    do {
        // System.out.println(cordenadaX + " " + cordenadaY);
        System.out.println("Donde crees que esta la mina en la cordenada y");
        String inputJugadorX = System.console().readLine();
        int cordenadaXjugador = Integer.parseInt(inputJugadorX);
              
        System.out.println("Donde crees que esta la mina en la cordenada x");
        String inputJugadorY = System.console().readLine();
        int cordenadaYjugador = Integer.parseInt(inputJugadorY);     

        //PARTIDA GUARDADA
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(cordenadaXjugador == i && cordenadaYjugador == j) {
                    if(tablero[i][j] == 0) {
                        tablero[i][j] = 1;                      
                }
            }
        }                   
        System.out.println();
        }

        //PINTAR ESTADO ACTUAL DE PARTIDA
        for(int i = 0; i < 4; i++) { 
            for(int j = 0; j < 4; j++) {
                if(tablero[i][j] == 0 || !(cordenadaXjugador == i && cordenadaYjugador == j) && tablero[i][j] == 3) {
                    System.out.print("[]\t");
                } else if (tablero[i][j] == 1) {
                    System.out.print("X\t"); 
                } else if ((cordenadaXjugador == i && cordenadaYjugador == j) && tablero[i][j] == 3) {
                    System.out.print("O\t");
                    program = false;
                }
            }    
        System.out.println();
        } 

        if(program == false) {
            System.out.println("ha explotado el paestino, no podra volver a ver a su familia. Sus trescientos hijos y su mujer no podran comer mañana (SIENTETE CULPABLE) Las ultimas palabras del palestino fueron "INshala"");
        } else if (intentos == 0) {
            System.out.println("HAS LIBERADO AL PUEBLO PALESTINO");
        } else {
            System.out.println("GG");
            intentos--;
        } 
    
        
    } while(program && intentos > 0);
 

    }
}


