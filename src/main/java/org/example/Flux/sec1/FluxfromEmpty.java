package org.example.Flux.sec1;

import org.example.commons.Util;

import reactor.core.publisher.Flux;

public class FluxfromEmpty {
    public static void main(String[] args) {

     Flux.empty().subscribe(Util.subscriber());

      Flux.error(new RuntimeException("oops!!"))
      .subscribe(Util.subscriber());
        
    }
    
}
