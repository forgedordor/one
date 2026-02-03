package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clib extends fcyz implements fdat {
    int a;
    final /* synthetic */ clic b;
    final /* synthetic */ clhw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clib(clic clicVar, clhw clhwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = clicVar;
        this.c = clhwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clib) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            clic clicVar = this.b;
            this.a = 1;
            obj = clicVar.c.e(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        clom clomVar = (clom) obj;
        ekrw ekrwVarH = clic.a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl$requestSatelliteConnection$1", "invokeSuspend", 183, "BugleSatelliteManagerWrapperImpl.kt");
        cloq cloqVar = clomVar.c;
        if (cloqVar == null) {
            cloqVar = cloq.a;
        }
        ekrdVar.r("Start satellite session response: %d", cloqVar.c);
        cloq cloqVar2 = clomVar.c;
        if (cloqVar2 == null) {
            cloqVar2 = cloq.a;
        }
        clop clopVarB = clop.b(cloqVar2.c);
        if (clopVarB == null) {
            clopVarB = clop.UNRECOGNIZED;
        }
        if (clopVarB == clop.SUCCESS) {
            this.c.b();
        } else if (this.b.d.a()) {
            this.c.a();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new clib(this.b, this.c, fcxyVar);
    }
}
