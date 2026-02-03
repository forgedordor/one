package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvl extends fcyz implements fdat {
    final /* synthetic */ bvvn a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvvl(fcxy fcxyVar, bvvn bvvnVar) {
        super(2, fcxyVar);
        this.a = bvvnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvvl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bvvn bvvnVar = this.a;
        ainv ainvVar = (ainv) bvvnVar.j.get();
        if (ainvVar != null) {
            ainvVar.c();
            ekrw ekrwVarE = bvvn.a.e();
            ekrwVarE.X(eksq.a, "BugleE2eeEtouffee");
            ((ekrd) bvvnVar.d((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl", "stopTimerIfStarted", 549, "ConversationE2eeStatusImpl.kt")).q("stopping etouffee action timer");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bvvl bvvlVar = new bvvl(fcxyVar, this.a);
        bvvlVar.b = obj;
        return bvvlVar;
    }
}
