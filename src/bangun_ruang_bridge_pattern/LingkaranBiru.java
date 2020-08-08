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
public class LingkaranBiru implements DrawAPI {
   @Override
   public void gambarLingkaran(int radius, int x, int y) {
      System.out.println("Gambar Lingkaran [ warna: biru, radius: " + radius + ", x: " + x + ", " + y + "]");
   }
}
