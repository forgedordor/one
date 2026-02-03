package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbtr;
import defpackage.dclw;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ScopeDetail extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ScopeDetail> CREATOR = new dbtr();
    final int a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final List g;
    public final FACLData h;

    public ScopeDetail(int i, String str, String str2, String str3, String str4, String str5, List list, FACLData fACLData) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = list;
        this.h = fACLData;
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
        dclw.D(parcel, 7, this.g);
        dclw.k(parcel, 8, this.h, i, false);
        dclw.c(parcel, iA);
    }
}
