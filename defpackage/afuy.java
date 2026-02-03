package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afuy implements fdau {
    final /* synthetic */ boolean a;
    final /* synthetic */ List b;

    public afuy(boolean z, List list) {
        this.a = z;
        this.b = list;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ((cyg) obj).getClass();
        ics icsVarC = dpc.c(cyi.b(egq.d(ics.e, 1.0f)), dpc.a(0, hmlVar, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true);
        hmlVar.v(-2127995280);
        boolean z = this.a;
        if (z) {
            hmlVar.v(-1543323592);
            j = glz.a(hmlVar).G;
            hmlVar.o();
        } else {
            hmlVar.v(-2127991315);
            boolean zBooleanValue = ((Boolean) hmlVar.e(gdd.b)).booleanValue();
            hmlVar.o();
            if (zBooleanValue) {
                hmlVar.v(-1543210907);
                j = glz.a(hmlVar).p;
                hmlVar.o();
            } else {
                hmlVar.v(-1543150116);
                j = glz.a(hmlVar).F;
                hmlVar.o();
            }
        }
        long j2 = j;
        hmlVar.o();
        float f = 0.0f;
        if (((Boolean) hmlVar.e(gdd.b)).booleanValue() && !z) {
            f = 3.0f;
        }
        gvk.c(icsVarC, null, j2, 0L, f, 0.0f, null, hxe.d(-961457599, new afux(this.b), hmlVar), hmlVar, 106);
        return fctx.a;
    }
}
