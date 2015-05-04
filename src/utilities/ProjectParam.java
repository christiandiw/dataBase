package utilities;

import gui.draw.MainFrame;
import gui.table.FilterTable;

import java.awt.Color;

public final class ProjectParam {

	//COLORS --------------------------------------------------------------------------------------------
	
	public final static Color NO_MATCH_COL = new Color(255,140,140);
	public final static Color HIGHLIGHT_COL = new Color(161,192,87);
	public final static Color MESSAGE_COL = new Color(38,127,0); //(161,192,87);
	public final static Color ALTERNATING_ROW_COL = new Color(240,255,240); //(245, 245, 245);
	
	//PATH & FILE NAMES & FILE ENDINGS -------------------------------------------------------------------
	
	public final static String DATA_BASE_FILE_EXT = ".DataBase";
	public static String ROOTH_PATH_APPL = null;
	//public final static String ROOT_PATH = System.getProperty("user.dir");
	public  static String ROOT_PATH = null;
	public final static int ID_DIGITS	= 5;
	public final static String DATA_FOLDER = "\\dataBase\\";
	
	//FILTER TABLE CONTENT STRUCTURE ---------------------------------------------------------------------
	
	public static FilterTable FILTER_TABLE = null;
	public static MainFrame MAIN_FRAME = null;
	
}