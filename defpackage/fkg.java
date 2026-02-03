package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkg implements fdau {
    final /* synthetic */ fdae a;
    final /* synthetic */ fdap b;

    public fkg(fdae fdaeVar, fdap fdapVar) {
        this.a = fdaeVar;
        this.b = fdapVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(759876635);
        dee deeVar = fkl.a;
        Object objF = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF == obj4) {
            fdae fdaeVar = this.a;
            hxn hxnVar = hrp.a;
            hnt hntVar = new hnt(fdaeVar, null);
            hmlVar.y(hntVar);
            objF = hntVar;
        }
        hsf hsfVar = (hsf) objF;
        Object objF2 = hmlVar.f();
        if (objF2 == obj4) {
            objF2 = new ddp(new ihs(fkl.a(hsfVar)), fkl.d, new ihs(fkl.b), 8);
            hmlVar.y(objF2);
        }
        ddp ddpVar = (ddp) objF2;
        fctx fctxVar = fctx.a;
        boolean zF = hmlVar.F(ddpVar);
        Object objF3 = hmlVar.f();
        if (zF || objF3 == obj4) {
            objF3 = new fkk(hsfVar, ddpVar, null);
            hmlVar.y(objF3);
        }
        hob.g(fctxVar, (fdat) objF3, hmlVar);
        final deb debVar = ddpVar.a;
        fdap fdapVar = this.b;
        boolean zD = hmlVar.D(debVar);
        Object objF4 = hmlVar.f();
        if (zD || objF4 == obj4) {
            objF4 = new fdae() { // from class: fkf
                @Override // defpackage.fdae
                public final Object invoke() {
                    return new ihs(((ihs) debVar.a()).a);
                }
            };
            hmlVar.y(objF4);
        }
        ics icsVar = (ics) fdapVar.invoke((fdae) objF4);
        hmlVar.o();
        return icsVar;
    }
}
