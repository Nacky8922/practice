package ex11_04;
import ex11_02.Asset;
import ex11_03.Thing;

public abstract class TangibleAsset extends Asset implements Thing {
	protected String color;
	protected double weight;

	//コンストラクタ
	protected TangibleAsset(String name, int price, String color, double weight) {
		super(name, price);
		this.color = color;
		this.weight = weight;
	}

	//ゲッター・セッター
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return this.weight;
	};
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
