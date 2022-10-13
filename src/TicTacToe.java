import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TicTacToe implements ActionListener  {

    JFrame frame = new JFrame();
    JPanel title_p = new JPanel();

    JPanel button_p = new JPanel();
    JLabel text_Title = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn = true;
    TicTacToe(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.getContentPane();
        frame.setTitle("tic tac tio");
        ImageIcon image = new ImageIcon("tic-tac-toe.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);


        title_p.setLayout(new BorderLayout());
        title_p.setBounds(500,40,500,40);
        title_p.add(text_Title);
        frame.add(title_p,BorderLayout.NORTH);


        text_Title.setBackground(Color.white);
        text_Title.setForeground(new Color(247,33,25));
        text_Title.setFont(new Font("Georgia",Font.ITALIC, 40));
        text_Title.setHorizontalAlignment(JLabel.CENTER);
        text_Title.setText("Tic Tac Toe");
        text_Title.setOpaque(true);



        button_p.setLayout(new GridLayout(3,3));
        button_p.setBackground(Color.white);
        frame.add(button_p);
        for(int i=0; i<9; i++){
            buttons[i] = new JButton();
            button_p.add(buttons[i]);
            buttons[i].setFont(new Font("Ariel",Font.BOLD,60));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);

        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0; i<9; i++){
            if(e.getSource()==buttons[i]){
                if (player1_turn){
                    if (buttons[i].getText().equals("")){
                        buttons[i].setText("X");
                        player1_turn=false;
                        text_Title.setText("O turn");
                        check();
                    }
                }
            else {
                if(e.getSource()==buttons[i]){
                    if (buttons[i].getText().equals("")){
                        buttons[i].setText("O");
                        player1_turn= true;
                        text_Title.setText("X turn");
                        check();
                    }
                }
            }
            }
        }


    }

    public void check(){
        if (
                (buttons[0].getText().equals("X")) &&
                        (buttons[1].getText().equals("X")) &&
                        (buttons[2].getText().equals("X"))){
            playerOneWins(0,1,2);
        }
        if (
                (buttons[3].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[5].getText().equals("X"))
        ) {
            playerOneWins(3,4,5);
        }
        if (
                (buttons[6].getText().equals("X")) &&
                        (buttons[7].getText().equals("X")) &&
                        (buttons[8].getText().equals("X"))
        ) {
            playerOneWins(6,7,8);
        }
        if (
                (buttons[0].getText().equals("X")) &&
                        (buttons[3].getText().equals("X")) &&
                        (buttons[6].getText().equals("X"))){
            playerOneWins(0,3,6);
        }
        if (
                (buttons[1].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[7].getText().equals("X"))
        ) {
            playerOneWins(1,4,7);
        }
        if (
                (buttons[2].getText().equals("X")) &&
                        (buttons[5].getText().equals("X")) &&
                        (buttons[8].getText().equals("X"))
        ) {
            playerOneWins(2,5,8);
        }
        if (
                (buttons[0].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[8].getText().equals("X"))){
            playerOneWins(0,4,8);
        }
        if (
                (buttons[2].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[6].getText().equals("X"))
        ) {
            playerOneWins(2,4,6);
        }
        if (
                (buttons[0].getText().equals("O")) &&
                        (buttons[1].getText().equals("O")) &&
                        (buttons[2].getText().equals("O"))){
            playerTwoWins(0,1,2);
        }
        if (
                (buttons[3].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[5].getText().equals("O"))
        ) {
            playerTwoWins(3,4,5);
        }
        if (
                (buttons[6].getText().equals("O")) &&
                        (buttons[7].getText().equals("O")) &&
                        (buttons[8].getText().equals("O"))
        ) {
            playerTwoWins(6,7,8);
        }
        if (
                (buttons[0].getText().equals("O")) &&
                        (buttons[3].getText().equals("O")) &&
                        (buttons[6].getText().equals("O"))){
            playerTwoWins(0,3,6);
        }
        if (
                (buttons[1].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[7].getText().equals("O"))
        ) {
            playerTwoWins(1,4,7);
        }
        if (
                (buttons[2].getText().equals("O")) &&
                        (buttons[5].getText().equals("O")) &&
                        (buttons[8].getText().equals("O"))
        ) {
            playerTwoWins(2,5,8);
        }
        if (
                (buttons[0].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[8].getText().equals("O"))){
            playerTwoWins(0,4,8);
        }
        if (
                (buttons[2].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[6].getText().equals("O"))
        ) {
            playerTwoWins(2,4,6);}
        else if ((!buttons[0].getText().equals("")) &&
                !buttons[1].getText().equals("") &&
                !buttons[2].getText().equals("") &&
                !buttons[3].getText().equals("") &&
                !buttons[4].getText().equals("") &&
                !buttons[5].getText().equals("") &&
                !buttons[6].getText().equals("") &&
                !buttons[7].getText().equals("") &&
                !buttons[8].getText().equals("") && !text_Title.getText().equals("X wins") ){
            {
                for (int i=0; i<9; i++)
                {
                    buttons[i].setEnabled(false);
                    buttons[i].setBackground(Color.gray);
                    buttons[i].setForeground(Color.gray);
                    text_Title.setText("Draw");

                }int odp = JOptionPane.showConfirmDialog(null,
                    "Do u want to play again",
                    "Play Again", JOptionPane.YES_NO_OPTION);
                if(odp== 0){
                    new TicTacToe();
                    frame.dispose();
                }else {
                    System.exit(0);
                }
            }
        }

    }


    public void playerOneWins(int a,int b, int c)
    {
        buttons[a].setBackground(Color.gray);
        buttons[a].setForeground(Color.gray);
        buttons[b].setBackground(Color.gray);
        buttons[b].setForeground(Color.gray);
        buttons[c].setBackground(Color.gray);
        buttons[c].setForeground(Color.gray);

        for (int i=0;i<9; i++)
        {
            buttons[i].setEnabled(false);
            text_Title.setText("X wins");
        }
        int odp = JOptionPane.showConfirmDialog(null,
                "Do u want to play again",
                "Play Again", JOptionPane.YES_NO_OPTION);
        if(odp== 0){
            new TicTacToe();
            frame.dispose();
        }else {
            System.exit(0);
        }

    }

    public void playerTwoWins (int a, int b, int c)
    {
        buttons[a].setBackground(Color.gray);
        buttons[a].setForeground(Color.gray);
        buttons[b].setBackground(Color.gray);
        buttons[b].setForeground(Color.gray);
        buttons[c].setBackground(Color.gray);
        buttons[c].setForeground(Color.gray);
        for(int i=0; i<9; i++)
        {
            buttons[i].setEnabled(false);
            text_Title.setText("O Wins");
        }
        int odp = JOptionPane.showConfirmDialog(null,
                "Do u want to play again",
                "Play Again", JOptionPane.YES_NO_OPTION);
        if(odp== 0){
            new TicTacToe();
            frame.dispose();
        }else {
            System.exit(0);
        }
    }
}

