package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrk extends fcyz implements fdat {
    final /* synthetic */ wrt a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrk(fcxy fcxyVar, wrt wrtVar) {
        super(2, fcxyVar);
        this.a = wrtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wrk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarE = wrt.a.e();
        ekrwVarE.X(eksq.a, "BugleComposeRow2");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrz ekrzVar = cqnc.t;
        wrt wrtVar = this.a;
        ekrdVar.X(ekrzVar, wrtVar.b);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/ConversationDraftPersistence$remove$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 98, "ConversationDraftPersistence.kt")).q("Persistence removing draft");
        String[] strArr = bpcy.a;
        bpco bpcoVar = new bpco();
        bpcoVar.f("ConversationDraftPersistence.remove");
        bpcoVar.b = new bpcw((bpcx) new wrl(wrtVar).apply(new bpcx()));
        return new Integer(bpcoVar.d());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wrk wrkVar = new wrk(fcxyVar, this.a);
        wrkVar.b = obj;
        return wrkVar;
    }
}
