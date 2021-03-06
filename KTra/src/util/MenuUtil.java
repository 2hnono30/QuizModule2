package util;

public class MenuUtil {
    public void menuUtil(String menu) {
        if (menu.equals("User-Lobby")){
            System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                                             USER                                                                         ║");
            System.out.println("║                                             [O]. Sign out                  [C]. Come on               [E]. Exit                                          ║");
            System.out.println("║                                                                                                                                                          ║");
            System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

        }
        if (menu.equals("User-menu")){
            System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                                             USER                                                                         ║");
            System.out.println("║                                                                          1. Show                                                                         ║");
            System.out.println("║                                                                          2. Search                                                                       ║");
            System.out.println("║                                                                          3. Sort                                                                         ║");
            System.out.println("║                                             [R]. Return                                             [E]. Exit                                            ║");
            System.out.println("║                                                                                                                                                          ║");
            System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

        }
        if (menu.equals("Menu-Main")){
            System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                                         \033[1;92mSTUDENT MANAGEMENT\033[0m                                                               ║");
            System.out.println("║                                                                          [C]. Come On                                                                    ║");
            System.out.println("║                                                       \033[0;1m[\033[1;92mO\033[0;1m] \033[0mSign out the account    -    \033[0;1m[\033[1;92mE\033[0;1m] \033[0mExit the application                                          ║");
            System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        }
        if (menu.equals("Sign-In-Menu")){
            System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                                \033[1;92mSTUDENT MANAGEMENT\033[0m                                                                        ║");
            System.out.println("║                                             \033[0;1m[\033[1;92m!\033[0;1m] \033[0mUsername must be between \033[0;32m6 \033[0m- \033[0;32m24 \033[0mcharacters                                                               ║");
            System.out.println("║                                             \033[0;1m[\033[1;92m!\033[0;1m] \033[0mPassword must be between \033[0;32m6 \033[0m- \033[0;32m32 \033[0mcharacters                                                               ║");
            System.out.println("║                                                                                                                                                          ║");
            System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

        }
        if (menu.equals("Authenticate-Menu")){
            System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                                \033[1;92mSTUDENT MANAGEMENT\033[0m                                                                        ║");
            System.out.println("║                                              \033[0;1m[\033[1;92m1\033[0;1m] \033[0;32mSign In \033[0m- Provide the application access permission                                                     ║");
            System.out.println("║                                              \033[0;1m[\033[1;92m2\033[0;1m] \033[0;32mForgot Account \033[0m- Recover the account when forgotten                                                     ║");
            System.out.println("║                                                          \033[0;1m[\033[1;92mE\033[0;1m] \033[0mExit the application                                                                        ║");
            System.out.println("║                                                                                                                                                          ║");
            System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

        }
        if (menu.equals("main-menu")) {
            System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                                         STUDENT MANAGER                                                                  ║");
            System.out.println("║                                                                          1. Add Student                                                                  ║");
            System.out.println("║                                                                          2. Show                                                                         ║");
            System.out.println("║                                                                          3. Search                                                                       ║");
            System.out.println("║                                                                          4. Edit                                                                         ║");
            System.out.println("║                                                                          5. Remove                                                                       ║");
            System.out.println("║                                                                          6. Sort                                                                         ║");
            System.out.println("║                                             [R]. Return                                             [E]. Exit                                            ║");
            System.out.println("║                                                                                                                                                          ║");
            System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        }
        if (menu.equals("Edit-menu")) {
            System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                                             EDIT                                                                         ║");
            System.out.println("║                                                                          1. Edit Student Name                                                            ║");
            System.out.println("║                                                                          2. Edit DOB                                                                     ║");
            System.out.println("║                                                                          3. Edit Sex                                                                     ║");
            System.out.println("║                                                                          4. Edit Phone Number                                                            ║");
            System.out.println("║                                                                          5. Black Main Menu                                                              ║");
            System.out.println("║                                                                                                                                                          ║");
            System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        }
        if (menu.equals("Sort-menu")) {
            System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                                             SORT                                                                         ║");
            System.out.println("║                                                                          1. Student Name                                                                 ║");
            System.out.println("║                                                                          2. Phone Number                                                                 ║");
            System.out.println("║                                                                          3. Black Main Menu                                                              ║");
            System.out.println("║                                                                                                                                                          ║");
            System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        }
//        if (menu.equals("Sign-In-Menu")){
//            System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
//            System.out.println("║                                                                          \033[1;92mSTUDENT MANAGEMENT\033[0m                                                              ║");
//            System.out.println("║                                                                          1. Student Name                                                                 ║");
//            System.out.println("║                                                                          2. Phone Number                                                                 ║");
//            System.out.println("║                                                                          3. Black Main Menu                                                              ║");
//            System.out.println("║                                                                                                                                                          ║");
//            System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
//        }
    }
}
