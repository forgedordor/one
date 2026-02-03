package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class airq extends fcyz implements fdat {
    final /* synthetic */ airv a;
    final /* synthetic */ ajlj b;
    final /* synthetic */ enmz c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public airq(airv airvVar, ajlj ajljVar, enmz enmzVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = airvVar;
        this.b = ajljVar;
        this.c = enmzVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((airq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        airv airvVar = this.a;
        ajlj ajljVar = this.b;
        enmz enmzVar = this.c;
        int i = this.d;
        eieu eieuVarH = eiiy.h("ComposeCuiLogger.logCuiFailure");
        try {
            ennf ennfVarA = enne.a((ennc) ennd.a.createBuilder());
            airo.a(ennfVarA, ajljVar);
            ennc enncVar = ennfVarA.a;
            enncVar.copyOnWrite();
            ennd enndVar = (ennd) enncVar.instance;
            enndVar.f = enmzVar;
            enndVar.e = 102;
            ennfVarA.b(i);
            final ennd enndVarA = ennfVarA.a();
            ekrw ekrwVarH = airv.a.h();
            ekrwVarH.X(eksq.a, "BugleCuj");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/analytics/compose/cuj/ComposeCuiLogger$logCuiFailure$1", "invokeSuspend", 90, "ComposeCuiLogger.kt")).t("ComposeCuiLogger.logCuiFailure %s", enndVarA);
            airvVar.k(new Supplier() { // from class: airp
                @Override // java.util.function.Supplier
                public final Object get() {
                    return enndVarA;
                }
            });
            fczl.a(eieuVarH, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new airq(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
