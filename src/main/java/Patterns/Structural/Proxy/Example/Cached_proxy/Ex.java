package Patterns.Structural.Proxy.Example.Cached_proxy;

import Patterns.Structural.Proxy.Example.Cached_proxy.ImageLoader.ImageLoader;
import Patterns.Structural.Proxy.Example.Cached_proxy.ImageLoader.ImageLoaderProxy;

public class Ex {

  public static void main(String[] args) {
    ImageLoader imageLoader = new ImageLoaderProxy();

    System.out.println(imageLoader.getImage("Cat").toString());
    System.out.println(imageLoader.getImage("Dog").toString());
    System.out.println(imageLoader.getImage("Cat").toString());
    System.out.println(imageLoader.getImage("Cat").toString());
  }
}
