package racingcar.view;

import racingcar.model.Car;
import racingcar.view.messages.InteractionMessageEnum;

import java.util.List;

public class OutputView {
    // TODO: InteractionMessageEnum.CAR_NAMES 이거 너무 긴데 매번 이렇게 길게 써야됨??
    public static void printCarNames() {
        System.out.println(InteractionMessageEnum.CAR_NAMES);
    }

    public static void printAttemptCount() {
        System.out.println(InteractionMessageEnum.ATTEMPT_COUNT);
    }

    public static void printResultMessage() {
        System.out.println(InteractionMessageEnum.RESULT_MESSAGE);
    }

    public static void printResult(List<Car> cars) { // TODO: 이거 static 맞나??
        for (Car car: cars) {
            System.out.print(car.getName() + InteractionMessageEnum.COLON +
                    InteractionMessageEnum.HYPHEN.getInteractionMessage().repeat(car.getMove())); // TODO: 넘 길다.
        }
        System.out.println(); // TODO: 줄바꿈 이렇게?
    }

    public static void printWinner(List<Car> winners) {
        // TODO: 이렇게 한줄한줄 해야되나?
        System.out.print(InteractionMessageEnum.WINNERS_MESSAGE);
        System.out.print(InteractionMessageEnum.COLON);

        // TODO: 아래 로직 메서드 분리 할지말지?
        for (int i = 0; i < winners.size() - 1; i++) {
            System.out.print(winners.get(i).getName() + InteractionMessageEnum.COMMA);
        }
        System.out.println(winners.get(winners.size() - 1).getName());
    }
}
