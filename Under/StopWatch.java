package Under;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StopWatch extends JFrame implements ActionListener {
    private JLabel timeLabel;
    private Timer timer;
    private long startTime;
    private long elapsedTime;

    public StopWatch() {
        setTitle("Stopwatch");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        timeLabel = new JLabel("00:00:00");
        add(timeLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton startButton = new JButton("Start");
        startButton.addActionListener(this);
        buttonPanel.add(startButton);

        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(this);
        buttonPanel.add(stopButton);

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);

        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        timer = new Timer();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Start")) {
            startTime = System.nanoTime();
            timer.start();
        } else if (e.getActionCommand().equals("Stop")) {
            timer.stop();
            elapsedTime += System.nanoTime() - startTime;
        } else if (e.getActionCommand().equals("Reset")) {
            timer.stop();
            elapsedTime = 0;
        }
        updateTimeLabel();
    }

    private void updateTimeLabel() {
        long seconds = elapsedTime / 1000000000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        seconds %= 60;
        minutes %= 60;
        hours %= 24;
        timeLabel.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }

    public static void main(String[] args) {
        new StopWatch();
    }
}
