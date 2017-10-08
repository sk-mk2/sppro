class FizzBuzz{
        public static void main(String[] args){
                        String ans="";
                                for(int i=1;i<=100;i++){
                                                if(i%3==0){
                                                                    ans+="Fizz";
                                                                                }
                                                                                            if(i%5==0){
                                                                                                                ans+="Buzz";
                                                                                                                            }
                                                                                                                                        if(ans==""){
                                                                                                                                                            ans=Integer.toString(i);
                                                                                                                                                                        }
                                                                                                                                                                                    System.out.println(ans);
                                                                                                                                                                                                ans="";
                                                                                                                                                                                                        }
                                                                                                                                                                                                            }
}
