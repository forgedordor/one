package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dogx extends dohm {
    public static final dogx a = new dogx();
    public static final Parcelable.Creator<dogx> CREATOR = new dogw();

    private dogx() {
        super("heif");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dogx)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -312508648;
    }

    public final String toString() {
        return "HEIF";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
