#ifndef __POINT_H__
#define __POINT_H__

typedef struct _point
{
    int xpos;
    int ypos;

} Point;


//Point 변수의 xpos, ypos값설정
void SetPointPos(Point * ppos, int xpos, int ypos);

//정보출력
void ShowPointPos(Point * ppos);

//두 변수 비교
int PointComp(Point * pos1, Point * pos2);

#endif