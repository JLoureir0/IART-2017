package deliverify.textil.order;

public class Order {

	private String customer;
	private String deliveryPoint;
	private float value;
	private float volume;

  public Order(String customer, String deliveryPoint, float value, float volume) {
		this.customer = customer;
		this.deliveryPoint = deliveryPoint;
		this.value = value;
		this.volume = volume;
  }

	public String getCustomer() {
  	return customer;
	}

	public String getDeliveryPoint() {
  	return deliveryPoint;
	}

	public float getValue() {
  	return value;
	}

	public float getVolume() {
  	return volume;
	}

}
