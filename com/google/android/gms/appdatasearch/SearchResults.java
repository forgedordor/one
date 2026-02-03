package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbje;
import defpackage.dbjf;
import defpackage.dbjg;
import defpackage.dclw;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SearchResults extends AbstractSafeParcelable implements Iterable<dbje> {
    public static final Parcelable.Creator<SearchResults> CREATOR = new dbjg();
    final String a;
    public final int[] b;
    public final byte[] c;
    final Bundle[] d;
    public final Bundle[] e;
    public final Bundle[] f;
    public final int g;
    public final int[] h;
    public final String[] i;
    final byte[] j;
    final double[] k;
    final Bundle l;
    final int m;
    final long[] n;
    final long[] o;
    final Bundle[] p;
    final int[] q;
    final byte[] r;
    final boolean s;

    public SearchResults(String str, int[] iArr, byte[] bArr, Bundle[] bundleArr, Bundle[] bundleArr2, Bundle[] bundleArr3, int i, int[] iArr2, String[] strArr, byte[] bArr2, double[] dArr, Bundle bundle, int i2, long[] jArr, long[] jArr2, Bundle[] bundleArr4, int[] iArr3, byte[] bArr3, boolean z) {
        this.a = str;
        this.b = iArr;
        this.c = bArr;
        this.d = bundleArr;
        this.e = bundleArr2;
        this.f = bundleArr3;
        this.g = i;
        this.h = iArr2;
        this.i = strArr;
        this.j = bArr2;
        this.k = dArr;
        this.l = bundle;
        this.m = i2;
        this.n = jArr;
        this.o = jArr2;
        this.p = bundleArr4;
        this.q = iArr3;
        this.r = bArr3;
        this.s = z;
    }

    public final boolean a() {
        return this.a != null;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<dbje> iterator() {
        return new dbjf(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.v(parcel, 2, this.b);
        dclw.f(parcel, 3, this.c, false);
        dclw.E(parcel, 4, this.d, i);
        dclw.E(parcel, 5, this.e, i);
        dclw.E(parcel, 6, this.f, i);
        dclw.i(parcel, 7, this.g);
        dclw.v(parcel, 8, this.h);
        dclw.C(parcel, 9, this.i);
        dclw.f(parcel, 10, this.j, false);
        double[] dArr = this.k;
        if (dArr != null) {
            int iB = dclw.b(parcel, 11);
            parcel.writeDoubleArray(dArr);
            dclw.c(parcel, iB);
        }
        dclw.p(parcel, 12, this.l);
        dclw.i(parcel, 13, this.m);
        dclw.y(parcel, 14, this.n);
        dclw.y(parcel, 15, this.o);
        dclw.E(parcel, 16, this.p, i);
        dclw.v(parcel, 17, this.q);
        dclw.f(parcel, 18, this.r, false);
        dclw.d(parcel, 19, this.s);
        dclw.c(parcel, iA);
    }
}
