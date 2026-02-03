package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaqk extends eaoi {
    public static final Parcelable.Creator<eaqk> CREATOR = new eaqj();

    public eaqk(easf easfVar, easl easlVar, Instant instant) {
        super(easfVar, easlVar, instant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeSerializable(this.c);
    }
}
