package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlfd implements fdat {
    final /* synthetic */ dleo a;
    final /* synthetic */ hri b;

    public dlfd(dleo dleoVar, hri hriVar) {
        this.a = dleoVar;
        this.b = hriVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dleo dleoVar = this.a;
            final hri hriVar = this.b;
            final int i = 0;
            for (Object obj3 : dleoVar.a) {
                int i2 = i + 1;
                if (i < 0) {
                    fcva.m();
                }
                final dlff dlffVar = (dlff) obj3;
                String str = dlffVar.a;
                String str2 = dlffVar.b;
                hmlVar.v(-1746271574);
                boolean zD = hmlVar.D(hriVar) | hmlVar.B(i) | hmlVar.D(dlffVar);
                Object objF = hmlVar.f();
                if (zD || objF == hmk.a) {
                    objF = new fdae() { // from class: dlfa
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            hri hriVar2 = hriVar;
                            int iC = hriVar2.c();
                            int i3 = i;
                            if (iC != i3) {
                                dlff dlffVar2 = dlffVar;
                                hriVar2.i(i3);
                                dlffVar2.c.invoke();
                            }
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                final dlff dlffVar2 = new dlff(str, str2, (fdae) objF);
                boolean z = hriVar.c() == i;
                ics icsVarE = egq.e(egq.x(ics.e, 48.0f, 0.0f, 2), 48.0f);
                long j = glz.a(hmlVar).a;
                long j2 = glz.a(hmlVar).s;
                hmlVar.v(5004770);
                boolean zD2 = hmlVar.D(dlffVar2);
                Object objF2 = hmlVar.f();
                if (zD2 || objF2 == hmk.a) {
                    objF2 = new fdae() { // from class: dlfb
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            dlffVar2.c.invoke();
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF2);
                }
                hmlVar.o();
                dthi.a(z, (fdae) objF2, icsVarE, false, hxe.d(-1183165684, new dlfc(dlffVar2), hmlVar), j, j2, hmlVar, 24960, 296);
                i = i2;
            }
        }
        return fctx.a;
    }
}
