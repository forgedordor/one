package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejez implements fdau {
    final /* synthetic */ ejfj a;
    final /* synthetic */ hsf b;
    final /* synthetic */ hsf c;

    public ejez(ejfj ejfjVar, hsf hsfVar, hsf hsfVar2) {
        this.a = ejfjVar;
        this.b = hsfVar;
        this.c = hsfVar2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ede edeVar = (ede) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edeVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edeVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ejfj ejfjVar = this.a;
            ejen.a(ejfjVar, hmlVar, 0);
            ejeg.c(ejfjVar, hmlVar, 0);
            ejfd.a(hmlVar, 0);
            hmlVar.v(967221949);
            hsf hsfVar = this.b;
            if (hsfVar.a() == ejfe.a) {
                ejfd.g(ejdk.a, hmlVar, 6);
            }
            hmlVar.o();
            hmlVar.v(967225323);
            hsf hsfVar2 = this.c;
            if (hsfVar2.a() != null) {
                fdae fdaeVar = ejfjVar.v;
                Object objA = hsfVar2.a();
                objA.getClass();
                ejfd.d(fdaeVar, (ejga) objA, hmlVar, 0);
            }
            hmlVar.o();
            int i = (iIntValue & 14) | 48;
            ejfd.f(edeVar, hxe.d(-695132004, new ejey(hsfVar, ejfjVar), hmlVar), hmlVar, i);
            ejfd.e(edeVar, ejdk.b, hmlVar, i);
        }
        return fctx.a;
    }
}
