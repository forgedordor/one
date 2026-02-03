package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class egbd implements Parcelable {
    public static final Parcelable.Creator<egbd> CREATOR = new egbc();
    private static egbd a;

    public static egbd d() {
        egbd egbdVar;
        synchronized (egbd.class) {
            if (a == null) {
                a = new egao(true, false, null);
            }
            egbdVar = a;
        }
        return egbdVar;
    }

    public abstract Intent a();

    public abstract boolean b();

    public abstract boolean c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeInt(b() ? 1 : 0);
        parcel.writeParcelable(a(), 0);
    }
}
