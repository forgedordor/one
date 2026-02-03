package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbtm;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CaptchaSolution extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CaptchaSolution> CREATOR = new dbtm();
    final int a;
    final String b;
    final String c;

    public CaptchaSolution(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }
}
