package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dcxr;
import defpackage.ejwf;
import defpackage.ejwg;
import defpackage.eldz;
import defpackage.evqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new dcxr();
    public final evqs a;
    public final evqs b;
    public final String[] c;
    private final evqs d;

    public AuthenticatorAttestationResponse(evqs evqsVar, evqs evqsVar2, evqs evqsVar3, String[] strArr) {
        this.d = evqsVar;
        this.a = evqsVar2;
        this.b = evqsVar3;
        dclh.m(strArr);
        this.c = strArr;
    }

    public final byte[] a() {
        return this.b.I();
    }

    public final byte[] b() {
        return this.a.I();
    }

    @Deprecated
    public final byte[] c() {
        return this.d.I();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return dclc.a(this.d, authenticatorAttestationResponse.d) && dclc.a(this.a, authenticatorAttestationResponse.a) && dclc.a(this.b, authenticatorAttestationResponse.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b}))});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        eldz eldzVar = eldz.h;
        ejwfVarB.b("keyHandle", eldzVar.j(c()));
        ejwfVarB.b("clientDataJSON", eldzVar.j(b()));
        ejwfVarB.b("attestationObject", eldzVar.j(a()));
        ejwfVarB.b("transports", Arrays.toString(this.c));
        return ejwfVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.f(parcel, 2, c(), false);
        dclw.f(parcel, 3, b(), false);
        dclw.f(parcel, 4, a(), false);
        dclw.C(parcel, 5, this.c);
        dclw.c(parcel, iA);
    }
}
