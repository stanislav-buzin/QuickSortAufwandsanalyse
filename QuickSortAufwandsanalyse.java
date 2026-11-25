import java.util.Scanner;
public class QuickSortAufwandsanalyse
{
    private int vergleiche;
    private int tausche;
    
    // Konstruktor
    public QuickSortAufwandsanalyse()
    {
        
    }
    
    public void analysiereAufwand(int stellen, int modus)
    {
        int[] a = new int[stellen];
        vergleiche = 0;
        tausche = 0;
        for (int i = 0; i < stellen; i++)
        {
            if (modus == 0)
            {
                a[i] = i + 1;
            }
            else if (modus == 1)
            {
                a[i] = stellen - i;
            }
        }
        sort(a);
        System.out.print("{");
        for(int i = 0; i < stellen - 1; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[stellen - 1]+"}");
        System.out.print("Vergleiche: "+vergleiche+" ");
        System.out.println("Tausche: "+tausche);
    }
    
    private void sort(int[] a)
    {
        if (a == null || a.length < 2)
        {
            return;
        }
        quicksort(a, 0, a.length - 1);
    }

    private void quicksort(int[] a, int links, int rechts)
    {
        if (links >= rechts)
        {
            return;
        }
        int pivotIndex = partitioniere(a, links, rechts);
        quicksort(a, links, pivotIndex - 1);
        quicksort(a, pivotIndex + 1, rechts);
    }

    private int partitioniere(int[] a, int links, int rechts)
    {
        int pivot = a[links];
        tausche(a, links, rechts);
        int i = links;
        for (int j = links; j < rechts; j++)
        {
            if (a[j] < pivot)
            {
                tausche(a, i, j);
                i++;
            }
            vergleiche++;
        }
        tausche(a, i, rechts);
        return i;
    }

    private void tausche(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        tausche++;
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl der Elemente (stellen >= 1): ");
        int stellen = scanner.nextInt();

        System.out.print("Modus (0 = aufsteigend, 1 = absteigend): ");
        int modus = scanner.nextInt();

        QuickSortAufwandsanalyse analyse = new QuickSortAufwandsanalyse();
        analyse.analysiereAufwand(stellen, modus);

        scanner.close();
    }
}