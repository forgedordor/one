package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daqh extends fcyz implements fdat {
    int a;
    final /* synthetic */ daql b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daqh(fcxy fcxyVar, daql daqlVar, ConversationIdType conversationIdType, long j, int i) {
        super(2, fcxyVar);
        this.b = daqlVar;
        this.c = conversationIdType;
        this.d = j;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((daqh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        daql daqlVar = this.b;
        aeum aeumVarJ = daqlVar.a().j(daqb.b(this.c, this.d, this.e), (cogw) daqlVar.b.b());
        this.a = 1;
        Object objC = daqlVar.c(aeumVarJ, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        daqh daqhVar = new daqh(fcxyVar, this.b, this.c, this.d, this.e);
        daqhVar.f = obj;
        return daqhVar;
    }
}
