float main(int arg){
	int result;
	
	if (arg > 0)
		result = calc('p', arg);
	else
		result = calc('n', arg);
	return result;
}

float calc(char sinal, int arg){
	int v1 = 10;
	float v2 = 3;
	float result;
	if (sinal == 'p'){
		result = arg + v1 / v2;
	}else{
		result = -1*arg - v1 * v2;
	}
	return result;
}
