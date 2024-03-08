public class Main {
    public static void main(String[] args) {

        //Product categories:
        String category = "Category:Clothing, Category:Grocery, Category:Outdoor, Category:Tools, Category:Electronics";

        int i = 0;

        while(true){
            int found = category.indexOf("Category:", i);
            if (found == -1) break;
            int start = found + 9; //Start of actual category name
            int end = category.indexOf(",", start);
            System.out.println(category.substring(start, end));
        }


    }
}