package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.AuthzenBeginTxData;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbsx;
import defpackage.dclw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TokenResponse extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenResponse> CREATOR = new dbsx();
    AuthzenBeginTxData A;
    boolean B;
    final int a;

    @Deprecated
    String b;
    String c;

    @Deprecated
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    CaptchaChallenge n;
    final List o;
    String p;
    String q;
    boolean r;
    int s;
    PostSignInData t;
    Account u;
    String v;
    TokenData w;
    Bundle x;
    String y;
    ResolutionData z;

    public TokenResponse() {
        this.x = new Bundle();
        this.a = 9;
        this.o = new ArrayList();
    }

    public final void a(Account account) {
        this.u = account;
        this.b = account.name;
    }

    public final void b(TokenData tokenData) {
        if (tokenData == null) {
            tokenData = null;
            this.d = null;
        } else {
            this.d = tokenData.b;
        }
        this.w = tokenData;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.m(parcel, 5, this.e, false);
        dclw.m(parcel, 6, this.f, false);
        dclw.m(parcel, 7, this.g, false);
        dclw.m(parcel, 8, this.h, false);
        dclw.m(parcel, 9, this.i, false);
        dclw.d(parcel, 10, this.j);
        dclw.d(parcel, 11, this.k);
        dclw.d(parcel, 12, this.l);
        dclw.d(parcel, 13, this.m);
        dclw.k(parcel, 14, this.n, i, false);
        dclw.n(parcel, 15, this.o, false);
        dclw.m(parcel, 16, this.p, false);
        dclw.m(parcel, 17, this.q, false);
        dclw.d(parcel, 19, this.r);
        dclw.i(parcel, 20, this.s);
        dclw.k(parcel, 21, this.t, i, false);
        dclw.k(parcel, 22, this.u, i, false);
        dclw.m(parcel, 26, this.v, false);
        dclw.k(parcel, 27, this.w, i, false);
        dclw.p(parcel, 28, this.x);
        dclw.m(parcel, 29, this.y, false);
        dclw.k(parcel, 30, this.z, i, false);
        dclw.k(parcel, 31, this.A, i, false);
        dclw.d(parcel, 32, this.B);
        dclw.c(parcel, iA);
    }

    public TokenResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, CaptchaChallenge captchaChallenge, List list, String str9, String str10, boolean z5, int i2, PostSignInData postSignInData, Account account, String str11, TokenData tokenData, Bundle bundle, String str12, ResolutionData resolutionData, AuthzenBeginTxData authzenBeginTxData, boolean z6) {
        this.x = new Bundle();
        this.a = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = captchaChallenge;
        this.o = list == null ? new ArrayList() : list;
        this.p = str9;
        this.q = str10;
        this.r = z5;
        this.s = i2;
        this.t = postSignInData;
        this.v = str11;
        this.x = bundle;
        this.y = str12;
        this.z = resolutionData;
        this.A = authzenBeginTxData;
        this.B = z6;
        if (account != null) {
            a(account);
        } else if (TextUtils.isEmpty(str)) {
            this.b = null;
            this.u = null;
        } else {
            a(new Account(str, "com.google"));
        }
        if (str3 != null && tokenData == null) {
            b(TextUtils.isEmpty(str3) ? null : new TokenData(1, str3, null, false, false, null, null));
        } else {
            b(tokenData);
        }
    }
}
