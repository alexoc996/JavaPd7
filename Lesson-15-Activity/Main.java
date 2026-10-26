class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    
    
  }
//Challenge 1
String spaces(int N){
  String b1d="";
  for(int x=0; x<N; x++){
    b1d+="";
  }
  return b1d;
}
//Challenge 2
double harmonic(int N){
  double sum=0;
  for(int x=1; x<=N; x++){
    sum += 1./x;
  }
  return sum;
}
  
}