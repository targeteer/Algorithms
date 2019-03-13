#include <iostream>
using namespace std;
 
int main()
{   
    int x = 0, y = 0;
    
    cin >> x >> y;
    
    int distance = y - x;
    
    int time = 0;
    int jump = 1;
    int less = distance;
    while (1)
    {
        if (jump*2 <= less)
        {
            less = less - (jump * 2);
            time += 2;
            jump++;    
    
            if (less == 0)
                break;    
        }
        if (jump <= less && less < jump*2)
        {        
            less = less - jump;
            time += 1;
            if (less == 0)
                break;
        }
        if (jump > less)
        {
            less = less - less;
            time++;    
            break;
        }
    }
    
    cout << time;
    
    
    return 0;    
}
