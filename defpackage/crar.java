package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crar extends cran {
    public static final Parcelable.Creator<crar> CREATOR = new craq();

    public crar(int i, float f, String str) {
        super(i, f, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(crat.a(this.c));
        parcel.writeFloat(this.a);
        parcel.writeString(this.b);
    }
}
