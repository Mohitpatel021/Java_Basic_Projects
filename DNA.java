public class DNA {
    public static void main(String[] args) {
        
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        
        
        String dna;

        
        dna = dna1;
        analyzeDNA(dna);

        
        dna = dna2;
        analyzeDNA(dna);

        
        dna = dna3;
        analyzeDNA(dna);
    }
    
    public static void analyzeDNA(String dna) {
        
        int startCodonIndex = dna.indexOf("ATG");

        
        if (startCodonIndex != -1) {
            System.out.println("Start codon ATG found at index: " + startCodonIndex);

            
            int stopCodonIndex = dna.indexOf("TGA", startCodonIndex + 3);

            
            if (stopCodonIndex != -1) {
                System.out.println("Stop codon TGA found at index: " + stopCodonIndex);

                
                if (startCodonIndex < stopCodonIndex) {
                    
                    int nucleotideCount = stopCodonIndex - (startCodonIndex + 3);
                    if (nucleotideCount % 3 == 0) {
                        
                        String protein = dna.substring(startCodonIndex, stopCodonIndex + 3);
                        System.out.println("Protein: " + protein);
                    } else {
                        System.out.println("Number of nucleotides between start and stop codons is not a multiple of 3.");
                    }
                } else {
                    System.out.println("Start codon does not appear before the stop codon.");
                }
            } else {
                System.out.println("Stop codon TGA not found after the start codon.");
            }
        } else {
            System.out.println("Start codon ATG not found in the DNA sequence.");
        }
    }
}