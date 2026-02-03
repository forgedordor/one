package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dddx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new dddx();
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    String k;
    String l;
    boolean m;
    String n;
    String o;

    UserAddress() {
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
        dclw.m(parcel, 12, this.k, false);
        dclw.m(parcel, 13, this.l, false);
        dclw.d(parcel, 14, this.m);
        dclw.m(parcel, 15, this.n, false);
        dclw.m(parcel, 16, this.o, false);
        dclw.c(parcel, iA);
    }

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
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
        this.k = str11;
        this.l = str12;
        this.m = z;
        this.n = str13;
        this.o = str14;
    }
}
