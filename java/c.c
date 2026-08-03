#include <stdio.h>
#include <math.h>// For pow() function

int main() {
int number, originalNumber, remainder, n = 0;
double result = 0.0;

// Accept input from the user
printf("Enter a number: ");
scanf("%d", &number);

originalNumber = number;

// Count the number of digits
while (originalNumber != 0) {
originalNumber /=10;
++n;

originalNumber = number;

// Compute the sum of powers of digits
while (originalNumber != 0) {
remainder = originalNumber % 10;
result += pow(remainder, n);
originalNumber /=10;

// Check if the number is an Armstrong number
if ((int)result == number) {
printf("%d is an Armstrong number.\n", number);
} else {
printf("%d is NOT an Armstrong number. n", number);

return 0;
}