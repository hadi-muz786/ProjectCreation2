package pack2;

public class Product {

	private Supplier supp;

	public void ProductService() {

		System.out.println("Product Quality");
		supp.SupplierService();

	}

	public Supplier getSupp() {
		return supp;
	}

	public void setSupp(Supplier supp) {
		this.supp = supp;
	}

}
