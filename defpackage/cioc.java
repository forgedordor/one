package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cioc extends fcyz implements fdat {
    final /* synthetic */ cins a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cioc(fcxy fcxyVar, cins cinsVar, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.a = cinsVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cioc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("MmsGroupUpgradeDatabaseOperations#updateMmsGroupUpgradeStatus");
        boteVar.B(this.a);
        return Boolean.valueOf(boteVar.f(this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cioc ciocVar = new cioc(fcxyVar, this.a, this.b);
        ciocVar.c = obj;
        return ciocVar;
    }
}
