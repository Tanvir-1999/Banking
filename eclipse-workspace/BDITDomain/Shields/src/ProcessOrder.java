import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProcessOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		//System.out.println("Please Enter Your Order");
		BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
		String orderentered = reader.readLine();
		String[] ordertype=null;
		if(orderentered.endsWith(" ")) {
			System.out.print("Unable to process Main is missing, Side is missing");
    		System.exit(0);
		}
		if(orderentered.contains(" ")) {
			ordertype=orderentered.split(" ");
		}else {
			System.out.print("Unable to process Main is missing, Side is missing");
    		System.exit(0);
		}
       
        if(ordertype[0].equals("Breakfast")) {
        	if(!(ordertype[1].length()==0)) {
        	System.out.print(ordertype[0]+" ");
        	int coffee=1;
        	char[] order = ordertype[1].toCharArray();
        	if(!ordertype[1].contains("1")) {
        		System.out.print("Unable to process Main is missing");
        		System.exit(0);
        	}
        	if(!ordertype[1].contains("2")) {
        		System.out.print("Unable to process Side is missing");
        		System.exit(0);
        	}
        	for (int i = 0; i < ordertype[1].length(); i++) {
                for (int j = i + 1; j < ordertype[1].length(); j++) {
                   if ((order[i] == order[j])&&(order[i]=='1')) {
                	  System.out.print("Eggs cannot be ordered more than once");
                	  System.exit(0);
                   }
                   if ((order[i] == order[j])&&(order[i]=='2')) {
                 	  System.out.print("Toast cannot be ordered more than once");
                 	  System.exit(0);
                    }
                   if ((order[i] == order[j])&&(order[i]=='3')) {
                	   coffee++;
                     }
                }
             }
        	System.out.print("Eggs, ");
        	System.out.print("Toast, ");
        	if(!ordertype[1].contains("3")) {
        		System.out.print("Water.");
        		System.exit(0);
        	}else {
        		System.out.print("Coffee("+coffee+").");
        	}
        	}else {
        		System.out.print("Unable to process Main is missing, Side is missing");
        		System.exit(0);
        	}
        	
        }else if(ordertype[0].equals("Lunch")) {
        	System.out.print(ordertype[0]+" ");
        	int chips=1;
        	int soda=1;
        	char[] order = ordertype[1].toCharArray();
        	if(!ordertype[1].contains("1")) {
        		System.out.print("Unable to process Main is missing");
        		System.exit(0);
        	}
        	if(!ordertype[1].contains("2")) {
        		System.out.print("Unable to process Side is missing");
        		System.exit(0);
        	}
        	for (int i = 0; i < ordertype[1].length(); i++) {
                for (int j = i + 1; j < ordertype[1].length(); j++) {
                   if ((order[i] == order[j])&&(order[i]=='1')) {
                	  System.out.print("Sandwich cannot be ordered more than once");
                	  System.exit(0);
                   }
                   if ((order[i] == order[j])&&(order[i]=='2')) {
                	   chips++;
                    }
                   if ((order[i] == order[j])&&(order[i]=='3')) {
                	   soda++;
                     }
                }
             }
        	System.out.print("Sandwich, ");
        	if(chips==1) {
        		System.out.print("Chips, ");
        	}else {
        		System.out.print("Chips("+chips+"), ");
        	}
        	if(!ordertype[1].contains("3")) {
        		System.out.print("Water.");
        		System.exit(0);
        	}else {
        		System.out.print("Soda("+soda+").");
        	}	
        	
        }else if(ordertype[0].equals("Dinner"))  {
        	System.out.print(ordertype[0]+" ");
        	int potatoes=1;
        	int wine=1;
        	int cake=1;
        	char[] order = ordertype[1].toCharArray();
        	if(!ordertype[1].contains("1")) {
        		System.out.print("Unable to process Main is missing");
        		System.exit(0);
        	}
        	if(!ordertype[1].contains("2")) {
        		System.out.print("Unable to process Side is missing");
        		System.exit(0);
        	}
        	if(!ordertype[1].contains("3")) {
        		System.out.print("Unable to process Drink is missing");
        		System.exit(0);
        	}
        	if(!ordertype[1].contains("4")) {
        		System.out.print("Unable to process Desert is missing");
        		System.exit(0);
        	}
        	for (int i = 0; i < ordertype[1].length(); i++) {
                for (int j = i + 1; j < ordertype[1].length(); j++) {
                   if ((order[i] == order[j])&&(order[i]=='1')) {
                	  System.out.print("Steak cannot be ordered more than once");
                	  System.exit(0);
                   }
                   if ((order[i] == order[j])&&(order[i]=='2')) {
                	   potatoes++;
                    }
                   if ((order[i] == order[j])&&(order[i]=='3')) {
                	   wine++;
                     }
                   if ((order[i] == order[j])&&(order[i]=='4')) {
                	   cake++;
                     }
                }
             }
        	System.out.print("Steak, ");
        	System.out.print("Water, ");
        	if(potatoes==1) {
        		System.out.print("Potatoes, ");
        	}else {
        		System.out.print("Potatoes("+potatoes+")");
        	}
        	if(wine==1) {
        		System.out.print("Wine, ");
        	}else {
        		System.out.print("Wine("+wine+"), ");
        	}
        	if(cake==1) {
        		System.out.print("Cake.");
        	}else {
        		System.out.print("Cake("+cake+").");
        	}
        	
        }else {
        	System.out.println("Please enter correct order");
        }
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}

}
