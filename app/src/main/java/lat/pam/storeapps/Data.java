package lat.pam.storeapps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("details")
    @Expose
    private String details;
    @SerializedName("foodName")
    @Expose
    private String foodName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrice() {
        return "Rp. "+price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Data(Integer id, String price, String number, String details, String foodName) {
        this.id = id;
        this.price = price;
        this.number = number;
        this.details = details;
        this.foodName = foodName;
    }
}

