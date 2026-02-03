package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dohb extends dohm {
    public static final dohb a = new dohb();
    public static final Parcelable.Creator<dohb> CREATOR = new doha();

    private dohb() {
        super("jpg");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dohb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 405563331;
    }

    public final String toString() {
        return "JPG";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
