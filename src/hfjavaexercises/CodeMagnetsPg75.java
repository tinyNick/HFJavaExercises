package hfjavaexercises;
/**
 * @author nicholas.fredrickson
 */
public class CodeMagnetsPg75 {

    public static class DrumkitTestDrive{

        boolean highHat = true;
        boolean snare = true;

        public static void main(String [] args) {

            DrumkitTestDrive drumKit = new DrumkitTestDrive();

            drumKit.playSnare();
            drumKit.playHighHat();

            drumKit.snare = false;

            if (drumKit.snare == true)
            {
                drumKit.playSnare();
            }
        }

        public void playSnare()
        {
            System.out.println("bang bang ba-bang");
        }

        public void playHighHat()
        {
            System.out.println("ding ding da-ding");
        }
    }
}
