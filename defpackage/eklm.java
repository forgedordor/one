package defpackage;

import j$.util.concurrent.ConcurrentMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eklm extends AbstractMap implements ConcurrentMap, Serializable, j$.util.concurrent.ConcurrentMap {
    static final eklj a = new ekkb();
    public static final /* synthetic */ int k = 0;
    private static final long serialVersionUID = 5;
    final transient int b;
    final transient int c;
    final transient ekkn[] d;
    final int e;
    final ejvp f;
    final transient ekkk g;
    transient Set h;
    transient Collection i;
    transient Set j;

    public eklm(ekka ekkaVar, ekkk ekkkVar) {
        this.e = Math.min(ekkaVar.a(), 65536);
        this.f = (ejvp) ejwg.c(ekkaVar.f, ekkaVar.c().a());
        this.g = ekkkVar;
        int iMin = Math.min(ekkaVar.b(), 1073741824);
        int i = 1;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.e) {
            i4++;
            i3 += i3;
        }
        this.c = 32 - i4;
        this.b = i3 - 1;
        this.d = new ekkn[i3];
        int i5 = iMin / i3;
        while (i < (i3 * i5 < iMin ? i5 + 1 : i5)) {
            i += i;
        }
        while (true) {
            ekkn[] ekknVarArr = this.d;
            if (i2 >= ekknVarArr.length) {
                return;
            }
            ekknVarArr[i2] = this.g.c(this, i);
            i2++;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    final int a(Object obj) {
        int iA = this.f.a(obj);
        int i = iA + ((iA << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    final ejvp b() {
        return this.g.e().a();
    }

    final ekkn c(int i) {
        return this.d[(i >>> this.c) & this.b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        ekkn[] ekknVarArr = this.d;
        int length = ekknVarArr.length;
        for (int i = 0; i < length; i++) {
            ekkn ekknVar = ekknVarArr[i];
            if (ekknVar.b != 0) {
                ekknVar.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = ekknVar.e;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    ekknVar.g();
                    ekknVar.f.set(0);
                    ekknVar.c++;
                    ekknVar.b = 0;
                } finally {
                    ekknVar.unlock();
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
        ekkj ekkjVarB;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        ekkn ekknVarC = c(iA);
        try {
            if (ekknVarC.b != 0 && (ekkjVarB = ekknVarC.b(obj, iA)) != null) {
                if (ekkjVarB.d() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            ekknVarC.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Object objD;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        ekkn[] ekknVarArr = this.d;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = ekknVarArr.length;
            long j2 = 0;
            for (?? r10 = z; r10 < length; r10++) {
                ekkn ekknVar = ekknVarArr[r10];
                int i2 = ekknVar.b;
                ?? r12 = ekknVar.e;
                for (?? r13 = z; r13 < r12.length(); r13++) {
                    ekkj ekkjVarB = (ekkj) r12.get(r13);
                    while (ekkjVarB != null) {
                        if (ekkjVarB.c() == null || (objD = ekkjVarB.d()) == null) {
                            ekknVar.l();
                            objD = null;
                        }
                        boolean z2 = z;
                        if (objD != null && b().c(obj, objD)) {
                            return true;
                        }
                        ekkjVarB = ekkjVarB.b();
                        z = z2;
                    }
                }
                j2 += ekknVar.c;
                z = z;
            }
            boolean z3 = z;
            if (j2 == j) {
                return z3;
            }
            i++;
            j = j2;
            z = z3;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.j;
        if (set != null) {
            return set;
        }
        ekkh ekkhVar = new ekkh(this);
        this.j = ekkhVar;
        return ekkhVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object objD = null;
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        ekkn ekknVarC = c(iA);
        try {
            ekkj ekkjVarB = ekknVarC.b(obj, iA);
            if (ekkjVarB != null && (objD = ekkjVarB.d()) == null) {
                ekknVarC.l();
            }
            return objD;
        } finally {
            ekknVarC.i();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        int i = 0;
        long j = 0;
        while (true) {
            ekkn[] ekknVarArr = this.d;
            if (i >= ekknVarArr.length) {
                if (j == 0) {
                    return true;
                }
                for (int i2 = 0; i2 < ekknVarArr.length; i2++) {
                    if (ekknVarArr[i2].b != 0) {
                        return false;
                    }
                    j -= ekknVarArr[i2].c;
                }
                return j == 0;
            }
            if (ekknVarArr[i].b != 0) {
                return false;
            }
            j += ekknVarArr[i].c;
            i++;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        ekkm ekkmVar = new ekkm(this);
        this.h = ekkmVar;
        return ekkmVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return c(iA).d(obj, iA, obj2, false);
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
        return c(iA).d(obj, iA, obj2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r10 = r6.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (defpackage.ekkn.m(r6) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r2.c++;
        r0 = r2.c(r5, r6);
        r1 = r2.b - 1;
        r3.set(r4, r0);
        r2.b = r1;
        r0 = r10;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            int r1 = r9.a(r10)
            ekkn r2 = r9.c(r1)
            r2.lock()
            r2.j()     // Catch: java.lang.Throwable -> L68
            int r3 = r2.b     // Catch: java.lang.Throwable -> L68
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r2.e     // Catch: java.lang.Throwable -> L68
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L68
            int r4 = r4 + (-1)
            r4 = r4 & r1
            java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L68
            ekkj r5 = (defpackage.ekkj) r5     // Catch: java.lang.Throwable -> L68
            r6 = r5
        L24:
            if (r6 == 0) goto L64
            java.lang.Object r7 = r6.c()     // Catch: java.lang.Throwable -> L68
            int r8 = r6.a()     // Catch: java.lang.Throwable -> L68
            if (r8 != r1) goto L5f
            if (r7 == 0) goto L5f
            eklm r8 = r2.a     // Catch: java.lang.Throwable -> L68
            ejvp r8 = r8.f     // Catch: java.lang.Throwable -> L68
            boolean r7 = r8.c(r10, r7)     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L5f
            java.lang.Object r10 = r6.d()     // Catch: java.lang.Throwable -> L68
            if (r10 == 0) goto L43
            goto L4a
        L43:
            boolean r1 = defpackage.ekkn.m(r6)     // Catch: java.lang.Throwable -> L68
            if (r1 != 0) goto L4a
            goto L64
        L4a:
            int r0 = r2.c     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + 1
            r2.c = r0     // Catch: java.lang.Throwable -> L68
            ekkj r0 = r2.c(r5, r6)     // Catch: java.lang.Throwable -> L68
            int r1 = r2.b     // Catch: java.lang.Throwable -> L68
            int r1 = r1 + (-1)
            r3.set(r4, r0)     // Catch: java.lang.Throwable -> L68
            r2.b = r1     // Catch: java.lang.Throwable -> L68
            r0 = r10
            goto L64
        L5f:
            ekkj r6 = r6.b()     // Catch: java.lang.Throwable -> L68
            goto L24
        L64:
            r2.unlock()
            return r0
        L68:
            r10 = move-exception
            r2.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eklm.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object obj3;
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        ekkn ekknVarC = c(iA);
        ekknVarC.lock();
        try {
            ekknVarC.j();
            AtomicReferenceArray atomicReferenceArray = ekknVarC.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            ekkj ekkjVar = (ekkj) atomicReferenceArray.get(length);
            ekkj ekkjVarB = ekkjVar;
            while (true) {
                obj3 = null;
                if (ekkjVarB == null) {
                    break;
                }
                Object objC = ekkjVarB.c();
                if (ekkjVarB.a() == iA && objC != null && ekknVarC.a.f.c(obj, objC)) {
                    Object objD = ekkjVarB.d();
                    if (objD != null) {
                        ekknVarC.c++;
                        ekknVarC.k(ekkjVarB, obj2);
                        obj3 = objD;
                    } else if (ekkn.m(ekkjVarB)) {
                        int i = ekknVarC.b;
                        ekknVarC.c++;
                        ekkj ekkjVarC = ekknVarC.c(ekkjVar, ekkjVarB);
                        int i2 = ekknVarC.b - 1;
                        atomicReferenceArray.set(length, ekkjVarC);
                        ekknVarC.b = i2;
                    }
                } else {
                    ekkjVarB = ekkjVarB.b();
                }
            }
            return obj3;
        } finally {
            ekknVarC.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        int i = 0;
        long j = 0;
        while (true) {
            if (i >= this.d.length) {
                return eonc.f(j);
            }
            j += r3[i].b;
            i++;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.i;
        if (collection != null) {
            return collection;
        }
        ekkz ekkzVar = new ekkz(this);
        this.i = ekkzVar;
        return ekkzVar;
    }

    Object writeReplace() {
        ekkk ekkkVar = this.g;
        ekkp ekkpVarD = ekkkVar.d();
        ekkp ekkpVarE = ekkkVar.e();
        ekkkVar.e().a();
        return new ekko(ekkpVarD, ekkpVarE, this.f, this.e, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r8.b().c(r12, r6.d()) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (defpackage.ekkn.m(r6) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r2.c++;
        r11 = r2.c(r5, r6);
        r12 = r2.b - 1;
        r3.set(r4, r11);
        r2.b = r12;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L77
            if (r12 != 0) goto L7
            goto L77
        L7:
            int r1 = r10.a(r11)
            ekkn r2 = r10.c(r1)
            r2.lock()
            r2.j()     // Catch: java.lang.Throwable -> L72
            int r3 = r2.b     // Catch: java.lang.Throwable -> L72
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r2.e     // Catch: java.lang.Throwable -> L72
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L72
            int r4 = r4 + (-1)
            r4 = r4 & r1
            java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L72
            ekkj r5 = (defpackage.ekkj) r5     // Catch: java.lang.Throwable -> L72
            r6 = r5
        L27:
            if (r6 == 0) goto L6e
            java.lang.Object r7 = r6.c()     // Catch: java.lang.Throwable -> L72
            int r8 = r6.a()     // Catch: java.lang.Throwable -> L72
            if (r8 != r1) goto L69
            if (r7 == 0) goto L69
            eklm r8 = r2.a     // Catch: java.lang.Throwable -> L72
            ejvp r9 = r8.f     // Catch: java.lang.Throwable -> L72
            boolean r7 = r9.c(r11, r7)     // Catch: java.lang.Throwable -> L72
            if (r7 == 0) goto L69
            java.lang.Object r11 = r6.d()     // Catch: java.lang.Throwable -> L72
            ejvp r1 = r8.b()     // Catch: java.lang.Throwable -> L72
            boolean r11 = r1.c(r12, r11)     // Catch: java.lang.Throwable -> L72
            r12 = 1
            if (r11 == 0) goto L50
            r0 = r12
            goto L56
        L50:
            boolean r11 = defpackage.ekkn.m(r6)     // Catch: java.lang.Throwable -> L72
            if (r11 == 0) goto L6e
        L56:
            int r11 = r2.c     // Catch: java.lang.Throwable -> L72
            int r11 = r11 + r12
            r2.c = r11     // Catch: java.lang.Throwable -> L72
            ekkj r11 = r2.c(r5, r6)     // Catch: java.lang.Throwable -> L72
            int r12 = r2.b     // Catch: java.lang.Throwable -> L72
            int r12 = r12 + (-1)
            r3.set(r4, r11)     // Catch: java.lang.Throwable -> L72
            r2.b = r12     // Catch: java.lang.Throwable -> L72
            goto L6e
        L69:
            ekkj r6 = r6.b()     // Catch: java.lang.Throwable -> L72
            goto L27
        L6e:
            r2.unlock()
            return r0
        L72:
            r11 = move-exception
            r2.unlock()
            throw r11
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eklm.remove(java.lang.Object, java.lang.Object):boolean");
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
        ekkn ekknVarC = c(iA);
        ekknVarC.lock();
        try {
            ekknVarC.j();
            AtomicReferenceArray atomicReferenceArray = ekknVarC.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            ekkj ekkjVar = (ekkj) atomicReferenceArray.get(length);
            ekkj ekkjVarB = ekkjVar;
            while (true) {
                if (ekkjVarB == null) {
                    break;
                }
                Object objC = ekkjVarB.c();
                if (ekkjVarB.a() == iA && objC != null) {
                    eklm eklmVar = ekknVarC.a;
                    if (eklmVar.f.c(obj, objC)) {
                        Object objD = ekkjVarB.d();
                        if (objD == null) {
                            if (ekkn.m(ekkjVarB)) {
                                int i = ekknVarC.b;
                                ekknVarC.c++;
                                ekkj ekkjVarC = ekknVarC.c(ekkjVar, ekkjVarB);
                                int i2 = ekknVarC.b - 1;
                                atomicReferenceArray.set(length, ekkjVarC);
                                ekknVarC.b = i2;
                            }
                        } else if (eklmVar.b().c(obj2, objD)) {
                            ekknVarC.c++;
                            ekknVarC.k(ekkjVarB, obj3);
                            z = true;
                        }
                    }
                }
                ekkjVarB = ekkjVarB.b();
            }
            return z;
        } finally {
            ekknVarC.unlock();
        }
    }
}
