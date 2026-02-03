package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddcd;
import defpackage.ejwh;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FRDProductSpecificDataEntry extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FRDProductSpecificDataEntry> CREATOR = new ddcd();
    final int a;
    final int b;
    final List c;
    final List d;
    final List e;
    final List f;
    final byte[][] g;
    final Boolean h;

    public FRDProductSpecificDataEntry(int i, int i2, List list, List list2, List list3, List list4, byte[][] bArr, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = bArr;
        this.h = Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FRDProductSpecificDataEntry)) {
            return false;
        }
        FRDProductSpecificDataEntry fRDProductSpecificDataEntry = (FRDProductSpecificDataEntry) obj;
        return this.a == fRDProductSpecificDataEntry.a && this.b == fRDProductSpecificDataEntry.b && ejwh.a(this.c, fRDProductSpecificDataEntry.c) && ejwh.a(this.d, fRDProductSpecificDataEntry.d) && ejwh.a(this.e, fRDProductSpecificDataEntry.e) && ejwh.a(this.f, fRDProductSpecificDataEntry.f) && Arrays.equals(this.g, fRDProductSpecificDataEntry.g) && ejwh.a(this.h, fRDProductSpecificDataEntry.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(Arrays.deepHashCode(this.g)), this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.i(parcel, 3, this.b);
        dclw.D(parcel, 4, this.c);
        dclw.z(parcel, 5, this.d);
        dclw.D(parcel, 6, this.e);
        dclw.z(parcel, 7, this.f);
        dclw.q(parcel, 8, this.g);
        dclw.o(parcel, 9, this.h);
        dclw.c(parcel, iA);
    }
}
