package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kso {
    public final ksa a;
    public final ksa d;
    public ksk f;
    final ArrayList g;
    private final ksj h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();

    public kso(ksa ksaVar) {
        new ArrayList();
        this.f = null;
        this.h = new ksj();
        this.g = new ArrayList();
        this.a = ksaVar;
        this.d = ksaVar;
    }

    private final void e(kta ktaVar, int i, ArrayList arrayList) {
        ksp kspVar = ktaVar.i;
        for (ksn ksnVar : kspVar.j) {
            if (ksnVar instanceof ksp) {
                g((ksp) ksnVar, i, ktaVar.j, arrayList, null);
            } else if (ksnVar instanceof kta) {
                g(((kta) ksnVar).i, i, ktaVar.j, arrayList, null);
            }
        }
        for (ksn ksnVar2 : ktaVar.j.j) {
            if (ksnVar2 instanceof ksp) {
                g((ksp) ksnVar2, i, kspVar, arrayList, null);
            } else if (ksnVar2 instanceof kta) {
                g(((kta) ksnVar2).j, i, kspVar, arrayList, null);
            }
        }
        if (i == 1) {
            for (ksn ksnVar3 : ((ksx) ktaVar).a.j) {
                if (ksnVar3 instanceof ksp) {
                    g((ksp) ksnVar3, 1, null, arrayList, null);
                }
            }
        }
    }

    private final void f(krz krzVar, int i, int i2, int i3, int i4) {
        ksj ksjVar = this.h;
        ksjVar.i = i;
        ksjVar.j = i3;
        ksjVar.a = i2;
        ksjVar.b = i4;
        this.f.b(krzVar, ksjVar);
        krzVar.N(ksjVar.c);
        krzVar.C(ksjVar.d);
        krzVar.P = ksjVar.f;
        krzVar.y(ksjVar.e);
    }

    private final void g(ksp kspVar, int i, ksp kspVar2, ArrayList arrayList, ksw kswVar) {
        kta ktaVar = kspVar.d;
        if (ktaVar.e == null) {
            ksa ksaVar = this.a;
            if (ktaVar == ksaVar.o || ktaVar == ksaVar.p) {
                return;
            }
            if (kswVar == null) {
                kswVar = new ksw(ktaVar);
                arrayList.add(kswVar);
            }
            ksw kswVar2 = kswVar;
            ktaVar.e = kswVar2;
            kswVar2.c.add(ktaVar);
            ksp kspVar3 = ktaVar.i;
            for (ksn ksnVar : kspVar3.j) {
                if (ksnVar instanceof ksp) {
                    g((ksp) ksnVar, i, kspVar2, arrayList, kswVar2);
                }
            }
            ksp kspVar4 = ktaVar.j;
            for (ksn ksnVar2 : kspVar4.j) {
                if (ksnVar2 instanceof ksp) {
                    g((ksp) ksnVar2, i, kspVar2, arrayList, kswVar2);
                }
            }
            if (i == 1 && (ktaVar instanceof ksx)) {
                for (ksn ksnVar3 : ((ksx) ktaVar).a.j) {
                    if (ksnVar3 instanceof ksp) {
                        g((ksp) ksnVar3, 1, kspVar2, arrayList, kswVar2);
                    }
                }
            }
            Iterator it = kspVar3.k.iterator();
            while (it.hasNext()) {
                g((ksp) it.next(), i, kspVar2, arrayList, kswVar2);
            }
            Iterator it2 = kspVar4.k.iterator();
            while (it2.hasNext()) {
                g((ksp) it2.next(), i, kspVar2, arrayList, kswVar2);
            }
            if (i == 1 && (ktaVar instanceof ksx)) {
                Iterator it3 = ((ksx) ktaVar).a.k.iterator();
                while (it3.hasNext()) {
                    g((ksp) it3.next(), 1, kspVar2, arrayList, kswVar2);
                }
            }
        }
    }

    public final int a(ksa ksaVar, int i) {
        ArrayList arrayList;
        long jA;
        ksa ksaVar2 = ksaVar;
        int i2 = i;
        ArrayList arrayList2 = this.g;
        int size = arrayList2.size();
        int i3 = 0;
        long j = 0;
        long jMax = 0;
        while (i3 < size) {
            ksw kswVar = (ksw) arrayList2.get(i3);
            kta ktaVar = kswVar.b;
            if (!(ktaVar instanceof ksm) ? !(i2 != 0 ? (ktaVar instanceof ksx) : (ktaVar instanceof ksv)) : ((ksm) ktaVar).g != i2) {
                ksp kspVar = i2 == 0 ? ksaVar2.o.i : ksaVar2.p.i;
                ksp kspVar2 = i2 == 0 ? ksaVar2.o.j : ksaVar2.p.j;
                boolean zContains = ktaVar.i.k.contains(kspVar);
                boolean zContains2 = kswVar.b.j.k.contains(kspVar2);
                long jA2 = kswVar.b.a();
                if (zContains && zContains2) {
                    long jB = kswVar.b(kswVar.b.i, j);
                    long jA3 = kswVar.a(kswVar.b.j, j);
                    long j2 = jB - jA2;
                    kta ktaVar2 = kswVar.b;
                    long j3 = ktaVar2.j.e;
                    arrayList = arrayList2;
                    if (j2 >= (-r15)) {
                        j2 += j3;
                    }
                    long j4 = ktaVar2.i.e;
                    long j5 = ((-jA3) - jA2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    krz krzVar = ktaVar2.d;
                    float f = i == 0 ? krzVar.ao : krzVar.ap;
                    float f2 = 1.0f - f;
                    float f3 = f > 0.0f ? (long) ((j5 / f) + (j2 / f2)) : 0L;
                    jA = (j4 + ((((long) ((f * f3) + 0.5f)) + jA2) + ((long) ((f3 * f2) + 0.5f)))) - j3;
                } else {
                    arrayList = arrayList2;
                    if (zContains) {
                        jA = Math.max(kswVar.b(kswVar.b.i, r0.e), kswVar.b.i.e + jA2);
                    } else if (zContains2) {
                        jA = Math.max(-kswVar.a(kswVar.b.j, r0.e), (-kswVar.b.j.e) + jA2);
                    } else {
                        jA = (r0.i.e + kswVar.b.a()) - kswVar.b.j.e;
                    }
                }
            } else {
                arrayList = arrayList2;
                jA = j;
            }
            jMax = Math.max(jMax, jA);
            i3++;
            ksaVar2 = ksaVar;
            i2 = i;
            arrayList2 = arrayList;
            j = 0;
        }
        return (int) jMax;
    }

    public final void b() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ksa ksaVar = this.d;
        ksaVar.o.d();
        ksaVar.p.d();
        arrayList.add(ksaVar.o);
        arrayList.add(ksaVar.p);
        ArrayList arrayList2 = ksaVar.aL;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            krz krzVar = (krz) arrayList2.get(i);
            if (krzVar instanceof ksd) {
                arrayList.add(new kst(krzVar));
            } else {
                if (krzVar.S()) {
                    if (krzVar.m == null) {
                        krzVar.m = new ksm(krzVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(krzVar.m);
                } else {
                    arrayList.add(krzVar.o);
                }
                if (krzVar.T()) {
                    if (krzVar.n == null) {
                        krzVar.n = new ksm(krzVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(krzVar.n);
                } else {
                    arrayList.add(krzVar.p);
                }
                if (krzVar instanceof kse) {
                    arrayList.add(new ksu(krzVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((kta) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            kta ktaVar = (kta) arrayList.get(i3);
            if (ktaVar.d != ksaVar) {
                ktaVar.b();
            }
        }
        ArrayList arrayList3 = this.g;
        arrayList3.clear();
        ksw.a = 0;
        ksa ksaVar2 = this.a;
        e(ksaVar2.o, 0, arrayList3);
        e(ksaVar2.p, 1, arrayList3);
        this.b = false;
    }

    public final void c() {
        int i;
        boolean z;
        boolean z2;
        ksq ksqVar;
        ArrayList arrayList = this.a.aL;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            krz krzVar = (krz) arrayList.get(i2);
            if (!krzVar.l) {
                int[] iArr = krzVar.aA;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = krzVar.C;
                int i6 = krzVar.D;
                if (i3 == 2) {
                    i = i3;
                    z = true;
                } else if (i3 == 3) {
                    z = i5 == 1;
                    i = 3;
                } else {
                    i = i3;
                    z = false;
                }
                if (i4 == 2) {
                    z2 = true;
                } else if (i4 == 3) {
                    z2 = i6 == 1;
                    i4 = 3;
                } else {
                    z2 = false;
                }
                ksq ksqVar2 = krzVar.o.f;
                boolean z3 = ksqVar2.i;
                ksq ksqVar3 = krzVar.p.f;
                boolean z4 = ksqVar3.i;
                if (z3 && z4) {
                    f(krzVar, 1, ksqVar2.f, 1, ksqVar3.f);
                    krzVar.l = true;
                } else if (z3 && z2) {
                    f(krzVar, 1, ksqVar2.f, 2, ksqVar3.f);
                    if (i4 == 3) {
                        krzVar.p.f.m = krzVar.h();
                    } else {
                        krzVar.p.f.c(krzVar.h());
                        krzVar.l = true;
                    }
                } else if (z4 && z) {
                    f(krzVar, 2, ksqVar2.f, 1, ksqVar3.f);
                    if (i == 3) {
                        krzVar.o.f.m = krzVar.j();
                    } else {
                        krzVar.o.f.c(krzVar.j());
                        krzVar.l = true;
                    }
                }
                if (krzVar.l && (ksqVar = krzVar.p.b) != null) {
                    ksqVar.c(krzVar.al);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0300 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.ksa r21) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kso.d(ksa):void");
    }
}
