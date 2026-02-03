package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbqd;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.ejwf;
import defpackage.ejwg;
import defpackage.ekgb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalSignInCredentialWrapper extends AbstractSafeParcelable implements Comparable<InternalSignInCredentialWrapper> {
    public static final Parcelable.Creator<InternalSignInCredentialWrapper> CREATOR = new dbqd();
    public final Account a;
    public final SignInCredential b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final long g;
    public final String h;
    public final boolean i;
    public final Intent j;
    private final List k;

    static {
        new Scope("profile");
        new Scope("email");
        new Scope("openid");
        new Scope("https://www.googleapis.com/auth/userinfo.profile");
        new Scope("https://www.googleapis.com/auth/userinfo.email");
    }

    public InternalSignInCredentialWrapper(Account account, SignInCredential signInCredential, List list, boolean z, boolean z2, long j, boolean z3, long j2, String str, boolean z4, Intent intent) {
        this.a = account;
        dclh.m(signInCredential);
        this.b = signInCredential;
        if (!TextUtils.isEmpty(signInCredential.f)) {
            dclh.b(list.isEmpty(), "Password credentials should have empty granted-scopes list");
            dclh.b(!z, "Converted credentials should not contain the original password");
        }
        dclh.m(list);
        this.k = ekgb.n(list);
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = z3;
        this.g = j2;
        this.h = str;
        this.i = z4;
        this.j = intent;
    }

    private final int a() {
        int i = this.d ? 100000 : this.b.f == null ? 1000 : this.a != null ? 100 : 0;
        SignInCredential signInCredential = this.b;
        int i2 = true != TextUtils.isEmpty(signInCredential.b) ? 2 : 1;
        if (!TextUtils.isEmpty(signInCredential.c)) {
            i2++;
        }
        if (!TextUtils.isEmpty(signInCredential.d)) {
            i2++;
        }
        Uri uri = signInCredential.e;
        if (uri != null && !Uri.EMPTY.equals(uri)) {
            i2++;
        }
        return i + i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
        InternalSignInCredentialWrapper internalSignInCredentialWrapper2 = internalSignInCredentialWrapper;
        int iA = a();
        int iA2 = internalSignInCredentialWrapper2.a();
        return iA == iA2 ? Long.compare(this.g, internalSignInCredentialWrapper2.g) : Integer.compare(iA, iA2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InternalSignInCredentialWrapper)) {
            return false;
        }
        InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) obj;
        return dclc.a(this.a, internalSignInCredentialWrapper.a) && dclc.a(this.b, internalSignInCredentialWrapper.b) && dclc.a(this.k, internalSignInCredentialWrapper.k) && this.c == internalSignInCredentialWrapper.c && this.d == internalSignInCredentialWrapper.d && this.e == internalSignInCredentialWrapper.e && this.f == internalSignInCredentialWrapper.f && this.g == internalSignInCredentialWrapper.g && dclc.a(this.h, internalSignInCredentialWrapper.h) && this.i == internalSignInCredentialWrapper.i && dclc.a(this.j, internalSignInCredentialWrapper.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.k, Boolean.valueOf(this.c), Boolean.valueOf(this.d), Long.valueOf(this.e), Boolean.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), this.j});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("owningAccount", this.a);
        ejwfVarB.b("signInCredential", this.b);
        ejwfVarB.b("grantedScopes", this.k);
        ejwfVarB.h("representsConvertedCredential", this.c);
        ejwfVarB.h("representsLinkedThirdPartyAccount", this.d);
        ejwfVarB.g("linkingTimeInMillis", this.e);
        ejwfVarB.h("autoSelectSupportedByAppAndAccount", this.f);
        ejwfVarB.g("lastUsedTimeMillis", this.g);
        ejwfVarB.b("originalAffiliation", this.h);
        ejwfVarB.h("isUnicornAccount", this.i);
        ejwfVarB.b("fullScreenConsentFlowIntent", this.j);
        return ejwfVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, account, i, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.n(parcel, 3, new ArrayList(this.k), false);
        dclw.d(parcel, 4, this.c);
        dclw.d(parcel, 5, this.d);
        dclw.j(parcel, 6, this.e);
        dclw.d(parcel, 7, this.f);
        dclw.j(parcel, 8, this.g);
        dclw.m(parcel, 9, this.h, false);
        dclw.d(parcel, 10, this.i);
        dclw.k(parcel, 11, this.j, i, false);
        dclw.c(parcel, iA);
    }
}
