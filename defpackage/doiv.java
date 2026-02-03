package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doiv extends dojm {
    public static final doiv a = new doiv();
    public static final Parcelable.Creator<doiv> CREATOR = new doiu();

    private doiv() {
        super("x-matroska");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doiv)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1376881254;
    }

    public final String toString() {
        return "MKV";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
