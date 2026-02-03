package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbpp;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new dbpp();
    public final List a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Account e;
    public final String f;
    public final String g;
    public final boolean h;
    public final Bundle i;
    public final boolean j;

    public AuthorizationRequest(List list, String str, boolean z, boolean z2, Account account, String str2, String str3, boolean z3, Bundle bundle, boolean z4) {
        boolean z5 = false;
        if (list != null && !list.isEmpty()) {
            z5 = true;
        }
        dclh.b(z5, "requestedScopes cannot be null or empty");
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = account;
        this.f = str2;
        this.g = str3;
        this.h = z3;
        this.i = bundle;
        this.j = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = this.a;
        int size = list.size();
        List list2 = authorizationRequest.a;
        if (size == list2.size() && list.containsAll(list2)) {
            Bundle bundle = authorizationRequest.i;
            Bundle bundle2 = this.i;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : bundle2.keySet()) {
                        if (!dclc.a(bundle2.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.c == authorizationRequest.c && this.h == authorizationRequest.h && this.d == authorizationRequest.d && this.j == authorizationRequest.j && dclc.a(this.b, authorizationRequest.b) && dclc.a(this.e, authorizationRequest.e) && dclc.a(this.f, authorizationRequest.f) && dclc.a(this.g, authorizationRequest.g)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.h), Boolean.valueOf(this.d), this.e, this.f, this.g, this.i, Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, list, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.d(parcel, 3, this.c);
        dclw.d(parcel, 4, this.d);
        dclw.k(parcel, 5, this.e, i, false);
        dclw.m(parcel, 6, this.f, false);
        dclw.m(parcel, 7, this.g, false);
        dclw.d(parcel, 8, this.h);
        dclw.p(parcel, 9, this.i);
        dclw.d(parcel, 10, this.j);
        dclw.c(parcel, iA);
    }
}
