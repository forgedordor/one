package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doit extends dojm {
    public static final doit a = new doit();
    public static final Parcelable.Creator<doit> CREATOR = new dois();

    private doit() {
        super("m4v");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doit)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1376881967;
    }

    public final String toString() {
        return "M4V";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
