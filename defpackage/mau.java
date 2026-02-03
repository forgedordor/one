package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mau {
    public static final /* synthetic */ int P = 0;
    public final int A;
    public final float B;
    public final byte[] C;
    public final int D;
    public final mag E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    private int Q;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final mbt l;
    public final Object m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final List r;
    public final mao s;
    public final long t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final float z;

    static {
        new mau(new mat());
        mgb.O(0);
        mgb.O(1);
        mgb.O(2);
        mgb.O(3);
        mgb.O(4);
        mgb.O(5);
        mgb.O(6);
        mgb.O(7);
        mgb.O(8);
        mgb.O(9);
        mgb.O(10);
        mgb.O(11);
        mgb.O(12);
        mgb.O(13);
        mgb.O(14);
        mgb.O(15);
        mgb.O(16);
        mgb.O(17);
        mgb.O(18);
        mgb.O(19);
        mgb.O(20);
        mgb.O(21);
        mgb.O(22);
        mgb.O(23);
        mgb.O(24);
        mgb.O(25);
        mgb.O(26);
        mgb.O(27);
        mgb.O(28);
        mgb.O(29);
        mgb.O(30);
        mgb.O(31);
        mgb.O(32);
        mgb.O(33);
        mgb.O(34);
        mgb.O(35);
        mgb.O(36);
    }

    public mau(mat matVar) {
        boolean z;
        String str;
        this.a = matVar.a;
        String strQ = mgb.Q(matVar.d);
        this.d = strQ;
        if (matVar.c.isEmpty() && matVar.b != null) {
            this.c = ekgb.r(new mbb(strQ, matVar.b));
            this.b = matVar.b;
        } else if (!matVar.c.isEmpty() && matVar.b == null) {
            this.c = matVar.c;
            List list = matVar.c;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((mbb) list.get(0)).b;
                    break;
                }
                mbb mbbVar = (mbb) it.next();
                if (TextUtils.equals(mbbVar.a, strQ)) {
                    str = mbbVar.b;
                    break;
                }
            }
            this.b = str;
        } else if (matVar.c.isEmpty() && matVar.b == null) {
            z = true;
            mee.c(z);
            this.c = matVar.c;
            this.b = matVar.b;
        } else {
            for (int i = 0; i < matVar.c.size(); i++) {
                if (((mbb) matVar.c.get(i)).b.equals(matVar.b)) {
                    z = true;
                    break;
                }
            }
            z = false;
            mee.c(z);
            this.c = matVar.c;
            this.b = matVar.b;
        }
        this.e = matVar.e;
        mee.d(matVar.g == 0 || (matVar.f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f = matVar.f;
        this.g = matVar.g;
        int i2 = matVar.h;
        this.h = i2;
        int i3 = matVar.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = matVar.j;
        this.l = matVar.k;
        this.m = null;
        this.n = matVar.l;
        this.o = matVar.m;
        this.p = matVar.n;
        this.q = matVar.o;
        List list2 = matVar.p;
        this.r = list2 == null ? Collections.EMPTY_LIST : list2;
        mao maoVar = matVar.q;
        this.s = maoVar;
        this.t = matVar.r;
        this.u = matVar.s;
        this.v = matVar.t;
        this.w = matVar.u;
        this.x = matVar.v;
        this.y = matVar.w;
        this.z = matVar.x;
        int i4 = matVar.y;
        this.A = i4 == -1 ? 0 : i4;
        float f = matVar.z;
        this.B = f == -1.0f ? 1.0f : f;
        this.C = matVar.A;
        this.D = matVar.B;
        this.E = matVar.C;
        this.F = matVar.D;
        this.G = matVar.E;
        this.H = matVar.F;
        this.I = matVar.G;
        int i5 = matVar.H;
        this.J = i5 == -1 ? 0 : i5;
        int i6 = matVar.I;
        this.K = i6 != -1 ? i6 : 0;
        this.L = matVar.J;
        this.M = matVar.K;
        this.N = -1;
        int i7 = matVar.L;
        this.O = (i7 != 0 || maoVar == null) ? i7 : 1;
    }

    public static String c(mau mauVar) {
        String str;
        int i;
        int i2;
        if (mauVar == null) {
            return "null";
        }
        ejwc ejwcVarD = ejwc.d(',');
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(mauVar.a);
        sb.append(", mimeType=");
        sb.append(mauVar.o);
        String str2 = mauVar.n;
        if (str2 != null) {
            sb.append(", container=");
            sb.append(str2);
        }
        int i3 = mauVar.j;
        if (i3 != -1) {
            sb.append(", bitrate=");
            sb.append(i3);
        }
        String str3 = mauVar.k;
        if (str3 != null) {
            sb.append(", codecs=");
            sb.append(str3);
        }
        mao maoVar = mauVar.s;
        if (maoVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i4 = 0; i4 < maoVar.b; i4++) {
                UUID uuid = maoVar.a(i4).a;
                if (uuid.equals(maf.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(maf.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(maf.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(maf.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(maf.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add(a.b(uuid, "unknown (", ")"));
                }
            }
            sb.append(", drm=[");
            ejwcVarD.i(sb, linkedHashSet);
            sb.append(']');
        }
        int i5 = mauVar.v;
        if (i5 != -1 && (i2 = mauVar.w) != -1) {
            sb.append(", res=");
            sb.append(i5);
            sb.append("x");
            sb.append(i2);
        }
        int i6 = mauVar.x;
        if (i6 != -1 && (i = mauVar.y) != -1) {
            sb.append(", decRes=");
            sb.append(i6);
            sb.append("x");
            sb.append(i);
        }
        float f = mauVar.B;
        if (!eolk.b(f, 1.0d, 0.001d)) {
            sb.append(", par=");
            sb.append(mgb.I("%.3f", Float.valueOf(f)));
        }
        mag magVar = mauVar.E;
        if (magVar != null && (magVar.f() || magVar.g())) {
            sb.append(", color=");
            String strI = magVar.g() ? mgb.I("%s/%s/%s", mag.d(magVar.c), mag.c(magVar.d), mag.e(magVar.e)) : "NA/NA/NA";
            sb.append(a.q(magVar.f() ? magVar.g + "/" + magVar.h : "NA/NA", strI, "/"));
        }
        float f2 = mauVar.z;
        if (f2 != -1.0f) {
            sb.append(", fps=");
            sb.append(f2);
        }
        int i7 = mauVar.F;
        if (i7 != -1) {
            sb.append(", maxSubLayers=");
            sb.append(i7);
        }
        int i8 = mauVar.G;
        if (i8 != -1) {
            sb.append(", channels=");
            sb.append(i8);
        }
        int i9 = mauVar.H;
        if (i9 != -1) {
            sb.append(", sample_rate=");
            sb.append(i9);
        }
        String str4 = mauVar.d;
        if (str4 != null) {
            sb.append(", language=");
            sb.append(str4);
        }
        List list = mauVar.c;
        if (!list.isEmpty()) {
            sb.append(", labels=[");
            ejwcVarD.i(sb, ekjz.g(list, new ejvr() { // from class: mas
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    mbb mbbVar = (mbb) obj;
                    int i10 = mau.P;
                    return mbbVar.a + ": " + mbbVar.b;
                }
            }));
            sb.append("]");
        }
        int i10 = mauVar.e;
        if (i10 != 0) {
            sb.append(", selectionFlags=[");
            String str5 = mgb.a;
            ArrayList arrayList = new ArrayList();
            if ((i10 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i10 & 2) != 0) {
                arrayList.add("forced");
            }
            ejwcVarD.i(sb, arrayList);
            sb.append("]");
        }
        int i11 = mauVar.f;
        if (i11 != 0) {
            sb.append(", roleFlags=[");
            int i12 = i11 & 32768;
            String str6 = mgb.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i11 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i11 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i11 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i11 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i11 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i11 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i11 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i11 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i11 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i11 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i11 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i11 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i11 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i11 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i11 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i12 != 0) {
                arrayList2.add("auxiliary");
            }
            ejwcVarD.i(sb, arrayList2);
            sb.append("]");
        }
        if ((i11 & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i13 = mauVar.g;
            String str7 = mgb.a;
            if (i13 == 0) {
                str = "undefined";
            } else if (i13 == 1) {
                str = "original";
            } else if (i13 == 2) {
                str = "depth-linear";
            } else if (i13 == 3) {
                str = "depth-inverse";
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final int a() {
        int i;
        int i2 = this.v;
        if (i2 == -1 || (i = this.w) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final mau b(int i) {
        mat matVar = new mat(this);
        matVar.L = i;
        return new mau(matVar);
    }

    public final boolean d(mau mauVar) {
        List list = this.r;
        int size = list.size();
        List list2 = mauVar.r;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mau mauVar = (mau) obj;
            int i2 = this.Q;
            if ((i2 == 0 || (i = mauVar.Q) == 0 || i2 == i) && this.e == mauVar.e && this.f == mauVar.f && this.g == mauVar.g && this.h == mauVar.h && this.i == mauVar.i && this.p == mauVar.p && this.t == mauVar.t && this.v == mauVar.v && this.w == mauVar.w && this.x == mauVar.x && this.y == mauVar.y && this.A == mauVar.A && this.D == mauVar.D && this.F == mauVar.F && this.G == mauVar.G && this.H == mauVar.H && this.I == mauVar.I && this.J == mauVar.J && this.K == mauVar.K && this.L == mauVar.L && this.O == mauVar.O && Float.compare(this.z, mauVar.z) == 0 && Float.compare(this.B, mauVar.B) == 0 && Objects.equals(this.a, mauVar.a) && Objects.equals(this.b, mauVar.b) && this.c.equals(mauVar.c) && Objects.equals(this.k, mauVar.k) && Objects.equals(this.n, mauVar.n) && Objects.equals(this.o, mauVar.o) && Objects.equals(this.d, mauVar.d) && Arrays.equals(this.C, mauVar.C) && Objects.equals(this.l, mauVar.l) && Objects.equals(this.E, mauVar.E) && Objects.equals(this.s, mauVar.s) && d(mauVar) && Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.Q;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c.hashCode();
        String str3 = this.d;
        int iHashCode3 = ((((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str4 = this.k;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        mbt mbtVar = this.l;
        int iHashCode5 = iHashCode4 + (mbtVar == null ? 0 : mbtVar.hashCode());
        String str5 = this.n;
        int iHashCode6 = ((iHashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        int iHashCode7 = ((((((((((((((((((((((((((((((((((((((((iHashCode6 + (this.o != null ? r2.hashCode() : 0)) * 31) + this.p) * 31) + ((int) this.t)) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + Float.floatToIntBits(this.z)) * 31) + this.A) * 31) + Float.floatToIntBits(this.B)) * 31) + this.D) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) - 1) * 31) - 1) * 31) + this.O;
        this.Q = iHashCode7;
        return iHashCode7;
    }

    public final String toString() {
        return "Format(" + this.a + ", " + this.b + ", " + this.n + ", " + this.o + ", " + this.k + ", " + this.j + ", " + this.d + ", [" + this.v + ", " + this.w + ", " + this.z + ", " + String.valueOf(this.E) + "], [" + this.G + ", " + this.H + "])";
    }
}
