package android.jplas.mycoffee.bankofclass;

import android.os.Parcel;
import android.os.Parcelable;

public class Coffee implements Parcelable {
    public static final int CAPPUCINO = 0;
    public static final int ESPRESSO = 1;
    public static final int MOCACCINO = 2;

    private String nama;
    private int jumlah, total, tipe;

    public Coffee(String nama, int jumlah, int tipe) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.total = calculate();
        this.tipe = tipe;
    }

    private int calculate(){
        switch (tipe){
            case CAPPUCINO: return jumlah * 25000;
            case ESPRESSO: return jumlah * 30000;
            case MOCACCINO: return jumlah * 15000;
            default: return 0;
        }
    }
    public String getNama() {
        return nama;
    }

    public int getTotal() {
        return total;
    }

    protected Coffee(Parcel in) {
        nama = in.readString();
        jumlah = in.readInt();
        total = in.readInt();
        tipe = in.readInt();
    }

    public static final Creator<Coffee> CREATOR = new Creator<Coffee>() {
        @Override
        public Coffee createFromParcel(Parcel in) {
            return new Coffee(in);
        }

        @Override
        public Coffee[] newArray(int size) {
            return new Coffee[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeInt(jumlah);
        parcel.writeInt(total);
        parcel.writeInt(tipe);
    }
}
