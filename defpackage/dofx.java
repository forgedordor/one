package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dofx extends dogg {
    public static final dofx a = new dofx();
    public static final Parcelable.Creator<dofx> CREATOR = new dofw();

    private dofx() {
        super("mpg");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dofx)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 68863937;
    }

    public final String toString() {
        return "MPG";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
