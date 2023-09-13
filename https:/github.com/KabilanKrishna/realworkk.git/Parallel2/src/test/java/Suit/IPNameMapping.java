package Suit;

public class IPNameMapping {
    public static void main(String[] args) {
        
    	
    	
    	String[] IP = {"172.23.3.203", "172.23.3.202", "172.23.3.201"};
        String[] IPusername = {"Kabilan", "Anurag", "Vignesh"};

        String ipAddress = "172.23.3.203"; // Change this to the IP address you want to check
        String username = null;

        for (int i = 0; i < IP.length; i++) {
            if (ipAddress.equals(IP[i])) {
                username = IPusername[i];
                break;
            }
        }

        if (username != null) {
            System.out.println(username);
        } else {
            System.out.println("Unknown IP");
        }
    }



}
