package com.northcoders.jv_android_retrofit_mvvm_2.ui.mainactivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.northcoders.jv_android_retrofit_mvvm_2.model.Album;
import com.northcoders.jv_android_retrofit_mvvm_2.model.AlbumRepository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private AlbumRepository albumRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.albumRepository = new AlbumRepository(application);
    }

    public LiveData<List<Album>> getAllAlbums() {
        return albumRepository.getMutableLiveData();
    }

    public void addNewAlbum(Album album) {
        albumRepository.addNewAlbum(album);
    }

    public void updateAlbum(long id, Album album) {
        albumRepository.updateAlbum(id, album);
    }

    public void deleteAlbum(long id) {
        albumRepository.deleteAlbum(id);
    }


}
