public class App {
    public static void main(String[] args) throws Exception {
        Laptop l1 = new Laptop("2022", "HP", "Windows 11",100,1000);
        Laptop l2 = new Laptop("2015", "Lenovo", "Windows 7",87,2400.2);
        Laptop l3 = new Laptop("2000", "Acer", "Windows 98",97,741287);

        Desktop d1 = new Desktop("2025", "Msi", "windows 11", 20);
        Desktop d2 = new Desktop("2020", "acer", "windows 10", 100);
        Desktop d3 = new Desktop("2014", "Alienware", "windows 8", 200);

        Notebook n1 = new Notebook("2025", "chromebook", "chrome os");
        Notebook n2 = new Notebook("2098", "hp", "chrome os");
        Notebook n3 = new Notebook("2021", "thinkcentre", "chrome os");


        System.out.println(l1.calculatePortabilityScore());
        System.out.println(n1.getModel());

    

    }
}
