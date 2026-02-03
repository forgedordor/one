package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbso;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GoogleAccountSetupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleAccountSetupRequest> CREATOR = new dbso();
    final int a;
    final Bundle b;
    boolean c;
    boolean d;
    boolean e;
    String f;
    String g;
    String h;
    String i;
    boolean j;
    boolean k;
    boolean l;
    String m;
    AppDescription n;
    AccountCredentials o;
    CaptchaSolution p;
    String q;
    String r;

    public GoogleAccountSetupRequest(int i, Bundle bundle, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, boolean z4, boolean z5, boolean z6, String str5, AppDescription appDescription, AccountCredentials accountCredentials, CaptchaSolution captchaSolution, String str6, String str7) {
        this.a = i;
        this.b = bundle;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = str5;
        this.n = appDescription;
        this.o = accountCredentials;
        this.p = captchaSolution;
        this.q = str6;
        this.r = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.p(parcel, 2, this.b);
        dclw.d(parcel, 3, this.c);
        dclw.d(parcel, 4, this.d);
        dclw.d(parcel, 5, this.e);
        dclw.m(parcel, 6, this.f, false);
        dclw.m(parcel, 7, this.g, false);
        dclw.m(parcel, 8, this.h, false);
        dclw.m(parcel, 9, this.i, false);
        dclw.d(parcel, 10, this.j);
        dclw.d(parcel, 11, this.k);
        dclw.d(parcel, 12, this.l);
        dclw.m(parcel, 13, this.m, false);
        dclw.k(parcel, 14, this.n, i, false);
        dclw.k(parcel, 15, this.o, i, false);
        dclw.k(parcel, 16, this.p, i, false);
        dclw.m(parcel, 17, this.q, false);
        dclw.m(parcel, 18, this.r, false);
        dclw.c(parcel, iA);
    }

    public GoogleAccountSetupRequest() {
        this.a = 1;
        this.b = new Bundle();
    }
}
