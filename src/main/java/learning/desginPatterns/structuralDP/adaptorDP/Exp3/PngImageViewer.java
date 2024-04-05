package learning.desginPatterns.structuralDP.adaptorDP.Exp3;

public class PngImageViewer implements AdvancedImageViewer {

	@Override
	public void showPngImage(String filename) {
		System.out.println("this is PNGImage: " + filename);
	}

	@Override
	public void showJpgImage(String filename) {
		// TODO Auto-generated method stub

	}

}
