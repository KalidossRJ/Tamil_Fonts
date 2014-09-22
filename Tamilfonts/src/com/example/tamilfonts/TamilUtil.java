package com.example.tamilfonts;


public class TamilUtil {
	
	/**
	 * à®ªà®¾à®®à®¿à®©à®¿ à®®à¯�à®±à¯ˆà®¯à®¿à®²à¯� à®…à®®à¯ˆà®¨à¯�à®¤ à®•à¯�à®±à®¿à®¯à¯‡à®±à¯�à®±à®®à¯�
	 */
	public final static int BAMINI = 0;
	/**
	 * à®¤à®¿à®¸à¯�à®•à®¿ à®®à¯�à®±à¯ˆà®¯à®¿à®²à¯� à®…à®®à¯ˆà®¨à¯�à®¤ à®•à¯�à®±à®¿à®¯à¯‡à®±à¯�à®±à®®à¯�
	 */
	public final static int TSCII = 1;
	/**
	 * à®…à®žà¯�à®šà®²à¯� à®®à¯�à®±à¯ˆà®¯à®¿à®²à¯� à®…à®®à¯ˆà®¨à¯�à®¤ à®•à¯�à®±à®¿à®¯à¯‡à®±à¯�à®±à®®à¯�
	 */
	public final static int ANJAL = 2;
	/**
	 * à®Ÿà®¾à®ªà¯� à®®à¯�à®±à¯ˆà®¯à®¿à®²à¯� à®…à®®à¯ˆà®¨à¯�à®¤ à®•à¯�à®±à®¿à®¯à¯‡à®±à¯�à®±à®®à¯�
	 */
	public final static int TAB = 3;
	/**
	 * à®Ÿà®¾à®®à¯� à®®à¯�à®±à¯ˆà®¯à®¿à®²à¯� à®…à®®à¯ˆà®¨à¯�à®¤ à®•à¯�à®±à®¿à®¯à¯‡à®±à¯�à®±à®®à¯�
	 */
	public final static int TAM = 4;
	
	/**
	 * à®‡à®¨à¯�à®¤ method à®‡à®©à¯� à®®à¯‚à®²à®®à¯� à®¨à¯€à®™à¯�à®•à®³à¯� à®¯à¯�à®©à®¿à®•à¯�à®•à¯‹à®Ÿà¯� à®•à¯�à®±à®¿à®®à¯�à®±à¯ˆà®¯à®¿à®²à¯� à®‡à®°à¯�à®¨à¯�à®¤à¯� à®‰à®™à¯�à®•à®³à¯�à®•à¯�à®•à¯�à®¤à¯� 
	 * à®¤à¯‡à®µà¯ˆà®¯à®¾à®© à®•à¯�à®±à®¿à®®à¯�à®±à¯ˆà®•à¯�à®•à¯� à®šà¯Šà®±à¯�à®•à®³à¯�, à®µà®šà®©à®™à¯�à®•à®³à¯ˆ à®®à®¾à®±à¯�à®±à®¿à®•à¯� à®•à¯Šà®³à¯�à®³à®²à®¾à®®à¯�.
	 * @param encodCode - à®Žà®¨à¯�à®¤à®•à¯� à®•à¯�à®±à®¿à®®à¯�à®±à¯ˆà®•à¯�à®•à¯� à®®à®¾à®±à¯�à®± à®µà®¿à®°à¯�à®®à¯�à®ªà¯�à®•à®¿à®©à¯�à®±à¯€à®°à¯�à®•à®³à¯� à®Žà®©à¯�à®ªà®¤à¯ˆ à®‡à®™à¯�à®•à¯‡ à®•à¯�à®±à®¿à®ªà¯�à®ªà®¿à®Ÿ à®µà¯‡à®£à¯�à®Ÿà¯�à®®à¯�.
	 * à®‰à®¤à®¾à®°à®£à®®à®¾à®• à®ªà®¾à®®à®¿à®©à®¿ à®®à¯�à®±à¯ˆ à®Žà®©à¯�à®±à®¾à®²à¯� TamilUtil.BAMINI à®Žà®©à¯�à®±à¯‹ à®…à®²à¯�à®²à®¤à¯� à®¤à®¿à®¸à¯�à®•à®¿ à®®à¯�à®±à¯ˆà®®à¯ˆ à®Žà®©à¯�à®±à®¾à®²à¯� TamilUtil.TSCII
	 * à®Žà®©à¯�à®±à¯‹ à®•à¯�à®±à®¿à®ªà¯�à®ªà®¿à®Ÿà®²à®¾à®®à¯�.
	 * 
	 * @param unicodeStr à®¯à¯�à®©à®¿à®•à¯�à®•à¯‹à®Ÿà¯� à®šà¯Šà®±à¯�à®•à®³à¯� à®µà®šà®©à®™à¯�à®•à®³à¯�
	 * @return à®¯à¯�à®©à®¿à®•à¯�à®•à¯‹à®Ÿà®¿à®²à¯� à®‡à®°à¯�à®¨à¯�à®¤à¯� à®¨à¯€à®™à¯�à®•à®³à¯� à®•à¯�à®±à®¿à®ªà¯�à®ªà®¿à®Ÿà¯�à®Ÿ à®•à¯�à®±à®¿à®®à¯�à®±à¯ˆà®•à¯�à®•à¯� à®®à®¾à®±à¯�à®±à®ªà¯�à®ªà®Ÿà¯�à®Ÿ à®šà¯Šà®±à¯�à®•à®³à¯�, à®µà®šà®©à®™à¯�à®•à®³à¯� à®‰à®™à¯�à®•à®³à¯�à®•à¯�à®•à¯� à®µà®¨à¯�à®¤à¯� à®•à®¿à®Ÿà¯ˆà®•à¯�à®•à¯�à®®à¯�.
	 */
	public static String convertToTamil(int encodCode, String unicodeStr){
		String convertedStr = "";
		TamilUtil tu = new TamilUtil();
		if(encodCode== TamilUtil.BAMINI){
			convertedStr = tu.convertToBamini(unicodeStr);
		}
		else if(encodCode== TamilUtil.TSCII){
			convertedStr = tu.convertToTSCII(unicodeStr);
		}
		else if(encodCode==TamilUtil.ANJAL){
			convertedStr = tu.convertToAnjal(unicodeStr);
		}
		else if(encodCode==TamilUtil.TAB){
			convertedStr = tu.convertToTab(unicodeStr);
		}
		else if(encodCode==TamilUtil.TAM){
			convertedStr = tu.convertToTam(unicodeStr);
		}
		return convertedStr;
	}
	
	private String convertToBamini(String unicodeStr){
		unicodeStr = unicodeStr.replace("à®¸à¯�à®°à¯€", "=");
		unicodeStr = unicodeStr.replace(",", ">");
		unicodeStr = unicodeStr.replace("à®œà¯Œ", "n[s");
		unicodeStr = unicodeStr.replace("à®œà¯‹", "N[h");
		unicodeStr = unicodeStr.replace("à®œà¯Š", "n[h");
		unicodeStr = unicodeStr.replace("à®œà®¾", "[h");
		unicodeStr = unicodeStr.replace("à®œà®¿", "[p");
		unicodeStr = unicodeStr.replace("à®œà¯€", "[P");
		unicodeStr = unicodeStr.replace("à®œà¯�", "[{");
		unicodeStr = unicodeStr.replace("à®œà¯‚", "[_");
		unicodeStr = unicodeStr.replace("à®œà¯†", "n[");
		unicodeStr = unicodeStr.replace("à®œà¯‡", "N[");
		unicodeStr = unicodeStr.replace("à®œà¯ˆ", "i[");
		unicodeStr = unicodeStr.replace("à®œà¯�", "[;");
		unicodeStr = unicodeStr.replace("à®œ", "[");
		unicodeStr = unicodeStr.replace("à®•à¯Œ", "nfs");
		unicodeStr = unicodeStr.replace("à®•à¯‹", "Nfh");
		unicodeStr = unicodeStr.replace("à®•à¯Š", "nfh");
		unicodeStr = unicodeStr.replace("à®•à®¾", "fh");
		unicodeStr = unicodeStr.replace("à®•à®¿", "fp");
		unicodeStr = unicodeStr.replace("à®•à¯€", "fP");
		unicodeStr = unicodeStr.replace("à®•à¯�", "F");
		unicodeStr = unicodeStr.replace("à®•à¯‚", "$");
		unicodeStr = unicodeStr.replace("à®•à¯†", "nf");
		unicodeStr = unicodeStr.replace("à®•à¯‡", "Nf");
		unicodeStr = unicodeStr.replace("à®•à¯ˆ", "if");
		unicodeStr = unicodeStr.replace("à®•à¯�", "f;");
		unicodeStr = unicodeStr.replace("à®•", "f");
		unicodeStr = unicodeStr.replace("à®™à¯Œ", "nqs");
		unicodeStr = unicodeStr.replace("à®™à¯‹", "Nqh");
		unicodeStr = unicodeStr.replace("à®™à¯Š", "nqh");
		unicodeStr = unicodeStr.replace("à®™à®¾", "qh");
		unicodeStr = unicodeStr.replace("à®™à®¿", "qp");
		unicodeStr = unicodeStr.replace("à®™à¯€", "qP");
		unicodeStr = unicodeStr.replace("à®™à¯�", "*");
		unicodeStr = unicodeStr.replace("à®™à¯‚", "*");
		unicodeStr = unicodeStr.replace("à®™à¯†", "nq");
		unicodeStr = unicodeStr.replace("à®™à¯‡", "Nq");
		unicodeStr = unicodeStr.replace("à®™à¯ˆ", "iq");
		unicodeStr = unicodeStr.replace("à®™à¯�", "q;");
		unicodeStr = unicodeStr.replace("à®™", "q");
		unicodeStr = unicodeStr.replace("à®šà¯Œ", "nrs");
		unicodeStr = unicodeStr.replace("à®šà¯‹", "Nrh");
		unicodeStr = unicodeStr.replace("à®šà¯Š", "nrh");
		unicodeStr = unicodeStr.replace("à®šà®¾", "rh");
		unicodeStr = unicodeStr.replace("à®šà®¿", "rp");
		unicodeStr = unicodeStr.replace("à®šà¯€", "rP");
		unicodeStr = unicodeStr.replace("à®šà¯�", "R");
		unicodeStr = unicodeStr.replace("à®šà¯‚", "R+");
		unicodeStr = unicodeStr.replace("à®šà¯†", "nr");
		unicodeStr = unicodeStr.replace("à®šà¯‡", "Nr");
		unicodeStr = unicodeStr.replace("à®šà¯ˆ", "ir");
		unicodeStr = unicodeStr.replace("à®šà¯�", "r;");
		unicodeStr = unicodeStr.replace("à®š", "r");
		unicodeStr = unicodeStr.replace("à®žà¯Œ", "nQs");
		unicodeStr = unicodeStr.replace("à®žà¯‹", "NQh");
		unicodeStr = unicodeStr.replace("à®žà¯Š", "nQh");
		unicodeStr = unicodeStr.replace("à®žà®¾", "Qh");
		unicodeStr = unicodeStr.replace("à®žà®¿", "Qp");
		unicodeStr = unicodeStr.replace("à®žà¯€", "QP");
		unicodeStr = unicodeStr.replace("à®žà¯�", "*");
		unicodeStr = unicodeStr.replace("à®žà¯‚", "*");
		unicodeStr = unicodeStr.replace("à®žà¯†", "nQ");
		unicodeStr = unicodeStr.replace("à®žà¯‡", "NQ");
		unicodeStr = unicodeStr.replace("à®žà¯ˆ", "iQ");
		unicodeStr = unicodeStr.replace("à®žà¯�", "Q;");
		unicodeStr = unicodeStr.replace("à®ž", "Q");
		unicodeStr = unicodeStr.replace("à®Ÿà¯Œ", "nls");
		unicodeStr = unicodeStr.replace("à®Ÿà¯‹", "Nlh");
		unicodeStr = unicodeStr.replace("à®Ÿà¯Š", "nlh");
		unicodeStr = unicodeStr.replace("à®Ÿà®¾", "lh");
		unicodeStr = unicodeStr.replace("à®Ÿà®¿", "b");
		unicodeStr = unicodeStr.replace("à®Ÿà¯€", "B");
		unicodeStr = unicodeStr.replace("à®Ÿà¯�", "L");
		unicodeStr = unicodeStr.replace("à®Ÿà¯‚", "^");
		unicodeStr = unicodeStr.replace("à®Ÿà¯†", "nl");
		unicodeStr = unicodeStr.replace("à®Ÿà¯‡", "Nl");
		unicodeStr = unicodeStr.replace("à®Ÿà¯ˆ", "il");
		unicodeStr = unicodeStr.replace("à®Ÿà¯�", "l;");
		unicodeStr = unicodeStr.replace("à®Ÿ", "l");
		unicodeStr = unicodeStr.replace("à®£à¯Œ", "nzs");
		unicodeStr = unicodeStr.replace("à®£à¯‹", "Nzh");
		unicodeStr = unicodeStr.replace("à®£à¯Š", "nzh");
		unicodeStr = unicodeStr.replace("à®£à®¾", "zh");
		unicodeStr = unicodeStr.replace("à®£à®¿", "zp");
		unicodeStr = unicodeStr.replace("à®£à¯€", "zP");
		unicodeStr = unicodeStr.replace("à®£à¯�", "Z");
		unicodeStr = unicodeStr.replace("à®£à¯‚", "Z}");
		unicodeStr = unicodeStr.replace("à®£à¯†", "nz");
		unicodeStr = unicodeStr.replace("à®£à¯‡", "Nz");
		unicodeStr = unicodeStr.replace("à®£à¯ˆ", "iz");
		unicodeStr = unicodeStr.replace("à®£à¯�", "z;");
		unicodeStr = unicodeStr.replace("à®£", "z");
		unicodeStr = unicodeStr.replace("à®¤à¯Œ", "njs");
		unicodeStr = unicodeStr.replace("à®¤à¯‹", "Njh");
		unicodeStr = unicodeStr.replace("à®¤à¯Š", "njh");
		unicodeStr = unicodeStr.replace("à®¤à®¾", "jh");
		unicodeStr = unicodeStr.replace("à®¤à®¿", "jp");
		unicodeStr = unicodeStr.replace("à®¤à¯€", "jP");
		unicodeStr = unicodeStr.replace("à®¤à¯�", "J");
		unicodeStr = unicodeStr.replace("à®¤à¯‚", "J}");
		unicodeStr = unicodeStr.replace("à®¤à¯†", "nj");
		unicodeStr = unicodeStr.replace("à®¤à¯‡", "Nj");
		unicodeStr = unicodeStr.replace("à®¤à¯ˆ", "ij");
		unicodeStr = unicodeStr.replace("à®¤à¯�", "j;");
		unicodeStr = unicodeStr.replace("à®¤", "j");
		unicodeStr = unicodeStr.replace("à®¨à¯Œ", "nes");
		unicodeStr = unicodeStr.replace("à®¨à¯‹", "Neh");
		unicodeStr = unicodeStr.replace("à®¨à¯Š", "neh");
		unicodeStr = unicodeStr.replace("à®¨à®¾", "eh");
		unicodeStr = unicodeStr.replace("à®¨à®¿", "ep");
		unicodeStr = unicodeStr.replace("à®¨à¯€", "eP");
		unicodeStr = unicodeStr.replace("à®¨à¯�", "E");
		unicodeStr = unicodeStr.replace("à®¨à¯‚", "E}");
		unicodeStr = unicodeStr.replace("à®¨à¯†", "ne");
		unicodeStr = unicodeStr.replace("à®¨à¯‡", "Ne");
		unicodeStr = unicodeStr.replace("à®¨à¯ˆ", "ie");
		unicodeStr = unicodeStr.replace("à®¨à¯�", "e;");
		unicodeStr = unicodeStr.replace("à®¨", "e");
		unicodeStr = unicodeStr.replace("à®©à¯Œ", "nds");
		unicodeStr = unicodeStr.replace("à®©à¯‹", "Ndh");
		unicodeStr = unicodeStr.replace("à®©à¯Š", "ndh");
		unicodeStr = unicodeStr.replace("à®©à®¾", "dh");
		unicodeStr = unicodeStr.replace("à®©à®¿", "dp");
		unicodeStr = unicodeStr.replace("à®©à¯€", "dP");
		unicodeStr = unicodeStr.replace("à®©à¯�", "D");
		unicodeStr = unicodeStr.replace("à®©à¯‚", "D}");
		unicodeStr = unicodeStr.replace("à®©à¯†", "nd");
		unicodeStr = unicodeStr.replace("à®©à¯‡", "Nd");
		unicodeStr = unicodeStr.replace("à®©à¯ˆ", "id");
		unicodeStr = unicodeStr.replace("à®©à¯�", "d;");
		unicodeStr = unicodeStr.replace("à®©", "d");
		unicodeStr = unicodeStr.replace("à®ªà¯Œ", "ngs");
		unicodeStr = unicodeStr.replace("à®ªà¯‹", "Ngh");
		unicodeStr = unicodeStr.replace("à®ªà¯Š", "ngh");
		unicodeStr = unicodeStr.replace("à®ªà®¾", "gh");
		unicodeStr = unicodeStr.replace("à®ªà®¿", "gp");
		unicodeStr = unicodeStr.replace("à®ªà¯€", "gP");
		unicodeStr = unicodeStr.replace("à®ªà¯�", "G");
		unicodeStr = unicodeStr.replace("à®ªà¯‚", "G+");
		unicodeStr = unicodeStr.replace("à®ªà¯†", "ng");
		unicodeStr = unicodeStr.replace("à®ªà¯‡", "Ng");
		unicodeStr = unicodeStr.replace("à®ªà¯ˆ", "ig");
		unicodeStr = unicodeStr.replace("à®ªà¯�", "g;");
		unicodeStr = unicodeStr.replace("à®ª", "g");
		unicodeStr = unicodeStr.replace("à®®à¯Œ", "nks");
		unicodeStr = unicodeStr.replace("à®®à¯‹", "Nkh");
		unicodeStr = unicodeStr.replace("à®®à¯Š", "nkh");
		unicodeStr = unicodeStr.replace("à®®à®¾", "kh");
		unicodeStr = unicodeStr.replace("à®®à®¿", "kp");
		unicodeStr = unicodeStr.replace("à®®à¯€", "kP");
		unicodeStr = unicodeStr.replace("à®®à¯�", "K");
		unicodeStr = unicodeStr.replace("à®®à¯‚", "%");
		unicodeStr = unicodeStr.replace("à®®à¯†", "nk");
		unicodeStr = unicodeStr.replace("à®®à¯‡", "Nk");
		unicodeStr = unicodeStr.replace("à®®à¯ˆ", "ik");
		unicodeStr = unicodeStr.replace("à®®à¯�", "k;");
		unicodeStr = unicodeStr.replace("à®®", "k");
		unicodeStr = unicodeStr.replace("à®¯à¯Œ", "nas");
		unicodeStr = unicodeStr.replace("à®¯à¯‹", "Nah");
		unicodeStr = unicodeStr.replace("à®¯à¯Š", "nah");
		unicodeStr = unicodeStr.replace("à®¯à®¾", "ah");
		unicodeStr = unicodeStr.replace("à®¯à®¿", "ap");
		unicodeStr = unicodeStr.replace("à®¯à¯€", "aP");
		unicodeStr = unicodeStr.replace("à®¯à¯�", "A");
		unicodeStr = unicodeStr.replace("à®¯à¯‚", "A+");
		unicodeStr = unicodeStr.replace("à®¯à¯†", "na");
		unicodeStr = unicodeStr.replace("à®¯à¯‡", "Na");
		unicodeStr = unicodeStr.replace("à®¯à¯ˆ", "ia");
		unicodeStr = unicodeStr.replace("à®¯à¯�", "a;");
		unicodeStr = unicodeStr.replace("à®¯", "a");
		unicodeStr = unicodeStr.replace("à®°à¯Œ", "nus");
		unicodeStr = unicodeStr.replace("à®°à¯‹", "Nuh");
		unicodeStr = unicodeStr.replace("à®°à¯Š", "nuh");
		unicodeStr = unicodeStr.replace("à®°à®¾", "uh");
		unicodeStr = unicodeStr.replace("à®°à®¿", "up");
		unicodeStr = unicodeStr.replace("à®°à¯€", "uP");
		unicodeStr = unicodeStr.replace("à®°à¯�", "U");
		unicodeStr = unicodeStr.replace("à®°à¯‚", "\\&");
		unicodeStr = unicodeStr.replace("à®°à¯†", "nu");
		unicodeStr = unicodeStr.replace("à®°à¯‡", "Nu");
		unicodeStr = unicodeStr.replace("à®°à¯ˆ", "iu");
		unicodeStr = unicodeStr.replace("à®°à¯�", "u;");
		unicodeStr = unicodeStr.replace("à®°", "u");
		unicodeStr = unicodeStr.replace("à®²à¯Œ", "nys");
		unicodeStr = unicodeStr.replace("à®²à¯‹", "Nyh");
		unicodeStr = unicodeStr.replace("à®²à¯Š", "nyh");
		unicodeStr = unicodeStr.replace("à®²à®¾", "yh");
		unicodeStr = unicodeStr.replace("à®²à®¿", "yp");
		unicodeStr = unicodeStr.replace("à®²à¯€", "yP");
		unicodeStr = unicodeStr.replace("à®²à¯�", "Y");
		unicodeStr = unicodeStr.replace("à®²à¯‚", "Y}");
		unicodeStr = unicodeStr.replace("à®²à¯†", "ny");
		unicodeStr = unicodeStr.replace("à®²à¯‡", "Ny");
		unicodeStr = unicodeStr.replace("à®²à¯ˆ", "iy");
		unicodeStr = unicodeStr.replace("à®²à¯�", "y;");
		unicodeStr = unicodeStr.replace("à®²", "y");
		unicodeStr = unicodeStr.replace("à®³à¯Œ", "nss");
		unicodeStr = unicodeStr.replace("à®³à¯‹", "Nsh");
		unicodeStr = unicodeStr.replace("à®³à¯Š", "nsh");
		unicodeStr = unicodeStr.replace("à®³à®¾", "sh");
		unicodeStr = unicodeStr.replace("à®³à®¿", "sp");
		unicodeStr = unicodeStr.replace("à®³à¯€", "sP");
		unicodeStr = unicodeStr.replace("à®³à¯�", "S");
		unicodeStr = unicodeStr.replace("à®³à¯‚", "Sh");
		unicodeStr = unicodeStr.replace("à®³à¯†", "ns");
		unicodeStr = unicodeStr.replace("à®³à¯‡", "Ns");
		unicodeStr = unicodeStr.replace("à®³à¯ˆ", "is");
		unicodeStr = unicodeStr.replace("à®³à¯�", "s;");
		unicodeStr = unicodeStr.replace("à®³", "s");
		unicodeStr = unicodeStr.replace("à®µà¯Œ", "nts");
		unicodeStr = unicodeStr.replace("à®µà¯‹", "Nth");
		unicodeStr = unicodeStr.replace("à®µà¯Š", "nth");
		unicodeStr = unicodeStr.replace("à®µà®¾", "th");
		unicodeStr = unicodeStr.replace("à®µà®¿", "tp");
		unicodeStr = unicodeStr.replace("à®µà¯€", "tP");
		unicodeStr = unicodeStr.replace("à®µà¯�", "T");
		unicodeStr = unicodeStr.replace("à®µà¯‚", "T+");
		unicodeStr = unicodeStr.replace("à®µà¯†", "nt");
		unicodeStr = unicodeStr.replace("à®µà¯‡", "Nt");
		unicodeStr = unicodeStr.replace("à®µà¯ˆ", "it");
		unicodeStr = unicodeStr.replace("à®µà¯�", "t;");
		unicodeStr = unicodeStr.replace("à®µ", "t");
		unicodeStr = unicodeStr.replace("à®´à¯Œ", "nos");
		unicodeStr = unicodeStr.replace("à®´à¯‹", "Noh");
		unicodeStr = unicodeStr.replace("à®´à¯Š", "noh");
		unicodeStr = unicodeStr.replace("à®´à®¾", "oh");
		unicodeStr = unicodeStr.replace("à®´à®¿", "op");
		unicodeStr = unicodeStr.replace("à®´à¯€", "oP");
		unicodeStr = unicodeStr.replace("à®´à¯�", "O");
		unicodeStr = unicodeStr.replace("à®´à¯‚", "*");
		unicodeStr = unicodeStr.replace("à®´à¯†", "no");
		unicodeStr = unicodeStr.replace("à®´à¯‡", "No");
		unicodeStr = unicodeStr.replace("à®´à¯ˆ", "io");
		unicodeStr = unicodeStr.replace("à®´à¯�", "o;");
		unicodeStr = unicodeStr.replace("à®´", "o");
		unicodeStr = unicodeStr.replace("à®±à¯Œ", "nws");
		unicodeStr = unicodeStr.replace("à®±à¯‹", "Nwh");
		unicodeStr = unicodeStr.replace("à®±à¯Š", "nwh");
		unicodeStr = unicodeStr.replace("à®±à®¾", "wh");
		unicodeStr = unicodeStr.replace("à®±à®¿", "wp");
		unicodeStr = unicodeStr.replace("à®±à¯€", "wP");
		unicodeStr = unicodeStr.replace("à®±à¯�", "W");
		unicodeStr = unicodeStr.replace("à®±à¯‚", "W}");
		unicodeStr = unicodeStr.replace("à®±à¯†", "nw");
		unicodeStr = unicodeStr.replace("à®±à¯‡", "Nw");
		unicodeStr = unicodeStr.replace("à®±à¯ˆ", "iw");
		unicodeStr = unicodeStr.replace("à®±à¯�", "w;");
		unicodeStr = unicodeStr.replace("à®±", "w");
		unicodeStr = unicodeStr.replace("à®¹à¯Œ", "n`s");
		unicodeStr = unicodeStr.replace("à®¹à¯‹", "N`h");
		unicodeStr = unicodeStr.replace("à®¹à¯Š", "n`h");
		unicodeStr = unicodeStr.replace("à®¹à®¾", "`h");
		unicodeStr = unicodeStr.replace("à®¹à®¿", "`p");
		unicodeStr = unicodeStr.replace("à®¹à¯€", "`P");
		unicodeStr = unicodeStr.replace("à®¹à¯�", "{`");
		unicodeStr = unicodeStr.replace("à®¹à¯‚", "`_");
		unicodeStr = unicodeStr.replace("à®¹à¯†", "n`");
		unicodeStr = unicodeStr.replace("à®¹à¯‡", "N`");
		unicodeStr = unicodeStr.replace("à®¹à¯ˆ", "i`");
		unicodeStr = unicodeStr.replace("à®¹à¯�", "`;");
		unicodeStr = unicodeStr.replace("à®¹", "`");
		unicodeStr = unicodeStr.replace("à®·à¯Œ", "n\\s");
		unicodeStr = unicodeStr.replace("à®·à¯‹", "N\\h");
		unicodeStr = unicodeStr.replace("à®·à¯Š", "n\\h");
		unicodeStr = unicodeStr.replace("à®·à®¾", "\\h");
		unicodeStr = unicodeStr.replace("à®·à®¿", "\\p");
		unicodeStr = unicodeStr.replace("à®·à¯€", "\\P");
		unicodeStr = unicodeStr.replace("à®·à¯�", "\\{");
		unicodeStr = unicodeStr.replace("à®·à¯‚", "\\\\_");
		unicodeStr = unicodeStr.replace("à®·à¯†", "n\\");
		unicodeStr = unicodeStr.replace("à®·à¯‡", "N\\");
		unicodeStr = unicodeStr.replace("à®·à¯ˆ", "i\\");
		unicodeStr = unicodeStr.replace("à®·à¯�", "\\;");
		unicodeStr = unicodeStr.replace("à®·", "\\");
		unicodeStr = unicodeStr.replace("à®¸à¯Œ", "n]s");
		unicodeStr = unicodeStr.replace("à®¸à¯‹", "N]h");
		unicodeStr = unicodeStr.replace("à®¸à¯Š", "n]h");
		unicodeStr = unicodeStr.replace("à®¸à®¾", "]h");
		unicodeStr = unicodeStr.replace("à®¸à®¿", "]p");
		unicodeStr = unicodeStr.replace("à®¸à¯€", "]P");
		unicodeStr = unicodeStr.replace("à®¸à¯�", "]{");
		unicodeStr = unicodeStr.replace("à®¸à¯‚", "]_");
		unicodeStr = unicodeStr.replace("à®¸à¯†", "n]");
		unicodeStr = unicodeStr.replace("à®¸à¯‡", "N]");
		unicodeStr = unicodeStr.replace("à®¸à¯ˆ", "i]");
		unicodeStr = unicodeStr.replace("à®¸à¯�", "];");
		unicodeStr = unicodeStr.replace("à®¸", "]");
		unicodeStr = unicodeStr.replace("à®…", "m");
		unicodeStr = unicodeStr.replace("à®†", "M");
		unicodeStr = unicodeStr.replace("à®‡", ",");
		unicodeStr = unicodeStr.replace("à®ˆ", "<");
		unicodeStr = unicodeStr.replace("à®‰", "c");
		unicodeStr = unicodeStr.replace("à®Š", "C");
		unicodeStr = unicodeStr.replace("à®Ž", "v");
		unicodeStr = unicodeStr.replace("à®�", "V");
		unicodeStr = unicodeStr.replace("à®�", "I");
		unicodeStr = unicodeStr.replace("à®’", "x");
		unicodeStr = unicodeStr.replace("à®“", "X");
		unicodeStr = unicodeStr.replace("à®”", "xs");
		unicodeStr = unicodeStr.replace("à®ƒ", "\"");
		
		return unicodeStr;
	}
	
	private String convertToTSCII(String unicodeStr){
		unicodeStr = unicodeStr.replace("à®œà¯Œ", "Â¦Æ’Âª");
		unicodeStr = unicodeStr.replace("à®œà¯‹", "Â§Æ’Â¡");
		unicodeStr = unicodeStr.replace("à®œà¯Š", "Â¦Æ’Â¡");
		unicodeStr = unicodeStr.replace("à®œà®¾", "Æ’Â¡");
		unicodeStr = unicodeStr.replace("à®œà®¿", "Æ’Â¢");
		unicodeStr = unicodeStr.replace("à®œà¯€", "Æ’Â£");
		unicodeStr = unicodeStr.replace("à®œà¯�", "Æ’Â¤");
		unicodeStr = unicodeStr.replace("à®œà¯‚", "Æ’Â¥");
		unicodeStr = unicodeStr.replace("à®œà¯†", "Â¦Æ’");
		unicodeStr = unicodeStr.replace("à®œà¯‡", "Â§Æ’");
		unicodeStr = unicodeStr.replace("à®œà¯ˆ", "Â¨Æ’");
		unicodeStr = unicodeStr.replace("à®œà¯�", "\\Ë†");
		unicodeStr = unicodeStr.replace("à®œ", "Æ’");
		unicodeStr = unicodeStr.replace("à®•à¯Œ", "Â¦Â¸Âª");
		unicodeStr = unicodeStr.replace("à®•à¯‹", "Â§Â¸Â¡");
		unicodeStr = unicodeStr.replace("à®•à¯Š", "Â¦Â¸Â¡");
		unicodeStr = unicodeStr.replace("à®•à®¾", "Â¸Â¡");
		unicodeStr = unicodeStr.replace("à®•à®¿", "Â¸Â¢");
		unicodeStr = unicodeStr.replace("à®•à¯€", "Â¸Â£");
		unicodeStr = unicodeStr.replace("à®•à¯�", "ÃŒ");
		unicodeStr = unicodeStr.replace("à®•à¯‚", "Ãœ");
		unicodeStr = unicodeStr.replace("à®•à¯†", "Â¦Â¸");
		unicodeStr = unicodeStr.replace("à®•à¯‡", "Â§Â¸");
		unicodeStr = unicodeStr.replace("à®•à¯ˆ", "Â¨Â¸");
		unicodeStr = unicodeStr.replace("à®•à¯�", "Ã¬");
		unicodeStr = unicodeStr.replace("à®•", "Â¸");
		unicodeStr = unicodeStr.replace("à®™à¯Œ", "Â¦Â¹Âª");
		unicodeStr = unicodeStr.replace("à®™à¯‹", "Â§Â¹Â¡");
		unicodeStr = unicodeStr.replace("à®™à¯Š", "Â¦Â¹Â¡");
		unicodeStr = unicodeStr.replace("à®™à®¾", "Â¹Â¡");
		unicodeStr = unicodeStr.replace("à®™à®¿", "Â¹Â¢");
		unicodeStr = unicodeStr.replace("à®™à¯€", "Â¹Â£");
		unicodeStr = unicodeStr.replace("à®™à¯�", "Â™");
		unicodeStr = unicodeStr.replace("à®™à¯‚", "Â›");
		unicodeStr = unicodeStr.replace("à®™à¯†", "Â¦Â¹");
		unicodeStr = unicodeStr.replace("à®™à¯‡", "Â§Â¹");
		unicodeStr = unicodeStr.replace("à®™à¯ˆ", "Â¨Â¹");
		unicodeStr = unicodeStr.replace("à®™à¯�", "Ã­");
		unicodeStr = unicodeStr.replace("à®™", "Â¹");
		unicodeStr = unicodeStr.replace("à®šà¯Œ", "Â¦ÂºÂª");
		unicodeStr = unicodeStr.replace("à®šà¯‹", "Â§ÂºÂ¡");
		unicodeStr = unicodeStr.replace("à®šà¯Š", "Â¦ÂºÂ¡");
		unicodeStr = unicodeStr.replace("à®šà®¾", "ÂºÂ¡");
		unicodeStr = unicodeStr.replace("à®šà®¿", "ÂºÂ¢");
		unicodeStr = unicodeStr.replace("à®šà¯€", "ÂºÂ£");
		unicodeStr = unicodeStr.replace("à®šà¯�", "Ã�");
		unicodeStr = unicodeStr.replace("à®šà¯‚", "Ã�");
		unicodeStr = unicodeStr.replace("à®šà¯†", "Â¦Âº");
		unicodeStr = unicodeStr.replace("à®šà¯‡", "Â§Âº");
		unicodeStr = unicodeStr.replace("à®šà¯ˆ", "Â¨Âº");
		unicodeStr = unicodeStr.replace("à®šà¯�", "Ã®");
		unicodeStr = unicodeStr.replace("à®š", "Âº");
		unicodeStr = unicodeStr.replace("à®žà¯Œ", "Â¦Â»Âª");
		unicodeStr = unicodeStr.replace("à®žà¯‹", "Â§Â»Â¡");
		unicodeStr = unicodeStr.replace("à®žà¯Š", "Â¦Â»Â¡");
		unicodeStr = unicodeStr.replace("à®žà®¾", "Â»Â¡");
		unicodeStr = unicodeStr.replace("à®žà®¿", "Â»Â¢");
		unicodeStr = unicodeStr.replace("à®žà¯€", "Â»Â£");
		unicodeStr = unicodeStr.replace("à®žà¯�", "Âš");
		unicodeStr = unicodeStr.replace("à®žà¯‚", "Âœ");
		unicodeStr = unicodeStr.replace("à®žà¯†", "Â¦Â»");
		unicodeStr = unicodeStr.replace("à®žà¯‡", "Â§Â»");
		unicodeStr = unicodeStr.replace("à®žà¯ˆ", "Â¨Â»");
		unicodeStr = unicodeStr.replace("à®žà¯�", "Ã¯");
		unicodeStr = unicodeStr.replace("à®ž", "Â»");
		unicodeStr = unicodeStr.replace("à®Ÿà¯Œ", "Â¦Â¼Âª");
		unicodeStr = unicodeStr.replace("à®Ÿà¯‹", "Â§Â¼Â¡");
		unicodeStr = unicodeStr.replace("à®Ÿà¯Š", "Â¦Â¼Â¡");
		unicodeStr = unicodeStr.replace("à®Ÿà®¾", "Â¼Â¡");
		unicodeStr = unicodeStr.replace("à®Ÿà®¿", "ÃŠ");
		unicodeStr = unicodeStr.replace("à®Ÿà¯€", "Ã‹");
		unicodeStr = unicodeStr.replace("à®Ÿà¯�", "ÃŽ");
		unicodeStr = unicodeStr.replace("à®Ÿà¯‚", "Ãž");
		unicodeStr = unicodeStr.replace("à®Ÿà¯†", "Â¦Â¼");
		unicodeStr = unicodeStr.replace("à®Ÿà¯‡", "Â§Â¼");
		unicodeStr = unicodeStr.replace("à®Ÿà¯ˆ", "Â¨Â¼");
		unicodeStr = unicodeStr.replace("à®Ÿà¯�", "Ã°");
		unicodeStr = unicodeStr.replace("à®Ÿ", "Â¼");
		unicodeStr = unicodeStr.replace("à®£à¯Œ", "Â¦Â½Âª");
		unicodeStr = unicodeStr.replace("à®£à¯‹", "Â§Â½Â¡");
		unicodeStr = unicodeStr.replace("à®£à¯Š", "Â¦Â½Â¡");
		unicodeStr = unicodeStr.replace("à®£à®¾", "Â½Â¡");
		unicodeStr = unicodeStr.replace("à®£à®¿", "Â½Â¢");
		unicodeStr = unicodeStr.replace("à®£à¯€", "Â½Â£");
		unicodeStr = unicodeStr.replace("à®£à¯�", "Ã�");
		unicodeStr = unicodeStr.replace("à®£à¯‚", "ÃŸ");
		unicodeStr = unicodeStr.replace("à®£à¯†", "Â¦Â½");
		unicodeStr = unicodeStr.replace("à®£à¯‡", "Â§Â½");
		unicodeStr = unicodeStr.replace("à®£à¯ˆ", "Â¨Â½");
		unicodeStr = unicodeStr.replace("à®£à¯�", "Ã±");
		unicodeStr = unicodeStr.replace("à®£", "Â½");
		unicodeStr = unicodeStr.replace("à®¤à¯Œ", "Â¦Â¾Âª");
		unicodeStr = unicodeStr.replace("à®¤à¯‹", "Â§Â¾Â¡");
		unicodeStr = unicodeStr.replace("à®¤à¯Š", "Â¦Â¾Â¡");
		unicodeStr = unicodeStr.replace("à®¤à®¾", "Â¾Â¡");
		unicodeStr = unicodeStr.replace("à®¤à®¿", "Â¾Â¢");
		unicodeStr = unicodeStr.replace("à®¤à¯€", "Â¾Â£");
		unicodeStr = unicodeStr.replace("à®¤à¯�", "Ã�");
		unicodeStr = unicodeStr.replace("à®¤à¯‚", "Ã ");
		unicodeStr = unicodeStr.replace("à®¤à¯†", "Â¦Â¾");
		unicodeStr = unicodeStr.replace("à®¤à¯‡", "Â§Â¾");
		unicodeStr = unicodeStr.replace("à®¤à¯ˆ", "Â¨Â¾");
		unicodeStr = unicodeStr.replace("à®¤à¯�", "Ã²");
		unicodeStr = unicodeStr.replace("à®¤", "Â¾");
		unicodeStr = unicodeStr.replace("à®¨à¯Œ", "Â¦Â¿Âª");
		unicodeStr = unicodeStr.replace("à®¨à¯‹", "Â§Â¿Â¡");
		unicodeStr = unicodeStr.replace("à®¨à¯Š", "Â¦Â¿Â¡");
		unicodeStr = unicodeStr.replace("à®¨à®¾", "Â¿Â¡");
		unicodeStr = unicodeStr.replace("à®¨à®¿", "Â¿Â¢");
		unicodeStr = unicodeStr.replace("à®¨à¯€", "Â¿Â£");
		unicodeStr = unicodeStr.replace("à®¨à¯�", "Ã‘");
		unicodeStr = unicodeStr.replace("à®¨à¯‚", "Ã¡");
		unicodeStr = unicodeStr.replace("à®¨à¯†", "Â¦Â¿");
		unicodeStr = unicodeStr.replace("à®¨à¯‡", "Â§Â¿");
		unicodeStr = unicodeStr.replace("à®¨à¯ˆ", "Â¨Â¿");
		unicodeStr = unicodeStr.replace("à®¨à¯�", "Ã³");
		unicodeStr = unicodeStr.replace("à®¨", "Â¿");
		unicodeStr = unicodeStr.replace("à®©à¯Œ", "Â¦Ã‰Âª");
		unicodeStr = unicodeStr.replace("à®©à¯‹", "Â§Ã‰Â¡");
		unicodeStr = unicodeStr.replace("à®©à¯Š", "Â¦Ã‰Â¡");
		unicodeStr = unicodeStr.replace("à®©à®¾", "Ã‰Â¡");
		unicodeStr = unicodeStr.replace("à®©à®¿", "Ã‰Â¢");
		unicodeStr = unicodeStr.replace("à®©à¯€", "Ã‰Â£");
		unicodeStr = unicodeStr.replace("à®©à¯�", "Ã›");
		unicodeStr = unicodeStr.replace("à®©à¯‚", "Ã«");
		unicodeStr = unicodeStr.replace("à®©à¯†", "Â¦Ã‰");
		unicodeStr = unicodeStr.replace("à®©à¯‡", "Â§Ã‰");
		unicodeStr = unicodeStr.replace("à®©à¯ˆ", "Â¨Ã‰");
		unicodeStr = unicodeStr.replace("à®©à¯�", "Ã½");
		unicodeStr = unicodeStr.replace("à®©", "Ã‰");
		unicodeStr = unicodeStr.replace("à®ªà¯Œ", "Â¦Ã€Âª");
		unicodeStr = unicodeStr.replace("à®ªà¯‹", "Â§Ã€Â¡");
		unicodeStr = unicodeStr.replace("à®ªà¯Š", "Â¦Ã€Â¡");
		unicodeStr = unicodeStr.replace("à®ªà®¾", "Ã€Â¡");
		unicodeStr = unicodeStr.replace("à®ªà®¿", "Ã€Â¢");
		unicodeStr = unicodeStr.replace("à®ªà¯€", "Ã€Â£");
		unicodeStr = unicodeStr.replace("à®ªà¯�", "Ã’");
		unicodeStr = unicodeStr.replace("à®ªà¯‚", "Ã¢");
		unicodeStr = unicodeStr.replace("à®ªà¯†", "Â¦Ã€");
		unicodeStr = unicodeStr.replace("à®ªà¯‡", "Â§Ã€");
		unicodeStr = unicodeStr.replace("à®ªà¯ˆ", "Â¨Ã€");
		unicodeStr = unicodeStr.replace("à®ªà¯�", "Ã´");
		unicodeStr = unicodeStr.replace("à®ª", "Ã€");
		unicodeStr = unicodeStr.replace("à®®à¯Œ", "Â¦Ã�Âª");
		unicodeStr = unicodeStr.replace("à®®à¯‹", "Â§Ã�Â¡");
		unicodeStr = unicodeStr.replace("à®®à¯Š", "Â¦Ã�Â¡");
		unicodeStr = unicodeStr.replace("à®®à®¾", "Ã�Â¡");
		unicodeStr = unicodeStr.replace("à®®à®¿", "Ã�Â¢");
		unicodeStr = unicodeStr.replace("à®®à¯€", "Ã�Â£");
		unicodeStr = unicodeStr.replace("à®®à¯�", "Ã“");
		unicodeStr = unicodeStr.replace("à®®à¯‚", "Ã£");
		unicodeStr = unicodeStr.replace("à®®à¯†", "Â¦Ã�");
		unicodeStr = unicodeStr.replace("à®®à¯‡", "Â§Ã�");
		unicodeStr = unicodeStr.replace("à®®à¯ˆ", "Â¨Ã�");
		unicodeStr = unicodeStr.replace("à®®à¯�", "Ãµ");
		unicodeStr = unicodeStr.replace("à®®", "Ã�");
		unicodeStr = unicodeStr.replace("à®¯à¯Œ", "Â¦Ã‚Âª");
		unicodeStr = unicodeStr.replace("à®¯à¯‹", "Â§Ã‚Â¡");
		unicodeStr = unicodeStr.replace("à®¯à¯Š", "Â¦Ã‚Â¡");
		unicodeStr = unicodeStr.replace("à®¯à®¾", "Ã‚Â¡");
		unicodeStr = unicodeStr.replace("à®¯à®¿", "Ã‚Â¢");
		unicodeStr = unicodeStr.replace("à®¯à¯€", "Ã‚Â£");
		unicodeStr = unicodeStr.replace("à®¯à¯�", "Ã”");
		unicodeStr = unicodeStr.replace("à®¯à¯‚", "Ã¤");
		unicodeStr = unicodeStr.replace("à®¯à¯†", "Â¦Ã‚");
		unicodeStr = unicodeStr.replace("à®¯à¯‡", "Â§Ã‚");
		unicodeStr = unicodeStr.replace("à®¯à¯ˆ", "Â¨Ã‚");
		unicodeStr = unicodeStr.replace("à®¯à¯�", "Ã¶");
		unicodeStr = unicodeStr.replace("à®¯", "Ã‚");
		unicodeStr = unicodeStr.replace("à®°à¯Œ", "Â¦ÃƒÂª");
		unicodeStr = unicodeStr.replace("à®°à¯‹", "Â§ÃƒÂ¡");
		unicodeStr = unicodeStr.replace("à®°à¯Š", "Â¦ÃƒÂ¡");
		unicodeStr = unicodeStr.replace("à®°à®¾", "ÃƒÂ¡");
		unicodeStr = unicodeStr.replace("à®°à®¿", "ÃƒÂ¢");
		unicodeStr = unicodeStr.replace("à®°à¯€", "ÃƒÂ£");
		unicodeStr = unicodeStr.replace("à®°à¯�", "Ã•");
		unicodeStr = unicodeStr.replace("à®°à¯‚", "Ã¥");
		unicodeStr = unicodeStr.replace("à®°à¯†", "Â¦Ãƒ");
		unicodeStr = unicodeStr.replace("à®°à¯‡", "Â§Ãƒ");
		unicodeStr = unicodeStr.replace("à®°à¯ˆ", "Â¨Ãƒ");
		unicodeStr = unicodeStr.replace("à®°à¯�", "Ã·");
		unicodeStr = unicodeStr.replace("à®°", "Ãƒ");
		unicodeStr = unicodeStr.replace("à®²à¯Œ", "Â¦Ã„Âª");
		unicodeStr = unicodeStr.replace("à®²à¯‹", "Â§Ã„Â¡");
		unicodeStr = unicodeStr.replace("à®²à¯Š", "Â¦Ã„Â¡");
		unicodeStr = unicodeStr.replace("à®²à®¾", "Ã„Â¡");
		unicodeStr = unicodeStr.replace("à®²à®¿", "Ã„Â¢");
		unicodeStr = unicodeStr.replace("à®²à¯€", "Ã„Â£");
		unicodeStr = unicodeStr.replace("à®²à¯�", "Ã–");
		unicodeStr = unicodeStr.replace("à®²à¯‚", "Ã¦");
		unicodeStr = unicodeStr.replace("à®²à¯†", "Â¦Ã„");
		unicodeStr = unicodeStr.replace("à®²à¯‡", "Â§Ã„");
		unicodeStr = unicodeStr.replace("à®²à¯ˆ", "Â¨Ã„");
		unicodeStr = unicodeStr.replace("à®²à¯�", "Ã¸");
		unicodeStr = unicodeStr.replace("à®²", "Ã„");
		unicodeStr = unicodeStr.replace("à®³à¯Œ", "Â¦Ã‡Âª");
		unicodeStr = unicodeStr.replace("à®³à¯‹", "Â§Ã‡Â¡");
		unicodeStr = unicodeStr.replace("à®³à¯Š", "Â¦Ã‡Â¡");
		unicodeStr = unicodeStr.replace("à®³à®¾", "Ã‡Â¡");
		unicodeStr = unicodeStr.replace("à®³à®¿", "Ã‡Â¢");
		unicodeStr = unicodeStr.replace("à®³à¯€", "Ã‡Â£");
		unicodeStr = unicodeStr.replace("à®³à¯�", "Ã™");
		unicodeStr = unicodeStr.replace("à®³à¯‚", "Ã©");
		unicodeStr = unicodeStr.replace("à®³à¯†", "Â¦Ã‡");
		unicodeStr = unicodeStr.replace("à®³à¯‡", "Â§Ã‡");
		unicodeStr = unicodeStr.replace("à®³à¯ˆ", "Â¨Ã‡");
		unicodeStr = unicodeStr.replace("à®³à¯�", "Ã»");
		unicodeStr = unicodeStr.replace("à®³", "Ã‡");
		unicodeStr = unicodeStr.replace("à®µà¯Œ", "Â¦Ã…Âª");
		unicodeStr = unicodeStr.replace("à®µà¯‹", "Â§Ã…Â¡");
		unicodeStr = unicodeStr.replace("à®µà¯Š", "Â¦Ã…Â¡");
		unicodeStr = unicodeStr.replace("à®µà®¾", "Ã…Â¡");
		unicodeStr = unicodeStr.replace("à®µà®¿", "Ã…Â¢");
		unicodeStr = unicodeStr.replace("à®µà¯€", "Ã…Â£");
		unicodeStr = unicodeStr.replace("à®µà¯�", "Ã—");
		unicodeStr = unicodeStr.replace("à®µà¯‚", "Ã§");
		unicodeStr = unicodeStr.replace("à®µà¯†", "Â¦Ã…");
		unicodeStr = unicodeStr.replace("à®µà¯‡", "Â§Ã…");
		unicodeStr = unicodeStr.replace("à®µà¯ˆ", "Â¨Ã…");
		unicodeStr = unicodeStr.replace("à®µà¯�", "Ã¹");
		unicodeStr = unicodeStr.replace("à®µ", "Ã…");
		unicodeStr = unicodeStr.replace("à®´à¯Œ", "Â¦Ã†Âª");
		unicodeStr = unicodeStr.replace("à®´à¯‹", "Â§Ã†Â¡");
		unicodeStr = unicodeStr.replace("à®´à¯Š", "Â¦Ã†Â¡");
		unicodeStr = unicodeStr.replace("à®´à®¾", "Ã†Â¡");
		unicodeStr = unicodeStr.replace("à®´à®¿", "Ã†Â¢");
		unicodeStr = unicodeStr.replace("à®´à¯€", "Ã†Â£");
		unicodeStr = unicodeStr.replace("à®´à¯�", "Ã˜");
		unicodeStr = unicodeStr.replace("à®´à¯‚", "Ã¨");
		unicodeStr = unicodeStr.replace("à®´à¯†", "Â¦Ã†");
		unicodeStr = unicodeStr.replace("à®´à¯‡", "Â§Ã†");
		unicodeStr = unicodeStr.replace("à®´à¯ˆ", "Â¨Ã†");
		unicodeStr = unicodeStr.replace("à®´à¯�", "Ãº");
		unicodeStr = unicodeStr.replace("à®´", "Ã†");
		unicodeStr = unicodeStr.replace("à®±à¯Œ", "Â¦ÃˆÂª");
		unicodeStr = unicodeStr.replace("à®±à¯‹", "Â§ÃˆÂ¡");
		unicodeStr = unicodeStr.replace("à®±à¯Š", "Â¦ÃˆÂ¡");
		unicodeStr = unicodeStr.replace("à®±à®¾", "ÃˆÂ¡");
		unicodeStr = unicodeStr.replace("à®±à®¿", "ÃˆÂ¢");
		unicodeStr = unicodeStr.replace("à®±à¯€", "ÃˆÂ£");
		unicodeStr = unicodeStr.replace("à®±à¯�", "Ãš");
		unicodeStr = unicodeStr.replace("à®±à¯‚", "Ãª");
		unicodeStr = unicodeStr.replace("à®±à¯†", "Â¦Ãˆ");
		unicodeStr = unicodeStr.replace("à®±à¯‡", "Â§Ãˆ");
		unicodeStr = unicodeStr.replace("à®±à¯ˆ", "Â¨Ãˆ");
		unicodeStr = unicodeStr.replace("à®±à¯�", "Ã¼");
		unicodeStr = unicodeStr.replace("à®±", "Ãˆ");
		unicodeStr = unicodeStr.replace("à®¹à¯Œ", "Â¦Â†Âª");
		unicodeStr = unicodeStr.replace("à®¹à¯‹", "Â§Â†Â¡");
		unicodeStr = unicodeStr.replace("à®¹à¯Š", "Â¦Â†Â¡");
		unicodeStr = unicodeStr.replace("à®¹à®¾", "Â†â€ Â¡");
		unicodeStr = unicodeStr.replace("à®¹à®¿", "Â†Â¢");
		unicodeStr = unicodeStr.replace("à®¹à¯€", "Â†Â£");
		unicodeStr = unicodeStr.replace("à®¹à¯�", "Â†Â¤");
		unicodeStr = unicodeStr.replace("à®¹à¯‚", "Â†Â¥");
		unicodeStr = unicodeStr.replace("à®¹à¯†", "Â¦Â†");
		unicodeStr = unicodeStr.replace("à®¹à¯‡", "Â§Â†");
		unicodeStr = unicodeStr.replace("à®¹à¯ˆ", "Â¨Â†");
		unicodeStr = unicodeStr.replace("à®¹à¯�", "Â‹â€¹ ");
		unicodeStr = unicodeStr.replace("à®¹", "â€ Â†");
		unicodeStr = unicodeStr.replace("à®·à¯Œ", "Â¦â€žÂª");
		unicodeStr = unicodeStr.replace("à®·à¯‹", "Â§â€žÂ¡");
		unicodeStr = unicodeStr.replace("à®·à¯Š", "Â¦â€žÂ¡");
		unicodeStr = unicodeStr.replace("à®·à®¾", "â€žÂ¡");
		unicodeStr = unicodeStr.replace("à®·à®¿", "â€žÂ¢");
		unicodeStr = unicodeStr.replace("à®·à¯€", "â€žÂ£");
		unicodeStr = unicodeStr.replace("à®·à¯�", "â€žÂ¤");
		unicodeStr = unicodeStr.replace("à®·à¯‚", "â€žÂ¥");
		unicodeStr = unicodeStr.replace("à®·à¯†", "Â¦â€ž");
		unicodeStr = unicodeStr.replace("à®·à¯‡", "Â§â€ž");
		unicodeStr = unicodeStr.replace("à®·à¯ˆ", "Â¨â€ž");
		unicodeStr = unicodeStr.replace("à®·à¯�", "â€°");
		unicodeStr = unicodeStr.replace("à®·", "â€ž");
		unicodeStr = unicodeStr.replace("à®¸à¯Œ", "Â¦â€¦Âª");
		unicodeStr = unicodeStr.replace("à®¸à¯‹", "Â§â€¦Â¡");
		unicodeStr = unicodeStr.replace("à®¸à¯Š", "Â¦â€¦Â¡");
		unicodeStr = unicodeStr.replace("à®¸à®¾", "â€¦Â¡");
		unicodeStr = unicodeStr.replace("à®¸à®¿", "â€¦Â¢");
		unicodeStr = unicodeStr.replace("à®¸à¯€", "â€¦Â£");
		unicodeStr = unicodeStr.replace("à®¸à¯�", "â€¦Â¤");
		unicodeStr = unicodeStr.replace("à®¸à¯‚", "â€¦Â¥");
		unicodeStr = unicodeStr.replace("à®¸à¯†", "Â¦â€¦");
		unicodeStr = unicodeStr.replace("à®¸à¯‡", "Â§â€¦");
		unicodeStr = unicodeStr.replace("à®¸à¯ˆ", "Â¨â€¦");
		unicodeStr = unicodeStr.replace("à®¸à¯�", "Å ");
		unicodeStr = unicodeStr.replace("à®¸", "â€¦");
		unicodeStr = unicodeStr.replace("à®…", "Â«");
		unicodeStr = unicodeStr.replace("à®†", "Â¬");
		unicodeStr = unicodeStr.replace("à®‡", "Ã¾");
		unicodeStr = unicodeStr.replace("à®ˆ", "Â®");
		unicodeStr = unicodeStr.replace("à®‰", "Â¯");
		unicodeStr = unicodeStr.replace("à®Š", "Â°");
		unicodeStr = unicodeStr.replace("à®Ž", "Â±");
		unicodeStr = unicodeStr.replace("à®�", "Â²");
		unicodeStr = unicodeStr.replace("à®�", "Â³");
		unicodeStr = unicodeStr.replace("à®’", "Â´");
		unicodeStr = unicodeStr.replace("à®“", "Âµ");
		unicodeStr = unicodeStr.replace("à®”", "Â¶");
		unicodeStr = unicodeStr.replace("à®ƒ", "Â·");
		unicodeStr = unicodeStr.replace("à®¸à¯�à®°à¯€", "Â‚");
		unicodeStr = unicodeStr.replace("â€˜", "â€˜");
		unicodeStr = unicodeStr.replace("à¯§", "Â�");
		unicodeStr = unicodeStr.replace("à¯¨", "Â�");
		unicodeStr = unicodeStr.replace("à¯©", "ÂŽ");
		unicodeStr = unicodeStr.replace("à¯ª", "Â�");
		unicodeStr = unicodeStr.replace("à¯«", "Â�");
		unicodeStr = unicodeStr.replace("à¯°", "Â�");
		unicodeStr = unicodeStr.replace("à¯±", "Âž");
		unicodeStr = unicodeStr.replace("à¯²", "Å¸");
		unicodeStr = unicodeStr.replace("à¯­", "â€“");
		unicodeStr = unicodeStr.replace("à¯®", "â€”");
		unicodeStr = unicodeStr.replace("à¯¯", "Ëœ");
		unicodeStr = unicodeStr.replace("à¯²", "Å¸");
		unicodeStr = unicodeStr.replace("à¯­", "â€“");

		return unicodeStr;
	}
	
	private String convertToAnjal(String unicodeStr){
		String TamilText[] = { "Ã»", "Ã»â€˜", "Ã»â€™", "Ã»â€œ", "Ã»â€�", "Ã»â€¢", "â€”Ã»", "Ã¾Ã»", "â€”Ã»â€˜", "Ã·Ã±Ãµ",
				"â€”Ã»Ã£", "Â€Ã»", "Ã¼", "â€”Ã³Ã³", "Ã¾Ã³â€˜", "â€”Ã³â€˜", "Ã³â€˜", "Ã³Â’", "Ã³â€™", "Ã³Â“",
				"Ã³â€�", "Ã³â€¢", "â€”Ã³", "Ã¾Ã³", "â‚¬Ã³", "Ã´", "Ã³", "â€”Â�Ã£", "Ã¾Â�â€˜", "â€”Â�â€˜",
				"Â�â€˜", "Å½", "Â�", "Â�", "Ëœ", "â€”Â�", "Ã¾Â�", "â‚¬Â�", "â„¢",
				"Â�", "â€”Å¡Ã£", "Ã¾Å¡â€˜", "â€”Å¡â€˜", "Å¡â€˜", "Å¡Â’", "Å¡Â“", "â€”Å¡", "Ã¾Å¡", "â‚¬Å¡",
				"â€º", "Å¡", "â€”Å“Ã£", "Ã¾Å“â€˜", "â€”Å“â€˜", "Å“â€˜", "Â�", "Âž", "Å¸", "Â¡",
				"â€”Å“", "Ã¾Å“", "â‚¬Å“", "Â¢", "Å“", "Å“", "â€”Â£Ã£", "Ã¾Â£â€˜", "â€”Â£â€˜", "Â£â€˜",
				"Â£Â’", "Â£Â“", "â€”Â£", "Ã¾Â£", "â‚¬Â£", "Â¤", "Â£", "â€”Â¥Ã£", "Ã¾Â¥â€˜", "â€”Â¥â€˜",
				"Â¥â€˜", "Â¦", "Â§", "Â¨", "Â©", "â€”Â¥", "Ã¾Â¥", "â‚¬Â¥", "Âª", "Â¥",
				"â€”Â«Ã£", "Ã¾Â«â€˜", "â€”Â«â€˜", "Â«â€˜", "Â¬", "âˆ’", "Â®â€“", "Â®", "â€”Â«", "Ã¾Â«",
				"â‚¬Â«", "Â¯", "Â«", "â€”Â°Ã£", "Ã¾Â°â€˜", "â€”Â°â€˜", "Â°â€˜", "Â±", "Â²", "Â³â€“",
				"Â³", "â€”Â°", "Ã¾Â°", "â‚¬Â°", "Â´", "Â°", "â€”ÂµÃ£", "Ã¾Âµâ€˜", "â€”Âµâ€˜", "Âµâ€˜",
				"Â¶", "Ã¿", "Â¸â€“", "Â¸", "â€”Âµ", "Ã¾Âµ", "â‚¬Âµ", "Â¹", "Âµ", "â€”Ã®Ã£",
				"Ã¾Ã®â€˜", "â€”Ã®â€˜", "Ã®â€˜", "Ã¯", "Ã°", "Ã±â€“", "Ã±", "â€”Ã®", "Ã¾Ã®", "â‚¬Ã®",
				"Ã²", "Ã®", "â€”ÂºÃ£", "Ã¾Âºâ€˜", "â€”Âºâ€˜", "Âºâ€˜", "Â»", "Â¼", "Â½", "Â¾",
				"â€”Âº", "Ã¾Âº", "â‚¬Âº", "Â¿", "Âº", "â€”Ã€Ã£", "Ã¾Ã€â€˜", "â€”Ã€â€˜", "Ã€â€˜", "Ã�",
				"Ã‚", "Ãƒ", "Ã„", "â€”Ã€", "Ã¾Ã€", "â‚¬Ã€", "Ã…", "Ã€", "â€”Ã†Ã£", "Ã¾Ã†â€˜",
				"â€”Ã†â€˜", "Ã†â€˜", "Ã‡", "Ãˆ", "Ã‰", "ÃŠ", "â€”Ã†", "Ã¾Ã†", "â‚¬Ã†", "Ã‹",
				"Ã†", "â€”ÃŒÃ£", "Ã¾ÃŒâ€˜", "â€”ÃŒâ€˜", "ÃŒâ€˜", "Ã�", "ÃŽ", "Ã�", "Ã�", "â€”ÃŒ",
				"Ã¾ÃŒ", "â‚¬ÃŒ", "Ã‘", "ÃŒ", "â€”Ã’Ã£", "Ã¾Ã’â€˜", "â€”Ã’â€˜", "Ã’â€˜", "Ã“", "Ã”",
				"Ã•â€“", "Ã•", "â€”Ã’", "Ã¾Ã’", "â‚¬Ã’", "Ã–", "Ã’", "â€”Ã£Ã£", "Ã¾Ã£â€˜", "â€”Ã£â€˜",
				"Ã£â€˜", "Ã¤", "Ã¥", "Ã¦", "Ã§", "â€”Ã£", "Ã¾Ã£", "â‚¬Ã£", "Ã¨", "Ã£",
				"â‚¬Ã—", "â€”Ã—Ã—", "Ã¾Ã—â€˜", "â€”Ã—â€˜", "Ã—â€˜", "Ã˜", "Ã™", "Ãš", "Ã›", "â€”Ã—",
				"Ã¾Ã—", "Ãœ", "Ã—", "â€”Ã©Ã©", "Ã¾Ã©â€˜", "â€”Ã©â€˜", "Ã©â€˜", "Ãª", "Ã«", "Ã¬â€“",
				"Ã¬", "â€”Ã©", "Ã¾Ã©", "â‚¬Ã©", "Ã­", "Ã©", "â€”Ã¹Ã¹", "Ã¾Ã¹â€˜", "â€”Ã¹â€˜", "Ã¹â€˜",
				"Ã¹Â’", "Ã¹Â“", "Ã¹â€�", "Ã¹â€¢", "â€”Ã¹", "Ã¾Ã¹", "â‚¬Ã¹", "Ãº", "Ã¹", "â€”Ã�Ã�",
				"Ã¾Ã�â€˜", "â€”Ã�â€˜", "Ã�â€˜", "Ãž", "ÃŸ", "Ã ", "Ã¡", "â€”Ã�", "Ã¾Ã�", "â‚¬Ã�",
				"Ã¢", "Ã�", "Ã¶Ã¥Ã¥", "Ã·Ã¥Ãµ", "Ã¶Ã¥Ãµ", "Ã¥Ãµ", "Ã¦", "Ã§", "Ã¥Ãº", "Ã¥Ã¼",
				"Ã¶Ã¥", "Ã·Ã¥", "Ã¸Ã¥", "Ã¨", "Ã¥", "â€”ÃµÃµ", "Ã¾Ãµâ€˜", "â€”Ãµâ€˜", "Ãµâ€˜", "ÃµÂ’",
				"ÃµÂ“", "â€”Ãµ", "Ã¾Ãµ", "â‚¬Ãµ", "Ã¶", "Ãµ", "â€”Ã·Ã·", "Ã¾Ã·â€˜", "â€”Ã·â€˜", "Ã·â€˜",
				"Ã·Â’", "Ã·Â“", "â€”Ã·", "Ã¾Ã·", "â‚¬Ã·", "Ã¸", "Ã·", "Â�", "â€š", "â€ž",
				"â€¦", "â€ ", "â€¡", "Ë†", "â€°", "Å ", "â€¹", "Å Ã£", "Å’", "Æ’",
				"Ã½"};

		String TamilReplace[] = {"à®•à¯�à®·", "à®•à¯�à®·à®¾", "à®•à¯�à®·à®¿", "à®•à¯�à®·à¯€", "à®•à¯�à®·à¯�", "à®•à¯�à®·à¯‚", "à®•à¯�à®·à¯†", "à®•à¯�à®·à¯‡", "à®•à¯�à®·à¯Š", "à®•à¯�à®·à¯‹",
				"à®•à¯�à®·à¯Œ", "à®•à¯�à®·à¯ˆ", "à®•à¯�à®·à¯�", "à®œà¯Œ", "à®œà¯‹", "à®œà¯Š", "à®œà®¾", "à®œà®¿", "à®œà®¿", "à®œà¯€",
				"à®œà¯�", "à®œà¯‚", "à®œà¯†", "à®œà¯‡", "à®œà¯ˆ", "à®œà¯�", "à®œ", "à®•à¯Œ", "à®•à¯‹", "à®•à¯Š",
				"à®•à®¾", "à®•à®¿", "à®•à¯€", "à®•à¯�", "à®•à¯‚", "à®•à¯†", "à®•à¯‡", "à®•à¯ˆ", "à®•à¯�",
				"à®•", "à®™à¯Œ", "à®™à¯‹", "à®™à¯Š", "à®™à®¾", "à®™à®¿", "à®™à¯€", "à®™à¯†", "à®™à¯‡", "à®™à¯ˆ",
				"à®™à¯�", "à®™", "à®šà¯Œ", "à®šà¯‹", "à®šà¯Š", "à®šà®¾", "à®šà®¿", "à®šà¯€", "à®šà¯�", "à®šà¯‚",
				"à®šà¯†", "à®šà¯‡", "à®šà¯ˆ", "à®šà¯�", "à®š", "à®š", "à®žà¯Œ", "à®žà¯‹", "à®žà¯Š", "à®žà®¾",
				"à®žà®¿", "à®žà¯€", "à®žà¯†", "à®žà¯‡", "à®žà¯ˆ", "à®žà¯�", "à®ž", "à®Ÿà¯Œ", "à®Ÿà¯‹", "à®Ÿà¯Š",
				"à®Ÿà®¾", "à®Ÿà®¿", "à®Ÿà¯€", "à®Ÿà¯�", "à®Ÿà¯‚", "à®Ÿà¯†", "à®Ÿà¯‡", "à®Ÿà¯ˆ", "à®Ÿà¯�", "à®Ÿ",
				"à®£à¯Œ", "à®£à¯‹", "à®£à¯Š", "à®£à®¾", "à®£à®¿", "à®£à¯€", "à®£à¯‚", "à®£à¯�", "à®£à¯†", "à®£à¯‡",
				"à®£à¯ˆ", "à®£à¯�", "à®£", "à®¤à¯Œ", "à®¤à¯‹", "à®¤à¯Š", "à®¤à®¾", "à®¤à®¿", "à®¤à¯€", "à®¤à¯‚",
				"à®¤à¯�", "à®¤à¯†", "à®¤à¯‡", "à®¤à¯ˆ", "à®¤à¯�", "à®¤", "à®¨à¯Œ", "à®¨à¯‹", "à®¨à¯Š", "à®¨à®¾",
				"à®¨à®¿", "à®¨à¯€", "à®¨à¯‚", "à®¨à¯�", "à®¨à¯†", "à®¨à¯‡", "à®¨à¯ˆ", "à®¨à¯�", "à®¨", "à®©à¯Œ",
				"à®©à¯‹", "à®©à¯Š", "à®©à®¾", "à®©à®¿", "à®©à¯€", "à®©à¯‚", "à®©à¯�", "à®©à¯†", "à®©à¯‡", "à®©à¯ˆ",
				"à®©à¯�", "à®©", "à®ªà¯Œ", "à®ªà¯‹", "à®ªà¯Š", "à®ªà®¾", "à®ªà®¿", "à®ªà¯€", "à®ªà¯�", "à®ªà¯‚",
				"à®ªà¯†", "à®ªà¯‡", "à®ªà¯ˆ", "à®ªà¯�", "à®ª", "à®®à¯Œ", "à®®à¯‹", "à®®à¯Š", "à®®à®¾", "à®®à®¿",
				"à®®à¯€", "à®®à¯�", "à®®à¯‚", "à®®à¯†", "à®®à¯‡", "à®®à¯ˆ", "à®®à¯�", "à®®", "à®¯à¯Œ", "à®¯à¯‹",
				"à®¯à¯Š", "à®¯à®¾", "à®¯à®¿", "à®¯à¯€", "à®¯à¯�", "à®¯à¯‚", "à®¯à¯†", "à®¯à¯‡", "à®¯à¯ˆ", "à®¯à¯�",
				"à®¯", "à®°à¯Œ", "à®°à¯‹", "à®°à¯Š", "à®°à®¾", "à®°à®¿", "à®°à¯€", "à®°à¯�", "à®°à¯‚", "à®°à¯†",
				"à®°à¯‡", "à®°à¯ˆ", "à®°à¯�", "à®°", "à®²à¯Œ", "à®²à¯‹", "à®²à¯Š", "à®²à®¾", "à®²à®¿", "à®²à¯€",
				"à®²à¯‚", "à®²à¯�", "à®²à¯†", "à®²à¯‡", "à®²à¯ˆ", "à®²à¯�", "à®²", "à®³à¯Œ", "à®³à¯‹", "à®³à¯Š",
				"à®³à®¾", "à®³à®¿", "à®³à¯€", "à®³à¯�", "à®³à¯‚", "à®³à¯†", "à®³à¯‡", "à®³à¯ˆ", "à®³à¯�", "à®³",
				"à®µà¯ˆ", "à®µà¯Œ", "à®µà¯‹", "à®µà¯Š", "à®µà®¾", "à®µà®¿", "à®µà¯€", "à®µà¯�", "à®µà¯‚", "à®µà¯†",
				"à®µà¯‡", "à®µà¯�", "à®µ", "à®±à¯Œ", "à®±à¯‹", "à®±à¯Š", "à®±à®¾", "à®±à®¿", "à®±à¯€", "à®±à¯‚",
				"à®±à¯�", "à®±à¯†", "à®±à¯‡", "à®±à¯ˆ", "à®±à¯�", "à®±", "à®¹à¯Œ", "à®¹à¯‹", "à®¹à¯Š", "à®¹à®¾",
				"à®¹à®¿", "à®¹à¯€", "à®¹à¯�", "à®¹à¯‚", "à®¹à¯†", "à®¹à¯‡", "à®¹à¯ˆ", "à®¹à¯�", "à®¹", "à®´à¯Œ",
				"à®´à¯‹", "à®´à¯Š", "à®´à®¾", "à®´à®¿", "à®´à¯€", "à®´à¯�", "à®´à¯‚", "à®´à¯†", "à®´à¯‡", "à®´à¯ˆ",
				"à®´à¯�", "à®´", "à®·à¯Œ", "à®·à¯‹", "à®·à¯Š", "à®·à®¾", "à®·à®¿", "à®·à¯€", "à®·à¯�", "à®·à¯‚",
				"à®·à¯†", "à®·à¯‡", "à®·à¯ˆ", "à®·à¯�", "à®·", "à®·à¯Œ", "à®·à¯‹", "à®·à¯Š", "à®·à®¾", "à®·à®¿",
				"à®·à¯€", "à®·à¯†", "à®·à¯‡", "à®·à¯ˆ", "à®·à¯�", "à®·", "à®¸à¯Œ", "à®¸à¯‹", "à®¸à¯Š", "à®¸à®¾",
				"à®¸à®¿", "à®¸à¯€", "à®¸à¯†", "à®¸à¯‡", "à®¸à¯ˆ", "à®¸à¯�", "à®¸", "à®…", "à®†", "à®ˆ",
				"à®‰", "à®Š", "à®Ž", "à®�", "à®�", "à®’", "à®“", "à®”", "à®ƒ", "à®‡",
				"à®¸à¯�à®°à¯€"};

		int count = 0;

		while (count < TamilText.length) {
			unicodeStr = unicodeStr.replaceAll(TamilReplace[count],TamilText[count]);
			count++;
		}
		return unicodeStr; 
	}
	
	
	private String convertToTab(String unicodeStr){
		String TamilText[] = {"Ã¾", "Ã¾Â£", "Ã¾Â¤", "Ã¾Â¦", "Ã¾Â§", "Ã¾Â¨", "ÂªÃ¾", "Â«Ã¾", "ÂªÃ¾Â£", "Â«Ã¾Â£",
				"ÂªÃ¾Ã·", "Â¬Ã¾", "Ã¾Â¢", "ÂªÃ¨Ã·", "Â«Ã¨Â£", "ÂªÃ¨Â£", "Ã¨Â£", "Ã¨Â¤", "Ã¨Â¦", "Â°",
				"Ãƒ", "ÂªÃ¨", "Â«Ã¨", "Â¬Ã¨", "Ã¨Â¢", "Ã¨", "ÂªÃ©Ã·", "Â«Ã©Â£", "ÂªÃ©Â£", "Ã©Â£",
				"Ã©Â¤", "Ã©Â¦", "Â±", "Ã„", "ÂªÃ©", "Â«Ã©", "Â¬Ã©", "Ã©Â¢", "Ã©", "ÂªÃªÃ·",
				"Â«ÃªÂ£", "ÂªÃªÂ£", "ÃªÂ£", "ÃªÂ¤", "ÃªÂ¦", "Â²", "Ã…", "ÂªÃª", "Â«Ãª", "Â¬Ãª",
				"ÃªÂ¢", "Ãª", "ÂªÃ¼Ã·", "Â«Ã¼Â£", "ÂªÃ¼Â£", "Ã¼Â£", "Ã¼Â¤", "Ã¼Â¦", "Ã¼Â§", "Ã¼Â¨",
				"ÂªÃ¼", "Â«Ã¼", "Â¬Ã¼", "Ã¼Â¢", "Ã¼", "ÂªÃ«Ã·", "Â«Ã«Â£", "ÂªÃ«Â£", "Ã«Â£", "Ã«Â¤",
				"Ã«Â¦", "Â³", "Ã†", "ÂªÃ«", "Â«Ã«", "Â¬Ã«", "Ã«Â¢", "Ã«", "ÂªÃ¬Ã·", "Â«Ã¬Â£",
				"ÂªÃ¬Â£", "Ã¬Â£", "Ã¬Â¤", "Â®", "Â¯", "Ã¬Â¦", "Â´", "Ã‡", "ÂªÃ¬", "Â«Ã¬",
				"Â¬Ã¬", "Ã¬Â¢", "Ã¬", "ÂªÃ­Ã·", "Â«Ã­Â£", "ÂªÃ­Â£", "Ã­Â£", "Ã­Â¤", "Ã­Â¦", "Âµ",
				"Ãˆ", "ÂªÃ­", "Â«Ã­", "Â¬Ã­", "Ã­Â¢", "Ã­", "ÂªÃ®Ã·", "Â«Ã®Â£", "ÂªÃ®Â£", "Ã®Â£",
				"Ã®Â¤", "Ã®Â¦", "Â¶", "Ã‰", "ÂªÃ®", "Â«Ã®", "Â¬Ã®", "Ã®Â¢", "Ã®", "ÂªÃ¯Ã·",
				"Â«Ã¯Â£", "ÂªÃ¯Â£", "Ã¯Â£", "Ã¯Â¤", "Ã¯Â¦", "Â¸", "Ã‹", "ÂªÃ¯", "Â«Ã¯", "Â¬Ã¯",
				"Ã¯Â¢", "Ã¯", "ÂªÃ¹Ã·", "Â«Ã¹Â£", "ÂªÃ¹Â£", "Ã¹Â£", "Ã¹Â¤", "Ã¹Â¦", "Ã‚", "Ã›",
				"ÂªÃ¹", "Â«Ã¹", "Â¬Ã¹", "Ã¹Â¢", "Ã¹", "ÂªÃ°Ã·", "Â«Ã°Â£", "ÂªÃ°Â£", "Ã°Â£", "Ã°Â¤",
				"Ã°Â¦", "Â¹", "ÃŒ", "ÂªÃ°", "Â«Ã°", "Â¬Ã°", "Ã°Â¢", "Ã°", "ÂªÃ±Ã·", "Â«Ã±Â£",
				"ÂªÃ±Â£", "Ã±Â£", "Ã±Â¤", "Ã±Â¦", "Âº", "Ã�", "ÂªÃ±", "Â«Ã±", "Â¬Ã±", "Ã±Â¢",
				"Ã±", "ÂªÃ²Ã·", "Â«Ã²Â£", "ÂªÃ²Â£", "Ã²Â£", "Ã²Â¤", "Ã²Â¦", "Â»", "ÃŽ", "ÂªÃ²",
				"Â«Ã²", "Â¬Ã²", "Ã²Â¢", "Ã²", "ÂªÃ³Ã·", "Â«Ã³Â£", "ÂªÃ³Â£", "Ã³Â£", "Ã³Â¤", "Ã³Â¦",
				"Â¼", "Ã�", "ÂªÃ³", "Â«Ã³", "Â¬Ã³", "Ã³Â¢", "Ã³", "ÂªÃ´Ã·", "Â«Ã´Â£", "ÂªÃ´Â£",
				"Ã´Â£", "Ã´Â¤", "Ã´Â¦", "Â½", "Ã–", "ÂªÃ´", "Â«Ã´", "Â¬Ã´", "Ã´Â¢", "Ã´",
				"ÂªÃ·Ã·", "Â«Ã·Â£", "ÂªÃ·Â£", "Ã·Â£", "Ã·Â¤", "Ã·Â¦", "Ã€", "Ã™", "ÂªÃ·", "Â«Ã·",
				"Â¬Ã·", "Ã·Â¢", "Ã·", "ÂªÃµÃ·", "Â«ÃµÂ£", "ÂªÃµÂ£", "ÃµÂ£", "ÃµÂ¤", "ÃµÂ¦", "Â¾",
				"Ã—", "ÂªÃµ", "Â«Ãµ", "Â¬Ãµ", "ÃµÂ¢", "Ãµ", "ÂªÃ¶Ã·", "Â«Ã¶Â£", "ÂªÃ¶Â£", "Ã¶Â£",
				"Ã¶Â¤", "Ã¶Â¦", "Â¿", "Ã˜", "ÂªÃ¶", "Â«Ã¶", "Â¬Ã¶", "Ã¶Â¢", "Ã¶", "ÂªÃ¸Ã·",
				"Â«Ã¸Â£", "ÂªÃ¸Â£", "Ã¸Â£", "Ã¸Â¤", "Ã¸Â¦", "Ã�", "Ãš", "ÂªÃ¸", "Â«Ã¸", "Â¬Ã¸",
				"Ã¸Â¢", "Ã¸", "ÂªÃ½Ã·", "Â«Ã½Â£", "ÂªÃ½Â£", "Ã½Â£", "Ã½Â¤", "Ã½Â¦", "ÂªÃ½", "Â«Ã½",
				"Â¬Ã½", "Ã½Â¢", "Ã½", "ÂªÃ»Ã·", "Â«Ã»Â£", "ÂªÃ»Â£", "Ã»Â£", "Ã»Â¤", "Ã»Â¦", "ÂªÃ»",
				"Â«Ã»", "Â¬Ã»", "Ã»Â¢", "Ã»", "ÂªÃºÃ·", "Â«ÃºÂ£", "ÂªÃºÂ£", "ÃºÂ£", "ÃºÂ¤", "ÃºÂ¦",
				"ÂªÃº", "Â«Ãº", "Â¬Ãº", "ÃºÂ¢", "Ãº", "Ãœ", "Ã�", "Ãž", "ÃŸ", "Ã ",
				"Ã¡", "Ã¢", "Ã£", "Ã¤", "Ã¥", "Ã¦", "Ã¥Ã·", "Ã§", "â€š", "Æ’",
				"â€ž", "â€¦", "â€ ", "â€”", "Ëœ", "â€“", "Â˜", "Ë†", "â€°", "Ãƒ",
				"Ã¿"};

		String TamilReplace[] = {"à®•à¯�à®·", "à®•à¯�à®·à®¾", "à®•à¯�à®·à®¿", "à®•à¯�à®·à¯€", "à®•à¯�à®·à¯�", "à®•à¯�à®·à¯‚", "à®•à¯�à®·à¯†", "à®•à¯�à®·à¯‡", "à®•à¯�à®·à¯Š", "à®•à¯�à®·à¯‹",
				"à®•à¯�à®·à¯Œ", "à®•à¯�à®·à¯ˆ", "à®•à¯�à®·à¯�", "à®•à¯Œ", "à®•à¯‹", "à®•à¯Š", "à®•à®¾", "à®•à®¿", "à®•à¯€", "à®•à¯�",
				"à®•à¯‚", "à®•à¯†", "à®•à¯‡", "à®•à¯ˆ", "à®•à¯�", "à®•", "à®™à¯Œ", "à®™à¯‹", "à®™à¯Š", "à®™à®¾",
				"à®™à®¿", "à®™à¯€", "à®™à¯�", "à®™à¯‚", "à®™à¯†", "à®™à¯‡", "à®™à¯ˆ", "à®™à¯�", "à®™", "à®šà¯Œ",
				"à®šà¯‹", "à®šà¯Š", "à®šà®¾", "à®šà®¿", "à®šà¯€", "à®šà¯�", "à®šà¯‚", "à®šà¯†", "à®šà¯‡", "à®šà¯ˆ",
				"à®šà¯�", "à®š", "à®œà¯Œ", "à®œà¯‹", "à®œà¯Š", "à®œà®¾", "à®œà®¿", "à®œà¯€", "à®œà¯�", "à®œà¯‚",
				"à®œà¯†", "à®œà¯‡", "à®œà¯ˆ", "à®œà¯�", "à®œ", "à®žà¯Œ", "à®žà¯‹", "à®žà¯Š", "à®žà®¾", "à®žà®¿",
				"à®žà¯€", "à®žà¯�", "à®žà¯‚", "à®žà¯†", "à®žà¯‡", "à®žà¯ˆ", "à®žà¯�", "à®ž", "à®Ÿà¯Œ", "à®Ÿà¯‹",
				"à®Ÿà¯Š", "à®Ÿà®¾", "à®Ÿà®¿", "à®Ÿà®¿", "à®Ÿà¯€", "à®Ÿà¯€", "à®Ÿà¯�", "à®Ÿà¯‚", "à®Ÿà¯†", "à®Ÿà¯‡",
				"à®Ÿà¯ˆ", "à®Ÿà¯�", "à®Ÿ", "à®£à¯Œ", "à®£à¯‹", "à®£à¯Š", "à®£à®¾", "à®£à®¿", "à®£à¯€", "à®£à¯�",
				"à®£à¯‚", "à®£à¯†", "à®£à¯‡", "à®£à¯ˆ", "à®£à¯�", "à®£", "à®¤à¯Œ", "à®¤à¯‹", "à®¤à¯Š", "à®¤à®¾",
				"à®¤à®¿", "à®¤à¯€", "à®¤à¯�", "à®¤à¯‚", "à®¤à¯†", "à®¤à¯‡", "à®¤à¯ˆ", "à®¤à¯�", "à®¤", "à®¨à¯Œ",
				"à®¨à¯‹", "à®¨à¯Š", "à®¨à®¾", "à®¨à®¿", "à®¨à¯€", "à®¨à¯�", "à®¨à¯‚", "à®¨à¯†", "à®¨à¯‡", "à®¨à¯ˆ",
				"à®¨à¯�", "à®¨", "à®©à¯Œ", "à®©à¯‹", "à®©à¯Š", "à®©à®¾", "à®©à®¿", "à®©à¯€", "à®©à¯�", "à®©à¯‚",
				"à®©à¯†", "à®©à¯‡", "à®©à¯ˆ", "à®©à¯�", "à®©", "à®ªà¯Œ", "à®ªà¯‹", "à®ªà¯Š", "à®ªà®¾", "à®ªà®¿",
				"à®ªà¯€", "à®ªà¯�", "à®ªà¯‚", "à®ªà¯†", "à®ªà¯‡", "à®ªà¯ˆ", "à®ªà¯�", "à®ª", "à®®à¯Œ", "à®®à¯‹",
				"à®®à¯Š", "à®®à®¾", "à®®à®¿", "à®®à¯€", "à®®à¯�", "à®®à¯‚", "à®®à¯†", "à®®à¯‡", "à®®à¯ˆ", "à®®à¯�",
				"à®®", "à®¯à¯Œ", "à®¯à¯‹", "à®¯à¯Š", "à®¯à®¾", "à®¯à®¿", "à®¯à¯€", "à®¯à¯�", "à®¯à¯‚", "à®¯à¯†",
				"à®¯à¯‡", "à®¯à¯ˆ", "à®¯à¯�", "à®¯", "à®°à¯Œ", "à®°à¯‹", "à®°à¯Š", "à®°à®¾", "à®°à®¿", "à®°à¯€",
				"à®°à¯�", "à®°à¯‚", "à®°à¯†", "à®°à¯‡", "à®°à¯ˆ", "à®°à¯�", "à®°", "à®²à¯Œ", "à®²à¯‹", "à®²à¯Š",
				"à®²à®¾", "à®²à®¿", "à®²à¯€", "à®²à¯�", "à®²à¯‚", "à®²à¯†", "à®²à¯‡", "à®²à¯ˆ", "à®²à¯�", "à®²",
				"à®³à¯Œ", "à®³à¯‹", "à®³à¯Š", "à®³à®¾", "à®³à®¿", "à®³à¯€", "à®³à¯�", "à®³à¯‚", "à®³à¯†", "à®³à¯‡",
				"à®³à¯ˆ", "à®³à¯�", "à®³", "à®µà¯Œ", "à®µà¯‹", "à®µà¯Š", "à®µà®¾", "à®µà®¿", "à®µà¯€", "à®µà¯�",
				"à®µà¯‚", "à®µà¯†", "à®µà¯‡", "à®µà¯ˆ", "à®µà¯�", "à®µ", "à®´à¯Œ", "à®´à¯‹", "à®´à¯Š", "à®´à®¾",
				"à®´à®¿", "à®´à¯€", "à®´à¯�", "à®´à¯‚", "à®´à¯†", "à®´à¯‡", "à®´à¯ˆ", "à®´à¯�", "à®´", "à®±à¯Œ",
				"à®±à¯‹", "à®±à¯Š", "à®±à®¾", "à®±à®¿", "à®±à¯€", "à®±à¯�", "à®±à¯‚", "à®±à¯†", "à®±à¯‡", "à®±à¯ˆ",
				"à®±à¯�", "à®±", "à®¹à¯Œ", "à®¹à¯‹", "à®¹à¯Š", "à®¹à®¾", "à®¹à®¿", "à®¹à¯€", "à®¹à¯†", "à®¹à¯‡",
				"à®¹à¯ˆ", "à®¹à¯�", "à®¹", "à®·à¯Œ", "à®·à¯‹", "à®·à¯Š", "à®·à®¾", "à®·à®¿", "à®·à¯€", "à®·à¯†",
				"à®·à¯‡", "à®·à¯ˆ", "à®·à¯�", "à®·", "à®¸à¯Œ", "à®¸à¯‹", "à®¸à¯Š", "à®¸à®¾", "à®¸à®¿", "à®¸à¯€",
				"à®¸à¯†", "à®¸à¯‡", "à®¸à¯ˆ", "à®¸à¯�", "à®¸", "à®…", "à®†", "à®‡", "à®ˆ", "à®‰",
				"à®Š", "à®Ž", "à®�", "à®�", "à®’", "à®“", "à®”", "à®ƒ", "à¯§", "à¯¨",
				"à¯©", "à¯ª", "à¯«", "à¯°", "à¯±", "à¯²", "à¯¯", "à¯­", "à¯®", "à¯¬",
				"à®¸à¯�à®°à¯€"};

		int count = 0;
		while (count < TamilText.length) {
			unicodeStr = unicodeStr.replaceAll(TamilReplace[count],TamilText[count]);
			count++;
		}

		return unicodeStr;
	}
	
	private String convertToTam(String unicodeStr){
		String TamilText[] = {"Ã¾", "Ã¾Â£", "Â¬Ã¾", "V", "r", "Ã¾Â§", "Ã¾Â¨", "ÂªÃ¾", "Â«Ã¾", "ÂªÃ¾Â£",
				"Â«Ã¾Â£", "ÂªÃ¾Ã·", "z", "ÂªÃ¼Ã·", "Â«Ã¼Â£", "ÂªÃ¼Â£", "Ã¼Â£", "T", "p", "Ã¼Â§",
				"Ã¼Â¨", "ÂªÃ¼", "Â«Ã¼", "Â¬Ã¼", "ÂªÃ¼Â£", "x", "Ã¼", "ÂªÃ¨Ã·", "Â«Ã¨Â£", "ÂªÃ¨Â£",
				"Ã¨Â£", "A", "W", "Â°", "Ãƒ", "ÂªÃ¨", "Â«Ã¨", "Â¬Ã¨", "â€š", "Ã¨",
				"ÂªÃ©Ã·", "Â«Ã©Â£", "ÂªÃ©Â£", "Ã©Â£", "B", "X", "Â±", "Ã„", "ÂªÃ©", "Â«Ã©",
				"Â¬Ã©", "Æ’", "Ã©", "ÂªÃªÃ·", "Â«ÃªÂ£", "ÂªÃªÂ£", "ÃªÂ£", "C", "Y", "Â²",
				"Ã…", "ÂªÃª", "Â«Ãª", "Â¬Ãª", "â€ž", "Ãª", "ÂªÃ«Ã·", "Â«Ã«Â£", "ÂªÃ«Â£", "Ã«Â£",
				"D", "Z", "Â³", "Ã†", "ÂªÃ«", "Â«Ã«", "Â¬Ã«", "â€¦", "Ã«", "ÂªÃ¬Ã·",
				"Â«Ã¬Â£", "ÂªÃ¬Â£", "Ã¬Â£", "Â®", "Â¯", "Â´", "Ã‡", "ÂªÃ¬", "Â«Ã¬", "Â¬Ã¬",
				"â€ ", "Ã¬", "ÂªÃ­Ã·", "Â«Ã­Â£", "ÂªÃ­Â£", "Ã­Â£", "E", "a", "Âµ", "Ãˆ",
				"ÂªÃ­", "Â«Ã­", "Â¬Ã­", "â€¡", "Ã­", "ÂªÃ®Ã·", "Â«Ã®Â£", "ÂªÃ®Â£", "Ã®Â£", "F",
				"b", "Â¶", "Ã‰", "ÂªÃ®", "Â«Ã®", "Â¬Ã®", "Ë†", "Ã®", "ÂªÃ¯Ã·", "Â«Ã¯Â£",
				"ÂªÃ¯Â£", "Ã¯Â£", "G", "c", "Â¸", "Ã‹", "ÂªÃ¯", "Â«Ã¯", "Â¬Ã¯", "ÂªÃ¯Â£",
				"â€°", "Ã¯", "ÂªÃ¹Ã·", "Â«Ã¹Â£", "ÂªÃ¹Â£", "Ã¹Â£", "Q", "m", "Ã‚", "Ã›",
				"ÂªÃ¹", "Â«Ã¹", "Â¬Ã¹", "ÂªÃ¹Â£", "Â¡", "Ã¹", "ÂªÃ°Ã·", "Â«Ã°Â£", "ÂªÃ°Â£", "Ã°Â£",
				"H", "d", "Â¹", "ÃŒ", "ÂªÃ°", "Â«Ã°", "Â¬Ã°", "ÂªÃ°Â£", "Å ", "Ã°",
				"ÂªÃ±Ã·", "Â«Ã±Â£", "ÂªÃ±Â£", "Ã±Â£", "I", "e", "Âº", "Ã�", "ÂªÃ±", "Â«Ã±",
				"Â¬Ã±", "ÂªÃ±Â£", "â€¹", "Ã±", "ÂªÃ²Ã·", "Â«Ã²Â£", "ÂªÃ²Â£", "Ã²Â£", "J", "f",
				"Â»", "ÃŽ", "ÂªÃ²", "Â«Ã²", "Â¬Ã²", "ÂªÃ²Â£", "Å’", "Ã²", "ÂªÃ³Ã·", "Â«Ã³Â£",
				"ÂªÃ³Â£", "Ã³Â£", "K", "g", "Â¼", "Ã�", "ÂªÃ³", "Â«Ã³", "Â¬Ã³", "Ëœ",
				"Ã³", "ÂªÃ´Ã·", "Â«Ã´Â£", "ÂªÃ´Â£", "Ã´Â£", "L", "h", "Â½", "Ã–", "ÂªÃ´",
				"Â«Ã´", "Â¬Ã´", "â„¢", "Ã´", "ÂªÃ·Ã·", "Â«Ã·Â£", "ÂªÃ·Â£", "Ã·Â£", "O", "k",
				"Ã€", "Ã™", "ÂªÃ·", "Â«Ã·", "Â¬Ã·", "Å“", "Ã·", "ÂªÃµÃ·", "Â«ÃµÂ£", "ÂªÃµÂ£",
				"ÃµÂ£", "M", "i", "Â¾", "Ã—", "ÂªÃµ", "Â«Ãµ", "Â¬Ãµ", "ÂªÃµÂ£", "Å¡",
				"Ãµ", "ÂªÃ¶Ã·", "Â«Ã¶Â£", "ÂªÃ¶Â£", "Ã¶Â£", "N", "j", "Â¿", "Ã˜", "ÂªÃ¶",
				"Â«Ã¶", "Â¬Ã¶", "â€º", "Ã¶", "ÂªÃ¸Ã·", "Â«Ã¸Â£", "ÂªÃ¸Â£", "Ã¸Â£", "P", "l",
				"Ã�", "Ãš", "ÂªÃ¸", "Â«Ã¸", "Â¬Ã¸", "ÂªÃ¸Â£", "Å¸", "Ã¸", "ÂªÃ½Ã·", "Â«Ã½Â£",
				"ÂªÃ½Â£", "Ã½Â£", "U", "q", "ÂªÃ½", "Â«Ã½", "Â¬Ã½", "y", "Ã½", "ÂªÃ»Ã·",
				"Â«Ã»Â£", "ÂªÃ»Â£", "Ã»Â£", "S", "o", "ÂªÃ»", "Â«Ã»", "Â¬Ã»", "ÂªÃ»Â£", "w",
				"Ã»", "ÂªÃºÃ·", "Â«ÃºÂ£", "ÂªÃºÂ£", "ÃºÂ£", "R", "n", "ÂªÃº", "Â«Ãº", "Â¬Ãº",
				"v", "Ãº", "Ãœ", "Ã�", "Ãž", "ÃŸ", "Ã ", "Ã¡", "Ã¢", "Ã£",
				"Ã¤", "Ã¥", "Ã¦", "Ã¥Ã·", "Ã§", "Ã¿", "Æ’"};

		String TamilReplace[] = {"à®•à¯�à®·", "à®•à¯�à®·à®¾", "à®•à¯�à®·à¯ˆ", "à®•à¯�à®·à®¿", "à®•à¯�à®·à¯€", "à®•à¯�à®·à¯�", "à®•à¯�à®·à¯‚", "à®•à¯�à®·à¯†", "à®•à¯�à®·à¯‡", "à®•à¯�à®·à¯Š",
				"à®•à¯�à®·à¯‹", "à®•à¯�à®·à¯Œ", "à®•à¯�à®·à¯�", "à®œà¯Œ", "à®œà¯‹", "à®œà¯Š", "à®œà®¾", "à®œà®¿", "à®œà¯€", "à®œà¯�",
				"à®œà¯‚", "à®œà¯†", "à®œà¯‡", "à®œà¯ˆ", "à®œà¯Š", "à®œà¯�", "à®œ", "à®•à¯Œ", "à®•à¯‹", "à®•à¯Š",
				"à®•à®¾", "à®•à®¿", "à®•à¯€", "à®•à¯�", "à®•à¯‚", "à®•à¯†", "à®•à¯‡", "à®•à¯ˆ", "à®•à¯�", "à®•",
				"à®™à¯Œ", "à®™à¯‹", "à®™à¯Š", "à®™à®¾", "à®™à®¿", "à®™à¯€", "à®™à¯�", "à®™à¯‚", "à®™à¯†", "à®™à¯‡",
				"à®™à¯ˆ", "à®™à¯�", "à®™", "à®šà¯Œ", "à®šà¯‹", "à®šà¯Š", "à®šà®¾", "à®šà®¿", "à®šà¯€", "à®šà¯�",
				"à®šà¯‚", "à®šà¯†", "à®šà¯‡", "à®šà¯ˆ", "à®šà¯�", "à®š", "à®žà¯Œ", "à®žà¯‹", "à®žà¯Š", "à®žà®¾",
				"à®žà®¿", "à®žà¯€", "à®žà¯�", "à®žà¯‚", "à®žà¯†", "à®žà¯‡", "à®žà¯ˆ", "à®žà¯�", "à®ž", "à®Ÿà¯Œ",
				"à®Ÿà¯‹", "à®Ÿà¯Š", "à®Ÿà®¾", "à®Ÿà®¿", "à®Ÿà¯€", "à®Ÿà¯�", "à®Ÿà¯‚", "à®Ÿà¯†", "à®Ÿà¯‡", "à®Ÿà¯ˆ",
				"à®Ÿà¯�", "à®Ÿ", "à®£à¯Œ", "à®£à¯‹", "à®£à¯Š", "à®£à®¾", "à®£à®¿", "à®£à¯€", "à®£à¯�", "à®£à¯‚",
				"à®£à¯†", "à®£à¯‡", "à®£à¯ˆ", "à®£à¯�", "à®£", "à®¤à¯Œ", "à®¤à¯‹", "à®¤à¯Š", "à®¤à®¾", "à®¤à®¿",
				"à®¤à¯€", "à®¤à¯�", "à®¤à¯‚", "à®¤à¯†", "à®¤à¯‡", "à®¤à¯ˆ", "à®¤à¯�", "à®¤", "à®¨à¯Œ", "à®¨à¯‹",
				"à®¨à¯Š", "à®¨à®¾", "à®¨à®¿", "à®¨à¯€", "à®¨à¯�", "à®¨à¯‚", "à®¨à¯†", "à®¨à¯‡", "à®¨à¯ˆ", "à®¨à¯Š",
				"à®¨à¯�", "à®¨", "à®©à¯Œ", "à®©à¯‹", "à®©à¯Š", "à®©à®¾", "à®©à®¿", "à®©à¯€", "à®©à¯�", "à®©à¯‚",
				"à®©à¯†", "à®©à¯‡", "à®©à¯ˆ", "à®©à¯Š", "à®©à¯�", "à®©", "à®ªà¯Œ", "à®ªà¯‹", "à®ªà¯Š", "à®ªà®¾",
				"à®ªà®¿", "à®ªà¯€", "à®ªà¯�", "à®ªà¯‚", "à®ªà¯†", "à®ªà¯‡", "à®ªà¯ˆ", "à®ªà¯Š", "à®ªà¯�", "à®ª",
				"à®®à¯Œ", "à®®à¯‹", "à®®à¯Š", "à®®à®¾", "à®®à®¿", "à®®à¯€", "à®®à¯�", "à®®à¯‚", "à®®à¯†", "à®®à¯‡",
				"à®®à¯ˆ", "à®®à¯Š", "à®®à¯�", "à®®", "à®¯à¯Œ", "à®¯à¯‹", "à®¯", "à®¯à®¾", "à®¯à®¿", "à®¯à¯€",
				"à®¯à¯�", "à®¯à¯‚", "à®¯à¯†", "à®¯à¯‡", "à®¯à¯ˆ", "à®¯à¯Š", "à®¯à¯�", "à®¯", "à®°à¯Œ", "à®°à¯‹",
				"à®°à¯Š", "à®°à®¾", "à®°à®¿", "à®°à¯€", "à®°à¯�", "à®°à¯‚", "à®°à¯†", "à®°à¯‡", "à®°à¯ˆ", "à®°à¯�",
				"à®°", "à®²à¯Œ", "à®²à¯‹", "à®²à¯Š", "à®²à®¾", "à®²à®¿", "à®²à¯€", "à®²à¯�", "à®²à¯‚", "à®²à¯†",
				"à®²à¯‡", "à®²à¯ˆ", "à®²à¯�", "à®²", "à®³à¯Œ", "à®³à¯‹", "à®³", "à®³à®¾", "à®³à®¿", "à®³à¯€",
				"à®³à¯�", "à®³à¯‚", "à®³à¯†", "à®³à¯‡", "à®³à¯ˆ", "à®³à¯�", "à®³", "à®µà¯Œ", "à®µà¯‹", "à®µà¯Š",
				"à®µà®¾", "à®µà®¿", "à®µà¯€", "à®µà¯�", "à®µà¯‚", "à®µà¯†", "à®µà¯‡", "à®µà¯ˆ", "à®µà¯Š", "à®µà¯�",
				"à®µ", "à®´à¯Œ", "à®´à¯‹", "à®´à¯Š", "à®´à®¾", "à®´à®¿", "à®´à¯€", "à®´à¯�", "à®´à¯‚", "à®´à¯†",
				"à®´à¯‡", "à®´à¯ˆ", "à®´à¯�", "à®´", "à®±à¯Œ", "à®±à¯‹", "à®±à¯Š", "à®±à®¾", "à®±à®¿", "à®±à¯€",
				"à®±à¯�", "à®±à¯‚", "à®±à¯†", "à®±à¯‡", "à®±à¯ˆ", "à®±à¯Š", "à®±à¯�", "à®±", "à®¹à¯Œ", "à®¹à¯‹",
				"à®¹à¯Š", "à®¹à®¾", "à®¹à®¿", "à®¹à¯€", "à®¹à¯†", "à®¹à¯‡", "à®¹à¯ˆ", "à®¹à¯�", "à®¹", "à®·à¯Œ",
				"à®·à¯‹", "à®·à¯Š", "à®·à®¾", "à®·à®¿", "à®·à¯€", "à®·à¯†", "à®·à¯‡", "à®·à¯ˆ", "à®·à¯Š", "à®·à¯�",
				"à®·", "à®¸à¯Œ", "à®¸à¯‹", "à®¸à¯Š", "à®¸à®¾", "à®¸à®¿", "à®¸à¯€", "à®¸à¯†", "à®¸à¯‡", "à®¸à¯ˆ",
				"à®¸à¯�", "à®¸", "à®…", "à®†", "à®‡", "à®ˆ", "à®‰", "à®Š", "à®Ž", "à®�",
				"à®�", "à®’", "à®“", "à®”", "à®ƒ", "à®¸à¯�à®°à¯€", "â€˜"};

		int count = 0;
		while (count < TamilText.length) {
			unicodeStr = unicodeStr.replaceAll(TamilReplace[count], TamilText[count]);
			count++;
		}
		return unicodeStr;
		
	}

}
