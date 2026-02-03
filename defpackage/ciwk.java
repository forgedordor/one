package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciwk extends fcyz implements fdat {
    int a;
    final /* synthetic */ ciwn b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ aubq d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciwk(fcxy fcxyVar, ciwn ciwnVar, ConversationIdType conversationIdType, aubq aubqVar) {
        super(2, fcxyVar);
        this.b = ciwnVar;
        this.c = conversationIdType;
        this.d = aubqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ciwk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        baqm baqmVar = (baqm) this.b.a.b();
        ConversationIdType conversationIdType = this.c;
        aubq aubqVar = this.d;
        this.a = 1;
        Object objD = baqmVar.d(conversationIdType, aubqVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ciwk ciwkVar = new ciwk(fcxyVar, this.b, this.c, this.d);
        ciwkVar.e = obj;
        return ciwkVar;
    }
}
