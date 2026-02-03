package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.ddyk;
import defpackage.ddyl;
import defpackage.ddzo;
import defpackage.ekpg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ExperimentTokens extends AbstractSafeParcelable {
    public final String b;
    public final byte[] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final byte[][] g;
    public final int[] h;
    public final byte[][] i;
    public final int[] j;
    public final byte[][] k;
    public static final byte[][] a = new byte[0][];
    public static final Parcelable.Creator<ExperimentTokens> CREATOR = new ddyl();

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
        this.g = bArr5;
        this.h = iArr;
        this.i = bArr6;
        this.j = iArr2;
        this.k = bArr7;
    }

    public static byte[][] a(List list, ddyk ddykVar) {
        byte[][] bArrA;
        byte[][] bArrA2;
        Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            ExperimentTokens experimentTokens = (ExperimentTokens) it.next();
            if (experimentTokens != null && (bArrA2 = ddykVar.a(experimentTokens)) != null) {
                length += bArrA2.length;
            }
        }
        byte[][] bArr = new byte[length][];
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ExperimentTokens experimentTokens2 = (ExperimentTokens) it2.next();
            if (experimentTokens2 != null && (bArrA = ddykVar.a(experimentTokens2)) != null) {
                for (byte[] bArr2 : bArrA) {
                    if (bArr2 != null) {
                        bArr[i] = bArr2;
                        i++;
                    }
                }
            }
        }
        return bArr;
    }

    private static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new GenericDimension(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private final Set c() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.i;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return e((byte[][]) arrayList.toArray(new byte[0][]));
    }

    private static Set d(int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetG = ekpg.g(length);
        for (int i : iArr) {
            hashSetG.add(Integer.valueOf(i));
        }
        return hashSetG;
    }

    private static Set e(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetG = ekpg.g(length);
        for (byte[] bArr2 : bArr) {
            dclh.m(bArr2);
            hashSetG.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetG;
    }

    private static void f(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            dclh.m(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (ddzo.a(this.b, experimentTokens.b) && ddzo.a(c(), experimentTokens.c()) && ddzo.a(e(this.d), e(experimentTokens.d)) && ddzo.a(e(this.e), e(experimentTokens.e)) && ddzo.a(e(this.f), e(experimentTokens.f)) && ddzo.a(e(this.g), e(experimentTokens.g)) && ddzo.a(d(this.h), d(experimentTokens.h)) && ddzo.a(b(this.j), b(experimentTokens.j)) && ddzo.a(e(this.k), e(experimentTokens.k))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.b;
        sb.append(str == null ? "null" : a.a(str, "'", "'"));
        byte[] bArr = this.c;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        f(sb, "GAIA=", this.d);
        sb.append(", ");
        f(sb, "PSEUDO=", this.e);
        sb.append(", ");
        f(sb, "ALWAYS=", this.f);
        sb.append(", ");
        f(sb, "OTHER=", this.g);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.h));
        sb.append(", ");
        f(sb, "directs=", this.i);
        sb.append(", genDims=");
        sb.append(Arrays.toString(b(this.j).toArray()));
        sb.append(", ");
        f(sb, "external=", this.k);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.f(parcel, 3, this.c, false);
        dclw.q(parcel, 4, this.d);
        dclw.q(parcel, 5, this.e);
        dclw.q(parcel, 6, this.f);
        dclw.q(parcel, 7, this.g);
        dclw.v(parcel, 8, this.h);
        dclw.q(parcel, 9, this.i);
        dclw.v(parcel, 10, this.j);
        dclw.q(parcel, 11, this.k);
        dclw.c(parcel, iA);
    }
}
