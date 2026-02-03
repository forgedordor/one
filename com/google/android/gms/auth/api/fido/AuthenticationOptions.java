package com.google.android.gms.auth.api.fido;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbpa;
import defpackage.dbpb;
import defpackage.dbpc;
import defpackage.dbpd;
import defpackage.dbpi;
import defpackage.dbpj;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dddt;
import defpackage.liu;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticationOptions extends AbstractSafeParcelable implements dbpj, dbpd {
    public static final Parcelable.Creator<AuthenticationOptions> CREATOR = new dbpa();
    public final PublicKeyCredentialRequestOptions a;
    public final String b;
    public final String c;
    public final BrowserOptions d;
    public final boolean e;
    public final long f;
    public final ResultReceiver g;
    public final BiometricPromptUiOptions h;
    private final dddt i;
    private final liu j;

    public AuthenticationOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, String str, String str2, BrowserOptions browserOptions, int i, Bundle bundle, boolean z, long j, ResultReceiver resultReceiver, BiometricPromptUiOptions biometricPromptUiOptions) {
        dddt dddtVarB = dddt.b(i);
        liu liuVarA = bundle == null ? null : dbpc.a(bundle);
        dclh.b(j > 0, "Must provide a valid startTime.");
        dclh.m(publicKeyCredentialRequestOptions);
        this.a = publicKeyCredentialRequestOptions;
        dclh.m(str);
        this.b = str;
        dclh.m(str2);
        this.c = str2;
        this.d = browserOptions;
        this.i = dddtVarB;
        this.j = liuVarA;
        this.e = z;
        this.f = j;
        this.g = resultReceiver;
        this.h = biometricPromptUiOptions;
    }

    @Override // defpackage.dbpd
    public final liu a() {
        return this.j;
    }

    @Override // defpackage.dbpj
    public final dddt b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationOptions)) {
            return false;
        }
        AuthenticationOptions authenticationOptions = (AuthenticationOptions) obj;
        return dclc.a(this.a, authenticationOptions.a) && dclc.a(this.b, authenticationOptions.b) && dclc.a(this.c, authenticationOptions.c) && dclc.a(this.d, authenticationOptions.d) && dclc.a(this.i, authenticationOptions.i) && dclc.a(this.j, authenticationOptions.j) && dclc.a(Boolean.valueOf(this.e), Boolean.valueOf(authenticationOptions.e)) && this.f == authenticationOptions.f && this.g == authenticationOptions.g && dclc.a(this.h, authenticationOptions.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.i, this.j, Boolean.valueOf(this.e), Long.valueOf(this.f), this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, publicKeyCredentialRequestOptions, i, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.k(parcel, 5, this.d, i, false);
        dclw.i(parcel, 6, dbpi.a(this));
        dclw.p(parcel, 7, dbpb.a(this));
        dclw.d(parcel, 8, this.e);
        dclw.j(parcel, 9, this.f);
        dclw.k(parcel, 10, this.g, i, false);
        dclw.k(parcel, 11, this.h, i, false);
        dclw.c(parcel, iA);
    }
}
