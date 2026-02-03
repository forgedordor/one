package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class earc extends eaow {
    public static final Parcelable.Creator<earc> CREATOR = new earb();

    public earc(String str, int i, int i2, String str2, String str3, eaps eapsVar) {
        super(str, i, i2, str2, str3, eapsVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        String str = this.e;
        if (str == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str);
        }
        parcel.writeParcelable(this.f, i);
    }
}
