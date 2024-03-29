package Patterns.Structural.Proxy.Example.Cached_proxy.ImageLoader;

import Patterns.Structural.Proxy.Example.Cached_proxy.Object.Image;

import java.util.HashMap;
import java.util.Map;

public class ImageLoaderProxy implements ImageLoader {

  private Map<String, Image> cache = new HashMap<>();
  private final ImageLoaderClass imageLoaderClass;

  //We can also send through constructor
  public ImageLoaderProxy(ImageLoaderClass imageLoaderClass) {
    this.imageLoaderClass = imageLoaderClass;
  }

  //Or crate in class Proxy
  public ImageLoaderProxy() {
    imageLoaderClass = new ImageLoaderClass();
  }

  @Override
  public Image getImage(String path) {
    if (cache.containsKey(path)) {

      //Get from cache

      System.out.println("\nGet from cache LOL :");
      return cache.get(path);
    }
    Image image = imageLoaderClass.getImage(path);
    cache.put(path, image);
    return image;
  }
}
