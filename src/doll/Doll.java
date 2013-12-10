package doll;

	import java.util.Stack;
	import java.awt.Color;
	import java.awt.Graphics2D;
	import java.util.Scanner;

	import javax.swing.*;

	import java.util.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.awt.image.*;
	import java.io.*;
	import java.nio.charset.Charset;

	import javax.imageio.*;
	import javax.swing.*;
/**
 *
 * @author Megan
 */
public class Doll {

		private static final int WIDTH = 500;
		private static final int HEIGHT = 500;
		
		//EDT calls worker thread
		public static void main(String[] args)
		{
			SwingUtilities.invokeLater( new Runnable()
			{
				public void run()
				{
					createAndShowGUI();
				}
			});
		}
		private static void createAndShowGUI()
		{
			JFrame frame = new Layout();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                 
			frame.setVisible( true );
		}
    
}
