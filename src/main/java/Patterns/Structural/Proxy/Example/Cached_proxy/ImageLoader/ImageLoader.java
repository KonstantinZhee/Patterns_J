package Patterns.Structural.Proxy.Example.Cached_proxy.ImageLoader;


import Patterns.Structural.Proxy.Example.Cached_proxy.Object.Image;

public interface ImageLoader {

  Image getImage(String path);
}
