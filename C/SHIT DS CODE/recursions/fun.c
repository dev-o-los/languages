#include <stdio.h>

void fun(int x)
{
    if (x > 0)
    {
        printf("%d ", x);
        fun(x - 1);
        printf("%d ", x);
        fun(x - 1);
        printf("%d ", x);
    }
}

void main()
{
    fun(3);
}