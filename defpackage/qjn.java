package defpackage;

import android.util.Log;
import androidx.work.OverwritingInputMerger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjn {
    public static final String a = qas.d("WorkSpec");
    public static final akv b = new akv() { // from class: qji
        @Override // defpackage.akv
        public final Object a(Object obj) {
            int i;
            pzj pzjVar;
            qbn qbnVar;
            Iterator it;
            long j;
            long jA;
            boolean z;
            boolean z2;
            List list = (List) obj;
            String str = qjn.a;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                qjm qjmVar = (qjm) it2.next();
                List list2 = qjmVar.q;
                pzs pzsVar = !list2.isEmpty() ? (pzs) list2.get(0) : pzs.a;
                UUID uuidFromString = UUID.fromString(qjmVar.a);
                uuidFromString.getClass();
                qbo qboVar = qjmVar.b;
                HashSet hashSet = new HashSet(qjmVar.p);
                pzs pzsVar2 = qjmVar.c;
                int i2 = qjmVar.h;
                int i3 = qjmVar.m;
                pzj pzjVar2 = qjmVar.g;
                long j2 = qjmVar.d;
                ArrayList arrayList2 = arrayList;
                long j3 = qjmVar.e;
                boolean z3 = j3 == 0;
                if (j3 != 0) {
                    i = i3;
                    pzjVar = pzjVar2;
                    qbnVar = new qbn(j3, qjmVar.f);
                } else {
                    i = i3;
                    pzjVar = pzjVar2;
                    qbnVar = null;
                }
                qbo qboVar2 = qbo.a;
                if (qboVar == qboVar2) {
                    if (qboVar != qboVar2 || i2 <= 0) {
                        z = true;
                        z2 = false;
                    } else {
                        z = true;
                        z2 = true;
                    }
                    j = j2;
                    it = it2;
                    jA = qjj.a(z2, i2, qjmVar.i, qjmVar.j, qjmVar.k, qjmVar.l, !z3, j, qjmVar.f, j3, qjmVar.n);
                } else {
                    it = it2;
                    j = j2;
                    jA = Long.MAX_VALUE;
                }
                arrayList2.add(new qbp(uuidFromString, qboVar, hashSet, pzsVar2, pzsVar, i2, i, pzjVar, j, qbnVar, jA, qjmVar.o));
                arrayList = arrayList2;
                it2 = it;
            }
            return arrayList;
        }
    };
    public Boolean A;
    public final String c;
    public qbo d;
    public String e;
    public String f;
    public pzs g;
    public pzs h;
    public long i;
    public long j;
    public long k;
    public pzj l;
    public int m;
    public pza n;
    public long o;
    public long p;
    public long q;
    public long r;
    public boolean s;
    public qbf t;
    public int u;
    public final int v;
    public long w;
    public int x;
    public final int y;
    public String z;

    public qjn(String str, qbo qboVar, String str2, String str3, pzs pzsVar, pzs pzsVar2, long j, long j2, long j3, pzj pzjVar, int i, pza pzaVar, long j4, long j5, long j6, long j7, boolean z, qbf qbfVar, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        qboVar.getClass();
        str2.getClass();
        str3.getClass();
        pzsVar.getClass();
        pzsVar2.getClass();
        pzjVar.getClass();
        pzaVar.getClass();
        qbfVar.getClass();
        this.c = str;
        this.d = qboVar;
        this.e = str2;
        this.f = str3;
        this.g = pzsVar;
        this.h = pzsVar2;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = pzjVar;
        this.m = i;
        this.n = pzaVar;
        this.o = j4;
        this.p = j5;
        this.q = j6;
        this.r = j7;
        this.s = z;
        this.t = qbfVar;
        this.u = i2;
        this.v = i3;
        this.w = j8;
        this.x = i4;
        this.y = i5;
        this.z = str4;
        this.A = bool;
    }

    public static /* synthetic */ qjn g(qjn qjnVar, String str, qbo qboVar, String str2, pzs pzsVar, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str3;
        long j3;
        String str4 = (i5 & 1) != 0 ? qjnVar.c : str;
        qbo qboVar2 = (i5 & 2) != 0 ? qjnVar.d : qboVar;
        String str5 = (i5 & 4) != 0 ? qjnVar.e : str2;
        String str6 = (i5 & 8) != 0 ? qjnVar.f : null;
        pzs pzsVar2 = (i5 & 16) != 0 ? qjnVar.g : pzsVar;
        pzs pzsVar3 = (i5 & 32) != 0 ? qjnVar.h : null;
        long j4 = (i5 & 64) != 0 ? qjnVar.i : 0L;
        long j5 = (i5 & 128) != 0 ? qjnVar.j : 0L;
        if ((i5 & 256) != 0) {
            str3 = str4;
            j3 = qjnVar.k;
        } else {
            str3 = str4;
            j3 = 0;
        }
        pzj pzjVar = (i5 & 512) != 0 ? qjnVar.l : null;
        int i6 = (i5 & 1024) != 0 ? qjnVar.m : i;
        pza pzaVar = (i5 & 2048) != 0 ? qjnVar.n : null;
        long j6 = (i5 & 4096) != 0 ? qjnVar.o : 0L;
        long j7 = (i5 & 8192) != 0 ? qjnVar.p : j;
        long j8 = (i5 & 16384) != 0 ? qjnVar.q : 0L;
        long j9 = (32768 & i5) != 0 ? qjnVar.r : 0L;
        boolean z = (65536 & i5) != 0 ? qjnVar.s : false;
        qbf qbfVar = (131072 & i5) != 0 ? qjnVar.t : null;
        int i7 = (262144 & i5) != 0 ? qjnVar.u : i2;
        int i8 = (524288 & i5) != 0 ? qjnVar.v : i3;
        long j10 = (1048576 & i5) != 0 ? qjnVar.w : j2;
        int i9 = (i5 & 2097152) != 0 ? qjnVar.x : i4;
        int i10 = qjnVar.y;
        String str7 = qjnVar.z;
        Boolean bool = qjnVar.A;
        str3.getClass();
        qboVar2.getClass();
        str5.getClass();
        str6.getClass();
        pzsVar2.getClass();
        pzsVar3.getClass();
        pzjVar.getClass();
        pzaVar.getClass();
        qbfVar.getClass();
        return new qjn(str3, qboVar2, str5, str6, pzsVar2, pzsVar3, j4, j5, j3, pzjVar, i6, pzaVar, j6, j7, j8, j9, z, qbfVar, i7, i8, j10, i9, i10, str7, bool);
    }

    public final long a() {
        return qjj.a(e(), this.m, this.n, this.o, this.p, this.u, f(), this.i, this.k, this.j, this.w);
    }

    public final void b(long j) {
        if (j < 900000) {
            qas.c();
            Log.w(a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        c(fddu.j(j, 900000L), fddu.j(j, 900000L));
    }

    public final void c(long j, long j2) {
        if (j < 900000) {
            qas.c();
            Log.w(a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.j = fddu.j(j, 900000L);
        if (j2 < 300000) {
            qas.c();
            Log.w(a, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.j) {
            qas.c();
            Log.w(a, a.u(j, "Flex duration greater than interval duration; Changed to "));
        }
        this.k = fddu.m(j2, 300000L, this.j);
    }

    public final boolean d() {
        return !fdbq.f(pzj.a, this.l);
    }

    public final boolean e() {
        return this.d == qbo.a && this.m > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjn)) {
            return false;
        }
        qjn qjnVar = (qjn) obj;
        return fdbq.f(this.c, qjnVar.c) && this.d == qjnVar.d && fdbq.f(this.e, qjnVar.e) && fdbq.f(this.f, qjnVar.f) && fdbq.f(this.g, qjnVar.g) && fdbq.f(this.h, qjnVar.h) && this.i == qjnVar.i && this.j == qjnVar.j && this.k == qjnVar.k && fdbq.f(this.l, qjnVar.l) && this.m == qjnVar.m && this.n == qjnVar.n && this.o == qjnVar.o && this.p == qjnVar.p && this.q == qjnVar.q && this.r == qjnVar.r && this.s == qjnVar.s && this.t == qjnVar.t && this.u == qjnVar.u && this.v == qjnVar.v && this.w == qjnVar.w && this.x == qjnVar.x && this.y == qjnVar.y && fdbq.f(this.z, qjnVar.z) && fdbq.f(this.A, qjnVar.A);
    }

    public final boolean f() {
        return this.j != 0;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
        int iA = qjh.a(this.i);
        int iA2 = (((((((((((iHashCode * 31) + iA) * 31) + qjh.a(this.j)) * 31) + qjh.a(this.k)) * 31) + this.l.hashCode()) * 31) + this.m) * 31) + this.n.hashCode();
        int iA3 = qjh.a(this.o);
        int iA4 = qjh.a(this.p);
        int iA5 = qjh.a(this.q);
        int iA6 = (((((((((((((iA2 * 31) + iA3) * 31) + iA4) * 31) + iA5) * 31) + qjh.a(this.r)) * 31) + (true != this.s ? 1237 : 1231)) * 31) + this.t.hashCode()) * 31) + this.u;
        int iA7 = (((((iA6 * 31) + this.v) * 31) + qjh.a(this.w)) * 31) + this.x;
        String str = this.z;
        int iHashCode2 = ((((iA7 * 31) + this.y) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.A;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "{WorkSpec: " + this.c + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ qjn(String str, qbo qboVar, String str2, String str3, pzs pzsVar, pzs pzsVar2, long j, long j2, long j3, pzj pzjVar, int i, pza pzaVar, long j4, long j5, long j6, long j7, boolean z, qbf qbfVar, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        String str5;
        qbo qboVar2 = (i5 & 2) != 0 ? qbo.a : qboVar;
        if ((i5 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            name.getClass();
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, qboVar2, str2, str5, (i5 & 16) != 0 ? pzs.a : pzsVar, (i5 & 32) != 0 ? pzs.a : pzsVar2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? pzj.a : pzjVar, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? pza.a : pzaVar, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, ((65536 & i5) == 0) & z, (131072 & i5) != 0 ? qbf.a : qbfVar, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? false : bool);
    }
}
