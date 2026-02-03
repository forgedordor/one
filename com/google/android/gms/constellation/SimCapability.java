package com.google.android.gms.constellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcon;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SimCapability extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SimCapability> CREATOR = new dcon();
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final List e;

    public SimCapability(int i, String str, int i2, String str2, List list) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.m(parcel, 2, this.b, false);
        dclw.i(parcel, 3, this.c);
        dclw.m(parcel, 4, this.d, false);
        dclw.n(parcel, 5, this.e, false);
        dclw.c(parcel, iA);
    }
}
