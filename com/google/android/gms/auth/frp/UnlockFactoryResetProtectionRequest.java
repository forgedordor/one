package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbva;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UnlockFactoryResetProtectionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UnlockFactoryResetProtectionRequest> CREATOR = new dbva();
    final int a;
    public final String b;
    public final String c;
    public final String d;

    public UnlockFactoryResetProtectionRequest(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.c(parcel, iA);
    }
}
