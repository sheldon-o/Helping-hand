
    public String checkAnagrams(String phraseOne, String phraseTwo) {

        char[] Arr1 = phraseOne.toCharArray();
        char[] Arr2 = phraseTwo.toCharArray();
        Arrays.sort(Arr1);
        Arrays.sort(Arr2);
        if(phraseOne.length()!=phraseTwo.length()){
            return "Given phrases are not anagrams";
        }
        else if (phraseOne.isEmpty()|| phraseTwo.isEmpty()){
            return "Give proper input not empty phrases";
        }
        else if (Arrays.equals(Arr1,Arr2)){
            return "Given phrases are anagrams";

        }
        else{
            return "Given phrases are not anagrams";
        }


    }
}
