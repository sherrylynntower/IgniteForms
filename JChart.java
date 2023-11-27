package Profile;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;




@SuppressWarnings({ "serial", "unused" })
public class JChart extends JFrame{
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	
	public int numusers=0;
	public String nameofskill;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				JChart frame = new JChart();
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		});

	}
	
	
	public JChart() {
		conn = dbConnection.ConnectDB();
		
		getContentPane().setLayout(null);
		setBounds(400, 400, 900, 500);
		
		// Management Skills (SKILL Group) SELECT Distinct SkillGroup FROM SkillTable
		//SKILL Name (setup combo box SELECT Distinct SkillTitle FROM SkillTable WHERE SkillGroup = "Management")
		//When getselectedvalue Display the number of users that have the skill
		
		
		JPanel panelChart = new JPanel();
		panelChart.setBackground(new Color(201, 240, 252));
		panelChart.setBounds(90, 186, 616, 206);
		getContentPane().add(panelChart);
		panelChart.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Display Bar Chart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
				barChartData.setValue(20000, "Number of users", "January");
				barChartData.setValue(15000, "Number of users", "Feburary");
				barChartData.setValue(30000, "Number of users", "March");	
				
				JFreeChart barChart = ChartFactory.createBarChart("Management Skills", "Skill Name", "Number of users", barChartData, PlotOrientation.VERTICAL, false, true, false);
				CategoryPlot barchrt = barChart.getCategoryPlot();
				barchrt.setRangeGridlinePaint(Color.BLUE);
				
				ChartPanel barPanel = new ChartPanel(barChart);
				panelChart.removeAll();
				panelChart.add(barPanel,BorderLayout.CENTER);
				panelChart.validate();
				
				
			}
		});
		btnNewButton.setBounds(105, 71, 180, 56);
		getContentPane().add(btnNewButton);
		
		
	}
	
	
}