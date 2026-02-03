package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxwf implements dxvi {
    public static final dxwf a = new dxwf();
    public static final Parcelable.Creator<dxwf> CREATOR = new dxwe();

    private dxwf() {
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
        if (!(obj instanceof dxwf)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436297177;
    }

    public final String toString() {
        return "YouTubeVisitor";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
