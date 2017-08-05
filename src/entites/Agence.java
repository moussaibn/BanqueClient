package entites;

import java.io.*;

public class Agence implements Serializable {
	
		private int numagence;
		private String nomagence;
		
		public int getNumagence() {
			return numagence;
		}
		public void setNumagence(int numagence) {
			this.numagence = numagence;
		}
		public String getNomagence() {
			return nomagence;
		}
		public void setNomagence(String nomagence) {
			this.nomagence = nomagence;
		}
		
}
