// Minesweeper process
for(int i = 0; i < m; i++){
	for(int j = 0; j < n; j++){
		if(grid[i[j] == -1){
			continue;
		}
		else {
			if(i == 0 && j == 0){
				for(int x = 0; x < i+1; x++){
					for(int y = 0; y < j+1; y++){
						if(grid[x][y] == -1){
							grid[i][j]++;
						}
					}
				}
			}
			else if(i == 0 && j == n-1){
				for(int x = i-1; x < i; x++){
					for(int y = j; y < j+1; y++){
						if(grid[x][y] == -1){
							grid[i][j]++；
						}
					}
				}
			}
			else if(i == m-1 &&j == 0){
				for(int x = i-1; x < i; x++){
					for(int y = j; y < j+1; y++){
						if(grid[x][y] == -1){
							grid[i][j]++;
						}
					}
				}
			}
			else if(x == m-1 && y == n-1){
				for(int x = i-1; x < i; x++){
					for(int y = j-1; y < j; y++){
						if(grid[x][y] == -1){
							grid[i][j]++;
						}
					}
				}
			}
			else{
				for(int x = i-1; x < i+1; x++){
					for(int y = j -1; y < j+1; y++){
						if(grid[x][y] == -1){
							grid[i][j]++;
						}
					}
				}
			}
		}
	}
}

// A new kind of get num
for(int i = 0; i < m; i++){
	for(int j = 0; j < n; j++){
		for(int x = i-1; x < i+1; x++){
			for(int y = j-1; y < j+1; y++){
				if(x<0|| x>m-1 || y<0 || y>n){
					continue;
				}
				else{
					if(grid[x][y] == -1){
						grid[i][j]++;
					}
				}
			}
		}
	}
}

for(int i = 0; i < m; i++){
	for(int j = 0; j < n; j++){
		if(grid[i][j] == -1){
			System.out.print("* ");
		}
		else {
			System.out.print(grid[i][j] + " ");
		}
	}
	System.out.println();
}



for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1) {
                    continue;
                }
                else {
                    for (int x = i - 1; x < i + 1; x++) {
                        for (int y = j - 1; y < j + 1; y++) {
                            if (x < 0 || x > m - 1 || y < 0 || y > n - 1) {
                                continue;
                            }
                            else {
                                if (grid[x][y] == -1) {
                                    grid[i][j]++;
                                }
                            }
                        }
                    }
                }
            }
        }
						