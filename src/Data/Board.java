/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import Data.PropertyCard;
/**
 *
 * @author Juan Ochoa
 */
public class Board {
    private static Square[][] gameBoard;
    private ArrayList<PropertyCard> cards = new ArrayList<>();
    
    public Board() {
        PropertyCard bogota = new PropertyCard(3500,"Bogotá");
        PropertyCard cartagena = new PropertyCard(3400,"Cartagena");
        PropertyCard tayrona = new PropertyCard(3300,"Parque Tayrona");
        PropertyCard medellin = new PropertyCard(3200,"Medellin");
        PropertyCard santaMarta = new PropertyCard(3100,"Santa Marta");
        PropertyCard sanAndres = new PropertyCard(3000,"San Andres");
        PropertyCard cali = new PropertyCard(2999,"Cali");
        PropertyCard guatape = new PropertyCard(678,"Guatape");
        PropertyCard barranquilla = new PropertyCard(2800,"Barranquilla");
        PropertyCard salento = new PropertyCard(456,"Salento");
        PropertyCard villaLeyva = new PropertyCard(2600,"villaLeyva");
        PropertyCard taganga = new PropertyCard(2500,"Taganga");
        PropertyCard popayan = new PropertyCard(2400,"Popayan");
        PropertyCard manizales = new PropertyCard(2300,"Manizales");
        PropertyCard sanAgustin = new PropertyCard(2200,"San Agustin");
        PropertyCard chicamocha = new PropertyCard(2100,"Chicamocha");
        PropertyCard pereira = new PropertyCard(2000,"Pereira");
        PropertyCard bucaramanga = new PropertyCard(1900,"Bucaramanga");
        PropertyCard sanGil = new PropertyCard(300,"San Gil");
        PropertyCard leticia = new PropertyCard(1700,"Leticia");
        PropertyCard armenia = new PropertyCard(1200,"Armenia");
        PropertyCard chiquinquira = new PropertyCard(1555,"Chiquinquira");
        PropertyCard zipaquira = new PropertyCard(1454,"Zipaquira");
        PropertyCard barichara = new PropertyCard(1373,"Barichara");
        PropertyCard losNevados = new PropertyCard(744,"Los Nevados");
        PropertyCard pasto = new PropertyCard(1023,"Pasto");
        PropertyCard rioHacha = new PropertyCard(567,"Rio Hacha");
        PropertyCard ipiales = new PropertyCard(345,"Ipiales");
        
        
        cards.add(bogota);
        cards.add(cartagena);
        cards.add(tayrona);
        cards.add(medellin);
        cards.add(santaMarta);
        cards.add(sanAndres);
        cards.add(cali);
        cards.add(guatape);
        cards.add(barranquilla);
        cards.add(salento);
        cards.add(villaLeyva);
        cards.add(taganga);
        cards.add(popayan);
        cards.add(manizales);
        cards.add(sanAgustin);
        cards.add(chicamocha);
        cards.add(pereira);
        cards.add(bucaramanga);
        cards.add(sanGil);
        cards.add(leticia);
        cards.add(armenia);
        cards.add(chiquinquira);
        cards.add(zipaquira);
        cards.add(barichara);
        cards.add(losNevados);
        cards.add(pasto);
        cards.add(rioHacha);
        cards.add(sanGil);
        cards.add(ipiales);
        
        //probar push
        int value = 0;
        gameBoard = new Square[11][11];
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard.length; col++) {
                PropertySquare square = new PropertySquare(row, col, "");
                gameBoard[row][col] = square;
            }
        }
    }

    public static Square[][] getGameBoard() {
        return gameBoard;
    }

    public static void setGameBoard(Square[][] gameBoard) {
        Board.gameBoard = gameBoard;
    }
    
    public String printBoard(String player, int r, int c) 
    {
        String printBoard = "\n";

        for (int row = 0; row < 11; row++) {
            printBoard = printBoard.concat("\t|");
            for (int col = 0; col < 11; col++) {
                
                if(row==r && col==c)
                {
                    printBoard = printBoard.concat("|"+player+"|");
                }
                else if(row==0&&col==0)
                {
                    printBoard = printBoard.concat("|   GO   |");
                }
                else if(row==0&&col==10)
                {
                    printBoard = printBoard.concat("   JAIL  |");
                }
                else if(row==10&&col==0)
                {
                    printBoard = printBoard.concat("|GO TO JAIL|");
                }
                else if(row==10&&col==10)
                {
                    printBoard = printBoard.concat("FREE STOP|");
                }
                else if((row==0||row==10))
                {
                    printBoard = printBoard.concat(
                        gameBoard[row][col].getName().concat("|"));
                }
                else if((col==0||col==10))
                {
                    printBoard = printBoard.concat("|".concat(
                        gameBoard[row][col].getName().concat("|")));
                }
                else
                {
                    printBoard = printBoard.concat("         ");
                }
                
            }
            printBoard = printBoard.concat("\n");
        }
        return printBoard;
    }
}
