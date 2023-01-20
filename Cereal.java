public class Cereal {
    private String name;
    private String type;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private double fiber;
    private double carbohydrates;
    private int sugar;
    private int potassium;
    private int vitamins;
    private int shelf;
    private double weight;
    private double cups;
    private double rating;

    public Cereal(String n, String t, int c, int p, int f, int s, double fi, double car, int su, int po, int v, int sh, int w, double cu, double r){
        name = n;
        type = t;
        calories = c;
        protein = p;
        fat = f;
        sodium = s;
        fiber = fi;
        carbohydrates = car;
        sugar = su;
        potassium = po;
        vitamins = v;
        shelf = sh;
        weight = w;
        cups = cu;
        rating = r;
    }

    public void setCereal(String n, String t, int c, int p, int f, int s, double fi, double car, int su, int po, int v, int sh, int w, double cu, double r){
        name = n;
        type = t;
        calories = c;
        protein = p;
        fat = f;
        sodium = s;
        fiber = fi;
        carbohydrates = car;
        sugar = su;
        potassium = po;
        vitamins = v;
        shelf = sh;
        weight = w;
        cups = cu;
        rating = r;
    }

    public Object[] getCereal(){
        return new Object[]{name, type, calories, protein, fat, sodium, fiber, carbohydrates, sugar, potassium, vitamins, shelf, weight, cups, rating};
    }




}