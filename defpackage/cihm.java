package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cihm extends fcyz implements fdat {
    public cihm(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return new cihm((fcxy) obj2).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        botb botbVarE = botm.e();
        botl botlVar = new botl();
        int iIntValue = botm.g().intValue();
        if (iIntValue < 60590) {
            dqru.x("rcs_group_icon_url", iIntValue);
        }
        botlVar.ap(new dqpn("conversations.rcs_group_icon_url", 6));
        botlVar.ap(new dqpj("conversations.icon", 11, "%/h%"));
        botbVarE.k(new botf(botlVar));
        botbVarE.A("GroupIconCleanupWorker#getConversations");
        botbVarE.s();
        return botbVarE.b().g();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cihm(fcxyVar);
    }
}
