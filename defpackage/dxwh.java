package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxwh implements dxvi {
    public static final dxwh a = new dxwh();
    public static final Parcelable.Creator<dxwh> CREATOR = new dxwg();

    private dxwh() {
    }

    @Override // defpackage.dxvi
    public final String a() {
        return "signed_out";
    }

    @Override // defpackage.dxvi
    public final /* synthetic */ boolean b() {
        return dxvh.a(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxwh)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1004849924;
    }

    public final String toString() {
        return "Zwieback";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
