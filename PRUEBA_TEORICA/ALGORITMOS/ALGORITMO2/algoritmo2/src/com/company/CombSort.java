package com.company;

public class CombSort {

    void sort(int arr[], int n)
    {
        int gap = n;
        boolean swapped = true;
        while (gap > 1 || swapped == true)
        {
            gap = updateGap(gap);
            swapped = false;
            for (int i = 0; i < (n - gap); i++)
            {
                int temp;
                if (arr[i] > arr[i + gap])
                {
                    temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    swapped = true;
                }
            }
        }
    }

    int updateGap(int gap)
    {
        gap = (gap * 10) / 13;
        if (gap < 1)
            return 1;
        else
            return gap;
    }
}
