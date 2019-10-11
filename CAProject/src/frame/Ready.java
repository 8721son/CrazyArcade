package frame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Ready extends JPanel {
	public String imgfile;
	public String id;
	public String status;

	public String getImgfile() {
		return imgfile;
	}

	public void setImgfile(String imgfile) {
		this.imgfile = imgfile;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Ready(String imgfile, String id, String status) {
		this.setLayout(null);
		this.imgfile = imgfile;
		this.id = id;
		this.status = status;
		this.setBackground(new Color(0, 69, 140));
		this.setBorder(new TitledBorder(new LineBorder(Color.black, 1)));
		ImageIcon rnscjd = new ImageIcon(imgfile);
		JLabel img = new JLabel(rnscjd);
		this.add(img);
		img.setBounds(20, 20, 110, 110);
		JLabel text1 = new JLabel(id);
		JLabel text2 = new JLabel(status);
		this.add(text1);
		text1.setBounds(40, 150, 130, 20);
		text2.setBounds(45, 170, 130, 20);
		this.add(text2);
		text1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		text2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
	}

}
