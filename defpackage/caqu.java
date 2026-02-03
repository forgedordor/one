package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class caqu extends fcyz implements fdat {
    int a;
    final /* synthetic */ caqv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caqu(caqv caqvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = caqvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caqu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objA;
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            caqv caqvVar = this.b;
            this.a = 1;
            if (((Boolean) ((cczi) cpxw.j.get()).e()).booleanValue()) {
                ekrw ekrwVarH = caqv.a.h();
                ekrwVarH.X(eksq.a, "BugleCms");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/staterecovery/ResetAllLocalStateRecover", "recover", 40, "ResetAllLocalStateRecover.kt")).q("Run ResetAllLocalStateRecover.");
                objA = fdin.a(eicg.a(caqvVar.d), new caqs(null, caqvVar), this);
                if (objA != obj2) {
                    objA = fctx.a;
                }
            } else {
                ekrw ekrwVarH2 = caqv.a.h();
                ekrwVarH2.X(eksq.a, "BugleCms");
                ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/staterecovery/ResetAllLocalStateRecover", "recover", 36, "ResetAllLocalStateRecover.kt")).q("Skip ResetAllLocalStateRecover because flag is off.");
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new caqu(this.b, fcxyVar);
    }
}
