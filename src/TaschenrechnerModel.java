public class TaschenrechnerModel {
    private double ersterOperand;
    private double zweiterOperand;
    private String operator;

    public double getErgebnis(){
        if (operator == "+") {
            return ersterOperand + zweiterOperand;
        } else if (operator == "-") {
            return ersterOperand - zweiterOperand;
        } else if (operator == "*") {
            return ersterOperand * zweiterOperand;
        } else if (operator == "/") {
            return ersterOperand / zweiterOperand;
        } else {
            return zweiterOperand;
        }
    }
    public void zuruecksetzen(){
        setOperator(null);
    }
    public void setErsterOperand(double opd){
        this.ersterOperand = opd;
    }
    public void setZweiterOperand(double opd){
        this.zweiterOperand = opd;
    }
    public void setOperator(String op){
        this.operator = op;
    }
}
