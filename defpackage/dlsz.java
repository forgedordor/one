package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlsz implements dltc<dltd> {
    public static final Parcelable.Creator<dlsz> CREATOR = new dlsy();
    public final int a = 1;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlsz)) {
            return false;
        }
        int i = ((dlsz) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "Remote(category=SCOTTY)";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString("SCOTTY");
    }
}
