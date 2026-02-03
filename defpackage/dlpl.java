package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlpl implements fdat {
    final /* synthetic */ dlps a;
    final /* synthetic */ ics b;
    final /* synthetic */ dlpo c;

    public dlpl(dlps dlpsVar, ics icsVar, dlpo dlpoVar) {
        this.a = dlpsVar;
        this.b = icsVar;
        this.c = dlpoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlps dlpsVar = this.a;
            if (dlpsVar instanceof dlpq) {
                hmlVar.v(-910459255);
                dlpn.f(this.b, hmlVar, 0);
                hmlVar.o();
            } else if (dlpsVar instanceof dlpp) {
                hmlVar.v(-910455767);
                dlpn.e(this.b, (dlpp) dlpsVar, this.c, hmlVar, 0);
                hmlVar.o();
            } else {
                if (!(dlpsVar instanceof dlpr)) {
                    hmlVar.v(-910461204);
                    hmlVar.o();
                    throw new fctg();
                }
                hmlVar.v(-910451290);
                ics icsVar = this.b;
                hmlVar.v(5004770);
                final dlpo dlpoVar = this.c;
                boolean zF = hmlVar.F(dlpoVar);
                Object objF = hmlVar.f();
                if (zF || objF == hmk.a) {
                    objF = new fdae() { // from class: dlpk
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            yot yotVar = (yot) dlpoVar;
                            you youVar = yotVar.a;
                            Optional optional = (Optional) youVar.c.b();
                            if (!optional.isPresent()) {
                                throw new IllegalStateException("ManualTranscriptionController not provided.");
                            }
                            ((suz) optional.get()).a(yotVar.d);
                            ((ains) youVar.d.b()).c("Bugle.Vmt.ManualTriggerTranscribe.Click.Count");
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                dlpn.g(icsVar, (fdae) objF, hmlVar, 0);
                hmlVar.o();
            }
        }
        return fctx.a;
    }
}
