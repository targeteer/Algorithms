#include<stdio.h>

#include<string.h>

#include<vector>

#include<algorithm>

#include<iostream>

using namespace std;

int test, n, m, k, y, x, l;
int arr[510][510];
int pan[10];
int ans;
int indx;
int dy[4] = { 0,-1,0,1 };
int dx[4] = { -1,0,1,0 };

void move(int dir, int len) {
	int ny, nx;
	for (int i = 1; i <= len; i++) {
		ny = y + dy[dir];
		nx = x + dx[dir];
		if (ny >= 1 && ny <= n && nx >= 1 && nx <= m && arr[ny][nx] != -1) {
			ans += arr[ny][nx];
			y = ny;
			x = nx;
			arr[ny][nx] = 0;
		}
		else {
			break;
		}
	}
	return;
}

void go(char dir1, int dir2, int cnt) {
	if (dir2 == 1) {
		for (int i = 1; i <= cnt; i++) {
			indx += 1;
			indx = indx % k;
		}
	}
	else {
		for (int i = 1; i <= cnt; i++) {
			if (indx == 0) {
				indx = k - 1;
				continue;
			}
			else {
				indx -= 1;
			}
		}
	}
	int len = pan[indx];

	if (dir1 == 'W') {
		move(0, len);
	}
	else if (dir1 == 'N') {
		move(1, len);
	}
	else if (dir1 == 'E') {
		move(2, len);
	}
	else if (dir1 == 'S') {
		move(3, len);
	}
	return;
}

int main() {
	scanf("%d", &test);
	for (int tc = 1; tc <= test; tc++) {
		scanf("%d %d %d %d", &m, &n, &x, &y);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				scanf("%d", &arr[i][j]);
			}
		}
		indx = 0;
		scanf("%d", &k);
		for (int i = 0; i < k; i++)
			scanf("%d", &pan[i]);
		scanf("%d", &l);
		ans = arr[y][x];
		arr[y][x] = 0;
		for (int i = 1; i <= l; i++) {
			char dir1;
			int dir2, cnt;
			scanf(" %c %d %d", &dir1, &dir2, &cnt);
			go(dir1, dir2, cnt);
		}
		printf("#%d %d %d %d\n", tc, ans, x, y);
	}
	return 0;
}