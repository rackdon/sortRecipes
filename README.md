# sortRecipes
Most common sorting algorithms

| Name                      | Best        | Average     | Worst       | Memory                                             | Stable      | Method       | Notes                  |
| :-----------------------: | :---------: | :---------: | :---------: | :------------------------------------------------: | :---------: | :---------:  | :--------------------: |
| [Quicksort](#quicksort)   | n log n     | n log n     | n²          | log n on average, worst case space complexity is n | No          | Partitioning |                        |
| [Mergesort](#mergesort)   | n log n     | n log n     | n log n     | n                                                  | Yes         | Merging      | Highly parallelizable  |

<a name="quicksort"></a>
## Quicksort

+ Pick an element, called a pivot, from the array.
+ Partitioning: reorder the array so that all elements with values less than the pivot come before the pivot, while all elements with values greater than the pivot come after it (equal values can go either way).
After this partitioning, the pivot is in its final position. This is called the partition operation.
+ Recursively apply the above steps to the sub-array of elements with smaller values and separately to the sub-array of elements with greater values.

The base case of the recursion is arrays of size zero or one, which never need to be sorted.

The pivot selection and partitioning steps can be done in several different ways; the choice of specific implementation schemes greatly affects the algorithm's performance.

In the very early versions of `quicksort`, the leftmost element of the partition would often be chosen as the pivot element.
Unfortunately, this causes worst-case behavior on already sorted arrays, which is a rather common use-case.
The problem was easily solved by choosing either a random index for the pivot, choosing the middle index of the partition or (especially for longer partitions) choosing the median of the first, middle and last element of the partition for the pivot.


<a name="mergesort"></a>
## Mergesort

+ Divide the unsorted list into n sublists, each containing 1 element (a list of 1 element is considered sorted).
+ Repeatedly merge sublists to produce new sorted sublists until there is only 1 sublist remaining. This will be the sorted list.

Merge sort is more efficient than quicksort for some types of lists if the data to be sorted can only be efficiently accessed sequentially
