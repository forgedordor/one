package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dogv extends dohm {
    public static final dogv a = new dogv();
    public static final Parcelable.Creator<dogv> CREATOR = new dogu();

    private dogv() {
        super("heic");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dogv)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -312508651;
    }

    public final String toString() {
        return "HEIC";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
