package com.victor.spring_boot_bertoti;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "<h1>MUNDIAL DO PALMEIRAS!!!</h1>" +
                "<img src='https://th.bing.com/th/id/R.0c3e027b31d16b75b820ef06d5e67ad9?rik=MPx6DOGyekTr4w&riu=http%3a%2f%2fpm1.aminoapps.com%2f7840%2f962c2be4086ac2ef0fe3de017fdb231d4e599b38r1-209-662v2_uhq.jpg&ehk=KlafUvjF5ltXtjHzwP%2bDWPaLhoOXqDXoJb9j%2bKe6ET4%3d&risl=&pid=ImgRaw&r=0' alt='GIF'>";
    }
}
