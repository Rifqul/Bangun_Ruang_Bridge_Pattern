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
public class Bangun_Ruang_Bridge_Pattern {
   public static void main(String[] args) {
      BangunRuang lingkaranmerah = new Lingkaran(100,100, 10, new LingkaranMerah());
      BangunRuang lingkaranbiru = new Lingkaran(100,100, 10, new LingkaranBiru());

      lingkaranmerah.draw();
      lingkaranbiru.draw();
   }
}
