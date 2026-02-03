package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lnw implements lnh {
    public static final lnv a = new lnp();
    public static final lnv b = new lnq();
    public static final lnv c = new lnr();
    public static final lnv d = new lns();
    public static final lnv e = new lnt();
    public static final lnv f = new lnn();
    public float g;
    float h;
    boolean i;
    final Object j;
    final lnx k;
    public boolean l;
    public float m;
    public float n;
    public float o;
    public final ArrayList p;
    public final ArrayList q;
    private long r;

    public lnw(lny lnyVar) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.m = Float.MAX_VALUE;
        this.n = -3.4028235E38f;
        this.r = 0L;
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.j = null;
        this.k = new lno(lnyVar);
        this.o = 1.0f;
    }

    private static void e(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // defpackage.lnh
    public final void a(long j) {
        long j2 = this.r;
        if (j2 == 0) {
            this.r = j;
            b(this.h);
            return;
        }
        long j3 = j - j2;
        this.r = j;
        float f2 = lnm.a().f;
        boolean zC = c(f2 == 0.0f ? 2147483647L : (long) (j3 / f2));
        float fMin = Math.min(this.h, this.m);
        this.h = fMin;
        float fMax = Math.max(fMin, this.n);
        this.h = fMax;
        b(fMax);
        if (!zC) {
            return;
        }
        this.l = false;
        lnm lnmVarA = lnm.a();
        lnmVarA.a.remove(this);
        ArrayList arrayList = lnmVarA.b;
        int iIndexOf = arrayList.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
            lnmVarA.e = true;
        }
        this.r = 0L;
        this.i = false;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.p;
            if (i >= arrayList2.size()) {
                e(arrayList2);
                return;
            }
            if (arrayList2.get(i) != null) {
                pmn pmnVar = (pmn) arrayList2.get(i);
                float f3 = this.h;
                pmo pmoVar = pmnVar.a;
                if (f3 < 1.0f) {
                    long jH = pmoVar.h();
                    pmx pmxVar = pmoVar.h;
                    pmx pmxVarG = ((pnf) pmxVar).g(0);
                    pmx pmxVar2 = pmxVarG.o;
                    pmxVarG.o = null;
                    pmxVar.y(-1L, pmoVar.a);
                    pmxVar.y(jH, -1L);
                    pmoVar.a = jH;
                    Runnable runnable = pmoVar.g;
                    if (runnable != null) {
                        runnable.run();
                    }
                    pmxVar.p.clear();
                    if (pmxVar2 != null) {
                        pmxVar2.t(pmxVar2, pmw.b, true);
                    }
                } else {
                    pmx pmxVar3 = pmoVar.h;
                    pmxVar3.t(pmxVar3, pmw.b, false);
                }
            }
            i++;
        }
    }

    final void b(float f2) {
        this.k.b(this.j, f2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.q;
            if (i >= arrayList.size()) {
                e(arrayList);
                return;
            } else {
                if (arrayList.get(i) != null) {
                    ((pmo) arrayList.get(i)).k(this.h);
                }
                i++;
            }
        }
    }

    public abstract boolean c(long j);

    public final void d(float f2) {
        this.h = f2;
        this.i = true;
    }

    public lnw(Object obj, lnx lnxVar) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.m = Float.MAX_VALUE;
        this.n = -3.4028235E38f;
        this.r = 0L;
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.j = obj;
        this.k = lnxVar;
        float f2 = 0.1f;
        if (lnxVar != c && lnxVar != d && lnxVar != e) {
            if (lnxVar == f) {
                f2 = 0.00390625f;
            } else {
                f2 = 0.002f;
                if (lnxVar != a && lnxVar != b) {
                    f2 = 1.0f;
                }
            }
        }
        this.o = f2;
    }
}
