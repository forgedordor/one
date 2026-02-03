package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmbr implements dmbs {
    public static final dmbr a = new dmbr();
    public static final Parcelable.Creator<dmbr> CREATOR = new dmbq();

    private dmbr() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmbr)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1172323945;
    }

    public final String toString() {
        return "GallerySource.SystemPicker";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
