package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yfg implements fdav {
    final /* synthetic */ ycd a;
    final /* synthetic */ yen b;
    final /* synthetic */ ejy c;
    final /* synthetic */ hsf d;
    final /* synthetic */ ddp e;

    public yfg(ycd ycdVar, yen yenVar, ejy ejyVar, hsf hsfVar, ddp ddpVar) {
        this.a = ycdVar;
        this.b = yenVar;
        this.c = ejyVar;
        this.d = hsfVar;
        this.e = ddpVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        yis yisVar;
        final int iIntValue = ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        ((eih) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= true != hmlVar.B(iIntValue) ? 16 : 32;
        }
        if ((iIntValue2 & 145) == 144 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ycd ycdVar = this.a;
            hmlVar.v(-324173789);
            Object objA = ycdVar.c.a();
            objA.getClass();
            if (((Boolean) objA).booleanValue() && ((Boolean) ycdVar.b.a()).booleanValue()) {
                hmlVar.v(1920231520);
                yit yitVar = (yit) ycdVar.a.g(iIntValue);
                auyl auylVarB = yitVar != null ? yitVar.b() : null;
                yisVar = auylVarB != null ? (yis) yck.a(auylVarB, hmlVar) : null;
                hmlVar.o();
            } else {
                hmlVar.v(1920299813);
                yit yitVar2 = (yit) ycdVar.a.f(iIntValue);
                auyl auylVarB2 = yitVar2 != null ? yitVar2.b() : null;
                yisVar = auylVarB2 != null ? (yis) yck.a(auylVarB2, hmlVar) : null;
                hmlVar.o();
            }
            final yis yisVar2 = yisVar;
            hmlVar.o();
            if (yisVar2 != null) {
                hmlVar.v(988124949);
                hmlVar.v(-1353598196);
                if (iIntValue == 0) {
                    yen yenVar = this.b;
                    ygj.b(yisVar2, yenVar, hmlVar, 0);
                    ygj.a(yenVar, this.c, yisVar2, hmlVar, 0);
                    iIntValue = 0;
                }
                hmlVar.o();
                yjf.a(yisVar2, ((Boolean) this.d.a()).booleanValue(), this.e, hmlVar, 512, 0);
                hmlVar.v(-1746271574);
                final yen yenVar2 = this.b;
                boolean zD = hmlVar.D(yenVar2) | ((iIntValue2 & 112) == 32) | hmlVar.D(yisVar2);
                Object objF = hmlVar.f();
                if (zD || objF == hmk.a) {
                    objF = new fdap() { // from class: yfe
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj5) {
                            ((hny) obj5).getClass();
                            return new yff(yenVar2, iIntValue, yisVar2);
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                hob.c(yisVar2, (fdap) objF, hmlVar);
                hmlVar.o();
            } else {
                hmlVar.v(988452092);
                dkmd.c(hmlVar, 0);
                hmlVar.o();
            }
        }
        return fctx.a;
    }
}
