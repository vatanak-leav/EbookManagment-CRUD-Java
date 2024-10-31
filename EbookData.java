public class EbookData {
    private String title;
    private String author;
    private String publishYear;
    private String category;
    private String page;
    private String price;

    public EbookData(){}
    public EbookData(String title, String author,  String publishYear, String category, String page, String price) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.category = category;
        this.page = page;
        this.price = price;
    }
    
    //get data
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public  String getpublishYear() {
        return publishYear;
    }
    public String getcategory() {
        return category;
    }
    public String getPage() {
        return page;
    }
    public String getPrice() {
        return price;
    }

  // set data 

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setpublishYear( String publishYear) {
        this.publishYear = publishYear;
    }
    public void setcategory(String category) {
        this.category = category;
    }
    public void setPage(String page) {
        this.page = page;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    @Override
    public String toString() { 
        return String.format ("| %-20s | %-12s | %5s | %-12s | %-4s | %-8s | ",title, author, publishYear, category, page, price+".00 $");
    }
}
