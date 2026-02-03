package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doix extends dojm {
    public static final doix a = new doix();
    public static final Parcelable.Creator<doix> CREATOR = new doiw();

    private doix() {
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
        if (!(obj instanceof doix)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1376881133;
    }

    public final String toString() {
        return "MP4";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
