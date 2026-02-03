package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dogb extends dogg {
    public static final dogb a = new dogb();
    public static final Parcelable.Creator<dogb> CREATOR = new doga();

    private dogb() {
        super("ogg");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dogb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 68865580;
    }

    public final String toString() {
        return "OGG";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
