
#ifndef CALC_ICE
#define CALC_ICE

module Demo
{
  sequence<int> IntSeq;
  
  exception NoData{};
  
  interface Calc
  {
    long add(int a, int b);
    long subtract(int a, int b);
    long multiply(int a, int b);
    
    double avg(IntSeq is) throws NoData;
  };

};

#endif
