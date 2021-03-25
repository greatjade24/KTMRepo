
		#include <stdio.h>
		#include <stdlib.h>
		#include <time.h>

		int getNumber() {
			return rand() % 45 + 1;
		}

		int main()
		{
			short int lotto[7] = { 0, };
			int i, k, num, a;
			char dup = 'N';

			printf("** 로또 추첨을 시작합니다. ** \n\n");
			srand((unsigned)time(NULL));

			for (i = 0; i < 6;) {
				num = getNumber();

				for (k = 0; k < 6; k++)
					if (lotto[k] == num)
						dup = 'Y';

				if (dup == 'N')
					lotto[i++] = num;

				else
					dup = 'N';
			}

			for (int l = 0; l < 6; l++) {
				for (int j = 0; j < 5; j++) {
					if (lotto[j] > lotto[j + 1]) {
						int imsi = lotto[j];
						lotto[j] = lotto[j + 1];
						lotto[j + 1] = imsi;
					}
				}
			}

			
			for (i = 0; i < 6; i++) {
				printf("추첨된 로또 번호 ==>	");
				printf("%d", lotto[i]);
				scanf("%c", &a);
			}

			printf("\n\n");
		}


	}


