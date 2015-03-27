public int[] twoSumII(int target, int[] list){
	int s = 0, e = list.lenth-1;
	int[] ans = new int[2];
	while (s < e){
	if (list[s] + list[e] == target){
	ans[0] = s + 1;
	ans[1] = e+1;
	break;
	}
	else if (list[s] + list[e] > target)
	e--;
	else 
	s++;
	}
	return ans;
}