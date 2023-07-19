public abstract class Shape {


    // bisa bikin constructor dan atribute di dalam class
    //protected int length

    //abstact method
    //wajib dioverride oleh class yang mengextends
    abstract public  Double getArea();

    //bisa memiliki method biasa
    //bisa dioverride / bisa juga tanpa di override (tidak wajib)
    public Double getSesuatu(){
        return  10.0;
    }
}
