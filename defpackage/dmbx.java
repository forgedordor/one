package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmbx implements dmca {
    public static final Parcelable.Creator<dmbx> CREATOR = new dmbv();
    public final dmbu a;
    public final boolean b;
    public final Integer c;
    public final String d;
    public final int e;
    public final int f;

    public dmbx(dmbu dmbuVar, int i, int i2, boolean z, Integer num, String str) {
        dmbuVar.getClass();
        this.a = dmbuVar;
        this.e = i;
        this.f = i2;
        this.b = z;
        this.c = num;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmbx)) {
            return false;
        }
        dmbx dmbxVar = (dmbx) obj;
        return this.a == dmbxVar.a && this.e == dmbxVar.e && this.f == dmbxVar.f && this.b == dmbxVar.b && fdbq.f(this.c, dmbxVar.c) && fdbq.f(this.d, dmbxVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.c;
        int iHashCode2 = (((((((iHashCode + this.e) * 31) + this.f) * 31) + (true != this.b ? 1237 : 1231)) * 31) + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "InApp(layout=" + this.a + ", facing=" + ((Object) dmbt.a(this.e)) + ", orientation=" + ((Object) dmbw.a(this.f)) + ", isFlashOn=" + this.b + ", previewViewId=" + this.c + ", effectId=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeString(dmbt.a(this.e));
        parcel.writeString(dmbw.a(this.f));
        parcel.writeInt(this.b ? 1 : 0);
        Integer num = this.c;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.d);
    }

    public /* synthetic */ dmbx(dmbu dmbuVar, int i, int i2, boolean z, Integer num, String str, int i3) {
        this(dmbuVar, i, i2, z, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : str);
    }
}
