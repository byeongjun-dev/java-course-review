package Chap04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 몬스터 정보
        String monsterName = "Diablo";
        int monsterHp = 100;
        int playerAttack = 20;
        boolean monsterAlive = true;

        // 전투 정보
        int turn = 0;
        int totalAttacks = 0;

        System.out.printf("===== %s 전투 시작 =====%n", monsterName);

        while (true) {

            System.out.print(
                    "\n행동 선택 (1. 공격 / 2. 방어 / 3. 회복 / 4. 도망) : "
            );

            int playerSelect = scanner.nextInt();

            // 잘못된 입력 처리
            if (playerSelect < 1 || playerSelect > 4) {
                System.out.println("1~4번 중에서 선택해주세요.");
                continue;
            }

            turn++;1

            switch (playerSelect) {

                case 1:
                    System.out.println("\n[공격]");

                    // 1~5회 랜덤 공격
                    int attackCount = (int)(Math.random() * 5) + 1;
                    int currentAttacks = 0;

                    for (int i = 0; i < attackCount && monsterHp > 0; i++) {

                        monsterHp -= playerAttack;
                        currentAttacks++;
                        totalAttacks++;

                        // 몬스터 사망 처리
                        if (monsterHp <= 0) {
                            monsterHp = 0;
                            monsterAlive = false;
                            break;
                        }
                    }

                    System.out.printf(
                            "이번 공격 : %d회 / 몬스터 HP : %d%n",
                            currentAttacks, monsterHp
                    );
                    break;

                case 2:
                    System.out.println("\n[방어] 방어 자세를 취했습니다.");
                    break;

                case 3:
                    System.out.println("\n[회복] 회복 행동을 선택했습니다.");
                    break;

                case 4:
                    System.out.println("\n[도망] 전투에서 도망쳤습니다.");
                    break;
            }

            // 몬스터가 죽었거나 플레이어가 도망치면 종료
            if (!monsterAlive || playerSelect == 4) {
                break;
            }
        }

        // 최종 전투 결과
        System.out.println("\n===== 전투 결과 =====");
        System.out.printf("총 턴 수 : %d%n", turn);
        System.out.printf("총 공격 횟수 : %d%n", totalAttacks);
        System.out.printf("몬스터 : %s%n", monsterName);
        System.out.printf("몬스터 HP : %d%n", monsterHp);
        System.out.printf("몬스터 생존 여부 : %b%n", monsterAlive);

        scanner.close();
    }
}