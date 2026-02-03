package com.google.android.gms.clearcut.sampler;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcbv;
import defpackage.dclw;
import defpackage.elcu;
import defpackage.elcz;
import defpackage.eldl;
import defpackage.eldm;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SamplerConfigParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SamplerConfigParcelable> CREATOR = new dcbv();
    public final int a;
    public final double b;
    public final int c;
    public final int d;
    public final String e;

    public SamplerConfigParcelable(int i, double d, int i2, int i3, String str) {
        this.a = i;
        this.b = d;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    public final int hashCode() {
        int i = elcz.a;
        elcu elcuVar = eldm.a;
        eldl eldlVar = new eldl();
        eldlVar.h(this.a);
        eldlVar.m(this.b);
        eldlVar.h(this.c);
        eldlVar.h(this.d);
        String str = this.e;
        if (str != null) {
            eldlVar.k(str, StandardCharsets.UTF_8);
        }
        return eldlVar.r().a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.g(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.i(parcel, 4, this.d);
        dclw.m(parcel, 5, this.e, false);
        dclw.c(parcel, iA);
    }
}
