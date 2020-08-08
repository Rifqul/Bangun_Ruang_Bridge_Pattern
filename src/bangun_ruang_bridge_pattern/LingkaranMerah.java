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
public class LingkaranMerah implements DrawAPI {
   @Override
   public void gambarLingkaran(int radius, int x, int y) {
      System.out.println("Gambar Lingkaran [ warna: merah, radius: " + radius + ", x: " + x + ", " + y + "]");
   }
}
