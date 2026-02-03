package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dcxy;
import defpackage.evqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CableAuthenticationData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CableAuthenticationData> CREATOR = new dcxy();
    public final long a;
    private final evqs b;
    private final evqs c;
    private final evqs d;

    public CableAuthenticationData(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        dclh.m(bArr);
        evqs evqsVarX = evqs.x(bArr);
        dclh.m(bArr2);
        evqs evqsVarX2 = evqs.x(bArr2);
        dclh.m(bArr3);
        evqs evqsVarX3 = evqs.x(bArr3);
        this.a = j;
        this.b = evqsVarX;
        this.c = evqsVarX2;
        this.d = evqsVarX3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CableAuthenticationData)) {
            return false;
        }
        CableAuthenticationData cableAuthenticationData = (CableAuthenticationData) obj;
        return this.a == cableAuthenticationData.a && dclc.a(this.b, cableAuthenticationData.b) && dclc.a(this.c, cableAuthenticationData.c) && dclc.a(this.d, cableAuthenticationData.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int iA = dclw.a(parcel);
        dclw.j(parcel, 1, j);
        dclw.f(parcel, 2, this.b.I(), false);
        dclw.f(parcel, 3, this.c.I(), false);
        dclw.f(parcel, 4, this.d.I(), false);
        dclw.c(parcel, iA);
    }
}
