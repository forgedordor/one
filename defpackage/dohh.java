package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dohh extends dohm {
    public static final dohh a = new dohh();
    public static final Parcelable.Creator<dohh> CREATOR = new dohg();

    private dohh() {
        super("vnd.wap.wbmp");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dohh)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -312064532;
    }

    public final String toString() {
        return "WBMP";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
