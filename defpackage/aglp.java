package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aglp extends fcyz implements fdat {
    final /* synthetic */ aukf a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aglp(fcxy fcxyVar, aukf aukfVar, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.a = aukfVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aglp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = bngz.a;
        bngw bngwVar = new bngw();
        bngwVar.ap("setDismissedInternal");
        bngwVar.f(new aglq(this.a, this.b));
        bngwVar.c(aukd.CONVERSATION_CLASSIFICATION_STATE_DISMISSED);
        return new Integer(bngwVar.b().e());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aglp aglpVar = new aglp(fcxyVar, this.a, this.b);
        aglpVar.c = obj;
        return aglpVar;
    }
}
