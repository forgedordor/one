package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ksw {
    public static int a;
    kta b;
    final ArrayList c = new ArrayList();

    public ksw(kta ktaVar) {
        this.b = null;
        a++;
        this.b = ktaVar;
    }

    public final long a(ksp kspVar, long j) {
        kta ktaVar = kspVar.d;
        if (ktaVar instanceof ksu) {
            return j;
        }
        List list = kspVar.j;
        int size = list.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            ksn ksnVar = (ksn) list.get(i);
            if (ksnVar instanceof ksp) {
                ksp kspVar2 = (ksp) ksnVar;
                if (kspVar2.d != ktaVar) {
                    jMin = Math.min(jMin, a(kspVar2, kspVar2.e + j));
                }
            }
        }
        if (kspVar != ktaVar.j) {
            return jMin;
        }
        long jA = ktaVar.a();
        long j2 = j - jA;
        return Math.min(Math.min(jMin, a(ktaVar.i, j2)), j2 - r10.e);
    }

    public final long b(ksp kspVar, long j) {
        kta ktaVar = kspVar.d;
        if (ktaVar instanceof ksu) {
            return j;
        }
        List list = kspVar.j;
        int size = list.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            ksn ksnVar = (ksn) list.get(i);
            if (ksnVar instanceof ksp) {
                ksp kspVar2 = (ksp) ksnVar;
                if (kspVar2.d != ktaVar) {
                    jMax = Math.max(jMax, b(kspVar2, kspVar2.e + j));
                }
            }
        }
        if (kspVar != ktaVar.i) {
            return jMax;
        }
        long jA = ktaVar.a();
        long j2 = j + jA;
        return Math.max(Math.max(jMax, b(ktaVar.j, j2)), j2 - r10.e);
    }
}
