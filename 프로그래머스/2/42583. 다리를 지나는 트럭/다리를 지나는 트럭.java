import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
		int sum = 0;
		int time = 0; 

		for(int i = 0; i < truck_weights.length; i++) { 
			int truck = truck_weights[i];

			while(true) {
				if(queue.isEmpty()) { 
					queue.add(truck);
					sum += truck;
					time++; 
					break;
				} else if(queue.size() == bridge_length) {
					sum -= queue.poll();
				} else  { 
					if(sum + truck <= weight) {
						queue.add(truck);
						sum += truck;
						time++;
						break;
					} else { 
						queue.add(0);
						time++;
					}
				}
			}
		}

		return time + bridge_length; 
    }
}

// 정해진 순으로 건너려 한다.
// 모든 트럭이 다리를 건너려면 최소 몇 초
// 최대 bridge_length대 올라갈 수 있으며,
// 다리는 weight 이하까지의 무게를 견딜 있습니다. 
// 단, 다리에 와나전히 오르지 않은 트럭의 무게는 무시
// 트럭 2대가 최대 무게 10kg 
