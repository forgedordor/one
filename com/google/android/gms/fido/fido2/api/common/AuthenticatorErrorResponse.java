package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcxs;
import defpackage.dcyd;
import defpackage.ejwf;
import defpackage.ejwg;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new dcxs();
    public final ErrorCode a;
    public final String b;
    public final int c;

    public AuthenticatorErrorResponse(int i, String str, int i2) {
        try {
            this.a = ErrorCode.a(i);
            this.b = str;
            this.c = i2;
        } catch (dcyd e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return dclc.a(this.a, authenticatorErrorResponse.a) && dclc.a(this.b, authenticatorErrorResponse.b) && dclc.a(Integer.valueOf(this.c), Integer.valueOf(authenticatorErrorResponse.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.f("errorCode", this.a.m);
        String str = this.b;
        if (str != null) {
            ejwfVarB.b("errorMessage", str);
        }
        return ejwfVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a.m);
        dclw.m(parcel, 3, this.b, false);
        dclw.i(parcel, 4, this.c);
        dclw.c(parcel, iA);
    }
}
