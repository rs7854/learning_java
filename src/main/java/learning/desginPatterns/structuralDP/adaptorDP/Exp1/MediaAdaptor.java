package learning.desginPatterns.structuralDP.adaptorDP.Exp1;

public class MediaAdaptor implements MediaPlayer {

	AdvancedPlayer ap ;
	
	MediaAdaptor(String format){
		if(format.equalsIgnoreCase("mp4")) {
			this.ap = new Mp4player();
		}else if(format.equalsIgnoreCase("wav")) {
			this.ap = new WavPlayer();
		}
		
	}
	
	public void play(String format, String file) {
		 if(format.equalsIgnoreCase("mp4")){
		        ap.playMp4(file);
		     }
		     else if(format.equalsIgnoreCase("wav")){
		        ap.playWav(file);
		     }
		
	}

}
