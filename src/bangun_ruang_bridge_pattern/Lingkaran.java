/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun_ruang_bridge_pattern;

/**
 *
 * @author ammar
 */
public class Lingkaran extends BangunRuang {
   private int x, y, radius;

   public Lingkaran (int x, int y, int radius, DrawAPI drawAPI) {
      super(drawAPI);
      this.x = x;  
      this.y = y;  
      this.radius = radius;
   }

   public void draw() {
      drawAPI.gambarLingkaran(radius,x,y);
   }
}
