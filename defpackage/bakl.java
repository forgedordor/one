package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bakl implements bakh {
    public final eksp a;
    private final fcyh b;

    public bakl(fcyh fcyhVar, dqsn dqsnVar) {
        fcyhVar.getClass();
        dqsnVar.getClass();
        this.b = fcyhVar;
        this.a = eksp.c("BugleDataModel");
    }

    @Override // defpackage.bakh
    public final ekgb a(ConversationIdType conversationIdType, aukf aukfVar) {
        conversationIdType.getClass();
        aukfVar.getClass();
        bngu bnguVarA = bngz.a();
        bnguVarA.A("getConversationClassifications");
        bngy bngyVar = new bngy();
        bngyVar.d(conversationIdType);
        bngyVar.c(aukfVar);
        bnguVarA.k(new bngx(bngyVar));
        ekgb ekgbVarZ = bnguVarA.b().z();
        ekgbVarZ.getClass();
        return ekgbVarZ;
    }

    @Override // defpackage.bakh
    public final Object b(ConversationIdType conversationIdType, aukf aukfVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.b), new baki(null, this, conversationIdType, aukfVar), fcxyVar);
    }

    @Override // defpackage.bakh
    public final Object c(ConversationIdType conversationIdType, aukf aukfVar, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.b), new bakj(null, this, conversationIdType, aukfVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
