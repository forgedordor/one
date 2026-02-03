package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccqn extends fcyz implements fdat {
    int a;
    final /* synthetic */ ccqp b;
    final /* synthetic */ atys c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccqn(fcxy fcxyVar, ccqp ccqpVar, atys atysVar) {
        super(2, fcxyVar);
        this.b = ccqpVar;
        this.c = atysVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccqn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objC;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ccqp ccqpVar = this.b;
        atys atysVar = this.c;
        this.a = 1;
        String str = ((atuy) atysVar).a.j;
        str.getClass();
        aubx aubxVar = atysVar.e().c;
        if (aubxVar == null) {
            aubxVar = aubx.a;
        }
        aubxVar.getClass();
        ekrg ekrgVar = ccqp.a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar2 = cqnc.e;
        ekrdVar.X(ekrzVar2, str);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsSinglePartIncomingChatMessageProcessor", "processWithinContext", 55, "MlsSinglePartIncomingChatMessageProcessor.kt")).t("Processing an incoming MLS message with content type: %s", auby.j(aubxVar));
        if (auby.g(aubxVar, cche.a) || auby.g(aubxVar, cche.d)) {
            objC = ccqpVar.c(atysVar, str, this);
        } else {
            ekrw ekrwVarJ = ekrgVar.j();
            ekrwVarJ.X(ekrzVar, "BugleE2eeMls");
            ekrd ekrdVar2 = (ekrd) ekrwVarJ;
            ekrdVar2.X(ekrzVar2, str);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsSinglePartIncomingChatMessageProcessor", "processWithinContext", 65, "MlsSinglePartIncomingChatMessageProcessor.kt")).t("Received a message with unknown content type %s. Drops it.", auby.j(aubxVar));
            objC = atav.FAIL_NO_RETRY;
        }
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ccqn ccqnVar = new ccqn(fcxyVar, this.b, this.c);
        ccqnVar.d = obj;
        return ccqnVar;
    }
}
