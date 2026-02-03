package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbiu;
import defpackage.dclw;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QuerySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QuerySpecification> CREATOR = new dbiu();
    public final boolean a;
    public final List b;
    public final List c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final int[] j;
    public final byte[] k;
    public final STSortSpec l;
    public final String m;
    public final CacheSpec n;

    public QuerySpecification(boolean z, List list, List list2, boolean z2, int i, int i2, boolean z3, int i3, boolean z4, int[] iArr, byte[] bArr, STSortSpec sTSortSpec, String str, CacheSpec cacheSpec) {
        this.a = z;
        this.b = list;
        this.c = list2;
        this.d = z2;
        this.e = i;
        this.f = i2;
        this.g = z3;
        this.h = i3;
        this.i = z4;
        this.j = iArr;
        this.k = bArr;
        this.l = sTSortSpec;
        this.m = str;
        this.n = cacheSpec;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, this.a);
        dclw.D(parcel, 2, this.b);
        dclw.n(parcel, 3, this.c, false);
        dclw.d(parcel, 4, this.d);
        dclw.i(parcel, 5, this.e);
        dclw.i(parcel, 6, this.f);
        dclw.d(parcel, 7, this.g);
        dclw.i(parcel, 8, this.h);
        dclw.d(parcel, 9, this.i);
        dclw.v(parcel, 10, this.j);
        dclw.f(parcel, 11, this.k, false);
        dclw.k(parcel, 12, this.l, i, false);
        dclw.m(parcel, 13, this.m, false);
        dclw.k(parcel, 15, this.n, i, false);
        dclw.c(parcel, iA);
    }
}
