package Chap03;

public class Main {
    static void main(String[] args) {
            String characterName = " Tom ";
            int level = 20;
            float health = 100.0f;
            float mana = 50.0f;
            boolean alive = true;
            int attack, defense, quickness;
            var nowExperience = 20.0f;
            String joinGuild = null;

            String trimName = characterName.trim();
            // System.out.println(trimName);
            // System.out.println(characterName.trim());

            int[] stats = new int[] {
                attack = 50,
                defense = 30,
                quickness = 10
            };

            float currentHealth = health - stats[0];
            // System.out.println(takeDamage);

            float takeExperience = nowExperience + 30.0f;
            System.out.println("===== 캐릭터 정보 =====");
            System.out.printf("이름 : %s%n레벨 : %d%nHP : %.1f%nMP : %.1f%n생존 : %b%n",
                    trimName, level, currentHealth, mana, alive);

            System.out.println("===== 능력치 =====");
            System.out.printf("공격력 : %d%n방어력 : %d%n민첩함 : %d%n", stats[0], stats[1], stats[2]);

            String printExperience = "\n현재 경험 : %.1f\n".formatted(takeExperience);
            System.out.println(printExperience);
            System.out.printf("현재 길드 가입 상태 : %s", joinGuild);
        }
    }
