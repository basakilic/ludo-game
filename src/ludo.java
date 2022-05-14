import java.util.Scanner;

public class ludo {

    // K for human player and its pieces
    // M for computer player and its pieces
    // Y for computer player and its pieces
    // S for computer player and its pieces
    static int K1X, K1Y, K2X, K2Y, K3X, K3Y, K4X, K4Y;
    static int M1X, M1Y, M2X, M2Y, M3X, M3Y, M4X, M4Y;
    static int Y1X, Y1Y, Y2X, Y2Y, Y3X, Y3Y, Y4X, Y4Y;
    static int S1X, S1Y, S2X, S2Y, S3X, S3Y, S4X, S4Y;

    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("Welcome to the Ludo Game. ");
        System.out.println("--------------------");
        System.out.println("You have 4 pieces (K). ");
        System.out.println("Throw the dice every step.");
        System.out.println("when you throw 6, one of your pieces goes out. ");
        System.out.println("Try to put your pieces in. ");
        System.out.println("Enter '0' to start ");
        System.out.println("If you want to continue, you should enter '0' every turn. ");
        System.out.println("Try to WIN !!! ");
        System.out.println();
        players(1);
        System.out.println();
    }
    public static int incrementXTest(int x, int y, int dice) {
        // to increment X
        ///////////////////////////////// 1.1
        if ((x == 5) && y <= 11 && y != 7 && y != 1) {
            if (y > 7) {
                if ((y - dice) >= 7) {
                    y = y - dice;
                } else {
                    int StepsToReach7 = y - 7;
                    y = y - StepsToReach7;
                    int ReminderStepsFromTheDice = dice - StepsToReach7;
                    if (x - ReminderStepsFromTheDice <= 7) {
                        x = x - ReminderStepsFromTheDice;
                    } else {
                        int StepsToReach1 = x - 1;
                        x = x - StepsToReach1;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReach1;
                        y = y - ReminderStepsFromTheDice;
                    }
                }

                ///////////////////////////////////// 1.2

            } else if (y <= 5) {
                if ((y - dice) >= 1) {
                    y = y - dice;
                } else {
                    int StepsToReach1 = y - 1;
                    y = y - StepsToReach1;
                    int ReminderStepsFromTheDice = dice - StepsToReach1;
                    if (x + ReminderStepsFromTheDice <= 7) {
                        x = x + ReminderStepsFromTheDice;
                    } else {
                        int StepsToReachX7 = 7 - x;
                        x = x + StepsToReachX7;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachX7;
                        y = y + ReminderStepsFromTheDice;
                    }
                }
            }
            //////////////////////////////////////// 2.1

        } else if ((x == 7) && y < 11 && y != 5) {
            if (y >= 7) {
                if ((y + dice) <= 11) {
                    y = y + dice;
                } else {
                    int StepsToReach11 = 11 - y;
                    y = y + StepsToReach11;
                    int ReminderStepsFromTheDice = dice - StepsToReach11;
                    if (x - ReminderStepsFromTheDice >= 5) {
                        x = x - ReminderStepsFromTheDice;
                    } else {
                        int StepsToReachX5 = x - 5;
                        x = x - StepsToReachX5;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachX5;
                        y = y - ReminderStepsFromTheDice;
                    }
                }


                //////////////////////////////////////// 2.2

            } else if (y < 5) {
                if ((y + dice) < 5) {
                    y = y + dice;
                } else {
                    int StepsToReach5 = 5 - y;
                    y = y + StepsToReach5;
                    int ReminderStepsFromTheDice = dice - StepsToReach5;
                    if (x + ReminderStepsFromTheDice <= 11) {
                        x = x + ReminderStepsFromTheDice;
                    } else {
                        int StepsToReachX11 = 11 - x;
                        x = x + StepsToReachX11;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachX11;
                        y = y + ReminderStepsFromTheDice;
                        if (y < 0) {
                            y = y * -1;
                        }
                    }
                }
            }
            //////////////////////////////////////////// 3.1
        } else if ((y == 5) && x < 11 && x != 5) {
            if (x < 5) {
                if ((x + dice) <= 5) {
                    x = x + dice;
                } else {
                    int StepsToReachX5 = 5 - x;
                    x = x + StepsToReachX5;
                    int ReminderStepsFromTheDice = dice - StepsToReachX5;
                    if (y - ReminderStepsFromTheDice >= 1) {
                        y = y - ReminderStepsFromTheDice;
                    } else {
                        int StepsToReachY1 = y - 1;
                        y = y - StepsToReachY1;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachY1;
                        x = x + ReminderStepsFromTheDice;
                    }
                }
                //////////////////////////////////////// 3.2

            } else if (x >= 7) {
                if ((x + dice) <= 11) {
                    x = x + dice;
                } else {
                    int StepsToReach11 = 11 - x;
                    x = x + StepsToReach11;
                    int ReminderStepsFromTheDice = dice - StepsToReach11;
                    if (y + ReminderStepsFromTheDice <= 7) {
                        y = y + ReminderStepsFromTheDice;
                    } else {
                        int StepsToReachY7 = 7 - y;
                        y = y + StepsToReachY7;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachY7;
                        x = x - ReminderStepsFromTheDice;
                    }
                }
            }
            //////////////////////////////////////// 4.1

        } else if ((y == 7) && x <= 11 && x != 1) {
            if (x <= 5) {
                if ((x - dice) >= 1) {
                    x = x - dice;
                } else {
                    int StepsToReach5 = x - 1;
                    x = x - StepsToReach5;
                    int ReminderStepsFromTheDice = dice - StepsToReach5;
                    if (y - ReminderStepsFromTheDice >= 5) {
                        y = y - ReminderStepsFromTheDice;
                    } else {
                        int StepsToReachY1 = y - 5;
                        y = y - StepsToReachY1;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachY1;
                        x = x + ReminderStepsFromTheDice;
                    }
                }
                ///////////////////////////////////// 4.2
            } else if (x > 7) {
                if ((x - dice) >= 7) {
                    x = x - dice;
                } else {
                    int StepsToReach7 = x - 7;
                    x = x - StepsToReach7;
                    int ReminderStepsFromTheDice = dice - StepsToReach7;

                    if (y + ReminderStepsFromTheDice <= 11) {
                        y = y + ReminderStepsFromTheDice;
                    } else {
                        int StepsToReachY11 = 11 - y;
                        y = y + StepsToReachY11;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachY11;
                        x = x - ReminderStepsFromTheDice;
                    }
                }
            }

        } else if ((x == 1) && y <= 7 && y > 5) {
            if ((y - dice) >= 5) {
                y = y - dice;
            } else {
                int StepsToReach5 = y - 5;
                y = y - StepsToReach5;
                int ReminderStepsFromTheDice = dice - StepsToReach5;
                if (x + ReminderStepsFromTheDice <= 5) {
                    x = x + ReminderStepsFromTheDice;
                } else {
                    int StepsToReachX5 = 5 - x;
                    x = x + StepsToReachX5;
                    ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachX5;
                    y = y - ReminderStepsFromTheDice;
                }
            }
            ////////////////////////////////////// 6
        } else if ((x == 11) && y < 7 && y >= 5) {
            if ((y + dice) <= 7) {
                y = y + dice;
            } else {
                int StepsToReach7 = 7 - y;
                y = y + StepsToReach7;
                int ReminderStepsFromTheDice = dice - StepsToReach7;
                if (x - ReminderStepsFromTheDice >= 7) {
                    x = x - ReminderStepsFromTheDice;
                } else {

                    int StepsToReachX7 = x - 7;
                    x = x - StepsToReachX7;
                    ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachX7;
                    y = y + ReminderStepsFromTheDice;

                }
            }
            ///////////////////////////////////// 7

        } else if ((y == 1) && x >= 5 && x < 7) {
            if ((x + dice) <= 7) {
                x = x + dice;
            } else {
                int StepsToReach7 = 7 - x;
                x = x + StepsToReach7;
                int ReminderStepsFromTheDice = dice - StepsToReach7;
                if (y + ReminderStepsFromTheDice <= 5) {
                    y = y + ReminderStepsFromTheDice;
                } else {
                    int StepsToReachY5 = 5 - y;
                    y = y + StepsToReachY5;
                    ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachY5;
                    x = x + ReminderStepsFromTheDice;
                }
            }

            /////////////////////////////////////////// 8

        } else if ((y == 11) && x > 5 && x <= 7) {
            if ((x - dice) >= 5) {
                x = x - dice;
            } else {
                int StepsToReachX5 = x - 5;
                x = x - StepsToReachX5;
                int ReminderStepsFromTheDice = dice - StepsToReachX5;
                if (y - ReminderStepsFromTheDice >= 7) {
                    y = y - ReminderStepsFromTheDice;
                } else {
                    int StepsToReachY7 = y - 7;
                    y = y - StepsToReachY7;
                    ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachY7;
                    x = x - ReminderStepsFromTheDice;
                }
            }
        }
        return x;
    }
    public static int incrementYTest(int x, int y, int dice) {
        // to increment Y
        ///////////////////////////////// 1.1
        if ((x == 5) && y <= 11 && y != 7 && y != 1) {
            if (y > 7) {
                if ((y - dice) >= 7) {
                    y = y - dice;
                } else {
                    int StepsToReach7 = y - 7;
                    y = y - StepsToReach7;
                    int ReminderStepsFromTheDice = dice - StepsToReach7;
                    if (x - ReminderStepsFromTheDice <= 7) {
                        x = x - ReminderStepsFromTheDice;
                    } else {
                        int StepsToReach1 = x - 1;
                        x = x - StepsToReach1;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReach1;
                        y = y - ReminderStepsFromTheDice;
                    }
                }
                ///////////////////////////////////// 1.2

            } else if (y <= 5) {
                if ((y - dice) >= 1) {
                    y = y - dice;
                } else {
                    int StepsToReach1 = y - 1;
                    y = y - StepsToReach1;
                    int ReminderStepsFromTheDice = dice - StepsToReach1;
                    if (x + ReminderStepsFromTheDice <= 7) {
                        x = x + ReminderStepsFromTheDice;
                    } else {
                        int StepsToReachX7 = 7 - x;
                        x = x + StepsToReachX7;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachX7;
                        y = y + ReminderStepsFromTheDice;
                    }
                }
            }
            //////////////////////////////////////// 2.1

        } else if ((x == 7) && y < 11 && y != 5) {
            if (y >= 7) {
                if ((y + dice) <= 11) {
                    y = y + dice;
                } else {
                    int StepsToReach11 = 11 - y;
                    y = y + StepsToReach11;
                    int ReminderStepsFromTheDice = dice - StepsToReach11;
                    if (x - ReminderStepsFromTheDice >= 5) {
                        x = x - ReminderStepsFromTheDice;
                    } else {
                        int StepsToReachX5 = x - 5;
                        x = x - StepsToReachX5;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachX5;
                        y = y - ReminderStepsFromTheDice;
                    }
                }


                //////////////////////////////////////// 2.2

            } else if (y < 5) {
                if ((y + dice) < 5) {
                    y = y + dice;
                } else {
                    int StepsToReach5 = 5 - y;
                    y = y + StepsToReach5;
                    int ReminderStepsFromTheDice = dice - StepsToReach5;
                    if (x + ReminderStepsFromTheDice <= 11) {
                        x = x + ReminderStepsFromTheDice;
                    } else {
                        int StepsToReachX11 = 11 - x;
                        x = x + StepsToReachX11;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachX11;
                        y = y + ReminderStepsFromTheDice;
                        if (y < 0) {
                            y = y * -1;
                        }
                    }
                }
            }
            //////////////////////////////////////////// 3.1
        } else if ((y == 5) && x < 11 && x != 5) {
            if (x < 5) {
                if ((x + dice) <= 5) {
                    x = x + dice;
                } else {
                    int StepsToReachX5 = 5 - x;
                    x = x + StepsToReachX5;
                    int ReminderStepsFromTheDice = dice - StepsToReachX5;
                    if (y - ReminderStepsFromTheDice >= 1) {
                        y = y - ReminderStepsFromTheDice;
                    } else {
                        int StepsToReachY1 = y - 1;
                        y = y - StepsToReachY1;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachY1;
                        x = x + ReminderStepsFromTheDice;
                    }
                }

                //////////////////////////////////////// 3.2

            } else if (x >= 7) {
                if ((x + dice) <= 11) {
                    x = x + dice;
                } else {
                    int StepsToReach11 = 11 - x;
                    x = x + StepsToReach11;
                    int ReminderStepsFromTheDice = dice - StepsToReach11;
                    if (y + ReminderStepsFromTheDice <= 7) {
                        y = y + ReminderStepsFromTheDice;
                    } else {
                        int StepsToReachY7 = 7 - y;
                        y = y + StepsToReachY7;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachY7;
                        x = x - ReminderStepsFromTheDice;
                    }
                }
            }
            //////////////////////////////////////// 4.1

        } else if ((y == 7) && x <= 11 && x != 1) {
            if (x <= 5) {
                if ((x - dice) >= 1) {
                    x = x - dice;
                } else {
                    int StepsToReach5 = x - 1;
                    x = x - StepsToReach5;
                    int ReminderStepsFromTheDice = dice - StepsToReach5;
                    if (y - ReminderStepsFromTheDice >= 5) {
                        y = y - ReminderStepsFromTheDice;
                    } else {
                        int StepsToReachY1 = y - 5;
                        y = y - StepsToReachY1;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachY1;
                        x = x + ReminderStepsFromTheDice;
                    }
                }
                ///////////////////////////////////// 4.2
            } else if (x > 7) {
                if ((x - dice) >= 7) {
                    x = x - dice;
                } else {
                    int StepsToReach7 = x - 7;
                    x = x - StepsToReach7;
                    int ReminderStepsFromTheDice = dice - StepsToReach7;

                    if (y + ReminderStepsFromTheDice <= 11) {
                        y = y + ReminderStepsFromTheDice;
                    } else {
                        int StepsToReachY11 = 11 - y;
                        y = y + StepsToReachY11;
                        ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachY11;
                        x = x - ReminderStepsFromTheDice;
                    }
                }
            }
            /////////////////////////////////////////// 5

        } else if ((x == 1) && y <= 7 && y > 5) {
            if ((y - dice) >= 5) {
                y = y - dice;
            } else {
                int StepsToReach5 = y - 5;
                y = y - StepsToReach5;
                int ReminderStepsFromTheDice = dice - StepsToReach5;
                if (x + ReminderStepsFromTheDice <= 5) {
                    x = x + ReminderStepsFromTheDice;
                } else {
                    int StepsToReachX5 = 5 - x;
                    x = x + StepsToReachX5;
                    ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachX5;
                    y = y - ReminderStepsFromTheDice;
                }
            }
            ////////////////////////////////////// 6
        } else if ((x == 11) && y < 7 && y >= 5) {
            if ((y + dice) <= 7) {
                y = y + dice;
            } else {
                int StepsToReach7 = 7 - y;
                y = y + StepsToReach7;
                int ReminderStepsFromTheDice = dice - StepsToReach7;
                if (x - ReminderStepsFromTheDice >= 7) {
                    x = x - ReminderStepsFromTheDice;
                } else {
                    int StepsToReachX7 = x - 7;
                    x = x - StepsToReachX7;
                    ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachX7;
                    y = y + ReminderStepsFromTheDice;
                }
            }
            ///////////////////////////////////// 7

        } else if ((y == 1) && x >= 5 && x < 7) {
            if ((x + dice) <= 7) {
                x = x + dice;
            } else {
                int StepsToReach7 = 7 - x;
                x = x + StepsToReach7;
                int ReminderStepsFromTheDice = dice - StepsToReach7;
                if (y + ReminderStepsFromTheDice <= 5) {
                    y = y + ReminderStepsFromTheDice;
                } else {
                    int StepsToReachY5 = 5 - y;
                    y = y + StepsToReachY5;
                    ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachY5;
                    x = x + ReminderStepsFromTheDice;
                }
            }

            /////////////////////////////////////////// 8

        } else if ((y == 11) && x > 5 && x <= 7) {
            if ((x - dice) >= 5) {
                x = x - dice;
            } else {
                int StepsToReachX5 = x - 5;
                x = x - StepsToReachX5;
                int ReminderStepsFromTheDice = dice - StepsToReachX5;
                if (y - ReminderStepsFromTheDice >= 7) {
                    y = y - ReminderStepsFromTheDice;
                } else {
                    int StepsToReachY7 = y - 7;
                    y = y - StepsToReachY7;
                    ReminderStepsFromTheDice = ReminderStepsFromTheDice - StepsToReachY7;
                    x = x - ReminderStepsFromTheDice;
                }
            }
        }
        return y;
    }
    public static void gameBoard() {
        for (int i = 1; i <= 11; i++) {
            for (int j = 1; j <= 11; j++) {
                if ((K1X == j && K1Y == i) || (K2X == j && K2Y == i) || (K3X == j && K3Y == i) || (K4X == j && K4Y == i)) {
                    System.out.print(" K");
                } else if ((M1X == j && M1Y == i) || (M2X == j && M2Y == i) || (M3X == j && M3Y == i) || (M4X == j && M4Y == i)) {
                    System.out.print(" M");
                } else if ((Y1X == j && Y1Y == i) || (Y2X == j && Y2Y == i) || (Y3X == j && Y3Y == i) || (Y4X == j && Y4Y == i)) {
                    System.out.print(" Y");
                } else if ((S1X == j && S1Y == i) || (S2X == j && S2Y == i) || (S3X == j && S3Y == i) || (S4X == j && S4Y == i)) {
                    System.out.print(" S");
                } else if (((i == 1 && (j == 1 || j == 2)) || (i == 2 && (j == 1 || j == 2)))) {
                    System.out.print(" K");
                } else if (((i == 1 && (j == 10 || j == 11)) || (i == 2 && (j == 10 || j == 11)))) {
                    System.out.print(" M");
                } else if (((i == 10 && (j == 1 || j == 2)) || (i == 11 && (j == 1 || j == 2)))) {
                    System.out.print(" S");
                } else if (((i == 10 && (j == 10 || j == 11)) || (i == 11 && (j == 10 || j == 11)))) {
                    System.out.print(" Y");
                }else if ((i == 6 && (j > 1 && j < 6)) || ((j == 6 && (i > 1 && i < 6))) ||
                        ((j == 6 && (i > 6 && i < 11))) || ((i == 6 && (j > 6 && j < 11)))) {
                    System.out.print(" .");
                }  else if (j == 5 || j == 7 || i == 5 || i == 7 || (j == 6 && (i == 1 || i == 11) || (i == 6 && (j == 1 || j == 11)))) {
                    System.out.print(" o");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void players(int turn) {
        while (true) {
            switch (turn) {
                case 1:
                    System.out.println("Your turn. Enter 0, if you want to continue");
                    Scanner input = new Scanner(System.in);
                    int inp = input.nextInt();
                    if (inp != 0) {
                        break;
                    }
                    int dice = (int) (Math.random() * 6 + 1);
                    System.out.println("1. player (K) dice : " + dice);

                    // TO MOVE THEM OUT
                    System.out.println();
                    if (dice == 6) {
                        if (K1X == 0) {
                            K1X = 1;
                            K1Y = 5;
                        } else if (K2X == 0) {
                            K2X = 1;
                            K2Y = 5;
                        } else if (K3X == 0) {
                            K3X = 1;
                            K3Y = 5;
                        } else if (K4X == 0) {
                            K4X = 1;
                            K4Y = 5;
                        } else {
                            int x = incrementXTest(K1X, K1Y, dice);
                            int y = incrementYTest(K1X, K1Y, dice);
                            K1X = x;
                            K1Y = y;
                        }
                        turn = 1;

                        // TO MOVE COMPLETED PIECE IN, WHEN THE PIECE COMPLETED A TOUR
                    } else if ((K1X == 4 && K1Y == 7 && dice >= 5) ||
                            (K1X == 3 && K1Y == 7 && dice >= 4) ||
                            (K1X == 2 && K1Y == 7 && dice >= 3) ||
                            (K1X == 1 && K1Y == 7 && dice >= 2) ||
                            (K1X == 1 && K1Y == 6 && dice >= 1)) {
                        K1X = -1;
                        K1Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("You have ONE completed piece in home ");
                        System.out.println();
                        turn = 2;
                    } else if ((K2X == 4 && K2Y == 7 && dice >= 5) ||
                            (K2X == 3 && K2Y == 7 && dice >= 4) ||
                            (K2X == 2 && K2Y == 7 && dice >= 3) ||
                            (K2X == 1 && K2Y == 7 && dice >= 2) ||
                            (K2X == 1 && K2Y == 6 && dice >= 1)) {
                        K2X = -1;
                        K2Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("You have TWO completed piece in home ");
                        System.out.println();
                        turn = 2;
                    } else if ((K3X == 4 && K3Y == 7 && dice >= 5) ||
                            (K3X == 3 && K3Y == 7 && dice >= 4) ||
                            (K3X == 2 && K3Y == 7 && dice >= 3) ||
                            (K3X == 1 && K3Y == 7 && dice >= 2) ||
                            (K3X == 1 && K3Y == 6 && dice >= 1)) {
                        K3X = -1;
                        K3Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("You have THREE completed piece in home ");
                        System.out.println();
                        turn = 2;
                    } else if ((K4X == 4 && K4Y == 7 && dice >= 5) ||
                            (K4X == 3 && K4Y == 7 && dice >= 4) ||
                            (K4X == 2 && K4Y == 7 && dice >= 3) ||
                            (K4X == 1 && K4Y == 7 && dice >= 2) ||
                            (K4X == 1 && K4Y == 6 && dice >= 1)) {
                        K4X = -1;
                        K4Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("You have FOUR completed piece in home ");
                        System.out.println("You win. Congrats !!! ");
                        System.out.println();
                        turn = 2;

                        // TO START OTHER PIECES TO MOVE, WHEN THE PIECE COMPLETED A TOUR
                    } else {
                        if (K1X != -1) {
                            int x = incrementXTest(K1X, K1Y, dice);
                            int y = incrementYTest(K1X, K1Y, dice);
                            K1X = x;
                            K1Y = y;
                        } else if (K2X != -1) {
                            int x = incrementXTest(K2X, K2Y, dice);
                            int y = incrementYTest(K2X, K2Y, dice);
                            K2X = x;
                            K2Y = y;
                        } else if (K3X != -1) {
                            int x = incrementXTest(K3X, K3Y, dice);
                            int y = incrementYTest(K3X, K3Y, dice);
                            K3X = x;
                            K3Y = y;
                        } else if (K4X != -1) {
                            int x = incrementXTest(K4X, K4Y, dice);
                            int y = incrementYTest(K4X, K4Y, dice);
                            K4X = x;
                            K4Y = y;
                        }
                        turn = 2;
                    }
                    gameBoard();
                    System.out.println();
                    break;

                case 2:
                    dice = (int) (Math.random() * 6 + 1);
                    System.out.println("2. player (M) : " + dice);
                    // TO MOVE THEM OUT
                    System.out.println();
                    if (dice == 6) {
                        if (M1X == 0) {
                            M1X = 7;
                            M1Y = 1;
                        } else if (M2X == 0) {
                            M2X = 7;
                            M2Y = 1;
                        } else if (M3X == 0) {
                            M3X = 7;
                            M3Y = 1;
                        } else if (M4X == 0) {
                            M4X = 7;
                            M4Y = 1;
                        } else {
                            int x = incrementXTest(M1X, M1Y, dice);
                            int y = incrementYTest(M1X, M1Y, dice);
                            M1X = x;
                            M1Y = y;
                        }
                        turn = 2;

                        // TO MOVE COMPLETED PIECE IN, WHEN THE PIECE COMPLETED A TOUR
                    } else if ((M1X == 5 && M1Y == 4 && dice >= 5) ||
                            (M1X == 5 && M1Y == 3 && dice >= 4) ||
                            (M1X == 5 && M1Y == 2 && dice >= 3) ||
                            (M1X == 5 && M1Y == 1 && dice >= 2) ||
                            (M1X == 6 && M1Y == 1 && dice >= 1)) {
                        M1X = -1;
                        M1Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("M has ONE completed piece in home ");
                        System.out.println();
                        turn = 3;
                    } else if ((M2X == 5 && M2Y == 4 && dice >= 5) ||
                            (M2X == 5 && M2Y == 3 && dice >= 4) ||
                            (M2X == 5 && M2Y == 2 && dice >= 3) ||
                            (M2X == 5 && M2Y == 1 && dice >= 2) ||
                            (M2X == 6 && M2Y == 1 && dice >= 1)) {
                        M2X = -1;
                        M2Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("M has TWO completed piece in home ");
                        System.out.println();
                        turn = 3;
                    } else if ((M3X == 5 && M3Y == 4 && dice >= 5) ||
                            (M3X == 5 && M3Y == 3 && dice >= 4) ||
                            (M3X == 5 && M3Y == 2 && dice >= 3) ||
                            (M3X == 5 && M3Y == 1 && dice >= 2) ||
                            (M3X == 6 && M3Y == 1 && dice >= 1)) {
                        M3X = -1;
                        M3Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("M has THREE completed piece in home ");
                        System.out.println();
                        turn = 3;
                    } else if ((M4X == 5 && M4Y == 4 && dice >= 5) ||
                            (M4X == 5 && M4Y == 3 && dice >= 4) ||
                            (M4X == 5 && M4Y == 2 && dice >= 3) ||
                            (M4X == 5 && M4Y == 1 && dice >= 2) ||
                            (M4X == 6 && M4Y == 1 && dice >= 1)) {
                        M4X = -1;
                        M4Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("M has FOUR completed piece in home. ");
                        System.out.println("M win. You lost");
                        System.out.println();
                        turn = 3;

                        // TO START OTHER PIECES TO MOVE, WHEN A PIECE COMPLETED A TOUR
                    } else {
                        if (M1X != -1) {
                            int x = incrementXTest(M1X, M1Y, dice);
                            int y = incrementYTest(M1X, M1Y, dice);
                            M1X = x;
                            M1Y = y;
                        } else if (K2X != -1) {
                            int x = incrementXTest(M2X, M2Y, dice);
                            int y = incrementYTest(M2X, M2Y, dice);
                            M2X = x;
                            M2Y = y;
                        } else if (M3X != -1) {
                            int x = incrementXTest(M3X, M3Y, dice);
                            int y = incrementYTest(M3X, M3Y, dice);
                            M3X = x;
                            M3Y = y;
                        } else if (M4X != -1) {
                            int x = incrementXTest(M4X, M4Y, dice);
                            int y = incrementYTest(M4X, M4Y, dice);
                            M4X = x;
                            M4Y = y;
                        }
                        turn = 3;

                    }
                    gameBoard();
                    System.out.println();
                    break;


                case 3:
                    dice = (int) (Math.random() * 6 + 1);
                    System.out.println("3. player(Y) : " + dice);
                    // TO MOVE THEM OUT
                    System.out.println();
                    if (dice == 6) {
                        if (Y1X == 0) {
                            Y1X = 11;
                            Y1Y = 7;
                        } else if (Y2X == 0) {
                            Y2X = 11;
                            Y2Y = 7;
                        } else if (Y3X == 0) {
                            Y3X = 11;
                            Y3Y = 7;
                        } else if (Y4X == 0) {
                            Y4X = 11;
                            Y4Y = 7;
                        } else {
                            int x = incrementXTest(Y1X, Y1Y, dice);
                            int y = incrementYTest(Y1X, Y1Y, dice);
                            Y1X = x;
                            Y1Y = y;
                        }
                        turn = 3;

                        // TO MOVE COMPLETED PIECE IN, WHEN THE PIECE COMPLETED A TOUR
                    } else if ((Y1X == 8 && Y1Y == 5 && dice >= 5) ||
                            (Y1X == 9 && Y1Y == 5 && dice >= 4) ||
                            (Y1X == 10 && Y1Y == 5 && dice >= 3) ||
                            (Y1X == 11 && Y1Y == 5 && dice >= 2) ||
                            (Y1X == 11 && Y1Y == 6 && dice >= 1) ){
                        Y1X = -1;
                        Y1Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("Y has ONE completed piece in home ");
                        System.out.println();
                        turn = 4;

                    } else if ((Y2X == 8 && Y2Y == 5 && dice >= 5) ||
                            (Y2X == 9 && Y2Y == 5 && dice >= 4) ||
                            (Y2X == 10 && Y2Y == 5 && dice >= 3) ||
                            (Y2X == 11 && Y2Y == 5 && dice >= 2) ||
                            (Y2X == 11 && Y2Y == 6 && dice >= 1) ){
                        Y2X = -1;
                        Y2Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("Y has TWO completed piece in home ");
                        System.out.println();
                        turn = 4;

                    }  else if ((Y3X == 8 && Y3Y == 5 && dice >= 5) ||
                            (Y3X == 9 && Y3Y == 5 && dice >= 4) ||
                            (Y3X == 10 && Y3Y == 5 && dice >= 3) ||
                            (Y3X == 11 && Y3Y == 5 && dice >= 2) ||
                            (Y3X == 11 && Y3Y == 6 && dice >= 1) ){
                        Y3X = -1;
                        Y3Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("Y has THREE completed piece in home ");
                        System.out.println();
                        turn = 4;

                    }  else if ((Y4X == 8 && Y4Y == 5 && dice >= 5) ||
                            (Y4X == 9 && Y4Y == 5 && dice >= 4) ||
                            (Y4X == 10 && Y4Y == 5 && dice >= 3) ||
                            (Y4X == 11 && Y4Y == 5 && dice >= 2) ||
                            (Y4X == 11 && Y4Y == 6 && dice >= 1) ){
                        Y4X = -1;
                        Y4Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("Y has FOUR completed piece in home ");
                        System.out.println("Y win. You lost");

                        System.out.println();
                        turn = 4;

                        // TO START OTHER PIECES TO MOVE, A PIECE COMPLETED A TOUR
                    } else{
                        if (Y1X != -1) {
                            int x = incrementXTest(Y1X, Y1Y, dice);
                            int y = incrementYTest(Y1X, Y1Y, dice);
                            Y1X = x;
                            Y1Y = y;
                        } else if (Y2X != -1) {
                            int x = incrementXTest(Y2X, Y2Y, dice);
                            int y = incrementYTest(Y2X, Y2Y, dice);
                            Y2X = x;
                            Y2Y = y;
                        } else if (Y3X != -1) {
                            int x = incrementXTest(Y3X, Y3Y, dice);
                            int y = incrementYTest(Y3X, Y3Y, dice);
                            Y3X = x;
                            Y3Y = y;
                        } else if (M4X != -1) {
                            int x = incrementXTest(Y4X, Y4Y, dice);
                            int y = incrementYTest(Y4X, Y4Y, dice);
                            Y4X = x;
                            Y4Y = y;
                        }
                        turn = 4;

                    }
                    gameBoard();
                    System.out.println();
                    break;


                case 4:
                    dice = (int) (Math.random() * 6 + 1);
                    System.out.println("4. player (S) : " + dice);
                    // TO MOVE THEM OUT
                    System.out.println();
                    if (dice == 6) {
                        if (S1X == 0) {
                            S1X = 5;
                            S1Y = 11;
                        } else if (S2X == 0) {
                            S2X = 5;
                            S2Y = 11;
                        } else if (S3X == 0) {
                            S3X = 5;
                            S3Y = 11;
                        } else if (S4X == 0) {
                            S4X = 5;
                            S4Y = 11;
                        } else {
                            int x = incrementXTest(S1X, S1Y, dice);
                            int y = incrementYTest(S1X, S1Y, dice);
                            S1X = x;
                            S1Y = y;
                        }
                        turn = 4;

                        // TO MOVE COMPLETED PIECE IN, WHEN THE PIECE COMPLETED A TOUR
                    } else if ((S1X == 7 && S1Y == 8 && dice >= 5) ||
                            (S1X == 7 && S1Y == 9 && dice >= 4) ||
                            (S1X == 7 && S1Y == 10 && dice >= 3) ||
                            (S1X == 7 && S1Y == 11 && dice >= 2) ||
                            (S1X == 6 && S1Y == 11 && dice >= 1) ){
                        S1X = -1;
                        S1Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("S has ONE completed piece in home ");
                        System.out.println();
                        turn = 1;

                    }  else if ((S2X == 7 && S2Y == 8 && dice >= 5) ||
                            (S2X == 7 && S2Y == 9 && dice >= 4) ||
                            (S2X == 7 && S2Y == 10 && dice >= 3) ||
                            (S2X == 7 && S2Y == 11 && dice >= 2) ||
                            (S2X == 6 && S2Y == 11 && dice >= 1) ){
                        S2X = -1;
                        S2Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("S has TWO completed piece in home ");
                        System.out.println();
                        turn = 1;

                    }  else if ((S3X == 7 && S3Y == 8 && dice >= 5) ||
                            (S3X == 7 && S3Y == 9 && dice >= 4) ||
                            (S3X == 7 && S3Y == 10 && dice >= 3) ||
                            (S3X == 7 && S3Y == 11 && dice >= 2) ||
                            (S3X == 6 && S3Y == 11 && dice >= 1) ){
                        S3X = -1;
                        S3Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("S has THREE completed piece in home ");
                        System.out.println();
                        turn = 1;

                    }  else if ((S4X == 7 && S4Y == 8 && dice >= 5) ||
                            (S4X == 7 && S4Y == 9 && dice >= 4) ||
                            (S4X == 7 && S4Y == 10 && dice >= 3) ||
                            (S4X == 7 && S4Y == 11 && dice >= 2) ||
                            (S4X == 6 && S4Y == 11 && dice >= 1) ){
                        S4X = -1;
                        S4Y = -1;
                        gameBoard();
                        System.out.println();
                        System.out.println("S has FOUR completed piece in home ");
                        System.out.println("S win. You lost");
                        System.out.println();
                        turn = 1;

                        // TO START OTHER PIECES TO MOVE, WHEN A PIECE COMPLETED A TOUR
                    } else{
                        if (S1X != -1) {
                            int x = incrementXTest(S1X, S1Y, dice);
                            int y = incrementYTest(S1X, S1Y, dice);
                            S1X = x;
                            S1Y = y;
                        } else if (S2X != -1) {
                            int x = incrementXTest(S2X, S2Y, dice);
                            int y = incrementYTest(S2X, S2Y, dice);
                            S2X = x;
                            S2Y = y;
                        } else if (S3X != -1) {
                            int x = incrementXTest(S3X, S3Y, dice);
                            int y = incrementYTest(S3X, S3Y, dice);
                            S3X = x;
                            S3Y = y;
                        } else if (S4X != -1) {
                            int x = incrementXTest(S4X, S4Y, dice);
                            int y = incrementYTest(S4X, S4Y, dice);
                            S4X = x;
                            S4Y = y;
                        }
                        turn = 1;

                    }
                    gameBoard();
                    System.out.println();
                    break;

            }
        }
    }
}
