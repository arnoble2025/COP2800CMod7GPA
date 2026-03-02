public class SpeciesCounter {
   // File name for data source
   private static final String FILE_NAME = "PalmerPenguins.csv";
   
   // Constants to represent species names
   private static final String SP_CHINSTRAP = "Chinstrap";
   private static final String SP_GENTOO = "Gentoo";
   private static final String SP_ADELIE = "Adelie";
   
   // Indexes for species count array
   private static final int NUM_SPECIES = 3;
   private static final int SP_CHINSTRAP_INDEX = 0;
   private static final int SP_GENTOO_INDEX = 1;
   private static final int SP_ADELIE_INDEX = 2;

   // Private fields for encapsulation
   private String[] speciesData;
   private int[] speciesCount;

   // Default constructor initializes variables to avoid null pointers
   public SpeciesCounter() {
      this.speciesData = new String[0];
      this.speciesCount = null;
   }

   // 1. Reads species data from CSV using the helper class
   public void readSpeciesData() {
      speciesData = CSVReader.readFile(FILE_NAME, 1);
   }

   // 2. Initializes the integer array for counting
   public void initializeSpeciesCount() {
      speciesCount = new int[NUM_SPECIES];
   }

   // 3. Returns true if speciesData has no records
   public boolean isDataEmpty() {
      return (speciesData == null || speciesData.length == 0);
   }

   // 4. Iterates through the data and updates the count array
   public void countSpecies() {
      for (String species : speciesData) {
         if (species.equals(SP_CHINSTRAP)) {
            speciesCount[SP_CHINSTRAP_INDEX]++;
         } else if (species.equals(SP_GENTOO)) {
            speciesCount[SP_GENTOO_INDEX]++;
         } else if (species.equals(SP_ADELIE)) {
            speciesCount[SP_ADELIE_INDEX]++;
         }
      }
   }

   // 5. Prints final counts to the console
   public void printSpeciesCount() {
      // Order and formatting must match the instructions exactly
      System.out.println(SP_CHINSTRAP + " count = " + speciesCount[SP_CHINSTRAP_INDEX]);
      System.out.println(SP_GENTOO + " count = " + speciesCount[SP_GENTOO_INDEX]);
      System.out.println(SP_ADELIE + " count = " + speciesCount[SP_ADELIE_INDEX]);
   }
}
