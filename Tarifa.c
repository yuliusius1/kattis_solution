#include <stdio.h>
int main(){
    int i,j,k,l;
    long int g;
    scanf("%i %i",&k,&l);
    g = k;
    for(i=0;i<l;i++){
        scanf("%i",&j);
        g += k;
        g -=j;
    }
    printf("%i",g);
}
