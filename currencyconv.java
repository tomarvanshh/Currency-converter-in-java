import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class currencyconv extends JFrame {

    private JTextField amountField;
    private JComboBox<String> fromCurrency;
    private JComboBox<String> toCurrency;
    private JLabel resultLabel;

    public currencyconv() {
        setTitle("Currency Converter");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setBounds(30, 30, 100, 25);
        add(amountLabel);

        amountField = new JTextField();
        amountField.setBounds(140, 30, 150, 25);
        add(amountField);

        String[] currencies = {"USD", "EUR", "GBP", "JPY", "AUD", "CAD", "CHF", "CNY", "SEK", "NZD"};
        fromCurrency = new JComboBox<>(currencies);
        fromCurrency.setBounds(30, 70, 100, 25);
        add(fromCurrency);

        toCurrency = new JComboBox<>(currencies);
        toCurrency.setBounds(140, 70, 100, 25);
        add(toCurrency);
        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(30, 110, 100, 25);
        add(convertButton);

        resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(140, 110, 200, 25);
        add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });
    }
    private void convertCurrency() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            String from = (String) fromCurrency.getSelectedItem();
            String to = (String) toCurrency.getSelectedItem();
            double rate = getConversionRate(from, to);
            double result = amount * rate;

            resultLabel.setText("Result: " + result + " " + to);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private double getConversionRate(String from, String to) {
        if (from.equals("USD")) {
            switch (to) {
                case "EUR": return 0.92;
                case "GBP": return 0.79;
                case "JPY": return 110.0;
                case "AUD": return 1.35;
                case "CAD": return 1.25;
                case "CHF": return 0.91;
                case "CNY": return 6.45;
                case "SEK": return 8.70;
                case "NZD": return 1.42;
                default: return 1.0;
            }
        } else if (from.equals("EUR")) {
            switch (to) {
                case "USD": return 1.18;
                case "GBP": return 0.88;
                case "JPY": return 129.0;
                case "AUD": return 1.59;
                case "CAD": return 1.47;
                case "CHF": return 1.08;
                case "CNY": return 7.58;
                case "SEK": return 10.24;
                case "NZD": return 1.67;
                default: return 1.0;
            }
        }
        if (from.equals("GBP")) {
            switch (to) {
                case "EUR": return 1.16;
                case "USD": return 1.27;
                case "JPY": return 204.84;
                case "AUD": return 1.88;
                case "CAD": return 1.73;
                case "CHF": return 1.16;
                case "CNY": return 9.21;
                case "SEK": return 13.5;
                case "NZD": return 2;
                default: return 1.0;
            }
        }
        if (from.equals("JPY")) {
            switch (to) {
                case "EUR": return 0.0058;
                case "GBP": return 0.0050;
                case "USD": return 0.0063;
                case "AUD": return 0.0093;
                case "CAD": return 0.0086;
                case "CHF": return 0.0058;
                case "CNY": return 0.046;
                case "SEK": return 0.068;
                case "NZD": return 0.010;
                default: return 1.0;
            }
        }
        if (from.equals("AUD")) {
            switch (to) {
                case "EUR": return 0.62;
                case "GBP": return 0.53;
                case "JPY": return 106.80;
                case "USD": return 0.68;
                case "CAD": return 0.92;
                case "CHF": return 0.61;
                case "CNY": return 4.91;
                case "SEK": return 7.21;
                case "NZD": return 1.10;
                default: return 1.0;
            }
        }
        if (from.equals("CAD")) {
            switch (to) {
                case "EUR": return 0.67;
                case "GBP": return 0.58;
                case "JPY": return 115.6;
                case "AUD": return 1.08;
                case "USD": return 0.73;
                case "CHF": return 0.67;
                case "CNY": return 5.31;
                case "SEK": return 7.81;
                case "NZD": return 1.20;
                default: return 1.0;
            }
        }
        if (from.equals("CHF")) {
            switch (to) {
                case "EUR": return 1;
                case "GBP": return 0.86;
                case "JPY": return 172.53;
                case "AUD": return 1.62;
                case "CAD": return 1.49;
                case "USD": return 1.09;
                case "CNY": return 7.93;
                case "SEK": return 11.65;
                case "NZD": return 1.78;
                default: return 1.0;
            }
        }
        if (from.equals("CNY")) {
            switch (to) {
                case "EUR": return 0.13;
                case "GBP": return 0.11;
                case "JPY": return 21.77;
                case "AUD": return 0.20;
                case "CAD": return 0.19;
                case "CHF": return 0.13;
                case "USD": return 0.14;
                case "SEK": return 1.45;
                case "NZD": return 0.23;
                default: return 1.0;
            }
        }
        if (from.equals("SEK")) {
            switch (to) {
                case "EUR": return 0.086;
                case "GBP": return 0.073;
                case "JPY": return 14.80;
                case "AUD": return 0.14;
                case "CAD": return 0.13;
                case "CHF": return 0.086;
                case "CNY": return 0.68;
                case "USD": return 0.094;
                case "NZD": return 0.15;
                default: return 1.0;
            }
        }
        if (from.equals("NZD")) {
            switch (to) {
                case "EUR": return 0.56;
                case "GBP": return 0.48;
                case "JPY": return 96.6;
                case "AUD": return 0.91;
                case "CAD": return 0.84;
                case "CHF": return 0.55;
                case "CNY": return 4.44;
                case "SEK": return 6.53;
                case "USD": return 0.61;
                default: return 1.0;
            }
        }
        return 1.0;
    }

    public static void main(String[] args) {
        new currencyconv().setVisible(true);
    }
}


