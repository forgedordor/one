package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eehq implements Parcelable {
    public static final Parcelable.Creator<eehq> CREATOR = new eehn();
    public final eeis a;
    public final eeis b;
    public final eehp c;
    public final eeis d;
    public final int e;
    public final int f;
    public final int g;

    public eehq(eeis eeisVar, eeis eeisVar2, eehp eehpVar, eeis eeisVar3, int i) {
        eeisVar.getClass();
        eeisVar2.getClass();
        eehpVar.getClass();
        this.a = eeisVar;
        this.b = eeisVar2;
        this.d = eeisVar3;
        this.e = i;
        this.c = eehpVar;
        if (eeisVar3 != null && eeisVar.compareTo(eeisVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (eeisVar3 != null && eeisVar3.compareTo(eeisVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > eejd.e().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.g = eeisVar.b(eeisVar2) + 1;
        this.f = (eeisVar2.c - eeisVar.c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eehq)) {
            return false;
        }
        eehq eehqVar = (eehq) obj;
        return this.a.equals(eehqVar.a) && this.b.equals(eehqVar.b) && Objects.equals(this.d, eehqVar.d) && this.e == eehqVar.e && this.c.equals(eehqVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Integer.valueOf(this.e), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.e);
    }
}
