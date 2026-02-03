package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doft extends dogg {
    public static final doft a = new doft();
    public static final Parcelable.Creator<doft> CREATOR = new dofs();

    private doft() {
        super("mp4");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doft)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 68863063;
    }

    public final String toString() {
        return "M4A";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
