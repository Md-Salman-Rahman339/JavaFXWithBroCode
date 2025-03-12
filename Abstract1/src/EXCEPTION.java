public class EXCEPTION {
    public static void main(String[] args) {
        try {
            int[] mynumbers={1,2,3};
            System.out.println(mynumbers[858]);
        }catch (Exception e){
            System.out.println("Something Went Wrong");
        } finally {
            System.out.println(" the 'try catch' is Finished");
        }
    }
}
