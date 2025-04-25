package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hotelaria-fesa")
public class HotelController {
    
  @GetMapping("")
  public String index() {
    return "/index";
  }

  @GetMapping("/acomodacoes")
  public String acomodacoes() {
    return "/hotel/acomodacoes";
  }
  
  @GetMapping("/bares")
  public String bares() {
  return "/hotel/bares";
  }

  @GetMapping("/lazer/externa")
  public String lazerExterno() {
  return "/hotel/area-lazer-externa";
  }
  
  @GetMapping("/lazer/interna")
  public String lazerInterno() {
  return "/hotel/area-lazer-interna";
  }

  @GetMapping("/fitness")
  public String fitness() {
  return "/hotel/area-fitness";
  }
  
  @GetMapping("/business-salas-reuniao")
  public String business() {
  return "/hotel/business-salas-reuniao";
  }

  @GetMapping("/restaurante")
  public String restaurante() {
  return "/hotel/restaurante";
  }

  @GetMapping("/spa")
  public String spa() {
  return "/hotel/area-spa-relaxamento";
  }

  @GetMapping("/business-teatros")
  public String teatro() {
  return "/hotel/business-teatros";
  }
}
