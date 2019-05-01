package com.ravilearnings.viewmodel.ui.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import com.ravilearnings.viewmodel.model.MenuItem;
import com.ravilearnings.viewmodel.ui.home.MenuListRepository;

public class MenuListViewModel extends ViewModel {
    private MenuListRepository repository;
    private LiveData<List<MenuItem>> menuItems;

    public MenuListViewModel() {
        repository = new MenuListRepository();
    }

    public LiveData<List<MenuItem>> getMenuItems() {
        // Fetch data only when it's null
        if (menuItems == null) {
            menuItems = repository.getMenu();
        }

        return menuItems;
    }
}
