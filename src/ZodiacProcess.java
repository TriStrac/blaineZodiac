public class ZodiacProcess extends ZodiacInfo {

    public int getYear(String birthday){
        int year;
        
        String[] parts = birthday.split("/");
        year = Integer.parseInt(parts[2]);

        return year;
    }
    
    public void selection(int year){
        int selection = year%12;

        switch(selection){
            case 4: 
                rat();
                break;
            case 5:
                ox();
                break;
            case 6:
                tiger();
                break;
            case 7:
                rabbit();
                break;
            case 8:
                dragon();
                break;
            case 9:
                snake();
                break;
            case 10:
                horse();
                break;
            case 11:
                goat();
                break;
            case 0:
                monkey();
                break;
            case 1:
                rooster();
                break;
            case 2:
                dog();
                break;
            case 3:
                pig();
                break;
            default:
                break;      
        }
    }
}
