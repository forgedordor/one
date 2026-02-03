package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eenw implements Parcelable {
    public static final Parcelable.Creator<eenw> CREATOR = new eenv();
    int a;
    eelv b;

    public eenw() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, 0);
    }

    public eenw(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = (eelv) parcel.readParcelable(getClass().getClassLoader());
    }
}
