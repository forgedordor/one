package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbsr;
import defpackage.dclh;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class OtpRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OtpRequest> CREATOR = new dbsr();
    final int a;
    public final String b;
    public final AppDescription c;
    public final byte[] d;
    public final boolean e;

    public OtpRequest(int i, String str, AppDescription appDescription, byte[] bArr, boolean z) {
        this.a = i;
        this.b = str;
        this.d = bArr;
        dclh.n(appDescription, "Caller's app description cannot be null!");
        this.c = appDescription;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.f(parcel, 4, this.d, false);
        dclw.d(parcel, 5, this.e);
        dclw.c(parcel, iA);
    }
}
