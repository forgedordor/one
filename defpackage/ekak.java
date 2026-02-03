package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.concurrent.ConcurrentMap;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekak extends AbstractMap implements ConcurrentMap, j$.util.concurrent.ConcurrentMap {
    static final Logger a = Logger.getLogger(ekak.class.getName());
    static final ejzz b = new ejyr();
    static final Queue c = new ejys();
    public static final /* synthetic */ int x = 0;
    final int d;
    final int e;
    final ejzq[] f;
    final int g;
    final ejvp h;
    final ejvp i;
    final ejzs j;
    final ejzs k;
    final long l;
    final long m;
    final long n;
    final Queue o;
    final ejya p;
    final ejze q;
    final ejyn r;
    Set s;
    Collection t;
    Set u;
    final ejyj v;
    final ejyi w;

    /* JADX WARN: Type inference failed for: r1v0, types: [ekak, java.util.AbstractMap] */
    public ekak(ejyk ejykVar, ejyn ejynVar) {
        ?? abstractMap = new AbstractMap();
        int i = ejykVar.d;
        abstractMap.g = Math.min(i == -1 ? 4 : i, 65536);
        ejzs ejzsVarC = ejykVar.c();
        abstractMap.j = ejzsVarC;
        abstractMap.k = ejykVar.d();
        abstractMap.h = (ejvp) ejwg.c(ejykVar.k, ejykVar.c().a());
        abstractMap.i = (ejvp) ejwg.c(ejykVar.l, ejykVar.d().a());
        long j = (ejykVar.i == 0 || ejykVar.j == 0) ? 0L : ejykVar.o == null ? ejykVar.e : ejykVar.f;
        abstractMap.l = j;
        abstractMap.v = (ejyj) ejwg.c(ejykVar.o, ejyj.a);
        long j2 = ejykVar.j;
        abstractMap.m = j2 == -1 ? 0L : j2;
        long j3 = ejykVar.i;
        abstractMap.n = j3 != -1 ? j3 : 0L;
        ejyi ejyiVar = ejykVar.p;
        ejyi ejyiVar2 = ejyi.a;
        ejyi ejyiVar3 = (ejyi) ejwg.c(ejyiVar, ejyiVar2);
        abstractMap.w = ejyiVar3;
        abstractMap.o = ejyiVar3 == ejyiVar2 ? c : new ConcurrentLinkedQueue();
        int i2 = 0;
        int i3 = 1;
        boolean z = abstractMap.l() || abstractMap.i();
        ejya ejyaVar = ejykVar.m;
        abstractMap.p = ejyaVar == null ? z ? ejya.b : ejyk.b : ejyaVar;
        char c2 = (abstractMap.m() || abstractMap.i()) ? (char) 1 : (char) 0;
        boolean z2 = abstractMap.j() || abstractMap.l();
        ejze ejzeVar = ejze.a;
        abstractMap.q = ejze.i[(ejzsVarC != ejzs.WEAK ? (char) 0 : (char) 4) | c2 | (true != z2 ? 0 : 2)];
        abstractMap.r = ejynVar;
        int iMin = Math.min(16, 1073741824);
        if (abstractMap.h() && !abstractMap.g()) {
            iMin = (int) Math.min(iMin, j);
        }
        int i4 = 0;
        int i5 = 1;
        while (i5 < abstractMap.g && (!abstractMap.h() || i5 * 20 <= abstractMap.l)) {
            i4++;
            i5 += i5;
        }
        abstractMap.e = 32 - i4;
        abstractMap.d = i5 - 1;
        abstractMap.f = new ejzq[i5];
        int i6 = iMin / i5;
        while (i3 < (i6 * i5 < iMin ? i6 + 1 : i6)) {
            i3 += i3;
        }
        if (abstractMap.h()) {
            long j4 = i5;
            long j5 = abstractMap.l;
            long j6 = (j5 / j4) + 1;
            long j7 = j5 % j4;
            while (true) {
                ejzq[] ejzqVarArr = abstractMap.f;
                if (i2 >= ejzqVarArr.length) {
                    return;
                }
                if (i2 == j7) {
                    j6--;
                }
                long j8 = j6;
                ejzqVarArr[i2] = new ejzq(abstractMap, i3, j8, (ejyf) ((ejxw) ejykVar.n).a);
                i2++;
                j6 = j8;
            }
        } else {
            int i7 = i3;
            ekak ekakVar = abstractMap;
            while (true) {
                ejzq[] ejzqVarArr2 = ekakVar.f;
                if (i2 >= ejzqVarArr2.length) {
                    return;
                }
                ejzqVarArr2[i2] = new ejzq(ekakVar, i7, -1L, (ejyf) ((ejxw) ejykVar.n).a);
                i2++;
                ekakVar = this;
            }
        }
    }

    static void c(ekal ekalVar, ekal ekalVar2) {
        ekalVar.l(ekalVar2);
        ekalVar2.n(ekalVar);
    }

    static void d(ekal ekalVar, ekal ekalVar2) {
        ekalVar.m(ekalVar2);
        ekalVar2.o(ekalVar);
    }

    static void e(ekal ekalVar) {
        ejzp ejzpVar = ejzp.a;
        ekalVar.l(ejzpVar);
        ekalVar.n(ejzpVar);
    }

    static void f(ekal ekalVar) {
        ejzp ejzpVar = ejzp.a;
        ekalVar.m(ejzpVar);
        ekalVar.o(ejzpVar);
    }

    final int a(Object obj) {
        int iA = this.h.a(obj);
        int i = iA + ((iA << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    final ejzq b(int i) {
        return this.f[(i >>> this.e) & this.d];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        ejzq[] ejzqVarArr = this.f;
        int length = ejzqVarArr.length;
        for (int i = 0; i < length; i++) {
            ejzq ejzqVar = ejzqVarArr[i];
            if (ejzqVar.b != 0) {
                ejzqVar.lock();
                try {
                    ekak ekakVar = ejzqVar.a;
                    ejzqVar.s(ekakVar.p.a());
                    AtomicReferenceArray atomicReferenceArray = ejzqVar.f;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (ekal ekalVarE = (ekal) atomicReferenceArray.get(i2); ekalVarE != null; ekalVarE = ekalVarE.e()) {
                            if (ekalVarE.d().f()) {
                                Object objJ = ekalVarE.j();
                                Object obj = ekalVarE.d().get();
                                int i3 = 3;
                                if (objJ != null && obj != null) {
                                    i3 = 1;
                                }
                                ekalVarE.a();
                                ejzqVar.x(objJ, obj, ekalVarE.d().a(), i3);
                            }
                        }
                    }
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        atomicReferenceArray.set(i4, null);
                    }
                    if (ekakVar.n()) {
                        while (ejzqVar.h.poll() != null) {
                        }
                    }
                    if (ekakVar.o()) {
                        while (ejzqVar.i.poll() != null) {
                        }
                    }
                    ejzqVar.l.clear();
                    ejzqVar.m.clear();
                    ejzqVar.k.set(0);
                    ejzqVar.d++;
                    ejzqVar.b = 0;
                } finally {
                    ejzqVar.unlock();
                    ejzqVar.t();
                }
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        ejzq ejzqVarB = b(iA);
        try {
            if (ejzqVarB.b == 0) {
                return false;
            }
            ekal ekalVarC = ejzqVarB.c(obj, iA, ejzqVarB.a.p.a());
            if (ekalVarC == null) {
                return false;
            }
            return ekalVarC.d().get() != null;
        } finally {
            ejzqVarB.o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            ejya r3 = r0.p
            ejzq[] r4 = r0.f
            long r5 = r3.a()
            r7 = -1
            r3 = r2
        L13:
            r9 = 3
            if (r3 >= r9) goto L6e
            int r9 = r4.length
            r10 = 0
            r12 = r2
        L1a:
            if (r12 >= r9) goto L5f
            r13 = r4[r12]
            int r14 = r13.b
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r13.f
            r15 = r2
            r16 = r15
        L25:
            int r2 = r14.length()
            if (r15 >= r2) goto L52
            java.lang.Object r2 = r14.get(r15)
            ekal r2 = (defpackage.ekal) r2
        L31:
            r17 = r3
            if (r2 == 0) goto L4f
            java.lang.Object r3 = r13.g(r2, r5)
            r18 = r2
            if (r3 == 0) goto L48
            ejvp r2 = r0.i
            boolean r2 = r2.c(r1, r3)
            if (r2 != 0) goto L46
            goto L48
        L46:
            r1 = 1
            return r1
        L48:
            ekal r2 = r18.e()
            r3 = r17
            goto L31
        L4f:
            int r15 = r15 + 1
            goto L25
        L52:
            r17 = r3
            int r2 = r13.d
            long r2 = (long) r2
            long r10 = r10 + r2
            int r12 = r12 + 1
            r2 = r16
            r3 = r17
            goto L1a
        L5f:
            r16 = r2
            r17 = r3
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 != 0) goto L68
            goto L70
        L68:
            int r3 = r17 + 1
            r7 = r10
            r2 = r16
            goto L13
        L6e:
            r16 = r2
        L70:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekak.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.u;
        if (set != null) {
            return set;
        }
        ejzg ejzgVar = new ejzg(this);
        this.u = ejzgVar;
        return ejzgVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    final boolean g() {
        return this.v != ejyj.a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        return b(iA).f(obj, iA);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    final boolean h() {
        return this.l >= 0;
    }

    final boolean i() {
        return this.m > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        ejzq[] ejzqVarArr = this.f;
        long j = 0;
        for (ejzq ejzqVar : ejzqVarArr) {
            if (ejzqVar.b != 0) {
                return false;
            }
            j += r8.d;
        }
        if (j == 0) {
            return true;
        }
        for (ejzq ejzqVar2 : ejzqVarArr) {
            if (ejzqVar2.b != 0) {
                return false;
            }
            j -= r9.d;
        }
        return j == 0;
    }

    final boolean j() {
        return this.n > 0;
    }

    final boolean k(ekal ekalVar, long j) {
        ekalVar.getClass();
        if (!i() || j - ekalVar.b() < this.m) {
            return j() && j - ekalVar.c() >= this.n;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.s;
        if (set != null) {
            return set;
        }
        ejzj ejzjVar = new ejzj(this);
        this.s = ejzjVar;
        return ejzjVar;
    }

    final boolean l() {
        return j();
    }

    final boolean m() {
        return i() || h();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    final boolean n() {
        return this.j != ejzs.STRONG;
    }

    final boolean o() {
        return this.k != ejzs.STRONG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return b(iA).h(obj, iA, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return b(iA).h(obj, iA, obj2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r7 = r4.d();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r6 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r7.f() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r8 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r2.d++;
        r12 = r2.y(r4, r4, r5, r6, r7, r8);
        r0 = r2.b - 1;
        r9.set(r10, r12);
        r2.b = r0;
        r0 = r6;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            int r1 = r11.a(r12)
            ejzq r2 = r11.b(r1)
            r2.lock()
            ekak r3 = r2.a     // Catch: java.lang.Throwable -> L7b
            ejya r4 = r3.p     // Catch: java.lang.Throwable -> L7b
            long r4 = r4.a()     // Catch: java.lang.Throwable -> L7b
            r2.s(r4)     // Catch: java.lang.Throwable -> L7b
            int r4 = r2.b     // Catch: java.lang.Throwable -> L7b
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r2.f     // Catch: java.lang.Throwable -> L7b
            int r4 = r9.length()     // Catch: java.lang.Throwable -> L7b
            int r4 = r4 + (-1)
            r10 = r1 & r4
            java.lang.Object r4 = r9.get(r10)     // Catch: java.lang.Throwable -> L7b
            ekal r4 = (defpackage.ekal) r4     // Catch: java.lang.Throwable -> L7b
            r5 = r3
            r3 = r4
        L2e:
            if (r4 == 0) goto L74
            r6 = r5
            java.lang.Object r5 = r4.j()     // Catch: java.lang.Throwable -> L7b
            int r7 = r4.a()     // Catch: java.lang.Throwable -> L7b
            if (r7 != r1) goto L6e
            if (r5 == 0) goto L6e
            ejvp r7 = r6.h     // Catch: java.lang.Throwable -> L7b
            boolean r7 = r7.c(r12, r5)     // Catch: java.lang.Throwable -> L7b
            if (r7 == 0) goto L6e
            ejzz r7 = r4.d()     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L7b
            r12 = 1
            if (r6 == 0) goto L52
            r8 = r12
            goto L5a
        L52:
            boolean r1 = r7.f()     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L74
            r0 = 3
            r8 = r0
        L5a:
            int r0 = r2.d     // Catch: java.lang.Throwable -> L7b
            int r0 = r0 + r12
            r2.d = r0     // Catch: java.lang.Throwable -> L7b
            ekal r12 = r2.y(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L7b
            int r0 = r2.b     // Catch: java.lang.Throwable -> L7b
            int r0 = r0 + (-1)
            r9.set(r10, r12)     // Catch: java.lang.Throwable -> L7b
            r2.b = r0     // Catch: java.lang.Throwable -> L7b
            r0 = r6
            goto L74
        L6e:
            ekal r4 = r4.e()     // Catch: java.lang.Throwable -> L7b
            r5 = r6
            goto L2e
        L74:
            r2.unlock()
            r2.t()
            return r0
        L7b:
            r0 = move-exception
            r12 = r0
            r2.unlock()
            r2.t()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekak.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object obj3;
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        ejzq ejzqVarB = b(iA);
        ejzqVarB.lock();
        try {
            ekak ekakVar = ejzqVarB.a;
            long jA = ekakVar.p.a();
            ejzqVarB.s(jA);
            AtomicReferenceArray atomicReferenceArray = ejzqVarB.f;
            int length = iA & (atomicReferenceArray.length() - 1);
            ekal ekalVar = (ekal) atomicReferenceArray.get(length);
            long j = jA;
            ekal ekalVarE = ekalVar;
            while (true) {
                obj3 = null;
                if (ekalVarE == null) {
                    break;
                }
                Object objJ = ekalVarE.j();
                if (ekalVarE.a() == iA && objJ != null && ekakVar.h.c(obj, objJ)) {
                    long j2 = j;
                    ejzz ejzzVarD = ekalVarE.d();
                    Object obj4 = ejzzVarD.get();
                    if (obj4 != null) {
                        ejzqVarB.d++;
                        ejzqVarB.x(obj, obj4, ejzzVarD.a(), 2);
                        ejzqVarB.z(ekalVarE, obj2, j2);
                        ejzqVarB.l(ekalVarE);
                        obj3 = obj4;
                    } else if (ejzzVarD.f()) {
                        int i = ejzqVarB.b;
                        ejzqVarB.d++;
                        ekal ekalVarY = ejzqVarB.y(ekalVar, ekalVarE, objJ, null, ejzzVarD, 3);
                        int i2 = ejzqVarB.b - 1;
                        atomicReferenceArray.set(length, ekalVarY);
                        ejzqVarB.b = i2;
                    }
                } else {
                    long j3 = j;
                    ekalVarE = ekalVarE.e();
                    j = j3;
                }
            }
            return obj3;
        } finally {
            ejzqVarB.unlock();
            ejzqVarB.t();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (int i = 0; i < this.f.length; i++) {
            jMax += Math.max(0, r0[i].b);
        }
        return eonc.f(jMax);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.t;
        if (collection != null) {
            return collection;
        }
        ekaa ekaaVar = new ekaa(this);
        this.t = ekaaVar;
        return ekaaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        r7 = r4.d();
        r12 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r6.i.c(r13, r12) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r6 = r12;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r12 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r7.f() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r8 = 3;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        r2.d++;
        r12 = r2.y(r4, r4, r5, r6, r7, r8);
        r13 = r2.b - 1;
        r9.set(r10, r12);
        r2.b = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r8 != 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        r0 = true;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L93
            if (r13 != 0) goto L7
            goto L93
        L7:
            int r1 = r11.a(r12)
            ejzq r2 = r11.b(r1)
            r2.lock()
            ekak r3 = r2.a     // Catch: java.lang.Throwable -> L8a
            ejya r4 = r3.p     // Catch: java.lang.Throwable -> L8a
            long r4 = r4.a()     // Catch: java.lang.Throwable -> L8a
            r2.s(r4)     // Catch: java.lang.Throwable -> L8a
            int r4 = r2.b     // Catch: java.lang.Throwable -> L8a
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r2.f     // Catch: java.lang.Throwable -> L8a
            int r4 = r9.length()     // Catch: java.lang.Throwable -> L8a
            int r4 = r4 + (-1)
            r10 = r1 & r4
            java.lang.Object r4 = r9.get(r10)     // Catch: java.lang.Throwable -> L8a
            ekal r4 = (defpackage.ekal) r4     // Catch: java.lang.Throwable -> L8a
            r5 = r3
            r3 = r4
        L31:
            if (r4 == 0) goto L7d
            r6 = r5
            java.lang.Object r5 = r4.j()     // Catch: java.lang.Throwable -> L8a
            int r7 = r4.a()     // Catch: java.lang.Throwable -> L8a
            if (r7 != r1) goto L84
            if (r5 == 0) goto L84
            ejvp r7 = r6.h     // Catch: java.lang.Throwable -> L8a
            boolean r7 = r7.c(r12, r5)     // Catch: java.lang.Throwable -> L8a
            if (r7 == 0) goto L84
            ejzz r7 = r4.d()     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r12 = r7.get()     // Catch: java.lang.Throwable -> L8a
            ejvp r1 = r6.i     // Catch: java.lang.Throwable -> L8a
            boolean r13 = r1.c(r13, r12)     // Catch: java.lang.Throwable -> L8a
            r1 = 1
            if (r13 == 0) goto L5c
            r6 = r12
            r8 = r1
            goto L68
        L5c:
            if (r12 != 0) goto L7d
            boolean r12 = r7.f()     // Catch: java.lang.Throwable -> L8a
            if (r12 == 0) goto L7d
            r12 = 3
            r13 = 0
            r8 = r12
            r6 = r13
        L68:
            int r12 = r2.d     // Catch: java.lang.Throwable -> L8a
            int r12 = r12 + r1
            r2.d = r12     // Catch: java.lang.Throwable -> L8a
            ekal r12 = r2.y(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8a
            int r13 = r2.b     // Catch: java.lang.Throwable -> L8a
            int r13 = r13 + (-1)
            r9.set(r10, r12)     // Catch: java.lang.Throwable -> L8a
            r2.b = r13     // Catch: java.lang.Throwable -> L8a
            if (r8 != r1) goto L7d
            r0 = r1
        L7d:
            r2.unlock()
            r2.t()
            return r0
        L84:
            ekal r4 = r4.e()     // Catch: java.lang.Throwable -> L8a
            r5 = r6
            goto L31
        L8a:
            r0 = move-exception
            r12 = r0
            r2.unlock()
            r2.t()
            throw r12
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekak.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        int iA = a(obj);
        ejzq ejzqVarB = b(iA);
        ejzqVarB.lock();
        try {
            ekak ekakVar = ejzqVarB.a;
            long jA = ekakVar.p.a();
            ejzqVarB.s(jA);
            AtomicReferenceArray atomicReferenceArray = ejzqVarB.f;
            int length = iA & (atomicReferenceArray.length() - 1);
            ekal ekalVar = (ekal) atomicReferenceArray.get(length);
            long j = jA;
            ekal ekalVarE = ekalVar;
            while (true) {
                if (ekalVarE == null) {
                    break;
                }
                Object objJ = ekalVarE.j();
                if (ekalVarE.a() == iA && objJ != null && ekakVar.h.c(obj, objJ)) {
                    long j2 = j;
                    ejzz ejzzVarD = ekalVarE.d();
                    Object obj4 = ejzzVarD.get();
                    if (obj4 == null) {
                        if (ejzzVarD.f()) {
                            int i = ejzqVarB.b;
                            ejzqVarB.d++;
                            ekal ekalVarY = ejzqVarB.y(ekalVar, ekalVarE, objJ, null, ejzzVarD, 3);
                            int i2 = ejzqVarB.b - 1;
                            atomicReferenceArray.set(length, ekalVarY);
                            ejzqVarB.b = i2;
                        }
                    } else if (ekakVar.i.c(obj2, obj4)) {
                        ejzqVarB.d++;
                        ejzqVarB.x(obj, obj4, ejzzVarD.a(), 2);
                        ejzqVarB.z(ekalVarE, obj3, j2);
                        ejzqVarB.l(ekalVarE);
                        z = true;
                    } else {
                        ejzqVarB.p(ekalVarE, j2);
                    }
                } else {
                    long j3 = j;
                    ekalVarE = ekalVarE.e();
                    j = j3;
                }
            }
            return z;
        } finally {
            ejzqVarB.unlock();
            ejzqVarB.t();
        }
    }
}
