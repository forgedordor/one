package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class earg extends eaoz {
    public static final Parcelable.Creator<earg> CREATOR = new earf();

    public earg(eatj eatjVar, double d) {
        super(eatjVar, d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeDouble(this.b);
    }
}
