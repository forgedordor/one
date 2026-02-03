package com.google.android.gms.audit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbls;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LogAuditRecordsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogAuditRecordsRequest> CREATOR = new dbls();
    public final int a;
    public final int b;
    public final String c;
    public final byte[][] d;
    public final byte[] e;
    public final byte[] f;

    public LogAuditRecordsRequest(int i, int i2, String str, byte[][] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.i(parcel, 2, this.b);
        dclw.m(parcel, 3, this.c, false);
        dclw.q(parcel, 4, this.d);
        dclw.f(parcel, 5, this.e, false);
        dclw.f(parcel, 6, this.f, false);
        dclw.c(parcel, iA);
    }
}
