package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxd implements fdau {
    final /* synthetic */ fdae a;
    final /* synthetic */ hrg b;

    public dmxd(fdae fdaeVar, hrg hrgVar) {
        this.a = fdaeVar;
        this.b = hrgVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((egc) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            float fA = dmxm.a(this.b.c());
            if (fA > 0.0f) {
                egt.a(dkl.a(ien.a(egq.c(ics.e, 1.0f), fA), glz.a(hmlVar).J, ikj.a), hmlVar);
                hmlVar.v(5004770);
                final fdae fdaeVar = this.a;
                boolean zD = hmlVar.D(fdaeVar);
                Object objF = hmlVar.f();
                if (zD || objF == hmk.a) {
                    objF = new fdae() { // from class: dmxc
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdaeVar.invoke();
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                acx.a(false, (fdae) objF, hmlVar, 0, 1);
            }
        }
        return fctx.a;
    }
}
