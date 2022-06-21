README

This is a program that allows the user to input algebraic notation from 2700chess.com
and output the move notation in pgn (portable game notation) format, which can then be 
read by popular chess analysis programs like lichess, chess.com, Stockfish, and others. 
This program only will convert notation in formats identical to that used by 2700chess. 

For example, a chess move on 2700chess is listed in the format 

1 e4 e5 

which cannot be read by a pgn reader. It has to be written as 

1. e4 e5

instead. This program automates the conversion process.

Java is required to run this program.

Instructions: 

Download the repository, which will henceforth be referred to as pgnr. 

Copy, paste and save the game moves (and only the moves) from 2700chess 
in algebraic notation, as a .txt file in pgnr. Repeat this process for all
games you wish to convert.

Open your command line and navigate into pgnr. 

Run the main.java program. 

The program will request the name of the txt file containing the
moves that were copy/pasted. Type in the name of that file and hit return/enter.

The converted notation is then returned in the command line, which can be 
copied into chess analysis software/pgn readers. 

Thereafter, you will be prompted to enter additional txt file names, or the word "done"
to signify that you have no more files to parse to pgn. 

You can test the program on the "test.txt" file in the repository,
which already has algebraic notation in the 2700chess format,  that requires 
conversion to pgn.

Future updates will include usability improvements. 
