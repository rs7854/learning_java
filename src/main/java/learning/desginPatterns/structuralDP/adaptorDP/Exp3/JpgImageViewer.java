package learning.desginPatterns.structuralDP.adaptorDP.Exp3;

public class JpgImageViewer implements AdvancedImageViewer {

	@Override
	public void showPngImage(String filename) {
		
	}

	@Override
	public void showJpgImage(String filename) {
		System.out.println("this is JPGImage: " + filename);
	}

}
