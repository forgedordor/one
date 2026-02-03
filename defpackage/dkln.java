package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkln implements fdau {
    final /* synthetic */ fdau a;
    final /* synthetic */ dklv b;
    final /* synthetic */ boolean c;
    final /* synthetic */ long d;

    public dkln(fdau fdauVar, dklv dklvVar, boolean z, long j) {
        this.a = fdauVar;
        this.b = dklvVar;
        this.c = z;
        this.d = j;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        edk edkVar = (edk) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edkVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edkVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            fdau fdauVar = this.a;
            final dklv dklvVar = this.b;
            Object objA = fdauVar.a(dklvVar.a, Integer.valueOf(((kio) hmlVar.e(jmh.e)).ep(edkVar.d())), dklo.h(dklvVar, hmlVar));
            hmlVar.v(-393008737);
            boolean z = this.c;
            ics icsVarE = ics.e;
            if (z) {
                hmlVar.v(5004770);
                boolean zD = hmlVar.D(dklvVar);
                Object objF = hmlVar.f();
                if (zD || objF == hmk.a) {
                    objF = new fdae() { // from class: dklm
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdae fdaeVar = dklvVar.b;
                            if (fdaeVar != null) {
                                fdaeVar.invoke();
                            }
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                icsVarE = dli.e(icsVarE, false, null, (fdae) objF, 15);
            }
            hmlVar.o();
            long j = this.d;
            dthx.a(dklo.a((String) objA, z, j), icsVarE, j, 0L, 0L, null, 0L, 0, false, 0, null, null, dklo.h(dklvVar, hmlVar), hmlVar, 0, 0, 65528);
        }
        return fctx.a;
    }
}
