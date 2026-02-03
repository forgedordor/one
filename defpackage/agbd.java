package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agbd extends fcyz implements fdat {
    final /* synthetic */ agbe a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agbd(fcxy fcxyVar, agbe agbeVar, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.a = agbeVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agbd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        agbe agbeVar = this.a;
        bakt baktVar = (bakt) agbeVar.b.b();
        ConversationIdType conversationIdType = this.b;
        bojh bojhVarR = baktVar.r(conversationIdType);
        return agbeVar.a.a(conversationIdType, bojhVarR != null ? bojhVarR.ab() : null, bojhVarR != null ? bojhVarR.an() : false);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        agbd agbdVar = new agbd(fcxyVar, this.a, this.b);
        agbdVar.c = obj;
        return agbdVar;
    }
}
