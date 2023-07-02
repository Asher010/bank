package UI;

import UI.BankUI;
import UI.SavingsAccount;
import UI.CurrentAccount;

import javax.swing.*;
import java.util.Scanner;




public class Main {
    public static <BankUI> void main(String[]args){
// SwingUtilities.invokeLater(new Runnable() {
// @Override
// public void run() {
// BankUI gui = new BankUI();
//
// }
// });
        BankUI bankUI = new BankUI();
        bankUI. mainUI();
    }
}