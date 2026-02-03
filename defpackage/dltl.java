package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dltl implements dltm<dltn> {
    public static final dltl a = new dltl();
    public static final Parcelable.Creator<dltl> CREATOR = new dltk();

    private dltl() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dltl)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 495218327;
    }

    public final String toString() {
        return "SystemPicker";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
