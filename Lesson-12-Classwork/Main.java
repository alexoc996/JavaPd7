class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
//Problem 1:
//Write a function collegeCredit that accepts a course code and if a course is college credit return true otherwise return false. If the sixth letter of the course code is "E" or "M" then is a college credit course.

//Problem 2:
//Write a function getCounsoler that accepts a students official class and returns their guidance consulor based on the either the first or middle character of official class being:

//B-Berrouet
//C-Chu
//D-Dinn
//E-Eyzengart
//F-Flores
//G-Gibson
//L-Shim Lee
//M-Meltzer
//P-Paccione
//S-Fiore
//T-Tsai
//Z-Zayes

//Problem 3:
//Write a function imageType that accepts a image file name and returns the image type based on the file extension.
//
//JPEG or JPG - Joint Photographic Experts Group
//PNG - Portable Network Graphics
//GIF - Graphics Interchange Format
//PDF - Portable Document Format

  }
  //Problem 1:
  boolean collegeCredit(String courseCode) {
    if(courseCode != null && courseCode.length() >= 6) {
      char sixthLetter = Character.toUpperCase(courseCode.charAt(5));
      if(sixthLetter == 'E' || sixthLetter == 'M') {
        return true;
      }
    }
    return false;
  }
  
  //Problem 2:
  String getCounselor(String officialClass) {
    if(officialClass == null || officialClass.isEmpty()) {
      return "Unknown Counselor";
    }

    String counselor = counselorFor(officialClass.charAt(0));
    if(!counselor.equals("Unknown Counselor")) {
      return counselor;
    }

    return counselorFor(officialClass.charAt(officialClass.length() / 2));
  }

  String counselorFor(char character) {
    switch(Character.toUpperCase(character)) {
      case 'B': return "Berrouet";
      case 'C': return "Chu";
      case 'D': return "Dinn";
      case 'E': return "Eyzengart";
      case 'F': return "Flores";
      case 'G': return "Gibson";
      case 'L': return "Shim Lee";
      case 'M': return "Meltzer";
      case 'P': return "Paccione";
      case 'S': return "Fiore";
      case 'T': return "Tsai";
      case 'Z': return "Zayes";
      default: return "Unknown Counselor";
    }
  }

  //Problem 3:
  String imageType(String fileName) {
    if(fileName == null || !fileName.contains(".")) {
      return "Unknown Image Type";
    }

    String extension = fileName.substring(fileName.lastIndexOf('.') + 1).toUpperCase();
    switch(extension) {
      case "JPEG":
      case "JPG":
        return "Joint Photographic Experts Group";
      case "PNG":
        return "Portable Network Graphics";
      case "GIF":
        return "Graphics Interchange Format";
      case "PDF":
        return "Portable Document Format";
      default:
        return "Unknown Image Type";
    }
  }
}