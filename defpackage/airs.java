package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class airs extends fcyz implements fdat {
    final /* synthetic */ airv a;
    final /* synthetic */ ajlj b;
    final /* synthetic */ ennh c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public airs(airv airvVar, ajlj ajljVar, ennh ennhVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = airvVar;
        this.b = ajljVar;
        this.c = ennhVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((airs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        airv airvVar = this.a;
        ajlj ajljVar = this.b;
        ennh ennhVar = this.c;
        int i = this.d;
        eieu eieuVarH = eiiy.h("ComposeCuiLogger.logCuiStart");
        try {
            ennf ennfVarA = enne.a((ennc) ennd.a.createBuilder());
            airo.a(ennfVarA, ajljVar);
            ennc enncVar = ennfVarA.a;
            enncVar.copyOnWrite();
            ennd enndVar = (ennd) enncVar.instance;
            enndVar.f = ennhVar;
            enndVar.e = 100;
            ennfVarA.b(i);
            final ennd enndVarA = ennfVarA.a();
            ekrw ekrwVarH = airv.a.h();
            ekrwVarH.X(eksq.a, "BugleCuj");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/analytics/compose/cuj/ComposeCuiLogger$logCuiStart$1", "invokeSuspend", 54, "ComposeCuiLogger.kt")).t("ComposeCuiLogger.logCuiStart %s", enndVarA);
            airvVar.k(new Supplier() { // from class: airr
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
        return new airs(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
