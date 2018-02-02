#include<stdio.h>
int main(){
	FILE * f = fopen("./result_LINUX3.txt","w");
	int x = 0,y = 0;
	while(x < 19){
		y = 0;
		while(y < 19){
			fprintf(f,"JButton board%02d%02d = new JButton(\"\");\n",x,y);
			++y;
		}
		++x;
	}
	fclose(f);
	return 0;
}
