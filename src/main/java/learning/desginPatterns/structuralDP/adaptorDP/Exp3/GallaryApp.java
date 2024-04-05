package learning.desginPatterns.structuralDP.adaptorDP.Exp3;

public class GallaryApp implements ImageViewer{
	
	 ImageViewerAdaptor adaptorViewer;

	@Override
	public void showImage(String format, String fileName) {
		if(format.equalsIgnoreCase("JPEG")) {
			System.out.println("This is Image Jpeg: " + fileName);
		}else {
			adaptorViewer = new ImageViewerAdaptor(format);
			adaptorViewer.showImage(format, fileName);
		}
	}
	 
	 
	
	

}
