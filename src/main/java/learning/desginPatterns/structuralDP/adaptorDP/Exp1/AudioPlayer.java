package learning.desginPatterns.structuralDP.adaptorDP.Exp1;

public class AudioPlayer implements MediaPlayer {
	
	
	MediaAdaptor mediaAdapter;
	

	public void play(String format, String file) {
		 if(format.equalsIgnoreCase("mp3")){
		        System.out.println("MP3 file " + file +" Playing...");   
		     }
		 else if(format.equalsIgnoreCase("wav") || format.equalsIgnoreCase("mp4")){
		        mediaAdapter = new MediaAdaptor(format);
		        mediaAdapter.play(format, file);
		     }
		     else{
		        System.out.println("Format not supported");
		     }
	}

}
