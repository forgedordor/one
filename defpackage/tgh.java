package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tgh implements fdat {
    final /* synthetic */ tgp a;

    public tgh(tgp tgpVar) {
        this.a = tgpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        lyy lyyVar;
        fcyh fcyhVarJ;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            tgr tgrVar = (tgr) this.a.b.a();
            tij tijVar = tgrVar.a;
            synchronized (lxe.a) {
                lyyVar = (lyy) tgrVar.fy("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
                if (lyyVar == null) {
                    try {
                        fdjq fdjqVar = fdkq.a;
                        fcyhVarJ = fdzb.a.j();
                    } catch (fcth | IllegalStateException unused) {
                        fcyhVarJ = fcyi.a;
                    }
                    lyy lyyVar2 = new lyy(fcyhVarJ.plus(new fdmt(null)));
                    tgrVar.fA("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", lyyVar2);
                    lyyVar = lyyVar2;
                }
            }
            tii tiiVar = (tii) tijVar.a.b();
            tgz tgzVar = (tgz) tiiVar.a.b();
            tic ticVar = (tic) tiiVar.b.b();
            tha thaVar = (tha) tiiVar.c.b();
            thaVar.getClass();
            thx.a(new tip(new tih(tgzVar, ticVar, thaVar, lyyVar).d), hmlVar, 0);
        }
        return fctx.a;
    }
}
