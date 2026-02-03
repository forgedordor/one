package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import defpackage.dclw;
import defpackage.delc;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new delc();
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;

    @Deprecated
    String i;
    String j;
    int k;
    final ArrayList l;
    TimeInterval m;
    final ArrayList n;

    @Deprecated
    String o;

    @Deprecated
    String p;
    final ArrayList q;
    boolean r;
    final ArrayList s;
    final ArrayList t;
    final ArrayList u;
    LoyaltyPoints v;

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = i;
        this.l = arrayList;
        this.m = timeInterval;
        this.n = arrayList2;
        this.o = str11;
        this.p = str12;
        this.q = arrayList3;
        this.r = z;
        this.s = arrayList4;
        this.t = arrayList5;
        this.u = arrayList6;
        this.v = loyaltyPoints;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, this.a, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.m(parcel, 5, this.d, false);
        dclw.m(parcel, 6, this.e, false);
        dclw.m(parcel, 7, this.f, false);
        dclw.m(parcel, 8, this.g, false);
        dclw.m(parcel, 9, this.h, false);
        dclw.m(parcel, 10, this.i, false);
        dclw.m(parcel, 11, this.j, false);
        dclw.i(parcel, 12, this.k);
        dclw.n(parcel, 13, this.l, false);
        dclw.k(parcel, 14, this.m, i, false);
        dclw.n(parcel, 15, this.n, false);
        dclw.m(parcel, 16, this.o, false);
        dclw.m(parcel, 17, this.p, false);
        dclw.n(parcel, 18, this.q, false);
        dclw.d(parcel, 19, this.r);
        dclw.n(parcel, 20, this.s, false);
        dclw.n(parcel, 21, this.t, false);
        dclw.n(parcel, 22, this.u, false);
        dclw.k(parcel, 23, this.v, i, false);
        dclw.c(parcel, iA);
    }

    LoyaltyWalletObject() {
        this.l = new ArrayList();
        this.n = new ArrayList();
        this.q = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
    }
}
