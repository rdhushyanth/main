#include <stdio.h>
int main(int argc, char *argv[])
{
	int i =argc-1;
	//printf("i = %d", i);
	while(i >= 0) {
		printf("arg %d: %s\n", i, argv[i]);
		i--;
		
	}
	
	char *states[] = {
		"California", "Oregon",
		"Washington", "Texas"
	};
	
	int num_states = 4;
	;
	i = 0;
	while(i < num_states){
		states[i] = argv[i];
		printf("state %d: %s\n", i, states[i]);
		i++;
	}
	states[0] = "LOKT";
	printf("States: %s, Args: %s", states[0], argv[0]);
	
	return 0;

}