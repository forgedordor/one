package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chqd extends fcyz implements fdat {
    private /* synthetic */ Object a;

    public chqd(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chqd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        botb botbVarE = botm.e();
        botbVarE.A("getTopTenMostRecentPersonalConversations");
        botl botlVar = new botl();
        botlVar.A();
        int iIntValue = botm.g().intValue();
        if (iIntValue < 10018) {
            dqru.x("IS_ENTERPRISE", iIntValue);
        }
        botlVar.ap(new dqty("conversations.IS_ENTERPRISE", 1, 0));
        botlVar.q();
        botlVar.c(bvdk.UNARCHIVED);
        botbVarE.h(botlVar);
        botbVarE.e(new bosy(botm.c.r, false));
        botbVarE.y(10);
        return botbVarE.b().z();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chqd chqdVar = new chqd(fcxyVar);
        chqdVar.a = obj;
        return chqdVar;
    }
}
