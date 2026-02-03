package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eikq implements Parcelable {
    public static final Parcelable.Creator<eikq> CREATOR = new eikp();
    public final eiik a;

    public eikq() {
        this.a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public eikq(eiik eiikVar) {
        this.a = eiikVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
