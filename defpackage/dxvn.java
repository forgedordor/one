package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvn implements dxvi {
    public static final Parcelable.Creator<dxvn> CREATOR = new dxvm();
    public final String a;
    public final long b;

    public dxvn(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
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
        if (!(obj instanceof dxvn)) {
            return false;
        }
        dxvn dxvnVar = (dxvn) obj;
        return fdbq.f(this.a, dxvnVar.a) && this.b == dxvnVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Fitbit(fitbitEncodedId=" + this.a + ", fitbitDecodedId=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
    }
}
