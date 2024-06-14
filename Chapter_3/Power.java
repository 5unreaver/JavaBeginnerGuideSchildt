// вычисление целых степеней числа 2
class Power {
    public static void main(String[] args) {
        int e, result;

        for(int i = 0; i < 10; i++) { // i - степень
            result = 1;
            e = i;
            while(e > 0) {
                result *= 2; // умножаем result на 2
                e--; // уменьшаем на 1
            }

            System.out.println("2 в степени "
            + i + " равно " + result);
        }
    }
}

/* Когда i = 0:
result = 1
e = 0
while(e > 0) не выполняется, потому что e уже равно 0.

Когда i = 1:
result = 1
e = 1
while(e > 0) выполняется 1 раз: result = 2, e = 0

Когда i = 2:
result = 1
e = 2
while(e > 0) выполняется 2 раза: result = 2, result = 4, e = 0

И далее до:
Когда i = 9:
result = 1
e = 9
while(e > 0) выполняется 9 раз: result удваивается 9 раз, становясь равным
2 в 9 степени = 512. */