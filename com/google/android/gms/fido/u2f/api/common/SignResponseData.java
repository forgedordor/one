package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.ddae;
import defpackage.ejwf;
import defpackage.ejwg;
import defpackage.eldz;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator<SignResponseData> CREATOR = new ddae();
    public final byte[] a;
    public final String b;
    public final byte[] c;
    public final byte[] d;

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        dclh.m(bArr);
        this.a = bArr;
        dclh.m(str);
        this.b = str;
        dclh.m(bArr2);
        this.c = bArr2;
        dclh.m(bArr3);
        this.d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.a, signResponseData.a) && dclc.a(this.b, signResponseData.b) && Arrays.equals(this.c, signResponseData.c) && Arrays.equals(this.d, signResponseData.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        eldz eldzVar = eldz.h;
        ejwfVarB.b("keyHandle", eldzVar.j(this.a));
        ejwfVarB.b("clientDataString", this.b);
        ejwfVarB.b("signatureData", eldzVar.j(this.c));
        ejwfVarB.b("application", eldzVar.j(this.d));
        return ejwfVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iA = dclw.a(parcel);
        dclw.f(parcel, 2, bArr, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.f(parcel, 4, this.c, false);
        dclw.f(parcel, 5, this.d, false);
        dclw.c(parcel, iA);
    }
}
