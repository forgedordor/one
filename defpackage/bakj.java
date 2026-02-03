package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bakj extends fcyz implements fdat {
    final /* synthetic */ bakl a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ aukf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bakj(fcxy fcxyVar, bakl baklVar, ConversationIdType conversationIdType, aukf aukfVar) {
        super(2, fcxyVar);
        this.a = baklVar;
        this.b = conversationIdType;
        this.c = aukfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bakj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bakl baklVar = this.a;
        aukf aukfVar = this.c;
        ConversationIdType conversationIdType = this.b;
        ekgb ekgbVarA = baklVar.a(conversationIdType, aukfVar);
        if (ekgbVarA.size() != 1) {
            ((eksl) baklVar.a.j()).I("Unable to increment impressions, %d matching records were found for conversationId: %s classificationType: %s", new Integer(ekgbVarA.size()), conversationIdType, aukfVar);
            return fctx.a;
        }
        long jK = ((bnfk) ekgbVarA.get(0)).k();
        String[] strArr = bngz.a;
        bngw bngwVar = new bngw();
        bngwVar.ap("incrementClassificationImpressions");
        bngwVar.f(new bakk(aukfVar, conversationIdType));
        bngwVar.e(jK + 1);
        return new Integer(bngwVar.b().e());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bakj bakjVar = new bakj(fcxyVar, this.a, this.b, this.c);
        bakjVar.d = obj;
        return bakjVar;
    }
}
