package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pr implements Parcelable {
    public static final Parcelable.Creator<pr> CREATOR = new pq();
    public int a;

    public pr() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public pr(Parcel parcel) {
        this.a = parcel.readInt();
    }
}
