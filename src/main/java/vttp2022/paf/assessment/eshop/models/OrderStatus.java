package vttp2022.paf.assessment.eshop.models;

import java.time.LocalDateTime;

// DO NOT CHANGE THIS CLASS
public class OrderStatus {

	private String orderId;
	private String deliveryId = "";
	private String status = "pending"; // or "dispatched"
	private LocalDateTime posted;

	public String getOrderId() { return this.orderId; }
	public void setOrderId(String orderId) { this.orderId = orderId; }

	public String getDeliveryId() { return this.deliveryId; }
	public void setDeliveryId(String deliveryId) { this.deliveryId = deliveryId; }

	public String getStatus() { return this.status; }
	public void setStatus(String status) { this.status = status; }
	
	public LocalDateTime getPosted() {
		return posted;
	}
	public void setPosted(LocalDateTime posted) {
		this.posted = posted;
	}
}
