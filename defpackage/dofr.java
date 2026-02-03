package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dofr extends dogg {
    public static final dofr a = new dofr();
    public static final Parcelable.Creator<dofr> CREATOR = new dofq();

    private dofr() {
        super("amr");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dofr)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 68852323;
    }

    public final String toString() {
        return "AMR";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
