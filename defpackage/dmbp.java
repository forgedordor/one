package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmbp implements dmbs {
    public static final dmbp a = new dmbp();
    public static final Parcelable.Creator<dmbp> CREATOR = new dmbo();

    private dmbp() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmbp)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1049850350;
    }

    public final String toString() {
        return "Grid";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
