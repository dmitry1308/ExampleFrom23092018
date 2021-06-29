package ru.schepin.examples.findAreaWithOne;

public class Handler {
    public int[][] findAreaWithOne(int[][] arr) {
        Node startNode = findStartNode(arr);
        Node finishNode = findFinishNode(arr);

        if (checkConditionOnZeros(startNode, finishNode, arr)) {
            return new int[0][0];
        } else {
            System.out.println("Start Point: " + startNode);
            System.out.println("Finish Point: " + finishNode);
        }

        int startX = startNode.getX();
        int startY = startNode.getY();

        int finishY = finishNode.getY();
        int finishX = finishNode.getX();

        int[][] newMatrix = new int[finishY - startY + 1][finishX - startX + 1];

        for (int y = startY; y <= finishY; y++) {
            for (int x = startX; x <= finishX; x++) {
                int number = arr[y][x];
                newMatrix[y - startY][x - startX] = number;
            }
        }
        return newMatrix;
    }


    private Node findStartNode(int[][] arr) {

        Node node = new Node(arr[0].length - 1, arr.length - 1);

        loop:
        for (int x = 0; x < arr[0].length - 1; x++) {
            for (int y = 0; y <= node.getY(); y++) {
                if (arr[y][x] == 1) {
                    if (y < node.getY()) {
                        node.setY(y);
                    }
                    if (x < node.getX()) {
                        node.setX(x);
                    }
                    if (y == 0) {
                        break loop;
                    }
                    break;
                }
            }

        }
        return node;
    }


    private Node findFinishNode(int[][] arr) {

        Node node = new Node(0, 0);

        loop:
        for (int x = arr[0].length - 1; x >= 0; x--) {
            for (int y = arr.length - 1; y > node.getY(); y--) {
                if (arr[y][x] == 1) {
                    if (y > node.getY()) {
                        node.setY(y);
                    }
                    if (x > node.getX()) {
                        node.setX(x);
                    }
                    if (y == arr.length - 1) {
                        break loop;
                    }
                    break;
                }
            }
        }
        return node;
    }

    private boolean checkConditionOnZeros(Node startNode, Node finishNode, int[][] arr) {
        return startNode.getX() == arr[0].length - 1 &&
                startNode.getY() == arr.length - 1 &&
                finishNode.getX() == 0 &&
                finishNode.getY() == 0;
    }
}
