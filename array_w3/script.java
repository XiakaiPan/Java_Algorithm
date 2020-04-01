/*
int[] count = new int[n];
// one trail
int[] birthday = new int[n];
int j = 0;
boolean is_repeated;
do{
	birthday[j] = (int)(Math.random() * n);
	is_repeated = false;
	for(int k = 0; k < j; k++){
		if(birthday[k] == birthday[j]){
			is_repeated = true;
			break;
		}
	}
	count[j]++;
	j++;
}while(!is_repeated && j < n);


// one trail 
*/
/*
// all trails
int[] count = new int[n];
for(int i = 0; i < trails; i++){
	int birthaday[n]; // the days of a year
	int j = 0;
	boolean is_repeated;
	do{
		birthday[j] = (int)(Math.random()*n);
		is_repeated = false;
		for(int k = 0; k < j; k++){
			if(birthday[j] == birthday[k]){
				is_repeated = true;
				count[j]++;
				break;
			}
		}
		j++;
	}while(!is_repeated);
}
*/
// print the result
int sum = 0;
for(int i = 0; i < n; i++){
	sum += count[i];
	double fraction = sum / n;
	System.out.println((i+1)+'\t'+count[i]+'\t'+fraction);
	if(fraction >= 0.5){
		break;
	}
}