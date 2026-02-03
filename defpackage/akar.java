package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akar extends fcyz implements fdat {
    final /* synthetic */ awjl a;
    final /* synthetic */ akbc b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akar(fcxy fcxyVar, awjl awjlVar, akbc akbcVar) {
        super(2, fcxyVar);
        this.a = awjlVar;
        this.b = akbcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akar) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        botb botbVarE = botm.e();
        botbVarE.A("matchByForeignKey");
        awjl awjlVar = this.a;
        botbVarE.i(new akas(awjlVar));
        botbVarE.A("DestinationConversationMatcher#matchByForeignKey");
        ekgb ekgbVarZ = botbVarE.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        Iterator<E> it = ekgbVarZ.iterator();
        while (it.hasNext()) {
            arrayList.add(((bojh) it.next()).C());
        }
        if (arrayList.size() > 1) {
            throw new IllegalStateException(a.i(arrayList, awjlVar, "DestinationToken should not map to multiple conversations.\nDestinationToken: ", "\nConversationIds: "));
        }
        ConversationIdType conversationIdType = (ConversationIdType) fcva.Y(arrayList);
        if (conversationIdType == null) {
            return null;
        }
        ((ains) this.b.b.b()).e("Bugle.Cme.Destination.Conversation.Match.Fallback", 6);
        return conversationIdType;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        akar akarVar = new akar(fcxyVar, this.a, this.b);
        akarVar.c = obj;
        return akarVar;
    }
}
