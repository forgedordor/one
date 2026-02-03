package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllv extends fcyz implements fdat {
    int a;
    final /* synthetic */ cllw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cllv(cllw cllwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cllwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cllv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cllw cllwVar = this.b;
            this.a = 1;
            ekrw ekrwVarH = cllw.a.h();
            ekrwVarH.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireScheduler", "retrieveQuestionnaire", 38, "RetrieveQuestionnaireScheduler.kt")).q("Scheduling RetrieveQuestionnaireWorkHandler task in PWQ.");
            Object objA = fdin.a(eicg.a(cllwVar.c), new cllu(null, cllwVar), this);
            if (objA != obj2) {
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
        return new cllv(this.b, fcxyVar);
    }
}
