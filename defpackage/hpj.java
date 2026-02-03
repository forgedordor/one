package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpj extends hrk implements Parcelable {
    public static final Parcelable.Creator<hpj> CREATOR = new hpi();

    public hpj(long j) {
        super(j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(c());
    }
}
