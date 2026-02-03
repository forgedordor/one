package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
@fcsv
/* loaded from: classes4.dex */
public final class dltb implements dltc<dltd> {
    public static final dltb a = new dltb();
    public static final Parcelable.Creator<dltb> CREATOR = new dlta();

    private dltb() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dltb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1330778708;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
