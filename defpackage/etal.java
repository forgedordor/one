package defpackage;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etal extends AbstractMap implements Serializable {
    public static final Comparator a = new etae();
    etak b;
    int c;
    int d;
    final etak e;
    private final Comparator f;
    private final boolean g;
    private etag h;
    private etai i;

    public etal() {
        this(a, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f(defpackage.etak r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            etak r0 = r9.b
            etak r1 = r9.c
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.i
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.i
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            etak r0 = r1.b
            etak r3 = r1.c
            if (r3 == 0) goto L22
            int r3 = r3.i
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.i
            goto L29
        L28:
            r0 = r2
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.i(r1)
            r8.h(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.h(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            etak r1 = r0.b
            etak r3 = r0.c
            if (r3 == 0) goto L4e
            int r3 = r3.i
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.i
            goto L55
        L54:
            r1 = r2
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.h(r0)
            r8.i(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.i(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.i = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.i = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            etak r9 = r9.a
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etal.f(etak, boolean):void");
    }

    private final void g(etak etakVar, etak etakVar2) {
        etak etakVar3 = etakVar.a;
        etakVar.a = null;
        if (etakVar2 != null) {
            etakVar2.a = etakVar3;
        }
        if (etakVar3 == null) {
            this.b = etakVar2;
        } else if (etakVar3.b == etakVar) {
            etakVar3.b = etakVar2;
        } else {
            etakVar3.c = etakVar2;
        }
    }

    private final void h(etak etakVar) {
        etak etakVar2 = etakVar.b;
        etak etakVar3 = etakVar.c;
        etak etakVar4 = etakVar3.b;
        etak etakVar5 = etakVar3.c;
        etakVar.c = etakVar4;
        if (etakVar4 != null) {
            etakVar4.a = etakVar;
        }
        g(etakVar, etakVar3);
        etakVar3.b = etakVar;
        etakVar.a = etakVar3;
        int iMax = Math.max(etakVar2 != null ? etakVar2.i : 0, etakVar4 != null ? etakVar4.i : 0) + 1;
        etakVar.i = iMax;
        etakVar3.i = Math.max(iMax, etakVar5 != null ? etakVar5.i : 0) + 1;
    }

    private final void i(etak etakVar) {
        etak etakVar2 = etakVar.b;
        etak etakVar3 = etakVar.c;
        etak etakVar4 = etakVar2.b;
        etak etakVar5 = etakVar2.c;
        etakVar.b = etakVar5;
        if (etakVar5 != null) {
            etakVar5.a = etakVar;
        }
        g(etakVar, etakVar2);
        etakVar2.c = etakVar;
        etakVar.a = etakVar2;
        int iMax = Math.max(etakVar3 != null ? etakVar3.i : 0, etakVar5 != null ? etakVar5.i : 0) + 1;
        etakVar.i = iMax;
        etakVar2.i = Math.max(iMax, etakVar4 != null ? etakVar4.i : 0) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    final etak a(Object obj, boolean z) {
        int iCompareTo;
        etak etakVar;
        Comparator comparator = this.f;
        etak etakVar2 = this.b;
        if (etakVar2 != null) {
            Comparable comparable = comparator == a ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(etakVar2.f) : comparator.compare(obj, etakVar2.f);
                if (iCompareTo == 0) {
                    return etakVar2;
                }
                etak etakVar3 = iCompareTo < 0 ? etakVar2.b : etakVar2.c;
                if (etakVar3 == null) {
                    break;
                }
                etakVar2 = etakVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i = iCompareTo;
        if (!z) {
            return null;
        }
        etak etakVar4 = this.e;
        if (etakVar2 != null) {
            etak etakVar5 = etakVar2;
            etakVar = new etak(this.g, etakVar5, obj, etakVar4, etakVar4.e);
            if (i < 0) {
                etakVar5.b = etakVar;
            } else {
                etakVar5.c = etakVar;
            }
            f(etakVar5, true);
        } else {
            if (comparator == a && !(obj instanceof Comparable)) {
                throw new ClassCastException(String.valueOf(obj.getClass().getName()).concat(" is not Comparable"));
            }
            etakVar = new etak(this.g, null, obj, etakVar4, etakVar4.e);
            this.b = etakVar;
        }
        this.c++;
        this.d++;
        return etakVar;
    }

    final etak b(Map.Entry entry) {
        etak etakVarC = c(entry.getKey());
        if (etakVarC == null || !Objects.equals(etakVarC.h, entry.getValue())) {
            return null;
        }
        return etakVarC;
    }

    final etak c(Object obj) {
        if (obj != null) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        etak etakVar = this.e;
        etakVar.e = etakVar;
        etakVar.d = etakVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    final etak d(Object obj) {
        etak etakVarC = c(obj);
        if (etakVarC != null) {
            e(etakVarC, true);
        }
        return etakVarC;
    }

    final void e(etak etakVar, boolean z) {
        etak etakVar2;
        etak etakVar3;
        int i;
        if (z) {
            etak etakVar4 = etakVar.e;
            etakVar4.d = etakVar.d;
            etakVar.d.e = etakVar4;
        }
        etak etakVar5 = etakVar.b;
        etak etakVar6 = etakVar.c;
        etak etakVar7 = etakVar.a;
        int i2 = 0;
        if (etakVar5 == null || etakVar6 == null) {
            if (etakVar5 != null) {
                g(etakVar, etakVar5);
                etakVar.b = null;
            } else if (etakVar6 != null) {
                g(etakVar, etakVar6);
                etakVar.c = null;
            } else {
                g(etakVar, null);
            }
            f(etakVar7, false);
            this.c--;
            this.d++;
            return;
        }
        if (etakVar5.i > etakVar6.i) {
            do {
                etakVar3 = etakVar5;
                etakVar5 = etakVar5.c;
            } while (etakVar5 != null);
        } else {
            do {
                etakVar2 = etakVar6;
                etakVar6 = etakVar6.b;
            } while (etakVar6 != null);
            etakVar3 = etakVar2;
        }
        e(etakVar3, false);
        etak etakVar8 = etakVar.b;
        if (etakVar8 != null) {
            i = etakVar8.i;
            etakVar3.b = etakVar8;
            etakVar8.a = etakVar3;
            etakVar.b = null;
        } else {
            i = 0;
        }
        etak etakVar9 = etakVar.c;
        if (etakVar9 != null) {
            i2 = etakVar9.i;
            etakVar3.c = etakVar9;
            etakVar9.a = etakVar3;
            etakVar.c = null;
        }
        etakVar3.i = Math.max(i, i2) + 1;
        g(etakVar, etakVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        etag etagVar = this.h;
        if (etagVar != null) {
            return etagVar;
        }
        etag etagVar2 = new etag(this);
        this.h = etagVar2;
        return etagVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        etak etakVarC = c(obj);
        if (etakVarC != null) {
            return etakVarC.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        etai etaiVar = this.i;
        if (etaiVar != null) {
            return etaiVar;
        }
        etai etaiVar2 = new etai(this);
        this.i = etaiVar2;
        return etaiVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.g) {
            throw new NullPointerException("value == null");
        }
        etak etakVarA = a(obj, true);
        Object obj3 = etakVarA.h;
        etakVarA.h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        etak etakVarD = d(obj);
        if (etakVarD != null) {
            return etakVarD.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    public etal(Comparator comparator, boolean z) {
        this.c = 0;
        this.d = 0;
        this.f = comparator;
        this.g = z;
        this.e = new etak(z);
    }
}
