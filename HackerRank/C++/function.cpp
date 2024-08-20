#include <iostream>
#include <cstdio>
using namespace std;

/*
Add `int max_of_four(int a, int b, int c, int d)` here.
*/

int max_of_four(int a, int b, int c, int d){
    int max, x,y;
    if(a>b){
        x=a;
    }else{
        x=b;
    }
    
    if(c>d){
        y=c;
    }else{
        y=d;
    }
    if(x>y){
        max=x;
    }else{
        max=y;
    }
    
    return max;
}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}