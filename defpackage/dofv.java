package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dofv extends dogg {
    public static final dofv a = new dofv();
    public static final Parcelable.Creator<dofv> CREATOR = new dofu();

    private dofv() {
        super("mpeg");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dofv)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 68863917;
    }

    public final String toString() {
        return "MP3";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
