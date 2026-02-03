package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awlp extends fcyz implements fdat {
    final /* synthetic */ String a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awlp(fcxy fcxyVar, String str) {
        super(2, fcxyVar);
        this.a = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awlp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        botb botbVarE = botm.e();
        botbVarE.A("CachingGroupManager#getConversationData");
        botbVarE.i(new awlr(this.a));
        botbVarE.i(awls.a);
        botbVarE.e(new bosy(botm.c.ao, false));
        return botbVarE.b().z();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awlp awlpVar = new awlp(fcxyVar, this.a);
        awlpVar.b = obj;
        return awlpVar;
    }
}
