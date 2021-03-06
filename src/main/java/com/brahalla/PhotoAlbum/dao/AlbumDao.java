package com.brahalla.PhotoAlbum.dao;

import com.brahalla.PhotoAlbum.domain.Album;

import java.util.List;

public interface AlbumDao {

  public Album createAlbum(Album album);

  public Album getAlbumById(Long id);

  public List<Album> getAlbumList();

  public Album updateAlbum(Album album);

  public Album deleteAlbum(Long id);

}
