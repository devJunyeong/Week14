import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LottoExample {
    public static void main(String[] args) {
        // 로또 번호 리스트 생성 (1~45까지의 숫자)
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }
        System.out.println("Initial list of numbers: " + numbers);

        // 번호 섞기 (랜덤하게 섞기)
        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);

        // 6개의 로또 번호를 뽑기
        ArrayList<Integer> lottoNumbers = new ArrayList<>(numbers.subList(0, 6));
        System.out.println("Selected Lotto numbers: " + lottoNumbers);

        // 번호 정렬
        Collections.sort(lottoNumbers);
        System.out.println("Sorted Lotto numbers: " + lottoNumbers);

        // 번호 리스트 크기 확인
        System.out.println("Lotto numbers size: " + lottoNumbers.size());

        // 특정 위치의 요소 가져오기
        if (!lottoNumbers.isEmpty()) {
            System.out.println("Element at index 0: " + lottoNumbers.get(0));
        }

        // 번호 검색
        System.out.println("Contains 15: " + lottoNumbers.contains(15)); // 특정 번호 포함 여부 확인
        System.out.println("Index of 15: " + lottoNumbers.indexOf(15)); // 특정 번호의 첫 번째 인덱스

        // 번호 반복문을 통한 출력
        System.out.println("Lotto numbers iteration using for-each:");
        for (int number : lottoNumbers) {
            System.out.println(number);
        }

        System.out.println("Lotto numbers iteration using for loop:");
        for (int i = 0; i < lottoNumbers.size(); i++) {
            System.out.println("Index " + i + ": " + lottoNumbers.get(i));
        }

        // 리스트를 배열로 변환
        Integer[] array = lottoNumbers.toArray(new Integer[0]);
        System.out.println("Converted to array: ");
        for (Integer element : array) {
            System.out.println(element);
        }

        // 리스트가 비어 있는지 확인
        System.out.println("Is the lotto numbers list empty? " + lottoNumbers.isEmpty());

        // 리스트 클리어
        lottoNumbers.clear(); // 모든 요소 제거
        System.out.println("Cleared lotto numbers list: " + lottoNumbers);
    }
}
