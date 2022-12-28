package lat.pam.storeapps;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SOService {

    @GET("uasresto")
    Call<List<Data>> getPosts();
}