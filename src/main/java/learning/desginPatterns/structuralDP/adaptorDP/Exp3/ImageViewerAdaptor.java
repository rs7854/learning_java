package learning.desginPatterns.structuralDP.adaptorDP.Exp3;

public class ImageViewerAdaptor implements ImageViewer {

	AdvancedImageViewer advancedImageViewer;
	
	public ImageViewerAdaptor() {
	}
	
	public ImageViewerAdaptor(String format) {
		if(format.equalsIgnoreCase("PNG")) { 
			advancedImageViewer = new PngImageViewer();
		}else {
			advancedImageViewer = new JpgImageViewer();
		}
	}
	
	

	@Override
	public void showImage(String format, String fileName) {
		if(format.equalsIgnoreCase("PNG")) { 
			advancedImageViewer.showPngImage(fileName);
		}else {
			advancedImageViewer.showJpgImage(fileName);
		}
		
	}

}
