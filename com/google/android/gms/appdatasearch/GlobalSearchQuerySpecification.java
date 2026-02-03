package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbil;
import defpackage.dclc;
import defpackage.dclw;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GlobalSearchQuerySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalSearchQuerySpecification> CREATOR = new dbil();
    final CorpusId[] a;
    public final int b;
    final CorpusScoringInfo[] c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final byte[] i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int[] m;
    public final byte[] n;
    public final STSortSpec o;
    public final String p;
    public final CacheSpec q;
    private final transient Map r;
    private final transient Map s;

    public GlobalSearchQuerySpecification(CorpusId[] corpusIdArr, int i, CorpusScoringInfo[] corpusScoringInfoArr, int i2, int i3, int i4, String str, boolean z, byte[] bArr, boolean z2, boolean z3, boolean z4, int[] iArr, byte[] bArr2, STSortSpec sTSortSpec, String str2, CacheSpec cacheSpec) {
        int length;
        this.a = corpusIdArr;
        this.b = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = str;
        this.h = z;
        this.i = bArr;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = iArr;
        this.n = bArr2;
        this.o = sTSortSpec;
        this.p = str2;
        this.q = cacheSpec;
        this.c = corpusScoringInfoArr;
        if (corpusIdArr == null || corpusIdArr.length == 0) {
            this.r = null;
        } else {
            this.r = new HashMap();
            for (int i5 = 0; i5 < corpusIdArr.length; i5++) {
                Set hashSet = (Set) this.r.get(corpusIdArr[i5].a);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    this.r.put(corpusIdArr[i5].a, hashSet);
                }
                String str3 = corpusIdArr[i5].b;
                if (str3 != null) {
                    hashSet.add(str3);
                }
            }
        }
        if (corpusScoringInfoArr == null || (length = corpusScoringInfoArr.length) == 0) {
            this.s = null;
            return;
        }
        this.s = new HashMap(length);
        for (CorpusScoringInfo corpusScoringInfo : corpusScoringInfoArr) {
            this.s.put(corpusScoringInfo.a, corpusScoringInfo);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GlobalSearchQuerySpecification) {
            GlobalSearchQuerySpecification globalSearchQuerySpecification = (GlobalSearchQuerySpecification) obj;
            if (dclc.a(Integer.valueOf(this.b), Integer.valueOf(globalSearchQuerySpecification.b)) && dclc.a(Integer.valueOf(this.d), Integer.valueOf(globalSearchQuerySpecification.d)) && dclc.a(Integer.valueOf(this.e), Integer.valueOf(globalSearchQuerySpecification.e)) && dclc.a(Integer.valueOf(this.f), Integer.valueOf(globalSearchQuerySpecification.f)) && dclc.a(this.g, globalSearchQuerySpecification.g) && dclc.a(Boolean.valueOf(this.h), Boolean.valueOf(globalSearchQuerySpecification.h)) && dclc.a(Boolean.valueOf(this.j), Boolean.valueOf(globalSearchQuerySpecification.j)) && dclc.a(Boolean.valueOf(this.k), Boolean.valueOf(globalSearchQuerySpecification.k)) && dclc.a(Boolean.valueOf(this.l), Boolean.valueOf(globalSearchQuerySpecification.l)) && dclc.a(this.s, globalSearchQuerySpecification.s) && dclc.a(this.o, globalSearchQuerySpecification.o) && dclc.a(this.p, globalSearchQuerySpecification.p) && Arrays.equals(this.a, globalSearchQuerySpecification.a) && Arrays.equals(this.i, globalSearchQuerySpecification.i) && Arrays.equals(this.c, globalSearchQuerySpecification.c) && Arrays.equals(this.m, globalSearchQuerySpecification.m) && Arrays.equals(this.n, globalSearchQuerySpecification.n) && dclc.a(this.q, globalSearchQuerySpecification.q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), this.s, this.o, this.p, Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.i)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.n)), this.q});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("mFilter: [");
        Map map = this.r;
        if (map != null) {
            for (String str : map.keySet()) {
                Iterator it = ((Set) map.get(str)).iterator();
                String str2 = "";
                while (it.hasNext()) {
                    str2 = str2 + ((String) it.next()) + ",";
                }
                sb.append("key:");
                sb.append(str);
                sb.append(", values:");
                sb.append(str2);
                sb.append("\n");
            }
        }
        sb.append("]\nmCorpusScoringInfoMap: [");
        Map map2 = this.s;
        if (map2 != null) {
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                sb.append(((CorpusId) it2.next()).toString().concat("\n"));
            }
        }
        sb.append("]\n");
        STSortSpec sTSortSpec = this.o;
        if (sTSortSpec != null) {
            sb.append("STSortSpec: ");
            sb.append(sTSortSpec.toString());
            sb.append("\n");
        }
        String str3 = this.p;
        if (str3 != null) {
            sb.append("Origin: ");
            sb.append(str3);
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.E(parcel, 1, this.a, i);
        dclw.i(parcel, 2, this.b);
        dclw.E(parcel, 3, this.c, i);
        dclw.i(parcel, 4, this.d);
        dclw.i(parcel, 5, this.e);
        dclw.i(parcel, 6, this.f);
        dclw.m(parcel, 7, this.g, false);
        dclw.d(parcel, 8, this.h);
        dclw.f(parcel, 9, this.i, false);
        dclw.d(parcel, 10, this.j);
        dclw.d(parcel, 11, this.k);
        dclw.d(parcel, 12, this.l);
        dclw.v(parcel, 13, this.m);
        dclw.f(parcel, 14, this.n, false);
        dclw.k(parcel, 15, this.o, i, false);
        dclw.m(parcel, 16, this.p, false);
        dclw.k(parcel, 18, this.q, i, false);
        dclw.c(parcel, iA);
    }
}
