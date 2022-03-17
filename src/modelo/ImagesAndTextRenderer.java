package modelo;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ImagesAndTextRenderer extends JLabel implements ListCellRenderer<Object> {
	

	public Component getListCellRendererComponent(JList<?> list, Object val, int index, boolean isSelected, boolean cellHasFocus) {
		Imagenes imagesNText = (Imagenes) val;
		setIcon(imagesNText.getImg());
		setText(imagesNText.getName());
		
		if (isSelected) {
			setBackground(list.getSelectionBackground());
			setForeground(list.getSelectionForeground());
		} 
		else {
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}
		setFont(list.getFont());
		return this;
	 }
}
