package ru.vsu.cs.PoryadinAV.error;

import static ru.vsu.cs.PoryadinAV.utils.SwingUtils.showErrorMessageBox;

public class ErrorMessage {
    public static void printErrorMessage(int errorCode) {
        String errorMessage = switch (errorCode) {
            case 0 -> "Столбцов должно быть ровно 6!";
            case 1 -> "Не удаётся загрузить файл!";
            case 2 -> "Не удаётся сохранить файл!";
            default -> null;
        };

        showErrorMessageBox(errorMessage);
    }
}