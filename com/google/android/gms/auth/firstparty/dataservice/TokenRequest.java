package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbsw;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenRequest> CREATOR = new dbsw();
    final String a;
    final String b;
    final Bundle c;
    final FACLConfig d;
    final PACLConfig e;
    final boolean f;
    final boolean g;
    final String h;
    final AppDescription i;
    final CaptchaSolution j;
    final boolean k;
    final boolean l;
    final String m;
    final int n;
    final String o;
    final String p;
    final String q;
    final long r;
    final boolean s;
    final String t;
    final String u;
    final int v;
    final boolean w;
    final int x;

    public TokenRequest(String str, String str2, Bundle bundle, FACLConfig fACLConfig, PACLConfig pACLConfig, boolean z, boolean z2, String str3, AppDescription appDescription, CaptchaSolution captchaSolution, boolean z3, boolean z4, String str4, int i, String str5, String str6, String str7, long j, boolean z5, String str8, String str9, int i2, boolean z6, int i3) {
        new Bundle();
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = fACLConfig;
        this.e = pACLConfig;
        this.f = z;
        this.g = z2;
        this.h = str3;
        this.i = appDescription;
        this.j = captchaSolution;
        this.k = z3;
        this.l = z4;
        this.m = str4;
        this.n = i;
        this.o = str5;
        this.p = str6;
        this.q = str7;
        this.r = j;
        this.s = z5;
        this.t = str8;
        this.u = str9;
        this.v = i2;
        this.w = z6;
        this.x = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.p(parcel, 4, this.c);
        dclw.k(parcel, 5, this.d, i, false);
        dclw.k(parcel, 6, this.e, i, false);
        dclw.d(parcel, 7, this.f);
        dclw.d(parcel, 8, this.g);
        dclw.m(parcel, 9, this.h, false);
        dclw.k(parcel, 10, this.i, i, false);
        dclw.k(parcel, 11, this.j, i, false);
        dclw.d(parcel, 13, this.k);
        dclw.d(parcel, 14, this.l);
        dclw.m(parcel, 15, this.m, false);
        dclw.i(parcel, 16, this.n);
        dclw.m(parcel, 17, this.o, false);
        dclw.m(parcel, 18, this.p, false);
        dclw.m(parcel, 19, this.q, false);
        dclw.j(parcel, 20, this.r);
        dclw.d(parcel, 21, this.s);
        dclw.m(parcel, 22, this.t, false);
        dclw.m(parcel, 23, this.u, false);
        dclw.i(parcel, 24, this.v);
        dclw.d(parcel, 25, this.w);
        dclw.i(parcel, 26, this.x);
        dclw.c(parcel, iA);
    }
}
