class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }
//Challenge 1
String creditCardType(String Creditcard) {
    if (Creditcard.substring(0, 1).equals("4")) {
        return "Visa";
    } else if (Creditcard.substring(0, 2).equals("34") || Creditcard.substring(0, 2).equals("37")) {
        return "America Express";
    } else if (Creditcard.substring(0, 2).equals("36")) {
        return "Diner Club";
    } else if (Creditcard.substring(0, 2).equals("51") || Creditcard.substring(0, 2).equals("55")) {
        return "Mastercard";
    } else if (Creditcard.length() >= 4 && Creditcard.substring(0, 4).equals("6011")) {
        return "Discovery";
    } else if (Creditcard.substring(0, 2).equals("65")) {
        return "Discovery";
    } else {
        return "Unknown";
    }
}
  //Challenge 2
  String pigLatin(String word) {
    String firstLetter = word.substring(0, 1);
    String restOfWord = word.substring(1);
    return restOfWord + firstLetter + "ay";
}

//Challenge 3
String nycLocate(String zipCode) {
    String prefix = zipCode.substring(0, 3);

    if (prefix.equals("100") || prefix.equals("101") || prefix.equals("102")) {
        return "Manhattan";
    } else if (prefix.equals("103")) {
        return "Staten Island";
    } else if (prefix.equals("104")) {
        return "Bronx";
    } else if (prefix.equals("112")) {
        return "Brooklyn";
    } else if (prefix.equals("113") || prefix.equals("114") || prefix.equals("111")) {
        return "Queens";
    } else {
        return "Unknown Location";
    }
}

}