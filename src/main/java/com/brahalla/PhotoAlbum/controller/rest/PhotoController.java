package com.brahalla.PhotoAlbum.controller.rest;

import com.brahalla.PhotoAlbum.domain.Photo;
import com.brahalla.PhotoAlbum.model.PhotoInfo;
import com.brahalla.PhotoAlbum.service.PhotoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("photos")
public class PhotoController {

	@Autowired
	PhotoService photoService;

	/* CREATE - create a photo
	 * REQUEST: POST /api/photos
	 */
  @RequestMapping(method = RequestMethod.POST)
  public Photo createPhoto(@RequestBody PhotoInfo photoInfo) {
    return this.photoService.createPhoto(photoInfo);
  }

	/* READ - read a photo
	 * REQUEST: GET /api/photos/{id}
	 */
  @RequestMapping(value = "{id}", method = RequestMethod.GET)
  public Photo getPhotoById(@PathVariable("id") Long id) {
    return this.photoService.getPhotoById(id);
  }

	/* READ - read all photos
	 * REQUEST: GET /api/photos
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<Photo> getPhotoList() {
		return this.photoService.getPhotoList();
	}

	/* UPDATE - update a photo
	 * REQUEST: PUT /api/photos/{id}
	 */
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
  public Photo updatePhoto(@PathVariable("id") Long id, @RequestBody PhotoInfo photoInfo) {
    return this.photoService.updatePhoto(id, photoInfo);
  }

	/* DELETE - delete a photo
	 * REQUEST: DELETE /api/photos/{id}
	 */
  @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
  public Photo deletePhoto(@PathVariable("id") Long id) {
    return this.photoService.deletePhoto(id);
  }

}
