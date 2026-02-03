package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqq extends hnb {
    public static final fduf a = fdvf.a(hwo.a);
    private static final AtomicReference s = new AtomicReference(false);
    public long b;
    public final hma c;
    public final Object d;
    public fdlr e;
    public Throwable f;
    public cva g;
    public final hum h;
    public final List i;
    public final cuz j;
    public final hoz k;
    public final cuz l;
    public final cuz m;
    public Set n;
    public fdis o;
    public boolean p;
    public final fduf q;
    public final hqi r;
    private final List t;
    private List u;
    private final List v;
    private List w;
    private hqh x;
    private final fcyh y;
    private final fdlt z;

    public hqq(fcyh fcyhVar) {
        hma hmaVar = new hma(new fdae() { // from class: hqc
            @Override // defpackage.fdae
            public final Object invoke() {
                fdis fdisVarV;
                hqq hqqVar = this.a;
                synchronized (hqqVar.d) {
                    fdisVarV = hqqVar.v();
                    if (((hqj) hqqVar.q.c()).compareTo(hqj.b) <= 0) {
                        throw fdle.a("Recomposer shutdown; frame clock awaiter will never resume", hqqVar.f);
                    }
                }
                if (fdisVarV != null) {
                    fdisVarV.w(fctx.a);
                }
                return fctx.a;
            }
        });
        this.c = hmaVar;
        this.d = new Object();
        this.t = new ArrayList();
        byte[] bArr = null;
        this.g = new cva(bArr);
        this.h = new hum(new hnq[16]);
        this.v = new ArrayList();
        this.i = new ArrayList();
        this.j = new cuz(bArr);
        this.k = new hoz();
        long[] jArr = cvp.a;
        this.l = new cuz(bArr);
        this.m = new cuz(bArr);
        this.q = fdvf.a(hqj.c);
        new hxn();
        fdlt fdltVar = new fdlt((fdlr) fcyhVar.get(fdlr.c));
        fdltVar.hK(new fdap() { // from class: hqd
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                final Throwable th = (Throwable) obj;
                CancellationException cancellationExceptionA = fdle.a("Recomposer effect job completed", th);
                final hqq hqqVar = this.a;
                synchronized (hqqVar.d) {
                    fdlr fdlrVar = hqqVar.e;
                    if (fdlrVar != null) {
                        hqqVar.q.f(hqj.b);
                        fdlrVar.t(cancellationExceptionA);
                        hqqVar.o = null;
                        fdlrVar.hK(new fdap() { // from class: hqa
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj2) {
                                Throwable th2 = (Throwable) obj2;
                                hqq hqqVar2 = hqqVar;
                                Object obj3 = hqqVar2.d;
                                Throwable th3 = th;
                                synchronized (obj3) {
                                    if (th3 != null) {
                                        if (th2 != null) {
                                            if (true == (th2 instanceof CancellationException)) {
                                                th2 = null;
                                            }
                                            if (th2 != null) {
                                                fcsw.a(th3, th2);
                                            }
                                        }
                                    }
                                    th3 = null;
                                    hqqVar2.f = th3;
                                    hqqVar2.q.f(hqj.a);
                                }
                                return fctx.a;
                            }
                        });
                    } else {
                        hqqVar.f = cancellationExceptionA;
                        hqqVar.q.f(hqj.a);
                    }
                }
                return fctx.a;
            }
        });
        this.z = fdltVar;
        this.y = fcyhVar.plus(hmaVar).plus(fdltVar);
        this.r = new hqi();
    }

    public static final void D(hza hzaVar) {
        try {
            if (hzaVar.c() instanceof hzh) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            hzaVar.d();
        }
    }

    private static final void F(hqq hqqVar, how howVar, how howVar2) {
        List list = howVar2.g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                how howVar3 = (how) list.get(i);
                hoz hozVar = hqqVar.k;
                hot hotVar = howVar3.a;
                hpa hpaVar = new hpa(howVar3, howVar);
                hui.b(hozVar.a, hotVar, hpaVar);
                hui.b(hozVar.b, hpaVar.b, hotVar);
                F(hqqVar, howVar, howVar3);
            }
        }
    }

    private static final void G(List list, hqq hqqVar, hnq hnqVar) {
        list.clear();
        synchronized (hqqVar.d) {
            Iterator it = hqqVar.i.iterator();
            while (it.hasNext()) {
                how howVar = (how) it.next();
                if (fdbq.f(howVar.c, hnqVar)) {
                    list.add(howVar);
                    it.remove();
                }
            }
        }
    }

    private final void H(hnq hnqVar) {
        if (this.t.remove(hnqVar)) {
            this.u = null;
        }
    }

    private final boolean I() {
        return this.h.b != 0 || z() || this.j.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Throwable th, hnq hnqVar) throws Throwable {
        if (!((Boolean) s.get()).booleanValue() || (th instanceof hmi)) {
            synchronized (this.d) {
                hqh hqhVar = this.x;
                if (hqhVar != null) {
                    throw hqhVar.a;
                }
                this.x = new hqh(th);
            }
            throw th;
        }
        synchronized (this.d) {
            Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
            this.v.clear();
            this.h.g();
            this.g = new cva((byte[]) null);
            this.i.clear();
            this.j.d();
            this.l.d();
            this.x = new hqh(th);
            if (hnqVar != null) {
                y(hnqVar);
            }
            v();
        }
    }

    public final boolean A() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.g.l() && this.h.b == 0) {
                if (!z()) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final boolean B() {
        List listG;
        boolean zI;
        synchronized (this.d) {
            if (this.g.k()) {
                return I();
            }
            hup hupVar = new hup(this.g);
            byte[] bArr = null;
            this.g = new cva(bArr);
            synchronized (this.d) {
                listG = g();
            }
            try {
                int size = listG.size();
                for (int i = 0; i < size; i++) {
                    ((hnq) listG.get(i)).r(hupVar);
                    if (((hqj) this.q.c()).compareTo(hqj.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.d) {
                    this.g = new cva(bArr);
                }
                synchronized (this.d) {
                    if (v() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zI = I();
                }
                return zI;
            } catch (Throwable th) {
                synchronized (this.d) {
                    this.g.h(hupVar);
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.hnb
    public final long a() {
        return 1000L;
    }

    @Override // defpackage.hnb
    public final hna b() {
        return null;
    }

    @Override // defpackage.hnb
    public final hov c(how howVar) {
        hov hovVar;
        synchronized (this.d) {
            hovVar = (hov) this.l.b(howVar);
        }
        return hovVar;
    }

    @Override // defpackage.hnb
    public final fcyh d() {
        return this.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hnb
    public final void e(hnq hnqVar, fdat fdatVar) throws Throwable {
        boolean zT = hnqVar.t();
        try {
            iwm iwmVar = null;
            Object[] objArr = 0;
            hza hzaVarG = hzf.g(new hqb(hnqVar), new hqe(hnqVar, 0 == true ? 1 : 0));
            try {
                hzg hzgVarW = hzaVarG.w();
                try {
                    synchronized (((hne) hnqVar).b) {
                        ((hne) hnqVar).n();
                        cuz cuzVarF = ((hne) hnqVar).f();
                        try {
                            hne.w();
                            hmw hmwVar = ((hne) hnqVar).k;
                            if (!hmwVar.d.d()) {
                                hmz.j("Expected applyChanges() to have been called");
                            }
                            try {
                                hmwVar.Z(cuzVarF, fdatVar);
                            } finally {
                                hmwVar.C = null;
                            }
                        } catch (Throwable th) {
                            ((hne) hnqVar).g = cuzVarF;
                            throw th;
                        }
                    }
                    if (!zT) {
                        hzf.c();
                    }
                    synchronized (this.d) {
                        if (((hqj) this.q.c()).compareTo(hqj.b) > 0 && !g().contains(hnqVar)) {
                            this.t.add(hnqVar);
                            this.u = null;
                        }
                    }
                    try {
                        synchronized (this.d) {
                            List list = this.i;
                            int size = list.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    break;
                                }
                                if (fdbq.f(((how) list.get(i)).c, hnqVar)) {
                                    ArrayList arrayList = new ArrayList();
                                    G(arrayList, this, hnqVar);
                                    while (!arrayList.isEmpty()) {
                                        u(arrayList, null);
                                        G(arrayList, this, hnqVar);
                                    }
                                } else {
                                    i++;
                                }
                            }
                        }
                        try {
                            hnqVar.i();
                            hnqVar.j();
                            if (zT) {
                                return;
                            }
                            hzf.c();
                        } catch (Throwable th2) {
                            J(th2, null);
                        }
                    } catch (Throwable th3) {
                        J(th3, hnqVar);
                    }
                } catch (Throwable th4) {
                    try {
                        Set set = ((hne) hnqVar).c;
                        if (!set.isEmpty()) {
                            hxl hxlVar = ((hne) hnqVar).j;
                            try {
                                hxlVar.g(set, ((hne) hnqVar).k.Q());
                                hxlVar.d();
                                hxlVar.c();
                            } catch (Throwable th5) {
                                hxlVar.c();
                                throw th5;
                            }
                        }
                        throw th4;
                    } finally {
                    }
                }
            } finally {
                D(hzaVarG);
            }
        } catch (Throwable th6) {
            J(th6, hnqVar);
        }
    }

    @Override // defpackage.hnb
    public final void f(how howVar) {
        fdis fdisVarV;
        synchronized (this.d) {
            hui.b(this.j, howVar.a, howVar);
            if (howVar.g != null) {
                F(this, howVar, howVar);
            }
            fdisVarV = v();
        }
        if (fdisVarV != null) {
            fdisVarV.w(fctx.a);
        }
    }

    public final List g() {
        List arrayList = this.u;
        if (arrayList == null) {
            List list = this.t;
            arrayList = list.isEmpty() ? fcvo.a : new ArrayList(list);
            this.u = arrayList;
        }
        return arrayList;
    }

    @Override // defpackage.hnb
    public final void i(hnq hnqVar) {
        fdis fdisVarV;
        synchronized (this.d) {
            hum humVar = this.h;
            if (humVar.l(hnqVar)) {
                fdisVarV = null;
            } else {
                humVar.n(hnqVar);
                fdisVarV = v();
            }
        }
        if (fdisVarV != null) {
            fdisVarV.w(fctx.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0181  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Comparable] */
    @Override // defpackage.hnb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.how r19, final defpackage.hov r20, defpackage.hlw r21) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqq.j(how, hov, hlw):void");
    }

    @Override // defpackage.hnb
    public final void m(hnq hnqVar) {
        synchronized (this.d) {
            Set linkedHashSet = this.n;
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                this.n = linkedHashSet;
            }
            linkedHashSet.add(hnqVar);
        }
    }

    @Override // defpackage.hnb
    public final void p(hnq hnqVar) {
        synchronized (this.d) {
            H(hnqVar);
            this.h.m(hnqVar);
            this.v.remove(hnqVar);
        }
    }

    @Override // defpackage.hnb
    public final boolean q() {
        return ((Boolean) s.get()).booleanValue();
    }

    @Override // defpackage.hnb
    public final boolean r() {
        return false;
    }

    @Override // defpackage.hnb
    public final boolean s() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0186, code lost:
    
        r0 = r10.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018b, code lost:
    
        if (r2 >= r0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0195, code lost:
    
        if (((defpackage.fcti) r10.get(r2)).b == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0197, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019a, code lost:
    
        r0 = new java.util.ArrayList(r10.size());
        r2 = r10.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a8, code lost:
    
        if (r3 >= r2) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01aa, code lost:
    
        r4 = (defpackage.fcti) r10.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b2, code lost:
    
        if (r4.b != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b4, code lost:
    
        r4 = (defpackage.how) r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b9, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ba, code lost:
    
        if (r4 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01bc, code lost:
    
        r0.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01bf, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c2, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c3, code lost:
    
        defpackage.fcva.y(r21.i, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c8, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c9, code lost:
    
        r0 = new java.util.ArrayList(r10.size());
        r2 = r10.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d7, code lost:
    
        if (r3 >= r2) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d9, code lost:
    
        r4 = r10.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e2, code lost:
    
        if (((defpackage.fcti) r4).b == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e4, code lost:
    
        r0.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e7, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ea, code lost:
    
        r10 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List u(java.util.List r22, defpackage.cva r23) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqq.u(java.util.List, cva):java.util.List");
    }

    public final fdis v() {
        hqj hqjVar;
        fduf fdufVar = this.q;
        byte[] bArr = null;
        if (((hqj) fdufVar.c()).compareTo(hqj.b) <= 0) {
            this.t.clear();
            this.u = fcvo.a;
            this.g = new cva(bArr);
            this.h.g();
            this.v.clear();
            this.i.clear();
            this.w = null;
            fdis fdisVar = this.o;
            if (fdisVar != null) {
                fdisVar.h(null);
            }
            this.o = null;
            this.x = null;
            return null;
        }
        if (this.x != null) {
            hqjVar = hqj.c;
        } else if (this.e == null) {
            this.g = new cva(bArr);
            this.h.g();
            hqjVar = z() ? hqj.d : hqj.c;
        } else {
            hqjVar = (this.h.b == 0 && !this.g.l() && this.v.isEmpty() && this.i.isEmpty() && !z() && !this.j.k()) ? hqj.e : hqj.f;
        }
        fdufVar.f(hqjVar);
        if (hqjVar != hqj.f) {
            return null;
        }
        fdis fdisVar2 = this.o;
        this.o = null;
        return fdisVar2;
    }

    public final void w() {
        synchronized (this.d) {
            fduf fdufVar = this.q;
            if (((hqj) fdufVar.c()).compareTo(hqj.e) >= 0) {
                fdufVar.f(hqj.b);
            }
        }
        this.z.t(null);
    }

    public final void x() {
        synchronized (this.d) {
            this.p = true;
        }
    }

    public final void y(hnq hnqVar) {
        List arrayList = this.w;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.w = arrayList;
        }
        if (!arrayList.contains(hnqVar)) {
            arrayList.add(hnqVar);
        }
        H(hnqVar);
    }

    public final boolean z() {
        return !this.p && (this.c.b.get() & 134217727) > 0;
    }

    @Override // defpackage.hnb
    public final void k(Set set) {
    }
}
