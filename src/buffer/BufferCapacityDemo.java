package buffer;
/*
 * The capacity is the amount of storage available for newly inserted characters, 
 * beyond which an allocation will occur.
 * */
public class BufferCapacityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize the StringBuffer object
        StringBuffer sb = new StringBuffer("");
        System.out.println("Initial Capacity is "+sb.capacity());

        sb.append("my name is harshada");
        // print the length of string buffer contents
        System.out.println("Length after user input:"+sb.length());         
        System.out.println("capapcity after user input:"+sb.capacity());   
        
        sb.append("123456789123456789");
        System.out.println("Current Length:"+sb.length());
        System.out.println("New Capacity:"+sb.capacity());
        
	}

}
