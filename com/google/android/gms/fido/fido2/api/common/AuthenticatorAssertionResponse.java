package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcxq;
import defpackage.ejwf;
import defpackage.ejwg;
import defpackage.eldz;
import defpackage.evqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new dcxq();
    public final evqs a;
    private final evqs b;
    private final evqs c;
    private final evqs d;
    private final evqs e;

    public AuthenticatorAssertionResponse(evqs evqsVar, evqs evqsVar2, evqs evqsVar3, evqs evqsVar4, evqs evqsVar5) {
        this.b = evqsVar;
        this.c = evqsVar2;
        this.d = evqsVar3;
        this.e = evqsVar4;
        this.a = evqsVar5;
    }

    public final byte[] a() {
        return this.d.I();
    }

    public final byte[] b() {
        return this.c.I();
    }

    @Deprecated
    public final byte[] c() {
        return this.b.I();
    }

    public final byte[] d() {
        return this.e.I();
    }

    public final byte[] e() {
        evqs evqsVar = this.a;
        if (evqsVar == null) {
            return null;
        }
        return evqsVar.I();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return dclc.a(this.b, authenticatorAssertionResponse.b) && dclc.a(this.c, authenticatorAssertionResponse.c) && dclc.a(this.d, authenticatorAssertionResponse.d) && dclc.a(this.e, authenticatorAssertionResponse.e) && dclc.a(this.a, authenticatorAssertionResponse.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e})), Integer.valueOf(Arrays.hashCode(new Object[]{this.a}))});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        eldz eldzVar = eldz.h;
        ejwfVarB.b("keyHandle", eldzVar.j(c()));
        ejwfVarB.b("clientDataJSON", eldzVar.j(b()));
        ejwfVarB.b("authenticatorData", eldzVar.j(a()));
        ejwfVarB.b("signature", eldzVar.j(d()));
        byte[] bArrE = e();
        if (bArrE != null) {
            ejwfVarB.b("userHandle", eldzVar.j(bArrE));
        }
        return ejwfVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.f(parcel, 2, c(), false);
        dclw.f(parcel, 3, b(), false);
        dclw.f(parcel, 4, a(), false);
        dclw.f(parcel, 5, d(), false);
        dclw.f(parcel, 6, e(), false);
        dclw.c(parcel, iA);
    }
}
