package Week3Day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
	    int count = 0;
	    String[] split = text.split(" ");
	    String duplicates = "";
	    String replacementStr = text;
	    for (int i = 0; i < split.length-1; i++) {
	    	for (int j = i+1; j < split.length; j++) {
				if(split[i].equals(split[j])) {
					count++;
					duplicates=split[j];
				}
	    	}
	    	}
	    	
				if(count>0) {
					String replaceAll = replacementStr.replaceAll(duplicates," ");
					System.out.println(replaceAll);
				
			}else {
				
				System.out.println(text);
			}
				
				
				
				
	    	}
			
	
	
	}


