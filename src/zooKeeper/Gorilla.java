package zooKeeper;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println(this+" has thrown something!");
		this.energy = this.energy - 5;
		this.displayEnergy();

	}
	
	public void eatBananas() {
		System.out.println(this+" is eating bananas!");
		this.energy = this.energy + 10;
		this.displayEnergy();

		
	}
	
	public void climb() {
		System.out.println(this+" is climbing!");
		this.energy= this.energy - 10;
		this.displayEnergy();
	}

}
