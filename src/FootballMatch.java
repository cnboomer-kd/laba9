import javax.swing.*;

public class FootballMatch extends JFrame
{
    private final JLabel resultLabel;
    private final JLabel lastScorerLabel;
    private final JLabel winnerLabel;

    private int milanScore = 0;
    private int madridScore = 0;

    public FootballMatch()
    {
        setTitle("Football Match");
        setSize(480, 220);
        setLayout(null);

        JButton milanButton = new JButton("AC Milan");
        milanButton.setBounds(20, 20, 200, 60);
        add(milanButton);

        JButton madridButton = new JButton("Real Madrid");
        madridButton.setBounds(240, 20, 200, 60);
        add(madridButton);

        resultLabel = new JLabel("Результат: 0 X 0");
        resultLabel.setBounds(170, 80, 200, 60);
        add(resultLabel);

        lastScorerLabel = new JLabel("Последний ход: н/а");
        lastScorerLabel.setBounds(170, 100, 200, 60);
        add(lastScorerLabel);

        winnerLabel = new JLabel("Победитель: Ничья");
        winnerLabel.setBounds(170, 120, 200, 60);
        add(winnerLabel);

        milanButton.addActionListener(e ->
        {
            milanScore++;
            updateLabels("AC Milan");
        });

        madridButton.addActionListener(e ->
        {
            madridScore++;
            updateLabels("Real Madrid");
        });
    }

    private void updateLabels(String lastScorer)
    {
        resultLabel.setText("Результат: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Последний ход: " + lastScorer);

        if (milanScore > madridScore)
        {
            winnerLabel.setText("Победитель: AC Milan");
        }
        else if (madridScore > milanScore)
        {
            winnerLabel.setText("Победитель: Real Madrid");
        }
        else
        {
            winnerLabel.setText("Победитель: Ничья");
        }
    }

    public static void main(String[] args) {
        FootballMatch match = new FootballMatch();
        match.setVisible(true);
        match.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}