public class TaschenrechnerMain {
    public static void main(String[] args) {
        TaschenrechnerModel model = new TaschenrechnerModel();

        model.setErsterOperand(29);
        model.setZweiterOperand(18);
        model.setOperator("+");
        System.out.println(model.getErgebnis());

        model.setOperator("-");
        System.out.println(model.getErgebnis());

        model.zuruecksetzen();
        System.out.println(model.getErgebnis());
    }

}
