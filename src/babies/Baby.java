package babies;

import com.company.Mother;

/**
 * Created by RENT on 2017-04-28.
 */
public class Baby {

	int servings;
	String name;
	private Mother mother;

	public Baby(String name, Mother mother) {
		this.mother = mother;
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void feed(int servings) {

		mother.serviceBaby(this);

	}

	public void feed2(int servings, Mother fromMother) {

		System.out.println("Bubu fron : " + fromMother.getName());

		this.servings = this.servings + servings;
		if (this.servings < 5) {
			System.out.println("Yum yum!!");
		} else {
			System.out.println("Ble!!!");
		}
	}

	public void poop() {
		System.out.println("All better!");
		this.servings = 0;
	}
}
