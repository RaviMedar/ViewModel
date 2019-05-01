package com.ravilearnings.viewmodel.networking;

import java.util.List;

import com.ravilearnings.viewmodel.model.MenuItem;
import retrofit2.Call;
import retrofit2.http.GET;

public interface WebService {

    @GET("menu.json")
    Call<List<MenuItem>> getMenu();
}
