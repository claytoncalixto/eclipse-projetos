package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufacturedate) {
		super(name, price);
		this.manufactureDate = manufacturedate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufacturedate(Date manufacturedate) {
		this.manufactureDate = manufacturedate;
	}
	
	@Override
	public String priceTag() {
		return getName()
				+ " (used) $ "
				+ String.format("%.2f", getPrice())
				+ "(Manufacture date: "
				+ sdf.format(manufactureDate)
				+ ")";
	}
}
