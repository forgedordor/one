package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvp implements dxvi {
    public static final Parcelable.Creator<dxvp> CREATOR = new dxvo();
    public final String a;

    public dxvp(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.dxvi
    public final String a() {
        return this.a;
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
        return (obj instanceof dxvp) && fdbq.f(this.a, ((dxvp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Gaia(accountName=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
