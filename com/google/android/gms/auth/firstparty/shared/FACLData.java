package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbto;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FACLData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FACLData> CREATOR = new dbto();
    final int a;
    final FACLConfig b;
    final String c;
    final boolean d;
    final String e;

    public FACLData(int i, FACLConfig fACLConfig, String str, boolean z, String str2) {
        this.a = i;
        this.b = fACLConfig;
        this.c = str;
        this.d = z;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.d(parcel, 4, this.d);
        dclw.m(parcel, 5, this.e, false);
        dclw.c(parcel, iA);
    }
}
