package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrr extends fcyz implements fdat {
    int a;
    final /* synthetic */ wrt b;
    final /* synthetic */ String c = "ConversationDraftPersistence.saveDiff";
    final /* synthetic */ fdap d;
    final /* synthetic */ fdap e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrr(fcxy fcxyVar, wrt wrtVar, fdap fdapVar, fdap fdapVar2) {
        super(2, fcxyVar);
        this.b = wrtVar;
        this.d = fdapVar;
        this.e = fdapVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wrr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        wrt wrtVar = this.b;
        eiju eijuVarB = wrtVar.f.b(this.c, new wrs(wrtVar, this.d, this.e));
        eijuVarB.getClass();
        this.a = 1;
        Object objC = fdxs.c(eijuVarB, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wrr wrrVar = new wrr(fcxyVar, this.b, this.d, this.e);
        wrrVar.f = obj;
        return wrrVar;
    }
}
