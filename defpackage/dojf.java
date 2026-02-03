package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dojf extends dojm {
    public static final dojf a = new dojf();
    public static final Parcelable.Creator<dojf> CREATOR = new doje();

    private dojf() {
        super("webm");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dojf)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 266645687;
    }

    public final String toString() {
        return "WEBM";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
