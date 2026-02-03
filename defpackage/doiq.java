package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doiq extends dojm {
    public static final doiq a = new doiq();
    public static final Parcelable.Creator<doiq> CREATOR = new doip();

    private doiq() {
        super("avc");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doiq)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1376892464;
    }

    public final String toString() {
        return "AVC";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
