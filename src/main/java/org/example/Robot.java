package org.example;

/**
 * Очень сложно для меня было понять условие, если кому-то поможет, мои шаги решения:
 * <p>
 * 1. Робота создал кто-то до нас
 * <p>
 * 2. Нам нужно знать куда он повернут, чтоб в дальнейшем повернуть в нужную сторону.   -     .getDirection()
 * <p>
 * я повернула вверх носом
 * <p>
 * 3. Узнаем также координаты, где стоит робот getX() getY().
 * <p>
 * 4. Далее дело техники: если текущий х меньше того, до которого надо дойти -> поворачиваем робота чтобы Direction было RIGHT, в обратном случае LEFT.
 * <p>
 * 5. Делаем цикл на разницу между текущим и нужным х. пусть топает
 * <p>
 * 6. cнова повернула робота вверх носом
 * <p>
 * 7. Подобно п.4 проверяем и поворачиваем в нужное DOWN или оставляем так (у меня то он стоит в UP)
 * <p>
 * 8. Делаем цикл на разницу между текущим и нужным y. пусть топает
 * <p>
 * 9. Робот стоит  в новых координатах
 */

public class Robot {
    int x = 0;
    int y = 0;
    Direction direction = Direction.UP;

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        System.out.println("Поворот против часовой стрелки");
        if (direction == Direction.DOWN) {
            this.direction = Direction.RIGHT;
            return;
        }

        if (direction == Direction.UP) {
            this.direction = Direction.LEFT;
            return;
        }

        if (direction == Direction.LEFT) {
            this.direction = Direction.DOWN;
            return;
        }

        if (direction == Direction.RIGHT) {
            this.direction = Direction.UP;
            return;
        }
    }

    public void turnRight() {
        System.out.println("поворот по часовой стрелке");
        if (this.direction == Direction.DOWN) {
            System.out.println("Вниз -> влево");
            this.direction = Direction.LEFT;
            return;
        }

        if (this.direction == Direction.UP) {
            System.out.println("Вверх -> вправо");
            this.direction = Direction.RIGHT;
            return;
        }

        if (this.direction == Direction.LEFT) {
            System.out.println("Влево -> вверх");
            this.direction = Direction.UP;
            return;
        }

        if (this.direction == Direction.RIGHT) {
            System.out.println("Вправо -> вниз");
            this.direction = Direction.DOWN;
            return;
        }
    }

    public void stepForward() {
        System.out.println("движение");
        if (direction == Direction.DOWN) {
            System.out.println("вниз");
            this.y--;
        }

        if (direction == Direction.UP) {
            System.out.println("вверх");
            this.y++;
        }

        if (direction == Direction.LEFT) {
            System.out.println("налево");
            this.x--;
        }

        if (direction == Direction.RIGHT) {
            System.out.println("направо");
            this.x++;
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getY() < toY && robot.getY() == toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }

        if (robot.getX() < toX && robot.getX() == toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

//        else if (robot.getY() > toY) {
//            while (robot.getDirection() != Direction.DOWN) {
//                robot.turnRight();
//            }
//            while (robot.getY() > toY) {
//                robot.stepForward();
//            }
//        }

       /* if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }*/
    }
}
