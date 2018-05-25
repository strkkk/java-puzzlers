package com.company;

public class Puzzle9_VarVar {

    interface Alone {
        private void leave() {
            System.out.println("Get out...");
        }
    }

    public static void main(String[] args) {
        var var = new Alone() {
            private void leave() {
                System.out.println("Really, leave me alone...");
            }
        };
        var.leave();
    }

//     Get out...
//     Really, leave me alone...
//     Ошибка в рантайме
//     Не скомпилируется
}
