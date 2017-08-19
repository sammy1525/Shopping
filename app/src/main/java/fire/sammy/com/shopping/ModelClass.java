package fire.sammy.com.shopping;

/**
 * Created by sammmy on 8/10/2017.
 */
public class ModelClass {
    String title,image;

    public ModelClass(String image, String title) {
        this.image = image;
        this.title = title;
    }

    public ModelClass() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
}