package com.google.android.gms.auth.api.fido;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbpb;
import defpackage.dbpc;
import defpackage.dbpd;
import defpackage.dbpi;
import defpackage.dbpj;
import defpackage.dbpn;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dddt;
import defpackage.liu;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RegistrationOptions extends AbstractSafeParcelable implements dbpj, dbpd {
    public static final Parcelable.Creator<RegistrationOptions> CREATOR = new dbpn();
    public final PublicKeyCredentialCreationOptions a;
    public final String b;
    public final String c;
    public final BrowserOptions d;
    public final Account e;
    public final boolean f;
    public final long g;
    public final ResultReceiver h;
    public final BiometricPromptUiOptions i;
    private final dddt j;
    private final liu k;

    public RegistrationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, String str, String str2, BrowserOptions browserOptions, Account account, int i, Bundle bundle, Boolean bool, long j, ResultReceiver resultReceiver, BiometricPromptUiOptions biometricPromptUiOptions) {
        dddt dddtVarB = dddt.b(i);
        liu liuVarA = bundle == null ? null : dbpc.a(bundle);
        dclh.b(j > 0, "Must provide a valid startTime.");
        dclh.m(publicKeyCredentialCreationOptions);
        this.a = publicKeyCredentialCreationOptions;
        dclh.m(str);
        this.b = str;
        dclh.m(str2);
        this.c = str2;
        this.d = browserOptions;
        this.e = account;
        this.j = dddtVarB;
        this.k = liuVarA;
        this.f = bool.booleanValue();
        this.g = j;
        this.h = resultReceiver;
        this.i = biometricPromptUiOptions;
    }

    @Override // defpackage.dbpd
    public final liu a() {
        return this.k;
    }

    @Override // defpackage.dbpj
    public final dddt b() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegistrationOptions)) {
            return false;
        }
        RegistrationOptions registrationOptions = (RegistrationOptions) obj;
        return dclc.a(this.a, registrationOptions.a) && dclc.a(this.b, registrationOptions.b) && dclc.a(this.c, registrationOptions.c) && dclc.a(this.d, registrationOptions.d) && dclc.a(this.e, registrationOptions.e) && dclc.a(this.j, registrationOptions.j) && dclc.a(this.k, registrationOptions.k) && dclc.a(Boolean.valueOf(this.f), Boolean.valueOf(registrationOptions.f)) && this.g == registrationOptions.g && this.h == registrationOptions.h && dclc.a(this.i, registrationOptions.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.j, this.k, Boolean.valueOf(this.f), Long.valueOf(this.g), this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, publicKeyCredentialCreationOptions, i, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.k(parcel, 5, this.d, i, false);
        dclw.k(parcel, 6, this.e, i, false);
        dclw.i(parcel, 7, dbpi.a(this));
        dclw.p(parcel, 8, dbpb.a(this));
        dclw.d(parcel, 9, this.f);
        dclw.j(parcel, 10, this.g);
        dclw.k(parcel, 11, this.h, i, false);
        dclw.k(parcel, 12, this.i, i, false);
        dclw.c(parcel, iA);
    }
}
