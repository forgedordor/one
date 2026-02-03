package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efwo implements Parcelable {
    public static final Parcelable.Creator<efwo> CREATOR = new efwn();

    public static efwo b(int i) {
        ejwl.m(i >= -1, "Invalid AccountId");
        return new efwq(i);
    }

    @Deprecated
    public abstract int a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a());
    }
}
