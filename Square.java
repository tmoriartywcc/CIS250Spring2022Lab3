public class Square implements DrawableASCII {
   private int sideLength;

   public Square(int sideLength) {
      this.sideLength = sideLength;
   }


   @Override
   public void drawASCII(char drawChar) {
      int rowIndex;
      int columnIndex;

      for (rowIndex = 0; rowIndex < this.sideLength; ++rowIndex) {
         for (columnIndex = 0; columnIndex < this.sideLength; ++columnIndex) {
            System.out.print(drawChar);
         }
         System.out.println();
      }
   }
}