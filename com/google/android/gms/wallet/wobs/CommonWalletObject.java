package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.demr;
import defpackage.dems;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new dems();
    public String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;

    @Deprecated
    String h;
    int i;
    final ArrayList j;
    TimeInterval k;
    final ArrayList l;

    @Deprecated
    String m;

    @Deprecated
    String n;
    final ArrayList o;
    boolean p;
    final ArrayList q;
    final ArrayList r;
    final ArrayList s;

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = i;
        this.j = arrayList;
        this.k = timeInterval;
        this.l = arrayList2;
        this.m = str9;
        this.n = str10;
        this.o = arrayList3;
        this.p = z;
        this.q = arrayList4;
        this.r = arrayList5;
        this.s = arrayList6;
    }

    public static demr a() {
        return new demr(new CommonWalletObject());
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
        dclw.i(parcel, 10, this.i);
        dclw.n(parcel, 11, this.j, false);
        dclw.k(parcel, 12, this.k, i, false);
        dclw.n(parcel, 13, this.l, false);
        dclw.m(parcel, 14, this.m, false);
        dclw.m(parcel, 15, this.n, false);
        dclw.n(parcel, 16, this.o, false);
        dclw.d(parcel, 17, this.p);
        dclw.n(parcel, 18, this.q, false);
        dclw.n(parcel, 19, this.r, false);
        dclw.n(parcel, 20, this.s, false);
        dclw.c(parcel, iA);
    }

    public CommonWalletObject() {
        this.j = new ArrayList();
        this.l = new ArrayList();
        this.o = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
    }
}
