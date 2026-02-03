package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doar implements doas<doav> {
    public static final doar a = new doar();
    public static final Parcelable.Creator<doar> CREATOR = new doaq();

    private doar() {
    }

    @Override // defpackage.doas
    public final String a() {
        return "TENOR";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doar)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -2118806537;
    }

    public final String toString() {
        return "Tenor";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
